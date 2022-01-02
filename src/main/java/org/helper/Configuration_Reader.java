package org.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;

	public Configuration_Reader() throws Throwable {
		File f = new File(
				"C:\\Users\\acer\\Downloads\\Decproject-master (1)\\Decproject-master\\src\\main\\java\\org\\propertyfile\\configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);

	}

	public String getUrl() throws Throwable {
		String url = p.getProperty("url");
		return url;
	}
	public String getusernme() {
String usernmae = p.getProperty("username");
	return usernmae;
	}
public String getpassword() {
String password = p.getProperty("password");
return password;
}






}
