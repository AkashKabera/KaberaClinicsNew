package com.kaberaClinics.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

public class PaymentPage extends ExtendedPageObject {

    @FindBy(xpath = "//p[contains(text(),'Phone Number To Continue')]")
    WebElement paymentPageHead;

    public boolean isPaymentPageDisplayed() throws InterruptedException{
        waitForPageLoaded();
        return paymentPageHead.isDisplayed();
    }

}
