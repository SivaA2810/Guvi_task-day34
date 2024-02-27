package org.utils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.sl.usermodel.Shadow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.base.ProjectSpecificationMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.prop.Datas_properties;

public class Utility {

	public static WebDriver driver;
	
	public void launchbrowser(String browser, String url) {
		switch (browser) {
		case "chrome" :driver = new ChromeDriver();
		break;
		case "edge"	  :driver = new EdgeDriver();
		break;
		case "firefox":driver = new FirefoxDriver();
		break;
	    default 	  :driver = new ChromeDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void urlLoad(String url) {
	

	}	
	public void browserClose() {
		driver.close();
		
	}
	public void clickbtn(WebElement element) {
		element.click();
	
	}
	public void findelementbyid(String attribute) {
		driver.findElement(By.id(attribute));
	}
	
	public void findelementbyxpathandsendkey(String attribute) {
		driver.findElement(By.xpath(attribute));
		
	}
	public void sendkey(WebElement element, String value) {
		element.sendKeys(value);

	}
	public void acceptA() {
		driver.switchTo().alert().accept();

	}
	public String gettextfromAlert() {
		String text= driver.switchTo().alert().getText();
		return text;
	}
	public void explicitwait(WebElement ele,int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.visibilityOf(ele));

	}
	
	public  String[][] getValuefromExcel() throws Exception {
		XSSFWorkbook book = new XSSFWorkbook("C:\\Users\\HP\\Eclipse workspace new\\Pom\\pomdata.xlsx");
		XSSFSheet sheet = book.getSheet("Sheet1");
		int rowcount = sheet.getLastRowNum(); 
		
		XSSFRow allrow = sheet.getRow(0);
		int colomncount = allrow.getLastCellNum();
		
		String[][] data = new String[rowcount][colomncount];	
		for (int i = 1; i <=rowcount; i++) {
		XSSFRow row = sheet.getRow(i);
		System.out.println();
		for (int j = 0; j <colomncount ; j++) {
			XSSFCell cell = row.getCell(j);
			data [i-1][j]= cell.getStringCellValue();
			
		}
	}
		System.out.println("datas fetched Successfully");
		return data;
	}

	public void getValuefromExcelanothermethod() throws Exception {
		XSSFWorkbook book = new XSSFWorkbook("C:\\Users\\HP\\Eclipse workspace new\\Pom\\pomdata.xlsx");
		XSSFSheet sheet = book.getSheet("Sheet1");
		XSSFRow row1 = sheet.getRow(0);
		int allRows = sheet.getPhysicalNumberOfRows();
		int allcells = row1.getPhysicalNumberOfCells();
		
		for (int i = 0; i < allRows; i++) {
			System.out.println();
			XSSFRow row = sheet.getRow(i);
		for (int j=0; j<allcells;j++) {
			XSSFCell cell2 = row.getCell(j);
			
		
		}
		
		}
		
	}
	public String takeScreenShot(String sreenshotname) throws Exception {
	String path = "C:\\Users\\HP\\Eclipse workspace new\\Pom\\snap\\"+sreenshotname+".png";
	TakesScreenshot taksc =(TakesScreenshot)driver;
	File source = taksc.getScreenshotAs(OutputType.FILE);
	File destination =new File(path);
	FileUtils.copyFile(source, destination);	
	
	return path;
	
	}

	}
	





