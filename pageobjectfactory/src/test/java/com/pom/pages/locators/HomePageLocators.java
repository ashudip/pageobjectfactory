package com.pom.pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {

	@FindBy(css = ".uitk-tab.uitk-tab-icon-text:nth-of-type(2)	")
	public WebElement flighttab;
	
	@FindBy(css = ".uitk-tab.uitk-tab-icon-text:nth-of-type(3) ")
	public WebElement cartab;
	
	@FindBy(css = "button[data-stid='location-field-leg1-origin-menu-trigger']")
	public WebElement leavingfrom;
	
	@FindBy(css = "button[data-stid='location-field-leg1-destination-menu-trigger']")
	public  WebElement leavingfrominput;
	
	@FindBy(css = "#location-field-leg1-destination-input")
	public WebElement goingto;
	
	@FindBy(css = "input[data-stid='location-field-leg1-destination-menu-input']")
	public WebElement goingtoinput;
	
	
	@FindBy(css = "button[data-testid=submit-button]")
	public WebElement searchbtn;
	
	@FindBy(css = "a[role = 'tab']")
	public List<WebElement> tabscount;
	

	
	
}
