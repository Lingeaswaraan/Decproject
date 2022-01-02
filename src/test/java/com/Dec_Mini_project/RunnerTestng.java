package com.Dec_Mini_project;

import org.helper.File_Reader_Manager;
import org.openqa.selenium.WebDriver;
import org.pageobjectmanager.Pageobjectmanager;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RunnerTestng extends Base {
	public static WebDriver driver = browser("chrome");

	public static Pageobjectmanager pom = new Pageobjectmanager(driver);

	
@BeforeMethod
public void login() throws Throwable {
	String url = File_Reader_Manager.filereader().getcr().getUrl();
	url(url);
	click(pom.gethp().getHome());
	String username = File_Reader_Manager.filereader().getcr().getusernme();
	input(pom.getlp().getEmail(),username );
	String password = File_Reader_Manager.filereader().getcr().getpassword();
	input(pom.getlp().getPassword(), password);
	click(pom.getlp().getSubmit());

}
@Test
public void women() throws InterruptedException {
actions("movetoelement", pom.getse().getwomen());
sleep(2000);
click(pom.getse().getwomeneven());
	click(pom.getse().getwomenimage());
	
	sleep(4000);
	click(pom.getse().getwomencart());
	click(pom.getse().getwomenproceed());
	
}



}
