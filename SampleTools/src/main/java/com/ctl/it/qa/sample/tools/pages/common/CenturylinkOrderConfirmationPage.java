package com.ctl.it.qa.sample.tools.pages.common;

import com.ctl.it.qa.sample.tools.pages.CenturylinkPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CenturylinkOrderConfirmationPage extends CenturylinkPage{

	@FindBy(xpath = "//div[contains(text(),'Your CenturyLink Order Confirmation')]")
	public WebElementFacade lbl_your_centurylink_order_confirmation;
	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return lbl_your_centurylink_order_confirmation;
	}

}
