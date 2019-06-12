package com.ctl.it.qa.sample.tools.pages.smallbusiness;

import java.time.Duration;

import com.ctl.it.qa.sample.tools.pages.CenturylinkPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class SmallBusinessPage extends CenturylinkPage {
	
	@FindBy(id = "inPageAddress_nc-sfaddress-lctl")
	public WebElementFacade tbx_address;
	
	@FindBy(xpath = "//ul[@id='ui-id-2']/li/a")
	public WebElementFacade lnk_address_list;

	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return tbx_address;
	}
	
	public void enterAddress(String address) {
		tbx_address.sendKeys(address);
		withTimeoutOf(Duration.ofMillis(5000)).waitFor(lnk_address_list).click();
	}

}
