Feature: Login logout features

  Scenario: User is able to login in the app with valid credentials
    Given User launched the app
    And user is on default page of the app
    When user introduces the valid credentials
    And clicks on Login button
    Then user lands on homepage

  Scenario: User is able to logout
    When user clicks on logout button
    Then user lands on login page
