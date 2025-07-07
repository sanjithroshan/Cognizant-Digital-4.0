public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(201, "Laptop", "Electronics"),
            new Product(202, "Phone", "Electronics"),
            new Product(203, "Shoes", "Footwear"),
            new Product(204, "Bag", "Accessories"),
            new Product(205, "Watch", "Accessories")
        };

        System.out.println("Linear Search for 'Shoes':");
        Product foundLinear = SearchEngine.linearSearch(products, "Shoes");
        System.out.println(foundLinear != null ? foundLinear : "Product not found");

        System.out.println("\n Binary Search for 'Phone':");
        Product foundBinary = SearchEngine.binarySearch(products, "Phone");
        System.out.println(foundBinary != null ? foundBinary : "Product not found");
    }
}
