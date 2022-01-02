package org.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmation {
	public WebDriver driver;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement confirm;
	public WebElement getConfirm() {
		return confirm;
	}
	public Confirmation(WebDriver driver2) {
this.driver = driver2;
PageFactory.initElements(driver, this);
	}
	

}
