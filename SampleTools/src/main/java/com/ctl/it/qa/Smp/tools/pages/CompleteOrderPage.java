package com.ctl.it.qa.Smp.tools.pages;

import com.ctl.it.qa.sample.tools.pages.CenturylinkPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CompleteOrderPage extends CenturylinkPage{

	@FindBy(id = "contactEmail")
	public WebElementFacade tbx_email_address;
	
	@FindBy(id = "companyName")
	public WebElementFacade tbx_company_name;
	
	@FindBy(id = "firstName")
	public WebElementFacade tbx_first_name;
	
	@FindBy(id = "lastName")
	public WebElementFacade tbx_last_name;
	
	@FindBy(id = "contactTN")
	public WebElementFacade tbx_contact_phone_number;
	
	@FindBy(id = "ownershipType")
	public WebElementFacade ddl_type_of_ownership;
	
	@FindBy(id = "termsAndCond")
	public WebElementFacade cbx_terms_and_conditions;
	
	@FindBy(id = "submit_order_custInfo")
	public WebElementFacade btn_place_my_order_securely;
	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return tbx_email_address;
	}

}
