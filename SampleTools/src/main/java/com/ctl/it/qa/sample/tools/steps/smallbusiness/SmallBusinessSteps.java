package com.ctl.it.qa.sample.tools.steps.smallbusiness;

import java.time.Duration;

import com.ctl.it.qa.sample.tools.pages.common.CenturylinkOrderConfirmationPage;
import com.ctl.it.qa.sample.tools.pages.common.HomePage;
import com.ctl.it.qa.sample.tools.pages.smallbusiness.CompleteOrderPage;
import com.ctl.it.qa.sample.tools.pages.smallbusiness.ProductChoosePage;
import com.ctl.it.qa.sample.tools.pages.smallbusiness.ProductSelectorPage;
import com.ctl.it.qa.sample.tools.pages.smallbusiness.SmallBusinessPage;
import com.ctl.it.qa.sample.tools.steps.CenturylinkSteps;

import net.thucydides.core.annotations.Step;

@SuppressWarnings("serial")
public class SmallBusinessSteps extends CenturylinkSteps { //Mandatory to extend all steps classes with a common class which extends Steps class of STAF or directly extend with Step class of STAF
   
	/*
	 Intialize all the page required as mentioned below
	 */
	HomePage homePage;
	SmallBusinessPage smallBusinessPage;
	
	ProductSelectorPage productSelectorPage;
	
	ProductChoosePage productChoosePage;
	
	CompleteOrderPage completeOrderPage;
	
	CenturylinkOrderConfirmationPage centurylinkOrderConfirmationPage;
	
	@Step //Any Step class method which is a complete business flow mark it with @Step annotation
	public void create_small_business_order(String address) {
		/*
		line 41: explicitly how to wait dynamically for a WebElementFacade to appear on page to perform further actions.
		line 44: Explicit static wait for 5000 milliseconds (use this method only when dynamic wait is failing).
		line 47: fillAllFields is framework method which enters all the fields present in data inputs(sample.xml or sample.xlsx) and identifying the object from CompleteOrderPage class
		 */
		smallBusinessPage.enterAddress(address);
		shouldExist(productSelectorPage, 30);
		productSelectorPage.withTimeoutOf(Duration.ofMillis(8000)).waitFor(productSelectorPage.lnk_get_internet_traditional_phone).click();
		shouldExist(productChoosePage, 30);
		productChoosePage.withTimeoutOf(Duration.ofMillis(8000)).waitFor(productChoosePage.btn_first_product_select).click();
		waitABit(5000);
		productChoosePage.withTimeoutOf(Duration.ofMillis(8000)).waitFor(productChoosePage.btn_next).click();
		shouldExist(completeOrderPage, 30);
		fillAllFields(completeOrderPage);
	}
	
	@Step
	public boolean is_order_status(String expectedStatus) {
		/*
		line 55: isExist behaves just like shouldExist method just that it return boolean value
		 */
		boolean isStatusMatch = false;
		if(isExist(centurylinkOrderConfirmationPage,30)) {
			isStatusMatch=true;
		}
		return isStatusMatch;
	}
}
