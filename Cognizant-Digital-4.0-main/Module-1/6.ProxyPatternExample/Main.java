public class Main {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("photo1.jpg");
        Image img2 = new ProxyImage("photo2.jpg");

        System.out.println("First call (photo1) — should load & display:");
        img1.display();  // Load + Display

        System.out.println("\nSecond call (photo1) — should only display:");
        img1.display();  // Only Display

        System.out.println("\nNow call photo2:");
        img2.display();  // Load + Display
    }
}
