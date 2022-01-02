package com.facebookreader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Facebookconfigure {
	public static Properties p; 
	
	public Facebookconfigure() throws IOException {

		File f = new File("C:\\Users\\acer\\Downloads\\Decproject-master (1)\\Decproject-master\\src\\main\\java\\com\\Facebookdata\\Facebookdata.properties");
		FileInputStream fis = new FileInputStream(f);
		 p = new Properties();
	p.load(fis);
	}
	
public  String username() {
String property = p.getProperty("validusername");
return property;
}	

public  String password() {
String property = p.getProperty("invalidpassword");
return property;
}

	public String usernmae1() {
String property = p.getProperty("invalidusername");
return property;
	}
	public String password1() {
String property = p.getProperty("invalidpassword1");
return property;
	}
	public String username2() {
String property = p.getProperty("validusername1");
return property;
		
	}
	public String password2() {
String property = p.getProperty("blankpassword");
return property;
	}
	public String username3() {
String property = p.getProperty("invalidusername1");
return property;
	}
	public String password3() {
String property = p.getProperty("blankpassword1");
return property;
	}
	public String loguser() {
String property = p.getProperty("logusernamevalid");
	return property;
	}
	public String logpass() {
String property = p.getProperty("logvalidpassword");
	return property;
	}
	public String loguser1() {
String property = p.getProperty("loginvalidusername1");
return property;
	}
	public String logpass1() {
String property = p.getProperty("logininvalidpassword");
return property;
	}
	public String loguser2() {
String property = p.getProperty("logininvalidusername2");
return property;
	}
	public String logpass2() {
String property = p.getProperty("loginvalidpassword1");
return property;
	}
public String loguser3() {
String property = p.getProperty("logininvalidusername3");
return property;
	}
	public String logpass3() {
String property = p.getProperty("invalidpassword2");
return property;
	}
	public String loguser4() {
String property = p.getProperty("loginvalidusername2");
return property;
	}
	public String logpass4() {
String property = p.getProperty("loginpasswordblank");
return property;
	}
	public String loguser5() {
String property = p.getProperty("loginusernameblank");
return property;
		
	}
	public String logpass5() {
String property = p.getProperty("loginpassword");
return property;
	}
	public String loguser6() {
String property = p.getProperty("loginblankusername2");
return property;
	}
	public String logpass6() {
String property = p.getProperty("loginpasswordblank2");
return property;
	}
	
	
	
	
	
	
	
}
