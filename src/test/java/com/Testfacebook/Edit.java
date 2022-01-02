package com.Testfacebook;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Facebookpom.Facebookpom;
import com.facebookbase.Facebook_Base;


public class Edit extends Facebook_Base {
	public static WebDriver driver = browser("chrome");
	public static Facebookpom pom = new Facebookpom(driver);

	@Test(enabled = false, dataProvider = "test_data")
	public void facebooklogin(String username, String passworfd) {
		url("https://www.facebook.com/");
		String id = driver.getWindowHandle();
		String expec_page = driver.switchTo().window(id).getTitle();
		String actual_page = "Facebook – log in or sign up"; // ------------> test case data driven
		Assert.assertEquals(actual_page, expec_page);
		if (driver.switchTo().window(id).getTitle().equals(actual_page)) {
			enabled(pom.getfb().getGetloginmail());
			input(pom.getfb().getGetloginmail(), username); // ------->property file
			enabled(pom.getfb().getGetloginpassword());
			input(pom.getfb().getGetloginpassword(), passworfd); // ------------>property file
			enabled(pom.getfb().getGetloginbutton());
			click(pom.getfb().getGetloginbutton());
		} else {
			System.out.println("invalid page");
		}
	}

	@DataProvider

	private Object[][] test_data() {

		return new Object[][] {

				{ "usesrname", "passw" }, { "usesrname", "passw" }

		};

	}

	@Test(enabled = false)
	public void facebookpassword() {
		url("https://www.facebook.com/");
		String id = driver.getWindowHandle();
		String expec_page = driver.switchTo().window(id).getTitle();
		System.out.println();
		String actual_page = "Facebook – log in or sign up"; // ------------> test case data driven
		Assert.assertEquals(actual_page, expec_page);

		enabled(pom.getfb().getGetloginmail());
		input(pom.getfb().getGetloginmail(), "charles");
		enabled(pom.getfb().getGetforgotpassword());
		click(pom.getfb().getGetforgotpassword());
		driver.getTitle();

		String passwordid = driver.getWindowHandle();
		String expec_pass = driver.switchTo().window(passwordid).getTitle();
		String actual_pass = "Forgotten Password | Can't Log In | Facebook";
		// assert
		if (driver.switchTo().window(passwordid).getTitle().equals(actual_pass)) {
			enabled(pom.getfb().getGetforgotemail());
			input(pom.getfb().getGetforgotemail(), "charles@gmail.com");
			enabled(pom.getfb().getGetpasswordclick());
			click(pom.getfb().getGetpasswordclick());
		} else {
			System.out.println("invalid page");
		}
	}

	@Test
	public void facebooknewaccount() throws IOException {
		url("https://www.facebook.com/");
		String id = driver.getWindowHandle();
		driver.getTitle();
		String expec_page = driver.switchTo().window(id).getTitle();
		System.out.println(expec_page);
		String actual_page = "Facebook – log in or sign up"; // ------------> test case data driven
		Assert.assertEquals(actual_page, expec_page);
		enabled(pom.getfb().getGetnewacc());
		click(pom.getfb().getGetnewacc());
		String newid = driver.getWindowHandle();
		System.out.println(newid);
		String expec_new = driver.switchTo().window(newid).getTitle();

		
		System.out.println(datadriven(7, 6));
		
		
		String actual_new = "Facebook – log in or sign up";
		// assert
		if (driver.switchTo().window(newid).getTitle().equals(actual_new)) {
			System.out.println("create new account");
		} else {
			System.out.println("invalid page");
		}

	}

}
