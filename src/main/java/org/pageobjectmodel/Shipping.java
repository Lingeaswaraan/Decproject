package org.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping {
	public WebDriver driver;
	@FindBy(id="cgv")
	private WebElement checkbox;
	public WebElement getCheckbox() {
		return checkbox;
	}

	public Shipping(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver, this);
	}
	
	public WebElement getShippingproceed() {
		return shippingproceed;
	}
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement shippingproceed;

}
