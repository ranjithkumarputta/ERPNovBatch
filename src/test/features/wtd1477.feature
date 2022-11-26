Feature: validate payment reports functionality

  Scenario: validate payment report based on valid credentials and submit
    Given customer should navigate to IM Home Page
    And Click on reports from left panel
    And Click on Payment reports
    When user enter all required filed of new payment report
    And  Click submit button
    Then User should validate the reports generated based on the user request

  @TC1
  Scenario: Calender page load correctly
    Given I open the browser
    And I login to URL "http://3.13.126.58/AMS3.0/auth/login/" with email "admin@gic.com" and password "Admin123"
    And I navigate to home URL"http://3.13.126.58/AMS3.0/home"
    When I click on calender
    Then  It should load calender page

  Scenario: validate payment report based on valid credentials and submit
    Given customer should navigate to IM Home Page
    And Click on reports from left panel
    And Click on Payment reports
    When user enter all required filed of new payment report
    And  Click submit button
    Then User should validate the reports generated based on the user request
