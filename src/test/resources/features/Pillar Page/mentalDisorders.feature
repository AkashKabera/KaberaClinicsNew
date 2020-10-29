@All @MentalDisordersPage

Feature: Mental Disorders Page


  The purpose of the feature
  is to make sure
  that Mental Disorders page functionality is working

  Background:
    Given user is on home page
    And User is on "Categories" section
    Then user click on "Mental Disorders" link in "Categories" section
    Then Verify that "Mental Disorder" pillar page displayed

  Scenario: Verify that Table of content links are working on Mental Disorders page
    And User click on TOC link "Mental Disorder" on page
    Then Verify that "Mental Disorder" section is displayed
    And Verify that TOC link "Mental Disorder" is active
    And User click on TOC link "Top 15 Mental Disorder sympotms" on page
    Then Verify that "Top 15 Mental Disorder sympotms" section is displayed
    And Verify that TOC link "Top 15 Mental Disorder sympotms" is active
    And User click on TOC link "Conclusion" on page
    Then Verify that "Conclusion" section is displayed
    And Verify that TOC link "Conclusion" is active

  Scenario: Verify that user is able to book consultation from Mental Disorders page
    And User click on Talk to Doc button in image
    Then Verify that "consult" page displayed
    And Verify that user is on "Consult" page