package com.fast.steps.serenity;

import com.kaberaClinics.pages.*;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.util.List;

public class EndUserSteps {

	LandingPage landingPage;
	DriverPage driverPage;
	DriverDashboard driverDashboard;
	HomePage homePage;

	@Step
	public void user_is_on_home_page() throws Throwable{
		landingPage.openURL();
	}

	@Step
	public void user_searches_for_symptom_as(String arg1) throws Throwable{
		homePage.enterLocationAndSymptom(arg1);
	}

	@Step
	public void select_a_symptom_from_dropdown() throws Throwable{
		homePage.selectASymptomFromDropdown();
	}

	@Step
	public void fill_the_questionnaire_as_following(DataTable arg1) throws Throwable{
		List<List<String>> data = arg1.raw();
		String btn="Yes";
		String btn1="Next";
		String phone="2222222222";
		homePage.fillTheQuestionnaire(btn,btn1,phone);
	}

	@Step
	public void verify_that_success_message_displayed(String arg1) throws Throwable{
		Assert.assertEquals("Thank you for your enquiry. Our professional will get in touch shortly.",homePage.getSuccessMessage());
	}







}