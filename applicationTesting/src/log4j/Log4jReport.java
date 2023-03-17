package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jReport {
public static void main(String[] args) {
	Logger logger;
	PropertyConfigurator.configure("Log4jProperties");
	Logger logg=Logger.getLogger(Log4jReport.class);
	logg.info("Log4J is Success");

	
	
}
}

