public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(101, "Sanjeev", 4500.50),
            new Order(102, "Aryan", 1999.99),
            new Order(103, "Priya", 7800.75),
            new Order(104, "Rahul", 1299.00),
            new Order(105, "Neha", 3000.00)
        };

        System.out.println("Original Orders:");
        OrderSorter.display(orders);

        // Bubble Sort
        System.out.println("\n Orders Sorted by Bubble Sort:");
        Order[] bubbleSorted = orders.clone();
        OrderSorter.bubbleSort(bubbleSorted);
        OrderSorter.display(bubbleSorted);

        // Quick Sort
        System.out.println("\n Orders Sorted by Quick Sort:");
        Order[] quickSorted = orders.clone();
        OrderSorter.quickSort(quickSorted, 0, quickSorted.length - 1);
        OrderSorter.display(quickSorted);
    }
}
