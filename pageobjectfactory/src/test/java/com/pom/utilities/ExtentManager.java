package com.pom.utilities;

import java.io.File;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {

	private static ExtentReports report;
	public static ExtentReports getinstance()
	{
		report = new ExtentReports(System.getProperty("user.dir") + "/target/surefire-reports/html/AutomationReport.html",true,DisplayOrder.OLDEST_FIRST);
		report.loadConfig(new File(System.getProperty("user.dir")+"/src/main/resources/extentconfig/ReportsConfig.xml"));
		return report;
		
	}
	
	
}
