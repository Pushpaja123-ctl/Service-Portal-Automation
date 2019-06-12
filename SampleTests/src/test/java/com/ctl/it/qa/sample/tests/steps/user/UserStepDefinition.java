package com.ctl.it.qa.sample.tests.steps.user;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;

import java.time.Duration;

import org.openqa.selenium.By;

import com.ctl.it.qa.sample.tools.pages.common.HomePage;
import com.ctl.it.qa.sample.tools.steps.user.UserSteps;
import com.ctl.it.qa.staf.Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class UserStepDefinition {

	 @Steps
	 UserSteps endUser; //A Step class of Tools project is initialized with @Steps annotation
	
	 HomePage homePage;
	 
		@SuppressWarnings("static-access")
		@Given("^I am in Centurylink portal$")
	    public void I_am_in_Centurylink_portal() {
	    	String fileType=Serenity.sessionVariableCalled("file_type");//Serenity feature to store value and which can be used anywhere further in the script
	    	if(fileType.contains("excel")) {
	    		endUser.switchDataTo("sample.xlsx");//Method to switch between different input data
	    	}else {
	    		endUser.switchDataTo("sample.xml");
	    	}
	        endUser.is_in_centurylink_small_business_page();
	    }
	   
		@SuppressWarnings("static-access")
		@Given("^I am logged in as a \"([^\"]*)\" user in SSO$")
		public void i_am_logged_in_as_a_user_in_SSO(String userType) {
			endUser.switchDataTo("sample.xml");
			String url = Page.envData.getFieldValue("sso-console");
			endUser.is_in_sso_login_page(url);
			endUser.logs_in_sso_as(userType);
		}
		
		@Then("I should be on home page")
		public void I_should_be_on_home_page() {
			homePage.withTimeoutOf(Duration.ofMillis(8000)).elementIsPresent(By.xpath("(//a[contains(.,'Home')])[1]"));
		}
	  }
