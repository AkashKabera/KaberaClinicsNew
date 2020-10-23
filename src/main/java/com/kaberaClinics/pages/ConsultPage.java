package com.kaberaClinics.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class ConsultPage extends ExtendedPageObject {

    public String getPageHead(String pageHead) throws InterruptedException{
        waitForPageLoaded();
        String xpathExpression = "//h2[contains(text(),'"+pageHead+"')]";
        return getDriver().findElement(By.xpath(xpathExpression)).getText();
    }

    public String getFormTitle(String title) throws InterruptedException{
        waitForPageLoaded();
        String xpathExpression = "//h2[contains(text(),'"+title+"')]";
        return getDriver().findElement(By.xpath(xpathExpression)).getText();
    }

    public void clickOnNextButton(String button , String form) throws InterruptedException{
        waitForPageLoaded();
        int index = 0;
        if(form.equals("Consult with a Doctor")){
            index = 3;
        }

        else if (form.equals("verify your phone number")){
            index = 4;
        }

        String xpathExpression = "(//button[text()='Next'])["+index+"]";
        System.out.println("Xpath is == " +xpathExpression);
        WebElement element = getDriver().findElement(By.xpath(xpathExpression));
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
        waitForPageLoaded();
        js.executeScript("window.scrollBy(0,-200)");
        Thread.sleep(2999);
        getDriver().findElement(By.xpath(xpathExpression)).click();
    }

    public String getErrorMessage(String errorMessage) throws InterruptedException{
        waitForPageLoaded();
        String xpathExpression = "//p[text()='"+errorMessage+"']";
        return getDriver().findElement(By.xpath(xpathExpression)).getText();
    }

    @FindBy(id = "search")
    WebElement symptomSearchField;
    @FindBy(xpath = "//*[@id='0']")
    WebElement symptomRadioBtn;
    @FindBy(xpath = "//input[@placeholder='Enter Your Phone Number']")
    WebElement phoneNumberField;

    public void enterSymptomAndPhoneNumber(String symptom) throws InterruptedException{
        waitForPageLoaded();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//input[@placeholder='Enter Your Phone Number']"));
        int phoneNumber =1000000000+(int)(Math.random()*91);
        System.out.println("Phone Number is " +phoneNumber);
        phoneNumberField.sendKeys(phoneNumber+"");
        waitForPageLoaded();
        withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.id("search"));
        symptomSearchField.sendKeys(symptom);
        withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//div/form/div[1]/ul/li[1]"));
        getDriver().findElement(By.xpath("//li[contains(text(),'Fever')]")).click();
        waitForPageLoaded();
        js.executeScript("document.getElementById('0').click()");
//        symptomRadioBtn.click();
        waitForPageLoaded();
    }

    public void enterInvalidOTP() throws InterruptedException{
        waitForPageLoaded();

        for(int i = 1; i <= 5; i++) {
            System.out.println(i);

            String xpathExpression = "(//input[@maxlength='1'])[" + i + "]";
            System.out.println("Xpath is === " +xpathExpression);
            int otp = 1 + (int)(Math.random()*9);
            System.out.println("OTP IS == " +otp);
            getDriver().findElement(By.xpath(xpathExpression)).sendKeys(otp+"");
        }
    }

    @FindBy(xpath = "(//input[@maxlength='1'])[1])")
    WebElement otpField;
    public String getOTPFieldValue()throws InterruptedException{
        waitForPageLoaded();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
      String otp =   (String) js.executeScript("document.getElementsByClassName('form-control otpbox')[0].value");
      System.out.println("OTP  IS " +otp);
      return otp;
    }

    @FindBy(xpath = "//span[text()='Entered a wrong number']")
    WebElement enteredWrongNumber;
    @FindBy(xpath = "//a[text()=' Resend One-Time Password']")
    WebElement resendOTPLink;
    public void clickOnLink(String linkName) throws InterruptedException{
        waitForPageLoaded();
        if (linkName.equals("Entered a wrong number")){
            waitForPageLoaded();
            enteredWrongNumber.click();
        }
        else if (linkName.equals(" Resend One-Time Password")){
            waitForPageLoaded();
            resendOTPLink.click();
        }
    }

    @FindBy(xpath = "//button[text()='Add']")
    WebElement addSymptomButton;
    public void enterSymptomAndClickOnAddButton() throws InterruptedException{
        waitForPageLoaded();
        withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.id("search"));
        symptomSearchField.sendKeys("add symptoms for testing");
        Thread.sleep(2999);
        withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//button[text()='Add']"));
        addSymptomButton.click();
    }

    @FindBy(xpath = "//label[text()='add symptoms for testing']")
    WebElement symptomList;
    public boolean isSymptomAddedInList() throws InterruptedException{
        waitForPageLoaded();
        boolean list = symptomList.isDisplayed();
        return list;
    }


}
