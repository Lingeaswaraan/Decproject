package com.facebookpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Facebook_page {
	public Facebook_page(WebDriver driver2) {
this.driver = driver2;
	PageFactory.initElements(driver, this);
	}
	public static WebDriver driver;
	@FindBy(id="email")
	private WebElement getloginmail;
	@FindBy(id="pass")
	private WebElement getloginpassword;
	@FindBy(name="login")
	private WebElement getloginbutton;
	@FindBy(xpath="//a[text()='Forgotten password?']")
	private WebElement getforgotpassword;
	@FindBy(name="email")
	private WebElement getforgotemail;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement getpasswordclick;
	@FindBy(xpath="(//a[@role='button'])[2]")
	private WebElement getnewacc;
		public WebElement getGetloginmail() {
		return getloginmail;
	}
	public WebElement getGetloginpassword() {
		return getloginpassword;
	}
	public WebElement getGetloginbutton() {
		return getloginbutton;
	}
	public WebElement getGetforgotpassword() {
		return getforgotpassword;
	}
	public WebElement getGetforgotemail() {
		return getforgotemail;
	}
	public WebElement getGetpasswordclick() {
		return getpasswordclick;
	}
	public WebElement getGetnewacc() {
		return getnewacc;
	}
	@FindBy(xpath="(//div[@role='button'])[3]")
	private WebElement account;
	 public WebElement getaccount() {
		 return account;
		 
	 }
	
	@FindBy(xpath="/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[3]/div/div[4]/div/div[1]/div[2]/div/div/div/div/span")
	private WebElement logout;
	public WebElement getlogout() {
		return logout;
		}
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div/div[1]")
	private WebElement newpopup;
	
	public WebElement getnewpopup() {
		return newpopup;
		
	}

	
	
	
	
	
	
	
	
	
	
	
	

}
