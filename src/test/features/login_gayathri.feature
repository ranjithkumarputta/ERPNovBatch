Feature: Validate Login behaviour

 @run1
  Scenario: Validate login behaviour using valid credentials

    Given I am on the IM login page
    When I enter "admin@gic.com" in the email field
    And I enter "Admin123" in the password field
    And I click on login button
    Then I should see a title "INVOICE MANAGER"




