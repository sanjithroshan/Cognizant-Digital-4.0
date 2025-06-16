public class WebApp implements Observer {
    private String user;

    public WebApp(String user) {
        this.user = user;
    }

    @Override
    public void update(double stockPrice) {
        System.out.println("WebApp (" + user + "): Stock price changed to " + stockPrice);
    }
}
