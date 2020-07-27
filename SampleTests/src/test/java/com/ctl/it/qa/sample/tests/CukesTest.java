package com.ctl.it.qa.sample.tests;

import net.serenitybdd.cucumber.CucumberWithSerenity;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.ctl.it.qa.staf.Environment;
import com.ctl.it.qa.staf.HtmlReport;
import com.ctl.it.qa.staf.STAFEnvironment;
import com.ctl.it.qa.staf.Steps;
import com.ctl.it.qa.staf.TestEnvironment;

import cucumber.api.CucumberOptions;

@TestEnvironment(Environment.TEST4)//Test Environment on which execution is to happen is provided
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/", tags={"@Sample"})
public class CukesTest {
	
	/*
	 * COMMENTS ARE ADDED TO BELOW MENTIONED CLASSES IN TESTS PROJECTS FOR BETTER UNDERSTANDING OF STAF
	 * /SampleTests/src/test/java/com/ctl/it/qa/sample/tests/CukesTest.java
	 * /SampleTests/src/test/java/com/ctl/it/qa/sample/tests/steps/centurylink/SmallBusinessStepDefinition.java
	 * /SampleTests/src/test/java/com/ctl/it/qa/sample/tests/steps/user/UserStepDefinition.java
	 */
	
	/*
	 * COMMENTS ARE ADDED TO BELOW MENTIONED CLASSES IN TOOLS PROJECTS FOR BETTER UNDERSTANDING OF STAF
	 * /SampleTools/src/main/java/com/ctl/it/qa/sample/tools/steps/user/UserSteps.java
	 * /SampleTools/src/main/java/com/ctl/it/qa/sample/tools/steps/smallbusiness/SmallBusinessSteps.java
	 * /SampleTools/src/main/java/com/ctl/it/qa/sample/tools/pages/common/HomePage.java
	 */
	
	@BeforeClass
	public static void setEnvironment() {
		STAFEnvironment.registerEnvironment(CukesTest.class);
		Steps.initialize("sample.xml");//Data input file name (present in SampleTools/src/test/resources) is provided
	}
	
	@AfterClass
	public static void clearEnvironment() {
		HtmlReport.generate();//To generate customized Html report
	}
	
	/*
	 NOTE: CaaC test set/ test case result will be updates only when execution happens from Jenkins
	 */
}