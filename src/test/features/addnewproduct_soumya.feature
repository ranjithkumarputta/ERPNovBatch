Feature: Validation of Adding a New Product

  @TC1
  Scenario: Adding a new Product with Valid Credentials

    Given User should login to the home page of IM
    And  user click the Add Product of left side panel
    When user enter the ValidValues  in the new Product Page
    And user click the Add Product button in new product page
    Then User should assert success message from new product page

  @TC2
  Scenario: Adding a new Product with InValid Credentials

    Given User should login to the home page of IM
    And  user click the Add Product of left side panel
    When user enter the InValidValues  in the new Product Page
    And user click the Add Product button in new product page
    Then User should assert error message from new product page



