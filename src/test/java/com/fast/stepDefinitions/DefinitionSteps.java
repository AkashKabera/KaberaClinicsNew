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

	@Then("^Fill the questionnaire as following for \"([^\"]*)\" button flow$")
	public void fill_the_questionnaire_as_following_for_button_flow(String arg1, DataTable arg2) throws Throwable {
		steps.fill_the_questionnaire_as_following_for_button_flow(arg1,arg2);
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

    @Given("^user click on \"([^\"]*)\" head link$")
    public void user_click_on_head_link(String arg1) throws Throwable{
	    steps.user_click_on_head_link(arg1);
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

    @Then("^Verify that \"([^\"]*)\" pillar page displayed$")
    public void verify_that_pillar_page_displayed(String arg1) throws Throwable{
	    steps.verify_that_pillar_page_displayed(arg1);
    }

	@Then("^Verify that after clicking on \"([^\"]*)\" icon in \"([^\"]*)\" navigates to \"([^\"]*)\" page$")
	public void verify_that_after_clicking_on_icon_in_navigates_to_page(String linkName, String section, String pageName) throws Throwable{
		steps.verify_that_after_clicking_on_icon_in_navigates_to_page(linkName,section,pageName);
	}

	@Given("^Enter an Email as following$")
	public void enter_an_Email_as_following(DataTable arg1) throws Throwable{
		steps.enter_an_Email_as_following(arg1);
	}

	@Then("^User Click on \"([^\"]*)\" button in footer$")
	public void user_Click_on_button_in_footer(String arg1) throws Throwable{
		steps.user_Click_on_button_in_footer(arg1);
	}

	@Then("^Verify that error message \"([^\"]*)\" displayed on keep up to date field$")
	public void verify_that_error_message_displayed_on_keep_up_to_date_field(String arg1) throws Throwable{
		steps.verify_that_error_message_displayed_on_keep_up_to_date_field(arg1);
	}


	@Then("^Enter an Invalid Email as following$")
	public void enter_an_Invalid_Email_as_following(DataTable arg1) throws Throwable{
		steps.enter_an_Invalid_Email_as_following(arg1);
	}

    @Given("^User select \"([^\"]*)\" package from \"([^\"]*)\" section$")
    public void user_select_package_from_section(String arg1, String arg2) throws Throwable{
		steps.user_select_package_from_section(arg1,arg2);
	}

    @Given("^Verify that user is on \"([^\"]*)\" page$")
    public void verify_that_user_is_on_page(String arg1) throws Throwable{
	    steps.verify_that_user_is_on_page(arg1);
    }

	@Given("^user click on \"([^\"]*)\" link in \"([^\"]*)\" section on homeopathy page$")
	public void user_click_on_link_in_section_on_homeopathy_page(String arg1, String arg2) throws Throwable{
		steps.user_click_on_link_in_section_on_homeopathy_page(arg1,arg2);
	}

    @Given("^user click on next button in \"([^\"]*)\" section$")
    public void user_click_on_next_button_in_section(String arg1) throws Throwable{
	    steps.user_click_on_next_button_in_section(arg1);
    }

    @Then("^user enter symptom \"([^\"]*)\"$")
    public void user_enter_symptom(String arg1) throws Throwable {
	    steps.user_enter_symptom(arg1);
    }

    @Then("^user select time period$")
    public void user_select_time_period() throws Throwable {
	    steps.user_select_time_period();
    }

    @Given("^Verify that user is on \"([^\"]*)\" form$")
    public void verify_that_user_is_on_form(String arg1) throws Throwable{
		steps.verify_that_user_is_on_form(arg1);
    }

    @Given("^User Click on \"([^\"]*)\" button in \"([^\"]*)\" form on consult page$")
    public void user_Click_on_button_in_form_on_consult_page(String arg1, String arg2) throws Throwable{
		steps.user_Click_on_button_in_form_on_consult_page(arg1,arg2);
    }

    @Then("^Verify that error message \"([^\"]*)\" displayed on consult page$")
    public void verify_that_error_message_displayed_on_consult_page(String arg1) throws Throwable {
		steps.verify_that_error_message_displayed_on_consult_page(arg1);
    }

	@Then("^User fill Consult with a doctor form as following$")
	public void user_fill_Consult_with_a_doctor_form_as_following(DataTable arg1) throws Throwable {
		steps.user_fill_Consult_with_a_doctor_form_as_following(arg1);
	}

	@Then("^User enter an invalid OTP$")
	public void user_enter_an_invalid_OTP() throws Throwable {
		steps.user_enter_an_invalid_OTP();
	}

	@Then("^Verify that OTP field is reset$")
	public void Verify_that_OTP_field_is_reset() throws Throwable {
		steps.Verify_that_OTP_field_is_reset();
	}

	@Given("^user click on \"([^\"]*)\" link on consult page$")
	public void user_click_on_link_on_consult_page(String arg1) throws Throwable{
		steps.user_click_on_link_on_consult_page(arg1);
	}

	@Then("^user enter symptom and click on Add button$")
	public void user_enter_symptom_and_click_on_Add_button() throws Throwable{
		steps.user_enter_symptom_and_click_on_Add_button();
	}

	@Then("^Verify that symptom is added in the list$")
	public void verify_that_symptom_is_added_in_the_list() throws Throwable{
		steps.verify_that_symptom_is_added_in_the_list();
	}

    @Given("^User click on \"([^\"]*)\" category link on guideline page$")
    public void user_click_on_category_link_on_guideline_page(String arg1)throws Throwable {
	    steps.user_click_on_category_link_on_guideline_page(arg1);
    }

    @Given("^User click on \"([^\"]*)\" category link on homeopathy page$")
    public void user_click_on_category_link_on_homeopathy_page(String arg1)throws Throwable {
	    steps.user_click_on_category_link_on_homeopathy_page(arg1);
    }

	@Given("^User click on TOC link \"([^\"]*)\" on page$")
	public void user_click_on_TOC_link_on_page(String arg1) throws Throwable{
		steps.user_click_on_TOC_link_on_page(arg1);
	}

	@Then("^Verify that \"([^\"]*)\" section is displayed$")
	public void verify_that_section_is_displayed(String arg1)throws Throwable {
		steps.verify_that_section_is_displayed(arg1);
	}

	@Then("^Verify that TOC link \"([^\"]*)\" is active$")
	public void verify_that_TOC_link_is_active(String arg1)throws Throwable {
		steps.verify_that_TOC_link_is_active(arg1);
	}

	@Given("^User click on Talk to Doc button in image$")
	public void user_click_on_Talk_to_Doc_button_in_image() throws Throwable{
		steps.user_click_on_Talk_to_Doc_button_in_image();
	}













}