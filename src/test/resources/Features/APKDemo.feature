@APKDemo @Regression, @Sanity
Feature: APKDemoApp
  Scenario: As a user I want to confirm text on Marquee
    Given I have an APKDemo app
    And I click on the TextView text
    When I confirm the text on Marquee
    Then the result should be "This use the default marquee animation limit of 3"
