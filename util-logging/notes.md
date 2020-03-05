# Java Util Logging Notes

## Log system management
* One application wide log manager
* log manager manages log system configuration
* manage objects that are logging
* Log manager class - **LogManager**
* One global instance of **LogManager** class
* We can access **LogManager** instance using **LogManager.getLogManager**