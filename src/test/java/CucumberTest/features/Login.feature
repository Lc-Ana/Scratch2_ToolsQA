@Regression @LoginLogout
Feature: Login logout features

  @Login
  Scenario: User is able to login in the app with valid credentials
    Given User launched the app
    And user is on default page of the app
    When user introduces the valid credentials
      | username      | password     |
      | standard_user | secret_sauce |
      | problem_user  | secret_sauc |
    #And clicks on Login button
    #Then user lands on homepage

  #@Logout
  #Scenario: User is able to logout
    #When user clicks on logout button
    #Then user lands on login page
