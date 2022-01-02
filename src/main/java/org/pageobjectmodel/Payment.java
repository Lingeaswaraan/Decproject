package org.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	public Payment(WebDriver driver2) {
	
	this.driver=driver2;
	PageFactory.initElements(driver, this);
	}
	public WebDriver driver;
	@FindBy(xpath="//a[@class='cheque']")
	private WebElement check;
	public WebElement getCheck() {
		return check;
	}

}
