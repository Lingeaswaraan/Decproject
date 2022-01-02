package org.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selection {
	public WebDriver driver;
	@FindBy(xpath = "(//a[@title='T-shirts'])[2]")
	private WebElement tshirt;

	@FindBy(xpath = "//img[@itemprop='image']")
	private WebElement image;
	@FindBy(xpath = "//button[@class='exclusive']")
	private WebElement cart;
	@FindBy(xpath = "//iframe[@frameborder='0']")
	private WebElement frame;

	
	
	
	
	
	
	@FindBy(xpath = "//a[@title='Women']")
	private WebElement women;
	public WebElement getwomen() {
		return women;
		}
	
	
	
	@FindBy(xpath = "(//a[@title='Evening Dresses'])[1]")
	private WebElement womeneven;
	public WebElement getwomeneven() {
		return womeneven;
		
	}
@FindBy(xpath="//img[@itemprop='image']")
	private WebElement womenimage;
public WebElement getwomenimage() {
	return womenimage;
	
	
}



@FindBy(xpath="exclusive")
private WebElement womencart;
public WebElement getwomencart() {
	return womencart;
	
	
}


@FindBy(xpath="//a[@title='Proceed to checkout']")
private WebElement womenproceed;
public WebElement getwomenproceed() {
	return womenproceed;
	
}


@FindBy(xpath="(//a[@title='Dresses'])[2]")
private WebElement dresses;
public WebElement getdresses() {
	return dresses;
	
}

@FindBy(xpath="(//a[@title='Casual Dresses'])[2]")
private WebElement casualdresses;
public WebElement getcasualdresses() {
	return casualdresses;
	
	
}

@FindBy(xpath="//img[@itemprop='image']")
private WebElement casualimage;
public WebElement getcasualimage() {
	return casualimage;
	
}

@FindBy(xpath="//iframe[@frameborder='0']")
private WebElement casualframe;
public WebElement getcasualframe() {
	return casualframe;
	
}

@FindBy(xpath="//button[@class='exclusive']")
private WebElement casualcart;
public WebElement getcasualcart() {
	
	return casualcart;
}



@FindBy(xpath="//a[@title='Proceed to checkout']")
private WebElement casualcheckout;
	
	public WebElement getcasualcheckout() {
		
		return casualcheckout;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public WebElement getFrame() {
		return frame;
	}

	public WebElement getProceed() {
		return proceed;
	}

	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement proceed;

	public Selection(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getTshirt() {
		return tshirt;
	}

	public WebElement getImage() {
		return image;
	}

	public WebElement getCart() {
		return cart;
	}

}
