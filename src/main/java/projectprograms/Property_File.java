package projectprograms;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Property_File {
public static Logger log = Logger.getLogger(Property_File.class);
public static void main(String[] args) {
	PropertyConfigurator.configure("log4j.properties");
	log.debug("debug");
	log.info("info");
	log.warn("warn");
	log.error("error");
	log.fatal("fatal");
	
	
	
	
	
	
}









}
