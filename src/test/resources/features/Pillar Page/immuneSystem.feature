@All @ImmuneSystemPage

Feature: Immune System Page


  The purpose of the feature
  is to make sure
  that Immune System page functionality is working

  Background:
    Given user is on home page
    And User is on "Categories" section
    Then user click on "Immune system" link in "Categories" section
    Then Verify that "Immune System" pillar page displayed

  Scenario: Verify that Table of content links are working on immune System page
    And User click on TOC link "What is an Immune System?" on page
    Then Verify that "What is an Immune System?" section is displayed
    And Verify that TOC link "What is an Immune System?" is active
    And User click on TOC link "Complement System" on page
    Then Verify that "Complement System" section is displayed
    And Verify that TOC link "Complement System" is active
    And User click on TOC link "How to Boost your Immunity Against Coronavirus?" on page
    Then Verify that "How to Boost your Immunity Against Coronavirus?" section is displayed
    And Verify that TOC link "How to Boost your Immunity Against Coronavirus?" is active
    And User click on TOC link "Conclusion" on page
    Then Verify that "Conclusion" section is displayed
    And Verify that TOC link "Conclusion" is active

  Scenario: Verify that user is able to book consultation from Immune System page
    And User click on Talk to Doc button in image
    Then Verify that "consult" page displayed
    And Verify that user is on "Consult" page

