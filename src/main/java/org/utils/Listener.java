package org.utils;

import org.base.ProjectSpecificationMethod;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listener extends ProjectSpecificationMethod implements ITestListener{

	ExtentReports extents = Extentreportdemo.getReport();
	ExtentTest test;
	String filepath;
	@Override
	public void onTestStart(ITestResult result) {
		test =extents.createTest(result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS,"Test passed");
		
		
		try {
			filepath =takeScreenShot(result.getMethod().getMethodName());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	
		test.addScreenCaptureFromPath(filepath, "Passedscreenshot");
	}


	@Override
	public void onTestFailure(ITestResult result) {
		test.fail(result.getThrowable());
		
		try {
			filepath =takeScreenShot(result.getMethod().getMethodName());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(filepath,"faildscreenshot");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skiped");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		extents.flush();
		
	}

	
	
	
}
