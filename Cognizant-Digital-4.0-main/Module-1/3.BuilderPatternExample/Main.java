// Main.java
public class Main {
    public static void main(String[] args) {
        // First configuration
        Computer gamingPC = new Computer.Builder()
                .setCpu("Intel Core i9")
                .setRam("32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 4080")
                .setWiFi(true)
                .setBluetooth(true)
                .build();

        gamingPC.showSpecs();

        System.out.println();

        // Second configuration
        Computer officePC = new Computer.Builder()
                .setCpu("Intel Core i5")
                .setRam("16GB")
                .setStorage("512GB SSD")
                .setWiFi(true)
                .setBluetooth(false)
                .build();

        officePC.showSpecs();
    }
}
