@All @DiabetesTreatmentPage

Feature: Diabetes Treatment Page


  The purpose of the feature
  is to make sure
  that Diabetes Treatment page functionality is working

  Background:
    Given user is on home page
    And User is on "Categories" section
    Then user click on "Diabetes Treatment" link in "Categories" section
    Then Verify that "Diabetes Treatment" pillar page displayed

  Scenario: Verify that Table of content links are working on Diabetes Treatment page
    And User click on TOC link "Diabetes Treatment" on page
    Then Verify that "Diabetes Treatment" section is displayed
    And Verify that TOC link "Diabetes Treatment" is active
    And User click on TOC link "What is Diabetes?" on page
    Then Verify that "What is Diabetes?" section is displayed
    And Verify that TOC link "What is Diabetes?" is active
    And User click on TOC link "What Causes Pre-diabetes" on page
    Then Verify that "What Causes Pre-diabetes" section is displayed
    And Verify that TOC link "What Causes Pre-diabetes" is active
    And User click on TOC link "Conclusion" on page
    Then Verify that "Conclusion" section is displayed
    And Verify that TOC link "Conclusion" is active
## Prediabetes link is missing in TOC

  Scenario: Verify that user is able to book consultation from Diabetes Treatment page
    And User click on Talk to Doc button in image
    Then Verify that "consult" page displayed
    And Verify that user is on "Consult" page