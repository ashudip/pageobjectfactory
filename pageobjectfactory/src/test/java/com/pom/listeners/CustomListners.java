package com.pom.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.pom.base.Page;
import com.pom.utilities.Utilities;
import com.relevantcodes.extentreports.LogStatus;

public class CustomListners extends Page implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test = exprep.startTest(result.getName());
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(LogStatus.PASS,"Test case passed");
		exprep.endTest(test);
		exprep.flush();
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		try {
			Utilities.CaptureScreenShot();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		test.log(LogStatus.FAIL,result.getName() +" FAILED WITH EXCEPTION "+ result.getThrowable());
		test.log(LogStatus.FAIL, test.addScreenCapture(Utilities.screenshot));
		exprep.endTest(test);
		exprep.flush();
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

	
	
}
