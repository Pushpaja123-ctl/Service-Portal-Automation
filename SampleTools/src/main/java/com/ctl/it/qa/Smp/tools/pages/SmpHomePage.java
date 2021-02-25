package com.ctl.it.qa.Smp.tools.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;

import com.ctl.it.qa.sample.tools.pages.CenturylinkPage;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class SmpHomePage extends CenturylinkPage {

	boolean Items_displayed = false;
	@FindBy(id = "inPageAddress_nc-sfaddress-lctl")
	public WebElementFacade tbx_address;
	
	@FindBy(xpath = "//ul[@id='ui-id-2']/li/a")
	public WebElementFacade lnk_address_list;

	@FindBy(xpath = "//a[@href='#Audit-tab']")
	public WebElementFacade lnk_Audit;
	
	@FindBy(xpath = "//a[@href='#AuditConfig-tab']")
	public WebElementFacade lnk_AuditConfig;
	
	
	@FindBy(xpath = "//a[@href='#Automation-tab']")
	public WebElementFacade lnk_Automation;
	
	@FindBy(xpath = "//a[@href='#B2BManagement-tab']")
	public WebElementFacade lnk_B2B;
	
	@FindBy(xpath = "//a[@href='#EAS-tab']")
	public WebElementFacade lnk_EAS;
	
	@FindBy(xpath = "//a[@href='#EDP-tab']")
	public WebElementFacade lnk_EDP;
	
	@FindBy(xpath = "//a[@href='#EMP-tab']")
	public WebElementFacade lnk_EMP;
	
	@FindBy(xpath = "//a[@href='#ESP-tab']")
	public WebElementFacade lnk_ESP;
	
	@FindBy(xpath = "//a[@href='#Notes-tab']")
	public WebElementFacade lnk_Notes;
	
	@FindBy(xpath = "//a[@href='#Reporting-tab']")
	public WebElementFacade lnk_Reporting;
	
	@FindBy(xpath = "//a[contains(.,'Help')]")
	public WebElementFacade lnk_Help;
	
	@FindBy(xpath = "//a[@href='#/Session']")
	public WebElementFacade lnk_Session;
	
	@FindBy(xpath = "//*[@id='Appnavhome']/span/b")
	public WebElementFacade lnk_Smp;
	
		
	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return lnk_Audit;
	}
	
	public void enterAddress(String address) {
		tbx_address.sendKeys(address);
		withTimeoutOf(Duration.ofMillis(5000)).waitFor(lnk_address_list).click();
	}
	
	 @Step	    
		 public void is_in_Smp_Home_Page_static()
		 {
	     if(lnk_Audit.isDisplayed() && lnk_AuditConfig.isDisplayed() && lnk_Automation.isDisplayed() && lnk_B2B.isDisplayed() && lnk_EAS.isDisplayed() && lnk_EMP.isDisplayed() && lnk_ESP.isDisplayed() )
	     {
		  //  lnk_Audit.click();
	    	Items_displayed = true; 
		    System.out.println("I am in Home page");
	     }
	    }
	    
		 @SuppressWarnings("deprecation")
		public void is_in_Smp_Home_Page_menus()
		 {
			 Items_displayed = false; 
			 if(lnk_Notes.isDisplayed() && lnk_Reporting.isDisplayed() && lnk_Help.isDisplayed() && lnk_Session.isDisplayed() && lnk_Smp.isDisplayed())
			 {
				 Items_displayed = true; 
				 System.out.println("I am in Home page");
			 }
			 Assert.assertEquals(true, Items_displayed);
		  }
	    
		 
	 }

	 
