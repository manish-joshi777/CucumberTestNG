Feature: Free CRM Application test

  Scenario: Validate free CRM HomePage

    Given user open browser
    Then user is on login page
    Then user login in app
    Then validate homepage title