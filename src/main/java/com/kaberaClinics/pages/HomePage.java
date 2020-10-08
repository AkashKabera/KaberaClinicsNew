package com.kaberaClinics.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.apache.tools.ant.taskdefs.Java;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class HomePage extends ExtendedPageObject {
    DriverDashboard driverDashboard;

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
    @FindBy(xpath = "//li[text()='Skin Infection']")
    WebElementFacade skinInfection;
    public void fillTheQuestionnaire(String buttonText, String buttonText1, String buttonText2)throws InterruptedException{
        withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//h5[@class='ques']"));
        String xpathExpression = "//a[text()='"+buttonText+"']";
        String xpathExpression1 = "(//button[text()='"+buttonText1+"'])[2]";
        Random rand = new Random();
        char randomString = (char) (rand.nextInt(26) + 'a');
        String name = "test" + randomString + randomString;
        withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.xpath(xpathExpression));
        getDriver().findElement(By.xpath(xpathExpression)).click();
        withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.id("firstmonth"));
        oneMonthButton.click();
        withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.xpath(xpathExpression1));
        getDriver().findElement(By.xpath(xpathExpression1)).click();
        waitForTextToAppear("Do You Have More Symptoms?");
        withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.xpath(xpathExpression));
        getDriver().findElement(By.xpath(xpathExpression)).click();
        withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.xpath(xpathExpression1));
        driverDashboard.sendValueByPlaceHolder("Search here..." , "Skin Infection");
        withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//li[text()='Skin Infection']"));
        skinInfection.click();
        waitForPageLoaded();
        getDriver().findElement(By.xpath(xpathExpression1)).click();
        withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.xpath(xpathExpression));
        getDriver().findElement(By.xpath(xpathExpression)).click();
        withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//input[@placeholder='Enter 10 digit phone number']"));
        int phoneNumber =1000000000+(int)(Math.random()*91);
        phoneNumberField.sendKeys(phoneNumber +"");
        Thread.sleep(999);
        String xpath = "//a[text()='"+buttonText1+"']";
        String xpath1 = "//a[text()='"+buttonText2+"']";
        getDriver().findElement(By.xpath(xpath)).click();
        withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("(//input[@name='name'])[3]"));
        patientNameField.sendKeys(name);
        Thread.sleep(999);
        getDriver().findElement(By.xpath(xpath)).click();
        Thread.sleep(4999);
        getDriver().findElement(By.xpath(xpath1)).click();
        }

        public String getSuccessMessage()throws InterruptedException{
//        waitForPageLoaded();
        withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.className("Toastify__toast-body"));
        JavascriptExecutor js=(JavascriptExecutor) getDriver();
        String str=(String)js.executeScript("return document.getElementsByClassName('Toastify__toast--success')[0].innerText");
        System.out.println("message is "+str);
        return str;
        }

        @FindBy(xpath = "//input[@placeholder='Enter Phone Number']")
        WebElementFacade phoneNumberField1;
        public void enterRandomPhoneNumber() throws InterruptedException{
        waitForPageLoaded();
        withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//input[@placeholder='Enter Phone Number']"));
        int phoneNumber =1000000000+(int)(Math.random()*91);
        System.out.println("Phone Number is " +phoneNumber);
        phoneNumberField1.sendKeys(phoneNumber+"");
        }

        public String getErrorMessage(String msg) throws InterruptedException{
        waitForPageLoaded();
        String xpathExpression = "//span[text()='"+msg+"']";
        String errMsg = getDriver().findElement(By.xpath(xpathExpression)).getText();
        return errMsg;
        }

        public void clickOnGivenLink(String linkName, String section) throws InterruptedException{
        waitForPageLoaded();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        Thread.sleep(999);
        int index = 1;

        if (section.equals("how homeopathy works")){
        String linkXpathExpression = "//a[text()='"+linkName+"']";
        js.executeScript("window.scrollBy(0,100)");
        Thread.sleep(999);
        getDriver().findElement(By.xpath(linkXpathExpression)).click();
        }

        else if (section.equals("Get 20% OFF On Monthly Packages")){
            index = 2;
            String linkXpathExpression = "(//a[text()='"+linkName+"'])["+index+"]";
            getDriver().findElement(By.xpath(linkXpathExpression)).click();
            }
        else {
            String linkXpathExpression = "(//a[text()='"+linkName+"'])["+index+"]";
            getDriver().findElement(By.xpath(linkXpathExpression)).click();
        }
        }

        public void scrollToSection(String section) throws InterruptedException{
            waitForPageLoaded();
            String xpath =  "//h3[text()='"+section+"']";
            String xpath1 = "//h4[text()='"+section+"']";
            String xpath2 = "//h2[text()='"+section+"']";
            JavascriptExecutor js = (JavascriptExecutor) getDriver();
            if (section.equals("Share Your Problem With Us")){
                WebElement element =  getDriver().findElement(By.xpath(xpath));
                js.executeScript("arguments[0].scrollIntoView();", element);
            }
            else if (section.equals("India’s Best Doctors Are Online")){
                WebElement element1 = getDriver().findElement(By.xpath(xpath1));
                js.executeScript("arguments[0].scrollIntoView();", element1);
            }
            else if (section.equals("Get Medicine Delivered ")){
                WebElement element1 = getDriver().findElement(By.xpath(xpath1));
                js.executeScript("arguments[0].scrollIntoView();", element1);
            }
            else if (section.equals("You Are Suffering From?")){
                WebElement element = getDriver().findElement(By.xpath(xpath));
                js.executeScript("arguments[0].scrollIntoView();", element);
            }
            else if (section.equals("Skip the Travel")){
                WebElement element = getDriver().findElement(By.xpath(xpath2));
                js.executeScript("arguments[0].scrollIntoView();", element);
                Thread.sleep(9999);
                js.executeScript("window.scrollBy(0,-100)");
            }
            else if (section.equals("Get Unlimited Consultation")){
                WebElement element = getDriver().findElement(By.xpath(xpath1));
                js.executeScript("arguments[0].scrollIntoView();", element);
                Thread.sleep(9999);
                js.executeScript("window.scrollBy(0,-100)");
            }
            else if (section.equals("Get 20% OFF On Monthly Packages")){
                WebElement element = getDriver().findElement(By.xpath(xpath1));
                js.executeScript("arguments[0].scrollIntoView();", element);
                Thread.sleep(9999);
                js.executeScript("window.scrollBy(0,-100)");
            }
            else if (section.equals("Benefits of Online Consultation")){
                WebElement element = getDriver().findElement(By.xpath(xpath2));
                js.executeScript("arguments[0].scrollIntoView();", element);
                Thread.sleep(5999);
                js.executeScript("window.scrollBy(0,-100)");
            }
            else {
                WebElement element = getDriver().findElement(By.xpath(xpath));
                js.executeScript("arguments[0].scrollIntoView();", element);
            }
        }

        @FindBy(id = "first_btn")
        WebElement firstNextButton;
        @FindBy(id = "sec_btn")
        WebElement secondNextButton;
        @FindBy(xpath = "//form/div/div/div[4]/button")
        WebElement thirdNextButton;
        @FindBy(id = "sec_input1")
        WebElement lessThanOneMonthBtn;
        public void fillFindYourDiseaseForm(String symptoms, String address) throws InterruptedException{
            waitForPageLoaded();
            int phone =1000000000+(int)(Math.random()*91);
            int num =100+(int)(Math.random()*91);
            Random rand = new Random();
            char c = (char) (rand.nextInt(26) + 'a');
            String name = "Test User" + c + c;
            String email = "Test_user" + c + c + num + "@gmail.com";
            driverDashboard.sendValueByPlaceHolder("Fever, Allergy, Skin Issues, Headache" , symptoms);
            Thread.sleep(999);
            firstNextButton.click();
            withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.id("sec_input1"));
            waitForTextToAppear("From How Long You Have Been Suffering From This?");
            lessThanOneMonthBtn.click();
            Thread.sleep(999);
            secondNextButton.click();
            driverDashboard.sendValueByPlaceHolder2("Name" , name);
            Thread.sleep(999);
            driverDashboard.sendValueByPlaceHolder("Phone Number" , phone+"");
            Thread.sleep(999);
            driverDashboard.sendValueByPlaceHolder("Email Address" , email);
            Thread.sleep(999);
            driverDashboard.sendValueByPlaceHolder1("Postal Address" , address);
        }

        public void clickOnNextButton()throws InterruptedException{
            waitForPageLoaded();
            withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//form/div/div/div[4]/button"));
            thirdNextButton.click();
        }

        public String isBlogPageDisplayed(String linkName, String section) throws InterruptedException{
            waitForPageLoaded();
            int index = 1;
            if (section.equals("5 Ways To Live Like Lord Buddha In The Corona Age")){
                index = 2;
            }
            String xpathExpression = "(//a[text()='"+linkName+"'])["+index+"]";
            System.out.println(xpathExpression);
            String href = getDriver().findElement(By.xpath(xpathExpression)).getAttribute("href");
            System.out.println("Link is ==" +href);
             if (section.equals("Read Our Top Articles")){
                     return href;
            }

            else if (section.equals("How Mindfulness Will Help You Battle Anything")){
                return href;
            }

            else if (section.equals("5 Ways To Live Like Lord Buddha In The Corona Age")){
                return href;
            }

            else {
                return href;
            }
        }

    public void clickOnCategory(String categoryName) throws InterruptedException{
        waitForPageLoaded();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        String xpathExpression = "//a[text()='"+categoryName+"']" ;
        WebElement element = getDriver().findElement(By.xpath(xpathExpression));
        js.executeScript("arguments[0].scrollIntoView();", element);
        Thread.sleep(5999);
        js.executeScript("window.scrollBy(0,-600)");
        Thread.sleep(5999);
        getDriver().findElement(By.xpath(xpathExpression)).click();
    }

    public String isCategoryOfferPageDisplayed() throws InterruptedException{
        waitForPageLoaded();
        withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//div[2]/div[1]/div/h2"));
        return getDriver().findElement(By.xpath("//div[2]/div[1]/div/h2")).getText();
    }
}
