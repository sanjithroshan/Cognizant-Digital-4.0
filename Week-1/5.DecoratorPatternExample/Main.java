public class Main {
    public static void main(String[] args) {
        // Base notifier
        Notifier notifier = new EmailNotifier();

        // Add SMS and Slack notification layers
        Notifier smsNotifier = new SMSNotifierDecorator(notifier);
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        // Final chained notifier
        slackNotifier.send("System maintenance scheduled for tonight.");
    }
}
