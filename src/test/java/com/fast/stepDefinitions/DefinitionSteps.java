package com.fast.stepDefinitions;

import com.fast.steps.serenity.EndUserSteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class DefinitionSteps {

	@Steps
	EndUserSteps steps;

	@Given("^user is on home page$")
	public void user_is_on_home_page() throws Throwable{
		steps.user_is_on_home_page();
	}

	@Given("^user searches for symptom as \"([^\"]*)\"$")
	public void user_searches_for_symptom_as(String arg1) throws Throwable{
		steps.user_searches_for_symptom_as(arg1);
	}

	@Then("^select a symptom from dropdown$")
	public void select_a_symptom_from_dropdown() throws Throwable{
		steps.select_a_symptom_from_dropdown();
	}

	@Then("^Fill the questionnaire as following$")
	public void fill_the_questionnaire_as_following(DataTable arg1) throws Throwable{
		steps.fill_the_questionnaire_as_following(arg1);
	}

	@Then("^Verify that success message \"([^\"]*)\" displayed$")
	public void verify_that_success_message_displayed(String arg1) throws Throwable{
		steps.verify_that_success_message_displayed(arg1);
	}














}