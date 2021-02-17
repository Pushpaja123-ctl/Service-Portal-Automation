package com.ctl.it.qa.Smp.tools.pages;

import com.ctl.it.qa.sample.tools.pages.CenturylinkPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductChoosePage extends CenturylinkPage{

	@FindBy(xpath = "//span[@id='step_txt_choose' and @class='step_indicator_item step_ind_active']")
	public WebElementFacade lbl_choose;
	
	@FindBy(xpath = "//a[@href='#step=customize'][contains(@id,'B:3125')][contains(.,'Select')]")
	public WebElementFacade btn_first_product_select;
	
	
	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return lbl_choose;
	}

}
