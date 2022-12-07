Feature: validate payment reports functionality

  Scenario: validate payment report based on valid credentials and submit
    Given customer should navigate to IM Home Page
    And Click on reports from left panel
    And Click on Payment reports
    When user enter all required filed of new payment report
    And  Click submit button
    Then User should validate the reports generated based on the user request