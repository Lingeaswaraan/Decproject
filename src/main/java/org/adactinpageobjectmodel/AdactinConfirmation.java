package org.adactinpageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinConfirmation {
	public WebDriver driver;
	@FindBy(id="my_itinerary")
	private WebElement itinerary;
	public AdactinConfirmation(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver, this);
	}
	public WebElement getItinerary() {
		return itinerary;
	}
	
	
	
	

}
