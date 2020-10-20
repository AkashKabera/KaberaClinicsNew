@All @HomeopathyPage

Feature: Homeopathy Page


  The purpose of the feature
  is to make sure
  that Homeopathy page functionality is working

  Scenario: Verify that Explore Now link is working in how homeopathy works section on home page
    Given user is on home page
    And user click on "EXPLORE NOW" link in "how homeopathy works" section
    Then Verify that "how-homeopathy-works" page displayed
