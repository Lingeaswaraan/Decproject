package com.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Facebookpom.Facebookpom;
import com.facebookbase.Facebook_Base;
import com.facebookpage.Facebook_page;

public class FacebookRunner extends Facebook_Base {
	public static WebDriver driver = browser("chrome");
public static Facebookpom pom = new Facebookpom(driver);
	public static void facebooklogin() {
		url("https://www.facebook.com/");
		String id = driver.getWindowHandle();
		String expec_page = driver.switchTo().window(id).getTitle();
		String actual_page = "Facebook – log in or sign up";
		if (driver.switchTo().window(id).getTitle().equals(actual_page)) {
			enabled(pom.getfb().getGetloginmail());
			input(pom.getfb().getGetloginmail(), "charles");
			enabled(pom.getfb().getGetloginpassword());
			input(pom.getfb().getGetloginpassword(), "charles@1234");
			enabled(pom.getfb().getGetloginbutton());
			click(pom.getfb().getGetloginbutton());
		} else {
			System.out.println("invalid page");
		}
	}

	public static void facebookpassword() {
		url("https://www.facebook.com/");
		enabled(pom.getfb().getGetloginmail());
		input(pom.getfb().getGetloginmail(), "charles");
		enabled(pom.getfb().getGetforgotpassword());
		click(pom.getfb().getGetforgotpassword());
		String passwordid = driver.getWindowHandle();
		String expec_pass = driver.switchTo().window(passwordid).getTitle();
		String actual_pass = "Forgotten Password | Can't Log In | Facebook";
		if (driver.switchTo().window(passwordid).getTitle().equals(actual_pass)) {
			enabled(pom.getfb().getGetforgotemail());
			input(pom.getfb().getGetforgotemail(), "charles@gmail.com");
			enabled(pom.getfb().getGetpasswordclick());
			click(pom.getfb().getGetpasswordclick());
		} else {
			System.out.println("invalid page");
		}
	}

	public static void facebooknewaccount() {
		url("https://www.facebook.com/");
		enabled(pom.getfb().getGetnewacc());
		click(pom.getfb().getGetnewacc());
		String newid = driver.getWindowHandle();
		String expec_new = driver.switchTo().window(newid).getTitle();
		String actual_new = "Facebook – log in or sign up";
		if (driver.switchTo().window(newid).getTitle().equals(actual_new)) {
			System.out.println("create new account");
		} else {
			System.out.println("invalid page");
		}
	}

	public static void main(String[] args) {
		
	}
}
