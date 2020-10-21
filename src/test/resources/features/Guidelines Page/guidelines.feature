@All @GuidelinesPage

Feature: Guidelines Page


  The purpose of the feature
  is to make sure
  that Guidelines page functionality is working

  Background:
    Given user is on home page
    And user click on "Kabera Clinics Guidelines" head link
    Then Verify that "guidelines" page displayed
    And Verify that user is on "Guideline" page

  Scenario: Verify that Kabera Clinics Guidelines link is working on home page
     And Verify that user is on "Guideline" page

  Scenario: Verify that User is able to book consultation from Online Therapy Can Help section
    And user click on "Get Care " link
    Then Verify that "consult" page displayed

   Scenario: Verify that User is able to book consultation from How it works? section
    And user click on "Get Consultation online " link in "How it works?" section
    Then Verify that "consult" page displayed

   Scenario: Verify that user is able to select 1 month package from Our packages section
     And User select "1month" package from "Our packages" section
     And User Click on "Buy Now" button
     Then Verify that "payment" page displayed

   Scenario: Verify that user is able to select 3 month package from Our packages section
     And User select "3month" package from "Our packages" section
     And User Click on "Buy Now" button
     Then Verify that "payment" page displayed

   Scenario: Verify that user is able to select 6 month package from Our packages section
     And User select "6month" package from "Our packages" section
     And User Click on "Buy Now" button
     Then Verify that "payment" page displayed

   Scenario: Verify that user is able to select 12 month package from Our packages section
     And User select "12month" package from "Our packages" section
     And User Click on "Buy Now" button
     Then Verify that "payment" page displayed

  Scenario: Verify that blog page is displayed after clicking on Read Now button in Why do you need a health checkup? section
    Then Verify that after clicking on "Read Now" button in "Why do you need a health checkup?" navigates to blog page

  Scenario: Verify that blog page is displayed after clicking on Read Now button in What should an online health check do for you? section
    Then Verify that after clicking on "Read Now" button in "What should an online health check do for you?" navigates to blog page

  Scenario: Verify that blog page is displayed after clicking on Read Now button in Why us for a health care? section
    Then Verify that after clicking on "Read Now" button in "Why us for a health care?" navigates to blog page

  Scenario: Verify that blog page is displayed after clicking on Read Now button in Purpose of online health consultation? section
    Then Verify that after clicking on "Read Now" button in "Purpose of online health consultation?" navigates to blog page


    