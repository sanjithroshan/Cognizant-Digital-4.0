public class FinancialForecast {

    // Recursive approach
    public static double predictFutureValue(double presentValue, double rate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return predictFutureValue(presentValue, rate, years - 1) * (1 + rate);
    }

    // Iterative approach (optimized)
    public static double predictFutureValueIterative(double presentValue, double rate, int years) {
        for (int i = 0; i < years; i++) {
            presentValue *= (1 + rate);
        }
        return presentValue;
    }
}
