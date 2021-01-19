 package com.pom.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class SigninPageLocators {

	
	@FindBy(css = "#signin-loginid")
	public WebElement email;
	
	@FindAll
	({
		@FindBy(css = "#signin-password"),
		@FindBy(id = "signin-password")
		
	})
	public WebElement password;
	
	@FindBy(css = "#submitButton")
	public WebElement submitbtn;
	
	
}
