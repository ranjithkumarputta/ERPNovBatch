@Calendar
Feature: Validate calender functionality

  @TC1
  Scenario: Calender page load correctly
    Given I open the browser
    And I login to URL "http://3.13.126.58/AMS3.0/auth/login/" with email "admin@gic.com" and password "Admin123"
    And I navigate to home URL"http://3.13.126.58/AMS3.0/home"
    When I click on calender
    Then  It should load calender page

  @TC2
  Scenario: Calendar page shows current month by default
    Given I open the browser
    And I login to URL "http://3.13.126.58/AMS3.0/auth/login/" with email "admin@gic.com" and password "Admin123"
    And I navigate to home URL"http://3.13.126.58/AMS3.0/home"
    When I click on calender
    Then  Current month is shown

  @TC3
  Scenario: On clicking on week button, the date format should be "MM DD — DD, YYYY"
    Given I open the browser
    And I login to URL "http://3.13.126.58/AMS3.0/auth/login/" with email "admin@gic.com" and password "Admin123"
    And I navigate to home URL"http://3.13.126.58/AMS3.0/home"
    When I click on calender
    And I click week button on calender page
    Then It should reflect current week with correct format

  @TC4
  Scenario: On clicking day button, the date format should be "Month DD, YYYY"
    Given I open the browser
    And I login to URL "http://3.13.126.58/AMS3.0/auth/login/" with email "admin@gic.com" and password "Admin123"
    And I navigate to home URL"http://3.13.126.58/AMS3.0/home"
    When I click on calender
    And I click day button on calender page
    Then  It should reflect current day with correct format

  @TC5
  Scenario: On clicking day button, the date format should be "Month, YYYY"
    Given I open the browser
    And I login to URL "http://3.13.126.58/AMS3.0/auth/login/" with email "admin@gic.com" and password "Admin123"
    And I navigate to home URL"http://3.13.126.58/AMS3.0/home"
    When I click on calender
    And I click month button on calender page
    Then  It should reflect current month with correct format



