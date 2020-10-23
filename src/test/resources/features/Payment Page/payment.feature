@All @PaymentPage

Feature: Payment Page


  The purpose of the feature
  is to make sure
  that Payment page functionality is working

  Scenario:  Verify that Buy Now link is working in the header
    Given user is on home page
    And user click on "Buy Now" link
    Then Verify that "payment" page displayed
    Then Verify that user is on "Payment" page

    