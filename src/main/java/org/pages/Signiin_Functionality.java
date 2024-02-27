package org.pages;

import org.base.ProjectSpecificationMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class Signiin_Functionality extends ProjectSpecificationMethod{

	public Signiin_Functionality(WebDriver driver ) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="signin2")
	private WebElement signin;
	
	@FindBy(id="sign-username")
	private WebElement setusername;
	
	@FindBy(id="sign-password")
	private WebElement setpassword;
	
	@FindBy(xpath="//button[text()='Sign up']")
	private WebElement signupbtn;
	
	@FindBy(xpath="(//button[text()='Close'])[2]")
	private static WebElement close;
	
	
	
	public WebElement getSignin() {
		return signin;
	}
	public WebElement getSetusername() {
		return setusername;
	}
	public WebElement getSetpassword() {
		return setpassword;
	}
	public WebElement getSignupbtn() {
		return signupbtn;
		
	}
	public WebElement getClose() {
		return close;
	
}
	}
