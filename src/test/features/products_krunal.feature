@Regression
    @Products
    Feature: Validate products features

    Scenario: Open list products page
      Given User is on the InvoiceManager home page
      When User clicks on Products menu
      And User clicks on list products submenu
      Then User should be open list products page

    Scenario: open update product page
      Given User is on list products page
      When User clicks on edit product button in action column
      Then user will be navigated to update product page

    Scenario: Validate product update functionality with valid data
      Given User is on update product page
      When User edits valid Name, Details and Price
      And User clicks on update product button
      Then User should get "product successfully updated" message

    Scenario: Verify updated product info into product list
      Given User is on list product page
      When User enter updated product in search input box
      Then Updated product should be appear in the list