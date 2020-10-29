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
    Then Verify that after clicking on "Read Now" button in "Why do you need a health check-up?" navigates to blog page

  Scenario: Verify that blog page is displayed after clicking on Read Now button in What should an online health check-up do for you? section
    Then Verify that after clicking on "Read Now" button in "What should an online health check-up do for you?" navigates to blog page

  Scenario: Verify that blog page is displayed after clicking on Read Now button in Why Kabera Clinics for health care? section
    Then Verify that after clicking on "Read Now" button in "Why Kabera Clinics for health care?" navigates to blog page

  Scenario: Verify that blog page is displayed after clicking on Read Now button in What is the purpose of online health care? section
    Then Verify that after clicking on "Read Now" button in "What is the purpose of online health care?" navigates to blog page

  Scenario: Verify that Arthritis Treatment Category link is working on guideline page
    And User click on "Arthritis Treatment" category link on guideline page
    Then Verify that "Arthritis Treatment" pillar page displayed

  Scenario: Verify that Diabetes Treatment Category link is working on guideline page
    And User click on "Diabetes Treatment" category link on guideline page
    Then Verify that "Diabetes Treatment" pillar page displayed

  Scenario: Verify that Hair Treatment Category link is working on guideline page
    And User click on "Hair Treatment" category link on guideline page
    Then Verify that "Hair Problems Solutions" pillar page displayed

  Scenario: Verify that Immune booster Category link is working on guideline page
    And User click on "Immune booster" category link on guideline page
    Then Verify that "Immune System" pillar page displayed

  Scenario: Verify that Migraine Treatment Category link is working on guideline page
    And User click on "Migraine Treatment" category link on guideline page
    Then Verify that "Migraine Headache" pillar page displayed

  Scenario: Verify that Skin Treatment Category link is working on guideline page
    And User click on "Skin Treatment" category link on guideline page
    Then Verify that "Skin Diseases" pillar page displayed

  Scenario: Verify that Blood Pressure Category link is working on guideline page
    And User click on "Blood Pressure" category link on guideline page
    Then Verify that "Blood Pressure" pillar page displayed

  Scenario: Verify that Child Care Category link is working on guideline page
    And User click on "Child Care" category link on guideline page
    Then Verify that "Child Health" pillar page displayed

  Scenario: Verify that Mental Disorders Category link is working on guideline page
    And User click on "Mental Disorders" category link on guideline page
    Then Verify that "Mental Disorder" pillar page displayed

  Scenario: Verify that Women Problem Category link is working on guideline page
    And User click on "PCOS(Women Problem)" category link on guideline page
    Then Verify that "Women's Health" pillar page displayed
