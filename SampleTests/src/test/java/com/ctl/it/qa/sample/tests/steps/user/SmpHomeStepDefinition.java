package com.ctl.it.qa.sample.tests.steps.user;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;

import java.time.Duration;

import org.openqa.selenium.By;

import com.ctl.it.qa.Smp.tools.pages.SmallBusinessPage;
import com.ctl.it.qa.Smp.tools.pages.SmpHomePage;
import com.ctl.it.qa.Smp.tools.steps.user.HomePageSteps;
import com.ctl.it.qa.Smp.tools.steps.user.UserSteps;
import com.ctl.it.qa.sample.tools.pages.common.HomePage;
import com.ctl.it.qa.staf.Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Step;

import java.time.Duration;

import com.ctl.it.qa.sample.tools.pages.common.LoginPage;
import com.ctl.it.qa.sample.tools.steps.CenturylinkSteps;
import com.ctl.it.qa.staf.xml.reader.IntDataContainer;


public class SmpHomeStepDefinition {

	 @Steps
	 HomePageSteps endUser; //A Step class of Tools project is initialized with @Steps annotation
	 String url;
	 SmpHomePage smphomepage;	 
	  
		@SuppressWarnings("static-access")
		@Given("user is in Service Management Portal\\(Smp)")
		public void user_is_in_Service_Management_Portal_Smp() {
		    // Write code here that turns the phrase above into concrete actions
			endUser.switchDataTo("Smp.xml");
			 url = Page.envData.getFieldValue("url");
			endUser.is_in_Smp_Home_Page(url);
			
		}

		/*@When("the Home page is displayed")
		public void the_Home_page_is_displayed() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new cucumber.api.PendingException();
		}*/

		@Then("user verifies for static elements on the Home page")
		public void user_verifies_for_static_elements_on_the_Home_page() {
		    // Write code here that turns the phrase above into concrete actions
			endUser.is_in_Smp_Home_Page_static(url);
			//throw new cucumber.api.PendingException();
		}

		@Then("user verifies the menu items on the Home page")
		public void user_verifies_the_menu_items_on_the_Home_page() {
		    // Write code here that turns the phrase above into concrete actions
			endUser.is_in_Smp_Home_Page_menus();
			//throw new cucumber.api.PendingException();
		}
	  }
