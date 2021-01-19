package com.pom.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class TopNavigationLocators {
	
	
	@FindBy(css = ".uitk-button.uitk-button-small.uitk-button-has-text.uitk-menu-icon-trigger.gc-header-custom-menu-trigger")
	public WebElement topsigninbtn;
	
	@FindBys({
		@FindBy(css = ".heading-container:nth-of-type(1)"),
		@FindBy(css = "a[data-stid='link-header-account-signin']")
		
	})
	
	public WebElement internalsignin;
	
	
}
