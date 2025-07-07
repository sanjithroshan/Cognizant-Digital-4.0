public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileUser = new MobileApp("Sanjeev");
        Observer webUser = new WebApp("Developer");

        stockMarket.registerObserver(mobileUser);
        stockMarket.registerObserver(webUser);

        stockMarket.setStockPrice(101.5);
        stockMarket.setStockPrice(105.75);

        stockMarket.removeObserver(webUser);

        stockMarket.setStockPrice(110.25);
    }
}
