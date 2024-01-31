Feature: Open cart application Signin feature

  Scenario: Login to Opencart application with invalid testdata
    Given Type Opencart  URL using any browser
    When user enter invalid email and password
    And click on Login button
    Then Check the Warning message is displayed or not

    Scenario: Login to Opencart application with valid testdata
    Given Type Opencart  URL using any browser
    When user enter valid email and password
    And click on Login button
    Then Check the Warning message is displayed or not
    