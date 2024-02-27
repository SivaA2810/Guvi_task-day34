package org.testcaseone;

import org.base.ProjectSpecificationMethod;
import org.pages.HomePage;
import org.testng.annotations.Test;

public class TC003AddtocartFunctionalities extends ProjectSpecificationMethod{

	@Test
	public void testCase03() throws Exception {
	
	HomePage obj = new HomePage(driver); 
	obj.placeorder().getLaptop().click();
	obj.placeorder().getSelectlaptop().click();
	obj.placeorder().getAddtocart().click();
	Thread.sleep(2000);
	obj.closeBrowser();

}
}
