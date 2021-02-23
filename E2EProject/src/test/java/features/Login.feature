Feature: feature to test Login functionality


  Scenario: Check loging is successful with credentials
    Given user is on loging page
    When user enters username and password
    And click on login button
    Then user is navigated to the homepage