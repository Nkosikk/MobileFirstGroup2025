@APKDemo @Regression, @Sanity
Feature: APKDemoApp
  Scenario: As a user I want to confirm text on Marquee
    Given I have an APKDemo app
    And I click on the TextView text
    When I click on the Marquee text
    Then the result should be "This use the default marquee animation limit of 3"


  Scenario: As a user I want to confirm text on WebView3
    Given I have an APKDemo app
    And I click on the Views text
    When I click on the WebView3 text
    Then the result should be "This is a WebView3"



  #//android.widget.TextView[@content-desc="Views"]
  #//android.widget.TextView[@content-desc="WebView3"]*/
  #//android.widget.ScrollView