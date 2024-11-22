#@Regression
Feature: user can register to the system
  Scenario: user register to the system with valid data
    Given user click to user icon
    And Click On Create Account Button
    When enter the user name
    And enter the email
    And enter the password
    And confirm his password
    And enter his first name and last name
    And enter his phone number
    And enter his country
    And enter his city
    And enter his address
    And enter his state and postal code
    And agree on policy
    And click on Register button
