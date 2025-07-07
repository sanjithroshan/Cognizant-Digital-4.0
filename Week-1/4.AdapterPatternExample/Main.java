public class Main {
    public static void main(String[] args) {
        // Using PayPal through Adapter
        PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPalGateway());
        paypalProcessor.processPayment(150.00);

        // Using Stripe through Adapter
        PaymentProcessor stripeProcessor = new StripeAdapter(new StripeGateway());
        stripeProcessor.processPayment(200.50);
    }
}
