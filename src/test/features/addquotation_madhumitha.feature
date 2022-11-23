

Feature: validate the Add Quotation Page

  Scenario Outline: Validate the functionality of AddQuotation and verify in the ListQuotation page
    Given I am on the login page in Invoice Manager Application
    And I enter a valid "<email>" and "<password>" and click the Login Button
    When I Navigate to the Add quotation page in Sales Menu in Invoice Manager
    And I select a "<month>", "<day>", "<hour>" and "<minutes>" from Date
    And I select a "<company>" from My Billing Company
    And I click on the Reference no button to generate the reference number
    And I select "<customer>" from Customer dropdown box
    And I select a "<expiryMonth>" and "<expiryDay>" from Expiry Date
    And I select the "<tax>" from Order Tax
    And I select the "<status>" from Status dropdown box
    And I enter the "<quantity>" ,"<productDescription>" "<unitPrice>" customer order details
    Then I click on the Add Quotation button
    And I am able to see the "<expectedCompany>","<expectedCustomer>","<expectedStatus>" and "<expectedDate>" in the first row of Quotations
    And I am able to download the quotation file as pdf

    Examples:
    |email          |password     |month          |day |hour |minutes |company |customer        |expiryMonth     |expiryDay |tax |status|quantity|productDescription|unitPrice |expectedCompany |expectedCustomer |expectedStatus |expectedDate        |
    |admin@gic.com  |Admin@123    |December 2022  |25  |7    |20      |zensar  |Santhos (Shan)  |October 2023    |14        |abc |Sent  |123     |Garden Tools      |1200      |zensar          |Santhos          |Sent           |25.12.2022 07:20:00 |
    |admin@gic.com  |Admin@123    |January 2023   |24  |18   |30      |Lidl    |tutu (Tom)      |July 2023       |31        |xyz |Sent  |50      |DIY Tools         |1500      |Lidl            |tutu             |Sent           |24.01.2023 18:30:00 |