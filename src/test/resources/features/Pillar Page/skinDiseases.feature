@All @SkinDiseasePage

Feature: Skin Disease Page


  The purpose of the feature
  is to make sure
  that Skin Disease page functionality is working

  Background:
    Given user is on home page
    And User is on "Categories" section
    Then user click on "Skin Diseases" link in "Categories" section
    Then Verify that "Skin Diseases" pillar page displayed

  Scenario: Verify that Table of content links are working on Skin Disease Page
    And User click on TOC link "What is a Skin Problem?" on page
    Then Verify that "What is a Skin Problem?" section is displayed
    And Verify that TOC link "What is a Skin Problem?" is active
    And User click on TOC link "Some Commonly Asked Questions on Skin Diseases" on page
    Then Verify that "Some Commonly Asked Questions on Skin Diseases" section is displayed
    And Verify that TOC link "Some Commonly Asked Questions on Skin Diseases" is active
    And User click on TOC link "What are the Common Causes of Skin Diseases?" on page
    Then Verify that "What are the Common Causes of Skin Diseases?" section is displayed
    And Verify that TOC link "What are the Common Causes of Skin Diseases?" is active
    And User click on TOC link "Conclusion" on page
    Then Verify that "Conclusion" section is displayed
    And Verify that TOC link "Conclusion" is active

  Scenario: Verify that user is able to book consultation from Skin Diseases page
    And User click on Talk to Doc button in image
    Then Verify that "consult" page displayed
    And Verify that user is on "Consult" page
