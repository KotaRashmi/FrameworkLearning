Feature: User Registrations and Login validations
  @registartion
  Scenario: Successful user registration
    Given user is on Application registration page
    And user provides username Password and confirm password
    When user clicks on submit button
    Then verify if user registered successfully

  @login
  Scenario: Validate User is able to Login with Valid Credentials
     Given user is on Application Landing Page
     And user enters valid username and Password
     When user clicks on login button
     Then verify user logged in successfully

  @InvalidLogin
  Scenario: Validate User is unable to Login with invalid credentials
     Given user is on Application Landing Page
     And user enters Invalid username and Password
     When user clicks on login button
     And Verify user is not loggedin and invalid credentials message displayed

