@calculator @Regression, @Sanity
Feature: Calculator
  Scenario: As a user i want to add two numbers
    Given I have a calculator
    And i click on the number 5
    And i clik the PLUS "op_add" button
    And i click the send number 3
    When i click on the EQUALS "eq" button
    Then the result should be 8