public class Main {
    public static void main(String[] args) {
        // Try getting two logger instances
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Use both to log messages
        logger1.log("This is the first log message.");
        logger2.log("This is the second log message.");

        // Test if both instances are the same
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same (Singleton works).");
        } else {
            System.out.println("Different instances exist (Singleton failed).");
        }
    }
}
