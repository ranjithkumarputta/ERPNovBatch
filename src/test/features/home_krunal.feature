
@Regression

  @Homepage
  Feature: Validate Homepage functionality
  Scenario: Open homepage with valid login credentials
    Given user opens home page url with chrome browser
    When user enter valid credentials
    Then user should be open homepage





