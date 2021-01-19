package com.pom.pages.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.pom.base.Page;
import com.pom.pages.locators.HomePageLocators;

public class HomePage extends Page{

	
	
	public HomePageLocators home;
	public HomePage()
	{
		
		this.home = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory,this.home);
	}
	
	public void gotoflight() {
		click(home.flighttab);
			
		
	}
	
	public void gotocars() {
		click(home.cartab);
		
	}
	
	public void packages() {
		
	}
	
	public void bookflight(String leavingfrom,String tocity) {
		home.leavingfrom.click();
		home.leavingfrominput.sendKeys(leavingfrom);
		home.leavingfrominput.sendKeys(Keys.ENTER);
		
		home.goingto.click();
		home.goingtoinput.sendKeys(tocity);
		home.goingtoinput.sendKeys(Keys.ENTER);
		
		home.searchbtn.click();
	}
	
	public int findtabcount() {
		return home.tabscount.size();
	}
	
	
	
}
