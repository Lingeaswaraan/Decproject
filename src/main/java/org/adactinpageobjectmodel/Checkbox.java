package org.adactinpageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkbox {
	public WebDriver driver;
	@FindBy(xpath="//input[@type='radio']")
	private WebElement radio;
	public Checkbox(WebDriver driver2) {
this.driver= driver2;
PageFactory.initElements(driver, this);
	
	
	}
	public WebElement getRadio() {
		return radio;
	}
	public WebElement getCont() {
		return cont;
	}
	@FindBy(id="continue")
	private WebElement cont;

}
