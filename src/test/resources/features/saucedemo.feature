Feature: Login Feature

  Scenario: Positive login test
    Given User is on the login page
    When User enters username and password
    And Clicks on login button
    Then User should be navigated to the home page

  Scenario: Negative login test with invalid credentials
    Given User is on the login page
    When User enters invalid username and password
    And Clicks on login button
    Then Error message should be displayed
