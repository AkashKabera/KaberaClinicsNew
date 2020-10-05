package com.kaberaClinics.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

public class HomePage extends ExtendedPageObject {

    @FindBy(xpath = "//input[@placeholder='I need treatment for ']")
    WebElementFacade needTreatmentField;
    @FindBy(xpath = "//input[@placeholder='I am from']")
    WebElementFacade locationField;
    @FindBy(xpath = "//div/div[2]/div[1]/div/div[2]/ul/li[1]")
    WebElementFacade symptomsDropdown;

    public void enterLocationAndSymptom(String symptom)throws InterruptedException{
        waitForPageLoaded();
        withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//input[@placeholder='I need treatment for ']"));
        locationField.clear();
        Thread.sleep(999);
        locationField.sendKeys("Mohali");
        waitForPageLoaded();
        needTreatmentField.sendKeys(symptom);
        waitForPageLoaded();
        }
    public void selectASymptomFromDropdown()throws InterruptedException{
        waitForPageLoaded();
        withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//div/div[2]/div[1]/div/div[2]/ul/li[1]"));
        symptomsDropdown.click();
    }

    @FindBy(id = "firstmonth")
    WebElementFacade oneMonthButton;
    @FindBy(xpath = "//input[@placeholder='Enter 10 digit phone number']")
    WebElementFacade phoneNumberField;
    @FindBy(xpath = "(//input[@name='name'])[3]")
    WebElementFacade patientNameField;
    public void fillTheQuestionnaire(String buttonText, String buttonText1, String phoneNumber)throws InterruptedException{
        withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//h5[@class='ques']"));
        String xpathExpression = "//a[text()='"+buttonText+"']";
        String xpathExpression1 = "(//button[text()='"+buttonText1+"'])[2]";
        String name = "abc";
        withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.xpath(xpathExpression));
        getDriver().findElement(By.xpath(xpathExpression)).click();
        withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.id("firstmonth"));
        oneMonthButton.click();
        withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.xpath(xpathExpression1));
        getDriver().findElement(By.xpath(xpathExpression1)).click();
        waitForTextToAppear("Do You Have More Symptoms?");
        withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.xpath(xpathExpression));
        getDriver().findElement(By.xpath(xpathExpression)).click();
//        waitForTextToAppear("Type Your Symptoms and add it to your chart?.");
        withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.xpath(xpathExpression1));
        getDriver().findElement(By.xpath(xpathExpression1)).click();
        withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.xpath(xpathExpression));
        getDriver().findElement(By.xpath(xpathExpression)).click();
        withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//input[@placeholder='Enter 10 digit phone number']"));
        phoneNumberField.sendKeys(phoneNumber);
        Thread.sleep(999);
        getDriver().findElement(By.xpath("//a[text()='Next']")).click();
        withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("(//input[@name='name'])[3]"));
        patientNameField.sendKeys(name);
        Thread.sleep(999);
        getDriver().findElement(By.xpath("//a[text()='Next']")).click();
        Thread.sleep(4999);
        getDriver().findElement(By.xpath("//a[text()='Ok']")).click();
        }

        public String getSuccessMessage()throws InterruptedException{
        waitForPageLoaded();
            JavascriptExecutor js=(JavascriptExecutor) getDriver();
            String str=(String)js.executeScript("return document.getElementsByClassName('Toastify__toast-body')[0].innerText");
            System.out.println("message is "+str);
            return str;
        }

}
