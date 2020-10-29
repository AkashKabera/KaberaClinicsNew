package com.kaberaClinics.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class PillarPage extends ExtendedPageObject {

    public void clickOnTOCLink(String linkName) throws InterruptedException{
        waitForPageLoaded();
            JavascriptExecutor js =  (JavascriptExecutor) getDriver();
            String xpathExpression = "//a[text()='"+linkName+"']";
            WebElement element = getDriver().findElement(By.xpath(xpathExpression));
        js.executeScript("arguments[0].scrollIntoView();", element);
            withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.xpath(xpathExpression));
            getDriver().findElement(By.xpath(xpathExpression)).click();
    }

    public String getSectionHead(String section) throws InterruptedException{
        waitForPageLoaded();
        String xpathExpression = "//h2[contains(text(),'"+section+"')]";
        withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.xpath(xpathExpression));
        String heading = getDriver().findElement(By.xpath(xpathExpression)).getText();
        return heading;
    }

    public boolean isTOCLinkActive(String linkName) throws InterruptedException{
        waitForPageLoaded();
        String xpathExpression = "//a[text()='"+linkName+"']";
        String className = getDriver().findElement(By.xpath(xpathExpression)).getAttribute("class");
        if (className.equals("active")){
            return true;
        }
        else {
            return false;
        }
    }

    @FindBy(xpath = "//*[@id='ad-content']/a/img")
    WebElement talkToDocImage;
    public void clickOnTalkToDocImage() throws InterruptedException{
        waitForPageLoaded();
        talkToDocImage.click();
    }
}
