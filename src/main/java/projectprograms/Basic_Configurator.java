package projectprograms;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Basic_Configurator {
  public static Logger log = Logger.getLogger(Basic_Configurator.class);
public static void main(String[] args) {
	BasicConfigurator.configure();
	log.debug("debug");
	log.info("infor");
	log.warn("warning");
	log.error("error");
	log.fatal("fatal");
	
	
	
}









}
