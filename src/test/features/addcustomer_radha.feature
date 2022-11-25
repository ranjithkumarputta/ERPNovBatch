Feature: Add Customer
  @AddCustomer
  Background:

    Given I am on login page
    When I enter email <"admin@gic.com">
    And passwd as <"Admin123">
    Then i click on login button

  Scenario Outline: Validate AddCustomer

    Given I click on Add Customer in Customers
    When I enter customer details <company>
    And Person as <person>
    And Mail as <email>
    And Phone as <phone>
    And LAddress as <ladd>
    And City as <city>
    And county as <county>
    And postcode as <postcode>
    And country as <country>
    Then I should see title as <result>

    Examples:
      |company     | person         | email                   | phone           | ladd   |city  |county | postcode |country |result                       |
      |""          |""              |""                       |""               | ""     |""    |""     |""        |""      |""                           |
      |"Samtxfpk"  |"sam kperson"   |"samactualxy@gmail.com"  |"1234567867657" | "qurt"  |"York"|"klgd" |"jjk6hh"  |"UK"    |"Customer Successfully Added"|
