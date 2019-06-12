package com.ctl.it.qa.sample.tools.pages;

import com.ctl.it.qa.staf.Page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public abstract class CenturylinkPage extends Page {

	@FindBy(xpath = "//a[text()='Next']")
	public WebElementFacade btn_next;
}
