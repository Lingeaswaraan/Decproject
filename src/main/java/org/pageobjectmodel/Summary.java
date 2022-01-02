package org.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary {
public WebDriver driver;
@FindBy(xpath="//a[@class='button btn btn-default standard-checkout button-medium']")
private WebElement summaryproceed;
public Summary(WebDriver driver2) {
this.driver = driver2;
PageFactory.initElements(driver, this);
}
public WebElement getSummaryproceed() {
	return summaryproceed;
}






}
