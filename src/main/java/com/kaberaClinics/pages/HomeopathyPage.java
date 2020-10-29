package com.kaberaClinics.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeopathyPage extends ExtendedPageObject {

    public String getPageHead(String pageName) throws InterruptedException{
        waitForPageLoaded();
        String xpathExpression = "//span[contains(text(),'"+pageName+"')]";
        String head = getDriver().findElement(By.xpath(xpathExpression)).getText();
        return head;
    }

    public void clickOnGivenButton(String button, String section) throws InterruptedException{
        waitForPageLoaded();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        Thread.sleep(999);

        if (section.equals("how homeopathy works")){
            String linkXpathExpression = "//a[text()='"+button+"']";
            System.out.println(linkXpathExpression);
            js.executeScript("window.scrollBy(0,1300)");
            Thread.sleep(1999);
            getDriver().findElement(By.xpath(linkXpathExpression)).click();
        }
    }

    @FindBy(xpath = "//button[@class='slick-arrow slick-next']")
    WebElement nextButton;
    @FindBy(xpath = "//h4[text()='We specialize in Homeopathic Treatment of']")
    WebElement categorySection;

    public void clickOnCategory(String categoryName) throws InterruptedException{
        waitForPageLoaded();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView();", categorySection);
//        String xpathExpression = "//h6[text()='"+categoryName+"']";
        Thread.sleep(999);
        nextButton.click();
        if (categoryName.equals("Immune booster") || categoryName.equals("Migraine Treatment") || categoryName.equals("Skin Treatment")){
            String xpathExpression = "(//h6[text()='"+categoryName+"'])[1]";
            WebDriverWait wait = new WebDriverWait(getDriver(), 120);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathExpression)));
            getDriver().findElement(By.xpath(xpathExpression)).click();
        }
//        else if (categoryName.equals("Blood Pressure")){
//            String xpathExpression = "(//h6[text()='"+categoryName+"'])[3]";
//            WebDriverWait wait = new WebDriverWait(getDriver(), 120);
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathExpression)));
//            getDriver().findElement(By.xpath(xpathExpression)).click();
//        }
        else {
            String xpathExpression = "(//h6[text()='"+categoryName+"'])[2]";
            WebDriverWait wait = new WebDriverWait(getDriver(), 120);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathExpression)));
            getDriver().findElement(By.xpath(xpathExpression)).click();
        }
    }
}
