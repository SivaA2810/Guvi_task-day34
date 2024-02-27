package org.pages;

import org.base.ProjectSpecificationMethod;
import org.openqa.selenium.WebDriver;

public class HomePage extends ProjectSpecificationMethod{

	public HomePage(WebDriver driver) {
	this.driver=driver;
}
	
	public Signiin_Functionality signIn() {
		
	return new Signiin_Functionality(driver);	
	}
	
	public Loginfunctionalities  login() {
		
	return new Loginfunctionalities(driver);
	}
	
	public Order_Functionalities placeorder() {
		
	return new Order_Functionalities(driver);
	}

	
	
}
