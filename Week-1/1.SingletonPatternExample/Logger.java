public class Logger {
    // 1. Static variable to hold the single instance
    private static Logger instance;

    // 2. Private constructor to prevent external instantiation
    private Logger() {
        System.out.println("Logger initialized.");
    }

    // 3. Public method to provide access to the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // Create instance only once
        }
        return instance;
    }

    // Sample logging method
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
