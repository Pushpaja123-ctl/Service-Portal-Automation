package com.ctl.it.qa.sample.tests.steps.centurylink;

import static org.hamcrest.MatcherAssert.assertThat;

import com.ctl.it.qa.sample.tools.steps.smallbusiness.SmallBusinessSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SmallBusinessStepDefinition {

	@Steps
	SmallBusinessSteps smallBusinessSteps;

    @When("^I create a Small Business order for location \"([^\"]*)\"$")
    public void I_create_a_small_business(String address) {
    	smallBusinessSteps.create_small_business_order(address);
    }
    
    @Then("^I should see the \"([^\"]*)\" message$")
	public void i_should_see_the_order_status_as(String orderStatus)
			throws Throwable {
		/*
		 * A common way to assert/validate. assertThat is from Hamcrest package static import. Check import section above.
		 */
		assertThat("Actual order status did not match the expected status '"
				+ orderStatus + "'", smallBusinessSteps.is_order_status(orderStatus));
	}
}
