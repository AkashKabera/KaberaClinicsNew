@All @HomeopathyPage

Feature: Homeopathy Page


  The purpose of the feature
  is to make sure
  that Homeopathy page functionality is working

  Background:
    Given user is on home page
    And user click on "What We Do?" head link
    Then Verify that "how-homeopathy-works" page displayed
    And Verify that user is on "How Homeopathy Works" page

  Scenario: Verify that What We Do? link is working on home page
    And Verify that user is on "How Homeopathy Works" page

  Scenario: Verify that Get Call button is working on homeopathy page
    Then User Click on " Get Call" button
    And User Click on "Call Me" button
    And Enter phone number
      | Phone Number | 10 Digits Random Number |
    And User Click on "Call Me" button
    Then Verify that success message "Thank you for your enquiry. Our professional will get in touch shortly." displayed

  Scenario: Verify that Explore Now link is working in how homeopathy works section on homeopathy page
    And user click on "EXPLORE NOW" link in "how homeopathy works" section on homeopathy page
    Then Verify that "consult" page displayed

  Scenario: Verify that You Are Suffering From? section is working on homeopathy page
    And User is on "You are suffering form?" section
    Then User fill the You Are Suffering From form as following
      | Symptom                                          | Fever                                  |
      | From How Long You Have Been Suffering From This? | Less than 1 month                      |
      | Name                                             | Test User + Random String              |
      | Phone Number                                     | 10 Digits random number                |
      | Email Address                                    | test_user + random number + @gmail.com |
      | Postal Address                                   | Mohali                                 |
    Then User click on next button

  Scenario: You Are Suffering From on homeopathy page - Field Validation
    And User is on "You Are Suffering From?" section
    And user click on next button in "You Are Suffering From?" section
    Then Verify that error message "Symptom is required" displayed
    And user enter symptom "fever"
    And user click on next button in "You Are Suffering From?" section
    And user click on next button in "From How Long You Have Been Suffering From This?" section
    Then Verify that error message "Please select an option" displayed
    And user select time period
    And user click on next button in "From How Long You Have Been Suffering From This?" section
    And user click on next button in "Enter Your Details So That Our Doctors Can Reach You With A Solution" section
    Then Verify that error message "Name is required" displayed
    Then Verify that error message "Phone Number is required" displayed
    Then Verify that error message "Email is required" displayed
    Then Verify that error message "Postal Address is required" displayed


