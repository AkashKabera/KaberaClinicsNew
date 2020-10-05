package com.kaberaClinics.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

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
        locationField.sendKeys("Mohali");
        waitForPageLoaded();
        needTreatmentField.sendKeys(symptom);
        waitForPageLoaded();
        withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//div/div[2]/div[1]/div/div[2]/ul/li[1]"));
        symptomsDropdown.click();
        }

}
