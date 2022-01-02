package com.Dec_Mini_project;

import java.io.IOException;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.helper.File_Reader_Manager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.pageobjectmanager.Pageobjectmanager;
import org.pageobjectmodel.Address;
import org.pageobjectmodel.Confirmation;
import org.pageobjectmodel.Homepage;
import org.pageobjectmodel.Loginpage;
import org.pageobjectmodel.Payment;
import org.pageobjectmodel.Selection;
import org.pageobjectmodel.Shipping;
import org.pageobjectmodel.Summary;

public class Runner_class2 extends Base {
	public static WebDriver driver = browser("chrome");
	public static Pageobjectmanager pom = new Pageobjectmanager(driver);

	public static void main(String[] args) throws Throwable {
		String url = File_Reader_Manager.filereader().getcr().getUrl();
		url(url);
		click(pom.gethp().getHome());
		String username = File_Reader_Manager.filereader().getcr().getusernme();
		input(pom.getlp().getEmail(),username );
		String password = File_Reader_Manager.filereader().getcr().getpassword();
		input(pom.getlp().getPassword(), password);
		click(pom.getlp().getSubmit());
		click(pom.getse().getTshirt());
		click(pom.getse().getImage());
		sleep(5000);
		frames("webelement", null, pom.getse().getFrame());
		click(pom.getse().getCart());
		System.out.println("out of frame");
		sleep(9000);
		actions("movetoelement", pom.getse().getProceed());
		click(pom.getse().getProceed());
		System.out.println("proceed");
		sleep(8000);
		click(pom.gets1().getSummaryproceed());
		sleep(5000);
		click(pom.geta().getProceedaddress());
		click(pom.gets2().getCheckbox());
		click(pom.gets2().getShippingproceed());
		click(pom.getp().getCheck());
		click(pom.getc().getConfirm());
		Thread.sleep(5000);
		screenshot("screenshot.png");

	}

}
