package com.pom.base;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.pom.pages.actions.TopNavigation;
import com.pom.utilities.ExcelReader;
import com.pom.utilities.ExtentManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Page {

	protected static WebDriver driver;
	FileInputStream fis;
	protected static String path = System.getProperty("user.dir");
	public static Logger logs = Logger.getLogger("devpinoyLogger");
	public static WebDriverWait wait;
	public ExtentReports exprep = ExtentManager.getinstance();
	protected String excelpath = "/src/main/resources/excel/Testdata.xlsx";
	protected ExcelReader excel = new ExcelReader(System.getProperty("user.dir")+excelpath);
	protected SoftAssert sfassert = new SoftAssert();
	public static ExtentTest test;
	public static TopNavigation topnav;
	protected int rows;
	protected int col;
	public static void initconfiguration() {
		
			System.setProperty("webdriver.chrome.driver", path + "/src/main/resources/executables/chromedriver");
			driver = new ChromeDriver();
			logs.debug("Browser opened");
			driver.get(Constants.url);
			logs.debug("Navigated to Url");
			driver.manage().window().maximize();
			logs.debug("Browser maximised");
			driver.manage().timeouts().implicitlyWait(Constants.implicit,TimeUnit.SECONDS);
			topnav = new TopNavigation(driver);
			logs.debug("Top navigation object created");
	
	}
	
	
	public static void teardown() {
		driver.quit();
		logs.debug("driver closed");
	}
	
	public void click(WebElement element) {

		element.click();
		test.log(LogStatus.INFO, " clicking on :" + element);
	}

	public void inputvalue(WebElement element , String value) {
		element.sendKeys(value);
		test.log(LogStatus.INFO, "entering value "+value+ " into "+element);
	}
	
	
	
	
}
