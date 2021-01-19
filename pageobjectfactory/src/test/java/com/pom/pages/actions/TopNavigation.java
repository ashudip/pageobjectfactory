package com.pom.pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.pom.pages.locators.TopNavigationLocators;


public class TopNavigation {

	TopNavigationLocators nav;
	public TopNavigation(WebDriver driver)
	{
		this.nav = new TopNavigationLocators();
		AjaxElementLocatorFactory aj = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(aj,this.nav);
	}
	
	public Signin gotosignpage() {
		nav.topsigninbtn.click();
		nav.internalsignin.click();
		return new Signin();
		
	}
	
	
	
}
