package org.adactin;

import org.adactinpageobjectmodel.AdactinConfirmation;
import org.adactinpageobjectmodel.CancelBooking;
import org.adactinpageobjectmodel.Checkbox;
import org.adactinpageobjectmodel.Homepage;
import org.adactinpageobjectmodel.HotelSearch;
import org.adactinpageobjectmodel.Input;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Dec_Mini_project.Base;

import adactinpageobjectmanager.Adactinpom;

public class Test_Runner extends Base {
	public static WebDriver driver = browser("chrome");
	public static Adactinpom pom = new Adactinpom(driver);

	public static void main(String[] args) throws InterruptedException {

		url("https://adactinhotelapp.com/");
		input(pom.getInstancehp().getUser(), "lingeaswaraan");

		input(pom.getInstancehp().getPassword(), "Chenn@i078");
		click(pom.getInstancehp().getLogin());
		dropdown("text", "London", pom.getInstancehs().getLocation());
		dropdown("text", "Hotel Sunshine", pom.getInstancehs().getHotels());
		dropdown("text", "Super Deluxe", pom.getInstancehs().getRoomtype());
		clear(pom.getInstancehs().getDatein());
		input(pom.getInstancehs().getDatein(), "25/12/2021");
		clear(pom.getInstancehs().getDateout());
		input(pom.getInstancehs().getDateout(), "30/12/2021");
		dropdown("text", "4 - Four", pom.getInstancehs().getAdult());
		dropdown("text", "4 - Four", pom.getInstancehs().getChild());
		click(pom.getInstancehs().getSubmit());
		click(pom.getInstancecb().getRadio());
		sleep(5000);
		click(pom.getInstancecb().getCont());
		input(pom.getInstancei().getFirstname(), "lingeshwaraan");
		input(pom.getInstancei().getLastname(), "p");
		input(pom.getInstancei().getAddress(), "xxx,yyy,zzz");
		input(pom.getInstancei().getCcnum(), "0123456789012345");
		dropdown("text", "VISA", pom.getInstancei().getCctype());
		dropdown("text", "January", pom.getInstancei().getCcmonth());
		dropdown("text", "2022", pom.getInstancei().getCcyear());
		input(pom.getInstancei().getCvv(), "321");
		click(pom.getInstancei().getBooknow());
		sleep(5000);
		click(pom.getInstanceac().getItinerary());
		click(pom.getInstancecb1().getCheckbox());
		click(pom.getInstancecb1().getCancel());
		alertmethods("switchto", null);
		alertmethods("accept", null);
	}

}
