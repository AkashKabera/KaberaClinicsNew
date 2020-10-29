@All @ChildCarePage

Feature: Child Care Page


  The purpose of the feature
  is to make sure
  that Child Care page functionality is working

  Background:
    Given user is on home page
    And User is on "Categories" section
    Then user click on "Child Care" link in "Categories" section
    Then Verify that "Child Health" pillar page displayed

  Scenario: Verify that Table of content links are working on Child Care page
    Then Verify that "Child Health" pillar page displayed
    And User click on TOC link "Why Child Health is Important?" on page
    Then Verify that "Why Child Health is Important?" section is displayed
    And Verify that TOC link "Why Child Health is Important?" is active
    And User click on TOC link "How can Parenting Affect Child Development?" on page
    Then Verify that "How can Parenting Affect Child Development?" section is displayed
    And Verify that TOC link "How can Parenting Affect Child Development?" is active
    And User click on TOC link "Conclusion" on page
    Then Verify that "Conclusion" section is displayed
    And Verify that TOC link "Conclusion" is active

  Scenario: Verify that user is able to book consultation from Child Care page
    And User click on Talk to Doc button in image
    Then Verify that "consult" page displayed
    And Verify that user is on "Consult" page
