// Computer.java
public class Computer {
    // Required and optional components
    private final String cpu;
    private final String ram;
    private final String storage;
    private final String graphicsCard;
    private final boolean hasWiFi;
    private final boolean hasBluetooth;

    // Private constructor - only Builder can access
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.hasWiFi = builder.hasWiFi;
        this.hasBluetooth = builder.hasBluetooth;
    }

    // Static nested Builder class
    public static class Builder {
        private String cpu;
        private String ram;
        private String storage;
        private String graphicsCard;
        private boolean hasWiFi;
        private boolean hasBluetooth;

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setWiFi(boolean hasWiFi) {
            this.hasWiFi = hasWiFi;
            return this;
        }

        public Builder setBluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    // Display method to print computer details
    public void showSpecs() {
        System.out.println("Computer Specifications:");
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println("Graphics Card: " + graphicsCard);
        System.out.println("WiFi: " + (hasWiFi ? "Yes" : "No"));
        System.out.println("Bluetooth: " + (hasBluetooth ? "Yes" : "No"));
    }
}
