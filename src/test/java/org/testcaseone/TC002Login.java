package org.testcaseone;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.base.ProjectSpecificationMethod;
import org.openqa.selenium.WebElement;
import org.pages.HomePage;
import org.prop.Datas_properties;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC002Login extends ProjectSpecificationMethod{
	
	@Test(dataProvider="ReadfromExcel")
	public void Testcase02(String username, String password) throws IOException, Exception {
	HomePage obj = new HomePage(driver);
	
	
	obj.login().getLoginbutton().click();
	obj.login().getUsername().sendKeys(username);
	obj.login().getPassword().sendKeys(password);
	obj.login().getSubmit().click();
	Thread.sleep(2000);
	
// for make multiple add to cart function i have give the code here instead of TC001AddtocartFunctionalities	 	



	}
}

