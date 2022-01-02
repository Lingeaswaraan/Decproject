package com.Testfacebook;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Facebookpom.Facebookpom;
import com.facebookbase.Facebook_Base;
import com.facebookreader.Facebookreader;

public class Test_Facebook extends Facebook_Base {
	public static WebDriver driver = browser("chrome");
	public static Facebookpom pom = new Facebookpom(driver);

	@Test(dataProvider = "login")
	public void facebooklogin(String username, String password) {
		url("https://www.facebook.com/");

		String actual_page = driver.getTitle();
		System.out.println(actual_page);
		String expec_page = "Facebook – log in or sign up";
		Assert.assertEquals(actual_page, expec_page);

		enabled(pom.getfb().getGetloginmail());
		input(pom.getfb().getGetloginmail(), username);

		enabled(pom.getfb().getGetloginpassword());
		input(pom.getfb().getGetloginpassword(), password);

		enabled(pom.getfb().getGetloginbutton());
		click(pom.getfb().getGetloginbutton());

		deletecookies();

		implicitwait(30);

		String logact_page = gettitle();

		String logexp_page = "Facebook";
		if (logexp_page.equalsIgnoreCase(logact_page)) {

			explicitwait(pom.getfb().getaccount());
			actions(pom.getfb().getaccount());

			explicitwait(pom.getfb().getlogout());

			actions(pom.getfb().getlogout());
		}

		else {

			System.err.println("Invalid Credentials");
		}

	}


	@DataProvider
	public Object[][] login() throws IOException {
return new Object[][] {{Facebookreader.facebookread().getconfig().loguser(),Facebookreader.facebookread().getconfig().logpass()},
	{Facebookreader.facebookread().getconfig().loguser1(),Facebookreader.facebookread().getconfig().logpass1()},
	{Facebookreader.facebookread().getconfig().loguser2(),Facebookreader.facebookread().getconfig().logpass2()},
	{Facebookreader.facebookread().getconfig().loguser3(),Facebookreader.facebookread().getconfig().logpass3()},
	{Facebookreader.facebookread().getconfig().loguser4(),Facebookreader.facebookread().getconfig().logpass4()},
	{Facebookreader.facebookread().getconfig().loguser5(),Facebookreader.facebookread().getconfig().logpass5()},
	{Facebookreader.facebookread().getconfig().loguser6(),Facebookreader.facebookread().getconfig().logpass6()}
};
	
	
	}	
	
	


@DataProvider
public  Object[][] password() throws IOException {
return new Object[][] { {Facebookreader.facebookread().getconfig().username(),Facebookreader.facebookread().getconfig().password1()},
	{Facebookreader.facebookread().getconfig().usernmae1(),Facebookreader.facebookread().getconfig().password1()},
	{Facebookreader.facebookread().getconfig().username2(),Facebookreader.facebookread().getconfig().password2()},
	{Facebookreader.facebookread().getconfig().username3(),Facebookreader.facebookread().getconfig().password3()}
	
};
}
	
	
	
	
	@Test(dataProvider = "password")
	public void facebookpassword(String username, String password) {
		url("https://www.facebook.com/");

		String actual_page = driver.getTitle();
		System.out.println(actual_page);
		String expec_page = "Facebook – log in or sign up";
		Assert.assertEquals(actual_page, expec_page);

		enabled(pom.getfb().getGetloginmail());
		input(pom.getfb().getGetloginmail(), username);

		enabled(pom.getfb().getGetloginpassword());
		input(pom.getfb().getGetloginpassword(), password);

		enabled(pom.getfb().getGetforgotpassword());
		click(pom.getfb().getGetforgotpassword());

		String expec_pass = driver.getTitle();
		String actual_pass = "Forgotten Password | Can't Log In | Facebook";
		Assert.assertEquals(actual_pass, expec_pass);

	}

	@Test
	public void facebooknewaccount() {
		url("https://www.facebook.com/");
		String expec_page = driver.getTitle();
		String actual_page = "Facebook – log in or sign up";
		Assert.assertEquals(actual_page, expec_page);

		enabled(pom.getfb().getGetnewacc());
		click(pom.getfb().getGetnewacc());


		implicitwait(30);
	
		
		String expec_new = getext(pom.getfb().getnewpopup());
		

		String actual_new = "Sign up";

		if (actual_new.contains(expec_new)) {

			System.out.println("Sucessfully entered in to sign up popup ");

		}

	}

}
