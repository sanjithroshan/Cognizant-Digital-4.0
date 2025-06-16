public class Main {
    public static void main(String[] args) {
        // Step 1: Create repository
        CustomerRepository repo = new CustomerRepositoryImpl();

        // Step 2: Inject repo into service
        CustomerService service = new CustomerService(repo);

        // Step 3: Use the service
        service.displayCustomer(101);
    }
}
