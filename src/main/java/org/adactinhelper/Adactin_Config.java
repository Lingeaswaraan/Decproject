package org.adactinhelper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Adactin_Config {
	public static Properties p;
public Adactin_Config() throws Throwable {
File f = new File("C:\\Users\\acer\\Downloads\\Decproject-master (1)\\Decproject-master\\src\\main\\java\\com\\adactinproperty\\adactin.properties");
FileInputStream fis = new FileInputStream(f);
p = new Properties();
p.load(fis);
}
public String geturl() {
	String url = p.getProperty("url");
return url;
}	
public String getusername() {
String username = p.getProperty("username");
return username;
}	
public String getpassword() {
String password = p.getProperty("password");
return password;
}	
public String getdatein() {
String datein = p.getProperty("datein");
return datein;
}
public String getdateout() {
String dateout = p.getProperty("dateout");
return dateout;
}
public String getfirstname() {
String firstname = p.getProperty("firstname");
return firstname;
}
public String getlastname() {
String lastname = p.getProperty("lastname");
return lastname;
}
public  String getaddress() {
String address = p.getProperty("address");
return address;
}
public String getccnum() {
String ccnum = p.getProperty("ccnum");
return ccnum;
}
public String getcctype() {
String cctype = p.getProperty("cctype");
return cctype;
}
public String getccmonth() {
String ccmonth = p.getProperty("ccmonth");
return ccmonth;
}
public String getyear() {
String year = p.getProperty("year");
return year;
}
public String getcvvnum() {
String cvvnum = p.getProperty("cvvnum");
return cvvnum;
}

}
