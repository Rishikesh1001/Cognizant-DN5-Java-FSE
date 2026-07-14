public class Logger {

    // Step 1: Create a private static object
    private static Logger instance;

    // Step 2: Make constructor private
    private Logger() {
        System.out.println("Logger instance created.");
    }

    // Step 3: Public method to return the same object
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Step 4: Sample method
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}