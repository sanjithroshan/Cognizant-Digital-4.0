public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(int id) {
        // Simulated data fetch
        return "Customer[id=" + id + ", name=Sanjeev]";
    }
}
