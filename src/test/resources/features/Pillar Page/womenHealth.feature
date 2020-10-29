@All @WomenHealthPage

Feature: Women Health Page


  The purpose of the feature
  is to make sure
  that Women Health page functionality is working

  Background:
    Given user is on home page
    And User is on "Categories" section
    Then user click on "Women Health" link in "Categories" section
    Then Verify that "Women's Health" pillar page displayed

  Scenario: Verify that Table of content links are working on Women Health Page
    And User click on TOC link "What is PCOS?" on page
    Then Verify that "What is PCOS?" section is displayed
    And Verify that TOC link "What is PCOS?" is active
    And User click on TOC link "Symptoms of PCOS" on page
    Then Verify that "Symptoms of PCOS" section is displayed
    And Verify that TOC link "Symptoms of PCOS" is active
    And User click on TOC link "History of PCOS" on page
    Then Verify that "History of PCOS" section is displayed
    And Verify that TOC link "History of PCOS" is active
    And User click on TOC link "Types of Pcos?" on page
    Then Verify that "Types of Pcos?" section is displayed
    And Verify that TOC link "Types of Pcos?" is active
    And User click on TOC link "Conclusion" on page
    Then Verify that "Conclusion" section is displayed
    And Verify that TOC link "Conclusion" is active

  Scenario: Verify that user is able to book consultation from Women Health page
    And User click on Talk to Doc button in image
    Then Verify that "consult" page displayed
    And Verify that user is on "Consult" page