package org.pageobjectmanager;

import org.openqa.selenium.WebDriver;
import org.pageobjectmodel.Address;
import org.pageobjectmodel.Confirmation;
import org.pageobjectmodel.Homepage;
import org.pageobjectmodel.Loginpage;
import org.pageobjectmodel.Payment;
import org.pageobjectmodel.Selection;
import org.pageobjectmodel.Shipping;
import org.pageobjectmodel.Summary;

public class Pageobjectmanager {
	public Pageobjectmanager(WebDriver driver2) {

		this.driver = driver2;
	}

	public WebDriver driver;
	private Homepage hp;
	private Loginpage lp;
	private Selection se;
	private Summary s1 ;
private Address a;
private Shipping s2 ;
private Payment p;
private Confirmation c ;
	public Homepage gethp() {

		if (hp == null) {
			hp = new Homepage(driver);
		}
		return hp;
	}

	public Loginpage getlp() {

		if (lp == null) {
			lp = new Loginpage(driver);
		}
		return lp;
	}

	public Selection getse() {
		if (se == null) {
			se = new Selection(driver);
		}
		return se;

	}
	public Summary gets1() {
		if(s1==null) {
			s1 = new Summary(driver);
		}
		return s1;
	}
public Address geta () {
	if (a == null) {
		a = new Address(driver);
	}return a;
	
	
}
public Shipping gets2() {
	
	if (s2==null) {
		s2 = new Shipping(driver);
	}
	return s2;
}
public Payment getp() {
	if (p == null) {
		p = new Payment(driver);
	}return p;
	
	
}
public Confirmation getc () {
	if (c == null) {
		c = new Confirmation(driver);
	}
	return c ;
}



}
