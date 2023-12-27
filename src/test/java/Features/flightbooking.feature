
Feature: Flight Booking

  @three
  Scenario: Validate User is able book flight ticket
    Given user is on Application Landing Page
    And user navigates to flight finderpage
    When user chooses  passengers count
    And user selects From port
    And user Selects on Month and Day
    And user selects To port
    And user Selects Returing Month and Day
    And user selects Biussness class and Airline
    And user clicks on Continue Button
    Then Verify if the Flight is booked succesfully