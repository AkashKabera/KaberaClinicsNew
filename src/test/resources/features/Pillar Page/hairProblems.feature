@All @HairProblemPage

Feature: Hair Problem Page


  The purpose of the feature
  is to make sure
  that Hair Problem page functionality is working

  Background:
    Given user is on home page
    And User is on "Categories" section
    Then user click on "Hair problems" link in "Categories" section
    Then Verify that "Hair Problems Solutions" pillar page displayed

  Scenario: Verify that Table of content links are working on Hair Problem page
    And User click on TOC link "What is Hair?" on page
    Then Verify that "What is Hair?" section is displayed
    And Verify that TOC link "What is Hair?" is active
    And User click on TOC link "What are the Common Hair Problems" on page
    Then Verify that "What are the Common Hair Problems" section is displayed
    And Verify that TOC link "What are the Common Hair Problems" is active
    And User click on TOC link "Conclusion" on page
    Then Verify that "Conclusion" section is displayed
    And Verify that TOC link "Conclusion" is active

  Scenario: Verify that user is able to book consultation from Hair Problem page
    And User click on Talk to Doc button in image
    Then Verify that "consult" page displayed
    And Verify that user is on "Consult" page
