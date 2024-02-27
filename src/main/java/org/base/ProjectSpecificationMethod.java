package org.base;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utils.Utility;

public class ProjectSpecificationMethod extends Utility{
	
	@BeforeMethod
	@Parameters({"browser","url"})
	public void browserLaunch(String browser, String url) throws Exception {
	launchbrowser(browser, url);
	
	}
	public void loadUrl(String url) {
	}
	
	
	@AfterMethod
	public void closeBrowser() {
	browserClose();
	}
	public void click(WebElement element) {
	clickbtn(element);
	}
	public String valueofAlert(String text) {
	gettextfromAlert();	
	return text;
	}
	
	public void acceptAllert() {
	acceptA();

	}
	@DataProvider(name="ReadfromExcel")
	public String[][] exceldata() throws Exception {
		
	String [][] data = getValuefromExcel();	
	return data;
	

	}
	
	public void newdataread() throws Exception {
		getValuefromExcelanothermethod();

	}
}
