@All @LandingPage

Feature: Landing Page


  The purpose of the feature
  is to make sure
  that landing page functionality is working

  Scenario: Verify that search bar lead functionality is working
    Given user is on home page
    And user searches for symptom as "fever"
    Then select a symptom from dropdown
    Then Fill the questionnaire as following
    | You Seem To Have The Symptoms Of Fever        | Yes                    |
    | How Long You Have Been Suffering?             | Less then 1 month      |
    | Do You Have More Symptoms?                    | Yes                    |
    | Type Your Symptoms And Add It To Your Chart?. | Skin Infection         |
    | Do You Want A Doctor To Call You?             | Yes                    |
    | Tell Us Your Phone Number.                    | 10 digit random number |
    | How About Your Name?                          | test + random string   |
    Then Verify that success message "Thank you for your enquiry. Our professional will get in touch shortly." displayed

  Scenario: Verify that talk to doc button is working
    Given user is on home page
    Then User Click on "Talk To Doc" button
    And User Click on "Call Me" button
    And Enter phone number
    | Phone Number | 10 Digits Random Number |
    And User Click on "Call Me" button
    Then Verify that success message "Thank you for your enquiry. Our professional will get in touch shortly." displayed

  Scenario: Talk to doc popup - Field Validation
    Given user is on home page
    Then User Click on "Talk To Doc" button
    And User Click on "Call Me" button
    Then Verify that error message "Please enter phone number." displayed

  Scenario:  Verify that BOOK AN ONLINE HOMEOPATHIC DOCTOR CONSULTATION link is working
    Given user is on home page
    And user click on "BOOK AN ONLINE HOMEOPATHIC DOCTOR CONSULTATION" link
    Then Verify that "consult" page displayed

  Scenario:  Verify that Buy Now link is working
    Given user is on home page
    And user click on "Buy Now" link
    Then Verify that "payment" page displayed

  Scenario:  Verify that Consult link is working
    Given user is on home page
    And user click on "Consult" link
    Then Verify that "consult" page displayed

  Scenario: Verify that Explore Now link is working in how homeopathy works section
    Given user is on home page
    And user click on "EXPLORE NOW" link in "how homeopathy works" section
    Then Verify that "how-homeopathy-works" page displayed

  Scenario: Verify that Personalized Consultation link is working
    Given user is on home page
    And user click on "Personalized Consultation" link
    Then Verify that "consult" page displayed

  Scenario: Verify that Talk To Our Doctors link is working
    Given user is on home page
    And user click on "Talk To Our Doctors" link
    And Enter phone number
      | Phone Number | 10 Digits Random Number |
    And User Click on "Submit" button
    Then Verify that success message "Thank you for your enquiry. Our professional will get in touch shortly." displayed

  Scenario: Verify that Kabera Clinics Guidelines link is working
    Given user is on home page
    And user click on "Kabera Clinics Guidelines" link
    Then Verify that "guidelines" page displayed

  Scenario: Verify that What We Do? link is working
    Given user is on home page
    And user click on "What We Do?" link
    Then Verify that "how-homeopathy-works" page displayed

  Scenario: Verify that user is able to Share Your Problem With Us
    Given user is on home page
    And User is on "Share Your Problem With Us" section
    Then User fill the Share Your Problem With Us form as following
    | Name                   | Test User + Random String             |
    | Phone Number           | 10 Digits Random Number               |
    | Email                  | testUser + random number + @gmail.com |
    | Problem you are facing | Fever                                 |
    And User Click on "Give Me A Solution" button
    Then Verify that success message "Thank you for your enquiry. Our professional will get in touch shortly." displayed

  Scenario: Share Your Problem With Us Form - Field Validations
    Given user is on home page
    And User is on "Share Your Problem With Us" section
    And User Click on "Give Me A Solution" button
    Then Verify that error message "Name is required" displayed
    Then Verify that error message "Phone Number is required" displayed
    Then Verify that error message "Email is required" displayed
    Then Verify that error message "Problem is required" displayed

  Scenario: Verify that Get Consultation button is working in India’s Best Doctors Are Online section
    Given user is on home page
    And User is on "India’s Best Doctors Are Online" section
    And User Click on "Get Consultation" button
    Then Verify that "consult" page displayed

  Scenario: Verify that Get Consultation button is working in Get Medicine Delivered section
    Given user is on home page
    And User is on "Get Medicine Delivered " section
    And User Click on "Get Consultation" button
    Then Verify that "consult" page displayed

  Scenario: Verify that You Are Suffering From? section is working
    Given user is on home page
    And User is on "You Are Suffering From?" section
    Then User fill the You Are Suffering From form as following
    | Symptom                                          | Fever                                  |
    | From How Long You Have Been Suffering From This? | Less than 1 month                      |
    | Name                                             | Test User + Random String              |
    | Phone Number                                     | 10 Digits random number                |
    | Email Address                                    | test_user + random number + @gmail.com |
    | Postal Address                                   | Mohali                                 |
    Then User click on next button
#    Then Verify that success message "Thank you for your enquiry. Our professional will get in touch shortly." displayed

  Scenario: Verify that blog page is displayed after clicking on See All button in Read Our Top Articles section
    Given user is on home page
    And User is on "Read Our Top Articles" section
    Then Verify that after clicking on "SEE ALL" button in "Read Our Top Articles" navigates to blog page
    Then Verify that after clicking on "READ MORE" button in "How Mindfulness Will Help You Battle Anything" navigates to blog page
    Then Verify that after clicking on "READ MORE" button in "5 Ways To Live Like Lord Buddha In The Corona Age" navigates to blog page

  Scenario: Verify that user is able to book consultation form Book Now button in Skip the Travel section
    Given user is on home page
    And User is on "Skip the Travel" section
    Then User Click on "BOOK NOW" button
    Then Verify that "consult" page displayed

  Scenario: Verify that user is able to book consultation from Get unlimited consultation section
    Given user is on home page
    And User is on "Get Unlimited Consultation" section
    And user click on "Limited Period Offer" link in "Get Unlimited Consultation" section
    Then Verify that "consult" page displayed

  Scenario: Verify that user is able to use coupons from Get 20% OFF On Monthly Packages section
    Given user is on home page
    And User is on "Get 20% OFF On Monthly Packages" section
    And user click on "Limited Period Offer" link in "Get 20% OFF On Monthly Packages" section
    Then Verify that "payment" page displayed

  Scenario: Verify that user is able to book consultation from Benefits of Online Consultation section
    Given user is on home page
    And User is on "Benefits of Online Consultation" section
    And User Click on "CONSULT NOW" button
    Then Verify that "consult" page displayed

  Scenario: Verify that offers are displayed for Arthritis Treatment
    Given user is on home page
    And  User click on "Arthritis Treatment " category
    Then Verify that "offers" page displayed
    Then Verify that "Arthritis Treatment" offer page displayed

  Scenario: Verify that offers are displayed for Diabetes Treatment
    Given user is on home page
    And  User click on "Diabetes Treatment" category
    Then Verify that "offers" page displayed
    Then Verify that "Diabetes Treatment" offer page displayed

  Scenario: Verify that offers are displayed for Hair Problem
    Given user is on home page
    And  User click on "Hair Problem" category
    Then Verify that "offers" page displayed
    Then Verify that "Hair Problem" offer page displayed

  Scenario: Verify that offers are displayed for Immune System
    Given user is on home page
    And  User click on "Immune System" category
    Then Verify that "offers" page displayed
    Then Verify that "Immune System" offer page displayed

  Scenario: Verify that offers are displayed for Migraine Headache
    Given user is on home page
    And  User click on "Migraine Headache" category
    Then Verify that "offers" page displayed
    Then Verify that "Migraine Headache" offer page displayed

  Scenario: Verify that offers are displayed for Skin Diseases
    Given user is on home page
    And  User click on "Skin Diseases" category
    Then Verify that "offers" page displayed
    Then Verify that "Skin Diseases" offer page displayed

  Scenario: Verify that offers are displayed for Blood Pressure
    Given user is on home page
    And  User click on "Blood Pressure" category
    Then Verify that "offers" page displayed
    Then Verify that "Blood Pressure" offer page displayed

  Scenario: Verify that offers are displayed for Child Care
    Given user is on home page
    And  User click on "Child Care" category
    Then Verify that "offers" page displayed
    Then Verify that "Child Care" offer page displayed

  Scenario: Verify that offers are displayed for Mental Disorders
    Given user is on home page
    And  User click on "Mental Disorders" category
    Then Verify that "offers" page displayed
    Then Verify that "Mental Disorders" offer page displayed

  Scenario: Verify that offers are displayed for Womens Health
    Given user is on home page
    And  User click on "Womens Health" category
    Then Verify that "offers" page displayed
    Then Verify that "Womens Health" offer page displayed

