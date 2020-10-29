package com.kaberaClinics.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GuidelinesPage extends ExtendedPageObject{

    @FindBy(xpath = "//h2[text()='OUR PACKAGES']")
    WebElement ourPackageHead;
    public void selectPackage(String packages) throws InterruptedException{
        waitForPageLoaded();
        String xpathExpression = "//label[@for='"+packages+"']";
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView();", ourPackageHead);
        Thread.sleep(1999);
        getDriver().findElement(By.xpath(xpathExpression)).click();
    }

    public void clickOnReadNowLink(String section) throws InterruptedException{
        waitForPageLoaded();
        String xpathExpression = "//span[text()='"+section+"']";
        WebElement element = getDriver().findElement(By.xpath(xpathExpression));
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
        Thread.sleep(1999);
        js.executeScript("window.scrollBy(0,-500)");
        int index = 0;
        if (section.equals("Why do you need a health check-up?")){
            index = 0;
        }
        else if (section.equals("Why Kabera Clinics for health care?")){
            index = 1;
        }
        else if (section.equals("What should an online health check-up do for you?")){
            index = 2;
        }
        else if (section.equals("What is the purpose of online health care?")){
            index = 3;
        }
        try {
            getDriver().findElements(By.linkText("Read Now")).get(+index).click();
            Thread.sleep(2999);
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) getDriver();
            executor.executeScript("arguments[0].click();", getDriver().findElements(By.linkText("Read Now")).get(+index));
            Thread.sleep(2999);
        }
    }

    public String getBlogHead(String blogName) throws InterruptedException{
        waitForPageLoaded();
        String xpathExpression = "(//a[text()='"+blogName+"'])[4]";
       String head =  getDriver().findElement(By.xpath(xpathExpression)).getText();
       return head;
    }

    @FindBy(xpath = "//button[@class='slick-arrow slick-next']")
    WebElement nextButton;
    @FindBy(xpath = "//h4[text()='People usually look for']")
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
//        else if(categoryName.equals("Blood Pressure")) {
//            String xpathExpression = "(//h6[text()='"+categoryName+"'])[3]";
//            WebDriverWait wait = new WebDriverWait(getDriver(), 120);
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathExpression)));
//            getDriver().findElement(By.xpath(xpathExpression)).click();
//        }
        else  {
            String xpathExpression = "(//h6[text()='"+categoryName+"'])[2]";
            WebDriverWait wait = new WebDriverWait(getDriver(), 120);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathExpression)));
            getDriver().findElement(By.xpath(xpathExpression)).click();
        }
    }
}
