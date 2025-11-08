package com.app.process;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class LoggerDemo {
	private static final Logger logger = LogManager.getLogger(LoggerDemo.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logger.info("Application started...");
        logger.debug("Debug message example");
        logger.warn("This is a warning!");
        logger.error("An error occurred!");
        logger.fatal("Fatal issue!");

        System.out.println("Check logs in console and logs/app.log");
	}

}
