public class PaymentContext {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void makePayment(int amount) {
        if (strategy != null) {
            strategy.pay(amount);
        } else {
            System.out.println("Please set a payment strategy.");
        }
    }
}
