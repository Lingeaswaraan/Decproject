package com.Facebookpom;

import org.openqa.selenium.WebDriver;

import com.facebookpage.Facebook_page;

public class Facebookpom {
	public static WebDriver driver;
private Facebook_page fbp;

public Facebookpom(WebDriver driver2) {
this.driver = driver2;
}

public Facebook_page getfb() {
if (fbp == null) {
	fbp = new Facebook_page(driver);
	
}
	return fbp;
	
}





}
