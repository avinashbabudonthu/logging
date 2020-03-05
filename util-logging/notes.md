# Java Util Logging Notes

## Notes
* One application wide log manager
* log manager manages log system configuration
* manage objects that are logging
* Log manager class - **LogManager**
* One global instance of **LogManager** class
* We can access **LogManager** instance using **LogManager.getLogManager**
* Logger instance
    * Provides methods that we use for logging
    * Logger logger = logManager.getLogger()
    * Each logger instance is named
    * Global logger name is available in Logger class. We can use that also
        * Logger.GLOBAL_LOGGER_NAME
    * Create Logger instance as **private static final** at class level
    ```
    private static final Logger logger = LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);
    ```
    * Write logs as follows
    ```
    logger.log(Level.INFO, "welcome to java util logging");
	logger.info("welcome to Logger.info");
    ```

## Logging Levels
* Each log entry is associated with level
* Each logger has capture level
    * Use **setLevel** method
    ```
    setLevel(Level.INFO)
    ```
    * Once capture level is set logger will ignore any entry that is below that level
* Each level has numeric value
    * 7 basic log levels
    * 2 specific levels for Logger
    * Can define custom level - not preferable
Level            | Numeric Value   | Description
---------------  | --------------- | ---------------
SEVERE           | 1000            | Serious Failure
WARNING          | 900             | Warning
INFO             | 800             | Information
CONFIG           | 700             | Configuration information like database connection etc
FINE             | 500             | General developer needed information
FINER            | 400             | Detailed developer needed information
FINEST           | 300             | Specialized developer needed information

First Header  | Second Header
------------- | -------------
Content Cell  | Content Cell
Content Cell  | Content Cell