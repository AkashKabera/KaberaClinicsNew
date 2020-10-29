@All @MigraineHeadachePage

Feature: Migraine Headache Page


  The purpose of the feature
  is to make sure
  that Migraine Headache page functionality is working

  Background:
    Given user is on home page
    And User is on "Categories" section
    Then user click on "Migraine Headache" link in "Categories" section
    Then Verify that "Migraine Headache" pillar page displayed

  Scenario: Verify that Table of content links are working on Migraine Headache Page
    And User click on TOC link "What is Migraine Headache?" on page
    Then Verify that "What is Migraine Headache?" section is displayed
    And Verify that TOC link "What is Migraine Headache?" is active
    And User click on TOC link "What are the symptoms of migraine Headaches?" on page
    Then Verify that "What are the symptoms of migraine Headaches?" section is displayed
    And Verify that TOC link "What are the symptoms of migraine Headaches?" is active
    And User click on TOC link "How to cure Migraine Headache permanently?" on page
    Then Verify that "How to cure Migraine Headache permanently?" section is displayed
    And Verify that TOC link "How to cure Migraine Headache permanently?" is active
    And User click on TOC link "How to Reduce migraine headache?" on page
    Then Verify that "How to Reduce migraine headache?" section is displayed
    And Verify that TOC link "How to Reduce migraine headache?" is active
    And User click on TOC link "Conclusion" on page
    Then Verify that "Conclusion" section is displayed
    And Verify that TOC link "Conclusion" is active

  Scenario: Verify that user is able to book consultation from Migraine Headache page
    And User click on Talk to Doc button in image
    Then Verify that "consult" page displayed
    And Verify that user is on "Consult" page
