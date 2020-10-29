@All @BloodPressurePage

Feature: Blood Pressure Page


  The purpose of the feature
  is to make sure
  that Blood Pressure page functionality is working

  Background:
    Given user is on home page
    And User is on "Categories" section
    Then user click on "Blood Pressure" link in "Categories" section
    Then Verify that "Blood Pressure" pillar page displayed

  Scenario: Verify that Table of content links are working on Blood Pressure page
    Then Verify that "Blood Pressure" pillar page displayed
    And User click on TOC link "What is Blood Pressure?" on page
    Then Verify that "What is Blood Pressure?" section is displayed
    And Verify that TOC link "What is Blood Pressure?" is active
    And User click on TOC link "How to lower blood pressure?" on page
    Then Verify that "How to lower blood pressure?" section is displayed
    And Verify that TOC link "How to lower blood pressure?" is active
    And User click on TOC link "When to hospitalize?" on page
    Then Verify that "When to hospitalize?" section is displayed
    And Verify that TOC link "When to hospitalize?" is active
    And User click on TOC link "Low Blood Pressure Treatment" on page
    Then Verify that "Low Blood Pressure Treatment" section is displayed
    And Verify that TOC link "Low Blood Pressure Treatment" is active
    And User click on TOC link "Bibliography" on page
    Then Verify that "Bibliography" section is displayed
    And Verify that TOC link "Bibliography" is active

  Scenario: Verify that user is able to book consultation from Blood Pressure page
    And User click on Talk to Doc button in image
    Then Verify that "consult" page displayed
    And Verify that user is on "Consult" page
