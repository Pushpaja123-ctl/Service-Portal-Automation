package com.ctl.it.qa.sample.tools.pages.smallbusiness;

import com.ctl.it.qa.sample.tools.pages.CenturylinkPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductSelectorPage extends CenturylinkPage {

	@FindBy(xpath = "//span[text()='The following Business Internet options are available at your location.']")
	public WebElementFacade lbl_business_internet_options;
	
	@FindBy(xpath = "//span[contains (text(),'Get Internet')]/..")
	public WebElementFacade lnk_get_internet_traditional_phone;
	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return lbl_business_internet_options;
	}

}
