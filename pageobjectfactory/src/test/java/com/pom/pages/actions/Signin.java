package com.pom.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.pom.base.Page;
import com.pom.pages.locators.SigninPageLocators;

public class Signin extends Page{

	SigninPageLocators sign;
	public Signin()
	{
		
		this.sign = new SigninPageLocators();
		AjaxElementLocatorFactory aj = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(aj,this.sign);
	}
	
	
	public void dosignin(String email,String password)
	{
		inputvalue(sign.email,email);
		inputvalue(sign.password,password);
		click(sign.submitbtn);
	}
	
	
}
