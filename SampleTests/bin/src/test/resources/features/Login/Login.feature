@Login
Feature: I should be able to log in as different users to salesforce application

  Scenario: Login as a valid user
    Given I am in SFA url
    When I log in as a "Valid" user
    Then I should be on Home Page
    
  Scenario: Login as an InValid user
    Given I am in SFA url
    When I log in as a "Invalid" user
    Then I should be on Login Page