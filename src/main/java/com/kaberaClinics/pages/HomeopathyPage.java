package com.kaberaClinics.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

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
}
