@All @ConsultPage

Feature: Consult Page


  The purpose of the feature
  is to make sure
  that Consult page functionality is working

  Background:
    Given user is on home page
    And user click on "BOOK AN ONLINE HOMEOPATHIC DOCTOR CONSULTATION" link
    Then Verify that "consult" page displayed
    And Verify that user is on "Consult" page

     Scenario: Verify that after clicking on consult link in the header consult page is displayed
     And Verify that user is on "Consult" page

   Scenario: Consult With a Doctor form - Field Validation
     And Verify that user is on "Consult" page
     And Verify that user is on "Consult with a Doctor" form
     And User Click on "Next" button in "Consult with a Doctor" form on consult page
     Then Verify that error message "Symptom Required" displayed on consult page
     Then Verify that error message "Phone Number Required" displayed on consult page

   Scenario: OTP Verify form - Field Validation
     And Verify that user is on "Consult" page
     And Verify that user is on "Consult with a Doctor" form
     Then User fill Consult with a doctor form as following
     | Symptoms     | fever               |
     | Phone Number | Random Phone Number |
     And User Click on "Next" button in "Consult with a Doctor" form on consult page
     Then Verify that success message "OTP Successfully Sent." displayed
     And Verify that user is on "verify your phone number" form
     And User Click on "Next" button in "verify your phone number" form on consult page
     Then Verify that error message "Please Enter OTP" displayed on consult page
     
   Scenario: User should not be able to book consultation with invalid OTP
     And Verify that user is on "Consult" page
     And Verify that user is on "Consult with a Doctor" form
     Then User fill Consult with a doctor form as following
       | Symptoms     | fever               |
       | Phone Number | Random Phone Number |
     And User Click on "Next" button in "Consult with a Doctor" form on consult page
     Then Verify that success message "OTP Successfully Sent." displayed
     And Verify that user is on "verify your phone number" form
     Then User enter an invalid OTP
     And User Click on "Next" button in "verify your phone number" form on consult page
     Then Verify that error message "Invalid OTP" displayed on consult page

   Scenario: Verify that Resend OTP link is working
     And Verify that user is on "Consult" page
     And Verify that user is on "Consult with a Doctor" form
     Then User fill Consult with a doctor form as following
       | Symptoms     | fever               |
       | Phone Number | Random Phone Number |
     And User Click on "Next" button in "Consult with a Doctor" form on consult page
     Then Verify that success message "OTP Successfully Sent." displayed
     And Verify that user is on "verify your phone number" form
     Then User enter an invalid OTP
     And User Click on "Next" button in "verify your phone number" form on consult page
     Then Verify that error message "Invalid OTP" displayed on consult page
     And user click on " Resend One-Time Password" link on consult page
     Then Verify that success message "OTP Successfully Sent." displayed
     And Verify that OTP field is reset

   Scenario: Verify that Entered a wrong number link is working
     And Verify that user is on "Consult" page
     And Verify that user is on "Consult with a Doctor" form
     Then User fill Consult with a doctor form as following
       | Symptoms     | fever               |
       | Phone Number | Random Phone Number |
     And User Click on "Next" button in "Consult with a Doctor" form on consult page
     Then Verify that success message "OTP Successfully Sent." displayed
     And Verify that user is on "verify your phone number" form
     And user click on "Entered a wrong number" link on consult page
     Then Verify that user is on "Consult with a Doctor" form

   Scenario: User should be able to add symptoms for consultation
     And Verify that user is on "Consult" page
     And Verify that user is on "Consult with a Doctor" form
     Then user enter symptom and click on Add button
     Then Verify that symptom is added in the list



     




