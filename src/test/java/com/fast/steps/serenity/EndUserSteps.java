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
	GuidelinesPage guidelinesPage;
	HomeopathyPage homeopathyPage;

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
	public void fill_the_questionnaire_as_following_for_button_flow(String arg1, DataTable arg2)throws Throwable {
		List<List<String>> data = arg2.raw();
		if(arg1.equals("Yes")){
			String btn1="Next";
			String btn2="Ok";
			String symptom = data.get(3).get(1);
			String btn = data.get(0).get(1);
			homePage.fillTheQuestionnaireForYesButton(btn,btn1,btn2,symptom);
		}
		else if(arg1.equals("No")){
			String btn1="Next";
			String btn2="Ok";
			String symptom = data.get(1).get(1);
			String btn = data.get(0).get(1);
			homePage.fillTheQuestionnaireForNoButton(btn,btn1,btn2,symptom);
		}
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
	public void user_click_on_head_link(String arg1) throws Throwable{
		driverDashboard.clickOnHeadLink(arg1);
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
		}
		else if (arg2.equals("How Mindfulness Will Help You Battle Anything")) {
			Assert.assertEquals("https://blog.kaberaclinics.com/how-mindfulness-will-help-you-battle-anything/", homePage.isBlogPageDisplayed(arg1, arg2));
			homePage.clickOnBlog(arg1,arg2);
			String blogName = "How Mindfulness Will Help You Battle Anything";
			Assert.assertEquals(blogName, homePage.getBlogHead(blogName));
		}
		else if (arg2.equals("5 Ways To Live Like Lord Buddha In The Corona Age")) {
			Assert.assertEquals("https://blog.kaberaclinics.com/5-ways-to-live-like-lord-buddha-in-the-corona-age/", homePage.isBlogPageDisplayed(arg1, arg2));
			homePage.clickOnBlog(arg1,arg2);
			String blogName = "5 Ways to Live Like Lord Buddha in the Corona Age";
			Assert.assertEquals(blogName, homePage.getBlogHead(blogName));
		}
		else if (arg2.equals("Why do you need a health checkup?")) {
			guidelinesPage.clickOnReadNowLink(arg2);
			Assert.assertEquals("https://blog.kaberaclinics.com/why-do-you-need-a-health-check-up/", extendedPageObject.getURL());
			String blogName = "Why Do You Need a Health Check-Up?";
			Assert.assertEquals(blogName,guidelinesPage.getBlogHead(blogName));
		}
		else if (arg2.equals("What should an online health check do for you?")) {
			guidelinesPage.clickOnReadNowLink(arg2);
			Assert.assertEquals("https://blog.kaberaclinics.com/what-should-an-online-health-check-up-do-for-you/", extendedPageObject.getURL());
			String blogName = "What should an Online Health check-up do for you?";
			Assert.assertEquals(blogName,guidelinesPage.getBlogHead(blogName));
		}
		else if (arg2.equals("Why us for a health care?")) {
			guidelinesPage.clickOnReadNowLink(arg2);
			Assert.assertEquals("https://blog.kaberaclinics.com/why-kabera-clinics-for-health-care/", extendedPageObject.getURL());
			String blogName = "Why Kabera Clinics for health care?";
			Assert.assertEquals(blogName,guidelinesPage.getBlogHead(blogName));
		}
		else if (arg2.equals("Purpose of online health consultation?")) {
			guidelinesPage.clickOnReadNowLink(arg2);
			Assert.assertEquals("https://blog.kaberaclinics.com/what-is-the-purpose-of-online-health-care/", extendedPageObject.getURL());
			String blogName = "What is the purpose of Online Health Care?";
			Assert.assertEquals(blogName,guidelinesPage.getBlogHead(blogName));
		}
}

	@Step
	public void user_click_on_category(String arg1) throws Throwable{
		homePage.clickOnCategory(arg1);
	}

	@Step
	public void verify_that_offer_page_displayed(String arg1) throws Throwable{
		Assert.assertTrue(homePage.isCategoryOfferPageDisplayed(arg1).contains(arg1));
	}

	@Step
	public void verify_that_pillar_page_displayed(String arg1) throws Throwable{
		if(arg1.equals("Migraine Headache") || arg1.equals("Women's Health")){
			String head = "Introduction";
			Assert.assertTrue(homePage.getPillarPage(head).contains(head.toUpperCase()));
		}
		else {
			Assert.assertTrue(homePage.getPillarPage(arg1).contains(arg1.toUpperCase()));
		}
	}

	@Step
	public void verify_that_after_clicking_on_icon_in_navigates_to_page(String linkName, String section, String pageName) throws Throwable{
		if(linkName.equals("facebook")){
			Assert.assertTrue(homePage.getSocialPage(linkName,section).contains("https://www.facebook.com/clinicskabera"));
		}
		else if(linkName.equals("twitter")){
			Assert.assertTrue(homePage.getSocialPage(linkName,section).contains("https://twitter.com/kabera_clinics"));
		}
		else if(linkName.equals("instagram")){
			Assert.assertTrue(homePage.getSocialPage(linkName,section).contains("https://www.instagram.com/kabera.clinics/"));
		}
		else if(linkName.equals("youtube")){
			Assert.assertTrue(homePage.getSocialPage(linkName,section).contains("https://www.youtube.com/channel/UCYSag6-AV4NWc2GyYVICZAQ"));
		}
	}

	@Step
	public void enter_an_Email_as_following(DataTable arg1) throws Throwable{
		homePage.enterRandomEmail();
	}

	@Step
	public void user_Click_on_button_in_footer(String arg1) throws Throwable{
		driverDashboard.clickOnGivenButton1(arg1);
	}

	@Step
	public void verify_that_error_message_displayed_on_keep_up_to_date_field(String arg1) throws Throwable{
		Assert.assertEquals(arg1,homePage.getErrorMessageOnFooter(arg1));
	}

	@Step
	public void enter_an_Invalid_Email_as_following(DataTable arg1) throws Throwable{
		homePage.enterRandomInvalidEmail();

	}

	@Step
	public void user_select_package_from_section(String arg1, String arg2)throws Throwable {
		guidelinesPage.selectPackage(arg1);
	}

	@Step
	public void verify_that_user_is_on_page(String arg1) throws Throwable{
		Assert.assertEquals(arg1,homeopathyPage.getPageHead(arg1));
	}

	@Step
	public void user_click_on_link_in_section_on_homeopathy_page(String arg1, String arg2) throws Throwable{
		homeopathyPage.clickOnGivenButton(arg1,arg2);
	}

	@Step
	public void user_click_on_next_button_in_section(String arg1) throws Throwable{
		homePage.clickOnNextButton(arg1);
	}

	@Step
	public void user_enter_symptom(String arg1) throws Throwable {
		homePage.enterSymptom(arg1);
	}

	@Step
	public void user_select_time_period() throws Throwable {
		homePage.selectTimePeriod();
	}













}
