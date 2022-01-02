package org.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address {
	public WebDriver driver;
	@FindBy(xpath="//span[text()='Proceed to checkout']")
	private WebElement proceedaddress;
	public WebElement getProceedaddress() {
		return proceedaddress;
	}
	public Address(WebDriver driver2) {
this.driver = driver2;
	PageFactory.initElements(driver, this);
	}
	
	}
	


