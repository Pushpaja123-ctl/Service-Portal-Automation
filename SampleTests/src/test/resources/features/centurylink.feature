@Sample
Feature: Scenarios to test different features of STAF

  @xmldata
  Scenario: TC311094 Verify user is able to submit order on Centurylink portal (xml data)
    Given I am in Centurylink portal
    When I create a Small Business order for location "692 S Logan St Denver CO 80209"
    Then I should see the "Your CenturyLink Order Confirmation" message
    
  @exceldata
  Scenario: TC311767 Verify user is able to submit order on Centurylink portal (excel data)
    Given I am in Centurylink portal
    When I create a Small Business order for location "692 S Logan St Denver CO 80209"
    Then I should see the "Your CenturyLink Order Confirmation" message
    
 
  @CheckLogin
  Scenario: TC124105 To verify login into SFA
    Given I am logged in as a "ssocommercial" user in SSO
    Then I should be on home page