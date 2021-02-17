package com.ctl.it.qa.Smp.tools.steps.user;

import net.thucydides.core.annotations.Step;

import java.time.Duration;

import com.ctl.it.qa.Smp.tools.pages.SmallBusinessPage;
import com.ctl.it.qa.Smp.tools.pages.SmpHomePage;
import com.ctl.it.qa.sample.tools.pages.common.LoginPage;
import com.ctl.it.qa.sample.tools.steps.CenturylinkSteps;
import com.ctl.it.qa.staf.xml.reader.IntDataContainer;

@SuppressWarnings("serial")
public class HomePageSteps extends CenturylinkSteps {
	
    //SmallBusinessPage smallBusinessPage; 
    LoginPage loginPage;
    SmpHomePage smphomepage; 
    
    @Step
    public void is_in_Smp_Home_Page(String url) {
    	/*
    	 First line: envData is a variable to access Environment data in data input file (excel or xml). Here, url is accessed.
    	 Second line: Maximizing the browser
    	 Third line: shouldExist method checks the page has navigated to the correct page. It check by verifying the WebElementFacade mentioned in method getUniqueElementInPage() in HomePage class exists or not.
    	 */
    	//smallBusinessPage.openAt(envData.getFieldValue("url"));
    	smphomepage.openAt(envData.getFieldValue("url"));
    	waitABit((3000));
    	smphomepage.maximize();
    	shouldExist(smphomepage, 30);
    	//smphomepage.is_in_Smp_Home_Page();
    }
    
    public void is_in_Smp_Home_Page_static(String url) {
    	/*
    	 First line: envData is a variable to access Environment data in data input file (excel or xml). Here, url is accessed.
    	 Second line: Maximizing the browser
    	 Third line: shouldExist method checks the page has navigated to the correct page. It check by verifying the WebElementFacade mentioned in method getUniqueElementInPage() in HomePage class exists or not.
    	 */
    	//smallBusinessPage.openAt(envData.getFieldValue("url"));
    	 	smphomepage.is_in_Smp_Home_Page_static();
    }
    
    public void is_in_Smp_Home_Page_menus()
    {
    	smphomepage.is_in_Smp_Home_Page_menus();
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