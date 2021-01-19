package com.pom.testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.pom.base.Page;
import com.pom.pages.actions.HomePage;
import com.pom.pages.actions.Signin;

public class FlightTest extends BaseTest{

	@Test
	public void login()
	{
		HomePage hp = new HomePage();
		SoftAssert sf = new SoftAssert();
		sf.assertEquals(hp.findtabcount(),2);
		Signin sig = Page.topnav.gotosignpage();
		sig.dosignin("ashudee@gmail.com","Test@123");
		sf.assertAll();
		
	}
	
}
