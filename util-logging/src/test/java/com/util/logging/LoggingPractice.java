package com.util.logging;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.junit.Test;

public class LoggingPractice {

	@Test
	public void logHelloWorld() {
		LogManager logManager = LogManager.getLogManager();
		Logger logger = logManager.getLogger(Logger.GLOBAL_LOGGER_NAME);

		logger.log(Level.INFO, "welcome to java util logging");
		logger.info("welcome to Logger.info");
	}

	@Test
	public void logLevelInfo() {
		Logger logger = LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);
		logger.setLevel(Level.INFO);

		logger.log(Level.INFO, "info log");
		logger.log(Level.WARNING, "warning log");
		logger.log(Level.SEVERE, "severe log");
		logger.log(Level.FINE, "fine log");
	}
}