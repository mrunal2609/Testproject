

Feature: Title of your feature
  I want to use this template for my feature file

  Background:
   Given user open browser
    And user open url
  Scenario: To verify user login with valid credentilas
    When user click on sign in
    And user enters username"username"
    And user enters pass"password"
    Then user clcik on submit
    Then user logged into appl"username"
 