public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5); // capacity = 5

        manager.addEmployee(new Employee(1, "Sanjeev", "Developer", 60000));
        manager.addEmployee(new Employee(2, "Aryan", "Designer", 55000));
        manager.addEmployee(new Employee(3, "Neha", "Manager", 75000));

        manager.listEmployees();

        System.out.println("\n Searching for ID 2:");
        Employee found = manager.searchById(2);
        System.out.println(found != null ? found : "Not Found");

        System.out.println("\n Deleting ID 2...");
        manager.deleteById(2);

        manager.listEmployees();
    }
}
