@All @LandingPage

Feature: Landing Page


  The purpose of the feature
  is to make sure
  that landing page functionality is working

  @test1
  Scenario: search lead
    Given user is on home page
    And user searches for symptom as "fever"
    Then select a symptom from dropdown
    Then Fill the questionnaire as following
      | Did you Speak | Yes |
    Then Verify that success message "abc" displayed

