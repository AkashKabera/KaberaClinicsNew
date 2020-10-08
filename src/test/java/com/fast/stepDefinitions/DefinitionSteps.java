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

    @Then("^User Click on \"([^\"]*)\" button$")
    public void user_Click_on_button(String arg1) throws Throwable{
		steps.user_Click_on_button(arg1);
    }

    @Then("^Enter phone number$")
    public void enter_phone_number(DataTable arg1) throws Throwable{
		steps.enter_phone_number(arg1);
    }

	@Then("^Verify that error message \"([^\"]*)\" displayed$")
	public void verify_that_error_message_displayed(String arg1) throws Throwable{
		steps.verify_that_error_message_displayed(arg1);
	}

    @Given("^user click on \"([^\"]*)\" link$")
    public void user_click_on_link(String arg1) throws Throwable{
	    steps.user_click_on_link(arg1);
    }

    @Then("^Verify that \"([^\"]*)\" page displayed$")
    public void verify_that_page_displayed(String arg1) throws Throwable{
	    steps.verify_that_page_displayed(arg1);
    }

	@Given("^user click on \"([^\"]*)\" link in \"([^\"]*)\" section$")
	public void user_click_on_link_in_section(String arg1, String arg2) throws Throwable{
		steps.user_click_on_link_in_section(arg1,arg2);
	}

    @Given("^User is on \"([^\"]*)\" section$")
    public void user_is_on_section(String arg1) throws Throwable{
	    steps.user_is_on_section(arg1);
    }

    @Then("^User fill the Share Your Problem With Us form as following$")
    public void user_fill_the_Share_Your_Problem_With_Us_form_as_following(DataTable arg1) throws Throwable{
	    steps.user_fill_the_Share_Your_Problem_With_Us_form_as_following(arg1);
    }

	@Then("^User fill the You Are Suffering From form as following$")
	public void user_fill_the_You_Are_Suffering_From_form_as_following(DataTable arg1)throws Throwable {
		steps.user_fill_the_You_Are_Suffering_From_form_as_following(arg1);
	}

	@Then("^User click on next button$")
	public void user_click_on_next_button() throws Throwable{
		steps.user_click_on_next_button();
	}

	@Then("^Verify that after clicking on \"([^\"]*)\" button in \"([^\"]*)\" navigates to blog page$")
	public void verify_that_after_clicking_on_button_in_navigates_to_blog_page(String arg1, String arg2) throws Throwable{
		steps.verify_that_after_clicking_on_button_in_navigates_to_blog_page(arg1,arg2);
	}

    @Given("^User click on \"([^\"]*)\" category$")
    public void user_click_on_category(String arg1) throws Throwable{
		steps.user_click_on_category(arg1);
    }

    @Then("^Verify that \"([^\"]*)\" offer page displayed$")
    public void verify_that_offer_page_displayed(String arg1) throws Throwable{
		steps.verify_that_offer_page_displayed(arg1);
    }



}