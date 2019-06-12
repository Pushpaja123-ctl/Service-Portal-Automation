package com.ctl.it.qa.sample.tests;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.ctl.it.qa.sample.tools.steps.user.UserSteps;
import com.ctl.it.qa.staf.Page;
import com.ctl.it.qa.staf.RallyTools;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;

public class StepDefinition {
	@Steps
	UserSteps userSteps;
	
	@Before
	public void beforeEveryScenario(Scenario scenario) {
		Serenity.setSessionVariable("file_type").to(scenario.getName());
	}
	
	@After
	public void afterEveryScenario(Scenario scenario) {
		try {
			com.ctl.it.qa.staf.Steps.isInitialized = false;
			Page.isInitialized = false;
			scenario.write("Data used for this test case:" + "\r\n");
			if (scenario.isFailed()) {
				byte[] screenshot = ((TakesScreenshot) userSteps.getDriver()).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
			}
		}catch(Exception e) {
			
		}finally {
			RallyTools.captureResultforCaaC(scenario);
			userSteps.getDriver().close();
			userSteps.getDriver().quit();
			
		}	
	  }
	}

	

