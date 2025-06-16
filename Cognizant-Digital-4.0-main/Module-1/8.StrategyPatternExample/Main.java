public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay using Credit Card
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        context.makePayment(500);

        // Pay using PayPal
        context.setPaymentStrategy(new PayPalPayment("user@example.com"));
        context.makePayment(750);
    }
}
