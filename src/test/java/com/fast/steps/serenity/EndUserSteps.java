package com.fast.steps.serenity;

import com.kaberaClinics.pages.*;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.util.List;
import java.util.Random;

public class EndUserSteps {

	LandingPage landingPage;
	DriverPage driverPage;
	DriverDashboard driverDashboard;
	HomePage homePage;
	ExtendedPageObject extendedPageObject;

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
		String btn2="Ok";
		homePage.fillTheQuestionnaire(btn,btn1,btn2);
	}

	@Step
	public void verify_that_success_message_displayed(String arg1) throws Throwable{
		Assert.assertEquals(arg1,homePage.getSuccessMessage());
	}

	@Step
	public void user_Click_on_button(String arg1) throws Throwable{
		driverDashboard.clickOnGivenButton(arg1);
	}

	@Step
	public void enter_phone_number(DataTable arg1) throws Throwable{
		homePage.enterRandomPhoneNumber();
	}

	@Step
	public void verify_that_error_message_displayed(String arg1) throws Throwable{
		Assert.assertEquals(arg1,homePage.getErrorMessage(arg1));
	}

	@Step
	public void user_click_on_link(String arg1) throws Throwable{
		driverDashboard.clickOnLink(arg1);
	}

	@Step
	public void verify_that_page_displayed(String arg1) throws Throwable{
		Assert.assertTrue(extendedPageObject.getURL().contains(arg1));
	}

	@Step
	public void user_click_on_link_in_section(String arg1, String arg2) throws Throwable{
		homePage.clickOnGivenLink(arg1,arg2);
	}

	@Step
	public void user_is_on_section(String arg1) throws Throwable{
		homePage.scrollToSection(arg1);
	}

	@Step
	public void user_fill_the_Share_Your_Problem_With_Us_form_as_following(DataTable arg1) throws Throwable{
		List<List<String>> data = arg1.raw();
		String problem =data.get(3).get(1);
		int phone =1000000000+(int)(Math.random()*91);
		int num =100+(int)(Math.random()*91);
		Random rand = new Random();
		char c = (char) (rand.nextInt(26) + 'a');
		String name = "Test User" + c + c;
		String email = "Test_user" + c + c + num + "@gmail.com";
		System.out.println(problem);
		driverDashboard.sendValueByPlaceHolder("Name",name);
		driverDashboard.sendValueByPlaceHolder("Phone no.",phone+"");
		driverDashboard.sendValueByPlaceHolder("Email",email);
		driverDashboard.sendValueByPlaceHolder1("Problem you are facing",problem);
	}

	@Step
	public void user_fill_the_You_Are_Suffering_From_form_as_following(DataTable arg1)throws Throwable {
		List<List<String>> data = arg1.raw();
		String problem =data.get(0).get(1);
		String address =data.get(5).get(1);
		homePage.fillFindYourDiseaseForm(problem,address);
	}


	@Step
	public void user_click_on_next_button() throws Throwable{
		homePage.clickOnNextButton();
	}

	@Step
	public void verify_that_after_clicking_on_button_in_navigates_to_blog_page(String arg1, String arg2) throws Throwable {
		if (arg2.equals("Read Our Top Articles")) {
			Assert.assertEquals("https://blog.kaberaclinics.com/", homePage.isBlogPageDisplayed(arg1, arg2));
		} else if (arg2.equals("How Mindfulness Will Help You Battle Anything")) {
			Assert.assertEquals("https://blog.kaberaclinics.com/3-tips-on-how-mindfulness-can-help-you-battle-anything/", homePage.isBlogPageDisplayed(arg1, arg2));
		} else if (arg2.equals("5 Ways To Live Like Lord Buddha In The Corona Age")) {
			Assert.assertEquals("https://blog.kaberaclinics.com/5-ways-to-live-like-lord-buddha-in-the-corona-age/", homePage.isBlogPageDisplayed(arg1, arg2));
		}
	}

	@Step
	public void user_click_on_category(String arg1) throws Throwable{
		homePage.clickOnCategory(arg1);
	}

	@Step
	public void verify_that_offer_page_displayed(String arg1) throws Throwable{
		Assert.assertTrue(homePage.isCategoryOfferPageDisplayed().contains(arg1));
	}

	}
