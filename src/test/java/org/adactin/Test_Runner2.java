package org.adactin;

import org.adactinhelper.Adactin_File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Dec_Mini_project.Base;

public class Test_Runner2 extends Base {

	public static void main(String[] args) throws Throwable {
		browser("chrome");
		String url = Adactin_File.adactinfile().adacconfig().geturl();
		url(url);
		WebElement usernmae = driver.findElement(By.id("username"));
		String username1 = Adactin_File.adactinfile().adacconfig().getusername();
		input(usernmae, username1);
		WebElement password = driver.findElement(By.id("password"));
		String password1 = Adactin_File.adactinfile().adacconfig().getpassword();
		input(password, password1);
		WebElement login = driver.findElement(By.id("login"));
		click(login);
		WebElement location = driver.findElement(By.id("location"));
		dropdown("text", "London", location);
		WebElement hotels = driver.findElement(By.id("hotels"));
		dropdown("text", "Hotel Sunshine", hotels);
		
		WebElement roomtype = driver.findElement(By.id("room_type"));
		dropdown("text", "Super Deluxe", roomtype);
		WebElement datein = driver.findElement(By.id("datepick_in"));
		clear(datein);
		input(datein, "25/12/2021");
		WebElement dateout = driver.findElement(By.id("datepick_out"));
		clear(dateout);
		input(dateout, "30/12/2021");
		WebElement adult = driver.findElement(By.id("adult_room"));
		dropdown("text", "4 - Four", adult);
		WebElement childroom = driver.findElement(By.id("child_room"));
		dropdown("text", "4 - Four", childroom);
		WebElement submit = driver.findElement(By.id("Submit"));
		click(submit);
		WebElement radio = driver.findElement(By.xpath("//input[@type='radio']"));
		click(radio);
		WebElement cont = driver.findElement(By.id("continue"));
		click(cont);
		WebElement firstname = driver.findElement(By.id("first_name"));
		String getfirstname = Adactin_File.adactinfile().adacconfig().getfirstname();
		input(firstname, getfirstname);
		WebElement lastname = driver.findElement(By.id("last_name"));
		String getlastname = Adactin_File.adactinfile().adacconfig().getlastname();
	    input(lastname, getlastname);
	    WebElement address = driver.findElement(By.id("address"));
	    String getaddress = Adactin_File.adactinfile().adacconfig().getaddress();
	    input(address, getaddress);
	    WebElement ccnum = driver.findElement(By.id("cc_num"));
	    String getccnum = Adactin_File.adactinfile().adacconfig().getccnum();
	    input(ccnum, getccnum);
	    WebElement cctype = driver.findElement(By.id("cc_type"));
	    String getcctype = Adactin_File.adactinfile().adacconfig().getcctype();
	    dropdown("text", getcctype, cctype);
	    WebElement ccmonth = driver.findElement(By.id("cc_exp_month"));
	    String getccmonth = Adactin_File.adactinfile().adacconfig().getccmonth();
	    dropdown("text", getccmonth, ccmonth);
	    WebElement ccyear = driver.findElement(By.id("cc_exp_year"));
	    dropdown("text", "2022", ccyear);
	    WebElement cccvv = driver.findElement(By.id("cc_cvv"));
	    String getcvvnum = Adactin_File.adactinfile().adacconfig().getcvvnum();
	    input(cccvv, getcvvnum);
	    WebElement booknow = driver.findElement(By.id("book_now"));
	    click(booknow);
	    sleep(5000);
	    WebElement itinerary = driver.findElement(By.id("my_itinerary"));
	    click(itinerary);
	    WebElement checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
	    click(checkbox);
	    WebElement cancel = driver.findElement(By.xpath("//input[@value ='Cancel Selected']"));
	    click(cancel);
	    sleep(4000);
	   alertmethods("accept", null);
	
	
	
	
	
	
	
	}	
	
}
