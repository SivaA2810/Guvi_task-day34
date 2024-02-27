package org.testcaseone;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.base.ProjectSpecificationMethod;
import org.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC001Register  extends ProjectSpecificationMethod{
	
	
	String actual;
	@Test
	public void Testcase01() throws Exception {
		FileReader file = new FileReader("C:\\Users\\HP\\Eclipse workspace new\\Pom\\src\\test\\resources\\testdata.properties");
		Properties prop = new Properties();
		prop.load(file);
		
	HomePage obj = new HomePage(driver);
	
	
	obj.signIn().getSignin().click();
	obj.signIn().getSetusername().sendKeys(prop.getProperty("giveusername"));
	obj.signIn().getSetpassword().sendKeys(prop.getProperty("givepassword"));
	obj.signIn().getSignupbtn().click();
	
	
	String expected = obj.gettextfromAlert();
	actual="This user already exist";
	SoftAssert condition = new SoftAssert();
	System.out.println(condition);
	condition.assertEquals(expected, actual);
	
	
	obj.acceptA();
	obj.signIn().getClose().click();
	

	} 
}