package org.pages;

import org.base.ProjectSpecificationMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginfunctionalities extends ProjectSpecificationMethod {
	
	public Loginfunctionalities(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);	
	}
	
	@CacheLookup
	@FindBy(id="login2")
	private static WebElement loginbutton;

	@FindBy(id="loginusername")
	private static WebElement username;
	
	@FindBy(id="loginpassword")
	private static WebElement password;
	
	@FindBy(xpath="//button[@onclick='logIn()']")
	private static WebElement submit;
	
	

	public WebElement getLoginbutton() {
	return loginbutton;
	}
	
	public WebElement getUsername() {
	return username;
	}
	
	public WebElement getPassword() {
	return password;
	}
	
	public WebElement getSubmit() {
	return submit;
	}
	
	
	}
	

	
	
		
		
	

