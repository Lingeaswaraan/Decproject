package adactinpageobjectmanager;

import org.adactinpageobjectmodel.AdactinConfirmation;
import org.adactinpageobjectmodel.CancelBooking;
import org.adactinpageobjectmodel.Checkbox;
import org.adactinpageobjectmodel.Homepage;
import org.adactinpageobjectmodel.HotelSearch;
import org.adactinpageobjectmodel.Input;
import org.openqa.selenium.WebDriver;

public class Adactinpom {
	public WebDriver driver;
	private AdactinConfirmation ac;
	private CancelBooking cb1;
	private Checkbox cb;
	private Homepage hp;
	private HotelSearch hs;
	private Input i ;
	
	
	public Adactinpom(WebDriver driver2) {
this.driver = driver2;
	
	}
	public Homepage getInstancehp() {
		if (hp==null) {
			hp = new Homepage(driver);
		}
		return hp;
}
	public HotelSearch  getInstancehs() {
		if (hs==null) {
			hs = new HotelSearch(driver);
		}
		return hs;
		}
	public Checkbox getInstancecb() {
		if (cb==null) {
			cb = new Checkbox(driver);
		}return cb;
		}
	public Input getInstancei() {
		if (i==null) {
			i = new Input(driver);
		} 
		return i;
		}
	public AdactinConfirmation getInstanceac() {
		if (ac == null) {
			ac = new AdactinConfirmation(driver);
			
		}
		return ac;
		
	}
	public CancelBooking getInstancecb1() {
		if (cb1==null) {
			cb1 = new CancelBooking(driver);
		}
		return cb1;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
