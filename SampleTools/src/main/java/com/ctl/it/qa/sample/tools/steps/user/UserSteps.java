package com.ctl.it.qa.sample.tools.steps.user;

import net.thucydides.core.annotations.Step;

import java.time.Duration;

import com.ctl.it.qa.sample.tools.pages.common.LoginPage;
import com.ctl.it.qa.sample.tools.pages.smallbusiness.SmallBusinessPage;
import com.ctl.it.qa.sample.tools.steps.CenturylinkSteps;
import com.ctl.it.qa.staf.xml.reader.IntDataContainer;

@SuppressWarnings("serial")
public class UserSteps extends CenturylinkSteps {
	
    SmallBusinessPage smallBusinessPage; 
    LoginPage loginPage;

    @Step
    public void is_in_centurylink_small_business_page() {
    	/*
    	 First line: envData is a variable to access Environment data in data input file (excel or xml). Here, url is accessed.
    	 Second line: Maximizing the browser
    	 Third line: shouldExist method checks the page has navigated to the correct page. It check by verifying the WebElementFacade mentioned in method getUniqueElementInPage() in HomePage class exists or not.
    	 */
    	smallBusinessPage.openAt(envData.getFieldValue("url"));
    	smallBusinessPage.maximize();
    	shouldExist(smallBusinessPage, 30);
    }
    
    @Step
	public void is_in_sso_login_page(String url) {
		loginPage.openAt(url);
		loginPage.maximize();
		WaitForPageToLoad(20000);
		loginPage.btn_centurylink_sso.click();
	}
    
    @Step
	public void logs_in_sso_as(String userType) {
		loginPage.withTimeoutOf(Duration.ofMillis(6000)).waitFor(loginPage.btn_login);
		IntDataContainer dataContainer = envData.getContainer(
				loginPage.getClass().getSimpleName()).getContainer(userType);
		fillFields(loginPage, dataContainer.getMandatoryFieldsFromAllContainers());
		loginPage.btn_login.click();
	}

	
    
    
    
}