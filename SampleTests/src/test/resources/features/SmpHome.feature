@Smp-Regression
Feature: Scenarios to verify the Home page of Service Management Portal

    @SmpHome
    Scenario: TC001 Verify Home page elements 
    Given user is in Service Management Portal(Smp)
    #When the Home page is displayed
    Then user verifies for static elements on the Home page
    And user verifies the menu items on the Home page  