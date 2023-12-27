Feature: User Registrations and Login
  Scenario Outline: Successful user registration
    Given user is on Application registration page
    And user provides username <User> Password <pswd> and confirmpassword <confirmPswd>
    When user clicks on submit button
    Then verify if user registered succesfully
    Examples:
      | User | pswd     | confirmPswd |
      | kota | password | password    |
@Validcase
    Scenario Outline: Validate User is able to Login with Valid Credentials
      Given user is on Application Landing Page
      And user enters username <User> Password <pswd>
      When user clicks on login button
      Then verify user logged in succesfully
      Examples:
        | User | pswd     |  |
        | kota | password |  |
@Invalidcase
 Scenario Outline: Validate User is unable to Login with invalid credentials
   Given user is on Application Landing Page
   And user enters username <User> Password <pswd>
   When user clicks on login button
   And Verify user is not loggedin and invalid credentials message displayed

   Examples:
     | User | pswd   |  |
     | kota | Abcdef |  |
