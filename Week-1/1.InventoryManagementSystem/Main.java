public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        // Add products
        manager.addProduct(new Product(101, "Keyboard", 50, 799.99));
        manager.addProduct(new Product(102, "Mouse", 100, 499.50));

        // Update product
        manager.updateProduct(102, 120, 459.00);

        // Display all
        System.out.println("\n--- Inventory ---");
        manager.displayInventory();

        // Delete a product
        manager.deleteProduct(101);

        // Display after deletion
        System.out.println("\n--- Inventory After Deletion ---");
        manager.displayInventory();
    }
}
