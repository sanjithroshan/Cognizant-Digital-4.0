public class CustomerService {
    private final CustomerRepository customerRepository;

    // Constructor-based dependency injection
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void displayCustomer(int id) {
        String customer = customerRepository.findCustomerById(id);
        System.out.println("Found: " + customer);
    }
}
