package com.pom.rough;



import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.pom.base.Page;
import com.pom.pages.actions.HomePage;
import com.pom.pages.actions.Signin;
import com.pom.testcases.BaseTest;

public class TestClass extends BaseTest {


	@Test(enabled = false)
	public void test1() throws InterruptedException {
		
		Signin sig = Page.topnav.gotosignpage();
		sig.dosignin("ashudee@gmail.com","Test@123");
	
	}
	
	@Test
	public void test2()
	{
		HomePage hp = new HomePage();
		SoftAssert sf = new SoftAssert();
		sf.assertEquals(hp.findtabcount(),3);
		sf.assertAll();
	}
}
