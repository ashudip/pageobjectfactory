package com.pom.testcases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.pom.base.Page;

public class BaseTest {

	@BeforeSuite
	public void init()
	{
		Page.initconfiguration();
	}
	
	@AfterSuite
	public void teardown()
	{
		Page.teardown();
	}
}
