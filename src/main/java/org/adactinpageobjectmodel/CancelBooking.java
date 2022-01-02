package org.adactinpageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelBooking {
	public WebDriver driver;
	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	private WebElement checkbox;
	public CancelBooking(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver, this);
	}
	public WebElement getCheckbox() {
		return checkbox;
	}
	public WebElement getCancel() {
		return cancel;
	}
	@FindBy(xpath="//input[@value ='Cancel Selected']")
	private WebElement cancel;

}
