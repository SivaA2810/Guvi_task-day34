package org.pages;

import org.base.ProjectSpecificationMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Functionalities extends ProjectSpecificationMethod {
	
	public Order_Functionalities(WebDriver driver) {
	this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindBy(xpath="(//a[@id='itemc'])[2]")
	private WebElement laptop;
	
	@FindBy(xpath="//a[text()='Sony vaio i5']")
	private WebElement selectlaptop;
	
	@FindBy(xpath="//a[text()='Add to cart']")
	private WebElement addtocart;

	
	public WebElement getLaptop() {
		return laptop;
	}

	public WebElement getSelectlaptop() {
		return selectlaptop;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}
	
	
	
	
	
}
