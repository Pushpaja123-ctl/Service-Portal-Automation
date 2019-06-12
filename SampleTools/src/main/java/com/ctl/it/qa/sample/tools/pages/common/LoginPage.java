package com.ctl.it.qa.sample.tools.pages.common;

import com.ctl.it.qa.sample.tools.pages.CenturylinkPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends CenturylinkPage{
	
	@FindBy(name = "user")
	public WebElementFacade tbx_user_name;

	@FindBy(name = "password")
	public WebElementFacade tbx_password;

	@FindBy(css = "input[value='Login']")
	public WebElementFacade btn_login;

	@FindBy(id = "Login")
	public WebElementFacade btn_log_in_to_salesforce;
	
	@FindBy(css = "input[value ='Login']")
	public WebElementFacade btn_log_in_to_partner_portal;

	@FindBy(xpath = "//span[. = 'CenturyLink SSO']")
	public WebElementFacade btn_centurylink_sso;
	
	@FindBy(css = "a[id='cancel_idp_hint']")
	public WebElementFacade btn_log_in_with_different_account;
	
	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		return tbx_user_name;
	}

	
	public void clickLogInWithADifferentAccount() {
		try{
		if(btn_log_in_with_different_account.isDisplayed()){
			btn_log_in_with_different_account.click();
		}
		}catch(Exception e){
			
		}
	}
}