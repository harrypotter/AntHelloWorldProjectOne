package practice.ant.base;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

public class HelloWorld {

	static Logger logger = Logger.getLogger(HelloWorld.class);
	
	public static void main(String[] args){
		BasicConfigurator.configure();
		logger.info("Hey there");
		System.out.println("hello world");
	}
}
