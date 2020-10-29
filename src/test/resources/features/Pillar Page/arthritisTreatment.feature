@All @ArthritisTreatmentPage

Feature: Arthritis Treatment Page


  The purpose of the feature
  is to make sure
  that Arthritis Treatment page functionality is working

  Background:
    Given user is on home page
    And User is on "Categories" section
    Then user click on "Arthritis treatment" link in "Categories" section
    Then Verify that "Arthritis Treatment" pillar page displayed

 Scenario: Verify that Table of content links are working on Arthritis Treatment page
   Then Verify that "Arthritis Treatment" pillar page displayed
   And User click on TOC link "What is Arthritis?" on page
   Then Verify that "What is Arthritis?" section is displayed
   And Verify that TOC link "What is Arthritis?" is active
   And User click on TOC link "What Causes Arthritis?" on page
   Then Verify that "What Causes Arthritis?" section is displayed
   And Verify that TOC link "What Causes Arthritis?" is active
   And User click on TOC link "Arthritis Pain" on page
   Then Verify that "Arthritis Pain" section is displayed
   And Verify that TOC link "Arthritis Pain" is active
   And User click on TOC link "Conclusion" on page
   Then Verify that "Conclusion" section is displayed
   And Verify that TOC link "Conclusion" is active
   And User click on TOC link "COVID-19 and Arthritis" on page
   Then Verify that "COVID-19 and Arthritis" section is displayed
   And Verify that TOC link "COVID-19 and Arthritis" is active

 Scenario: Verify that user is able to book consultation from Arthritis Treatment page
   And User click on Talk to Doc button in image
   Then Verify that "consult" page displayed
   And Verify that user is on "Consult" page




