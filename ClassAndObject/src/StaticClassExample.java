
class UtilityClass {
 
    static abstract class Logger {
        abstract void log(String logMessage);
    }
 
    static Logger logger;
 
    static void log(String logMessage) {
        logger.log(logMessage);
    }
}
 
class CustomLogger extends UtilityClass.Logger {
 
    void log(String logMessage) {
        logMessage = doSomethingCustomBeforeLogging(logMessage);
        System.out.println("I want to log " + logMessage
                + " my own great way");
    }
 
    private String doSomethingCustomBeforeLogging(String logMessage) {
        logMessage = "'" + logMessage + "' (" + logMessage.split(" ").length
                + " words)";
        return logMessage;
    }
}
 
public class StaticClassExample {
 
    public static void main(String[] args) {
 
        UtilityClass.logger = new CustomLogger();
        UtilityClass.log("An important message");
    }
}