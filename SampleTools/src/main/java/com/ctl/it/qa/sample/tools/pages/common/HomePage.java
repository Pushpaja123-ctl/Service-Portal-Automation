package com.ctl.it.qa.sample.tools.pages.common;

import com.ctl.it.qa.sample.tools.pages.CenturylinkPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends CenturylinkPage {//Mandatory to extend all page classes with a common class which extends Page class of STAF or directly extend with Page class of STAF

	/*
	 * Below are the ways in which objects are identified using different locators like id,LinkText,xpath,css,name,etc..
	 * Follow the below naming convention for ElementFacade(MANDATORY)
             btn - button
             lbl - label
             lnk - link
             ddl - drop down list
             cbx - check box
             img - image 
             tbx = text box
 
	 */
	
	@FindBy(id = "signInToggle")
	public WebElementFacade btn_sign_in;
		
	@FindBy(linkText = "SMALL BUSINESS")
	public WebElementFacade lnk_small_business;

	@FindBy(linkText = "Audit")
	public WebElementFacade link_Audit;
			
	/*
     Method used in shouldExist & isExist method */
     
	@Override
	public WebElementFacade getUniqueElementInPage() {
		return btn_sign_in; 
	}
}
