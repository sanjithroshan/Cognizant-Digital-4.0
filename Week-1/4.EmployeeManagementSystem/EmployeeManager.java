public class EmployeeManager {
    Employee[] employees;
    int size = 0; // Number of employees added

    public EmployeeManager(int capacity) {
        employees = new Employee[capacity]; // Fixed-size array
    }

    // Add an employee
    public void addEmployee(Employee emp) {
        if (size < employees.length) {
            employees[size] = emp;
            size++;
            System.out.println("Employee added: " + emp.name);
        } else {
            System.out.println("Cannot add more employees. Array is full.");
        }
    }

    // Search by employee ID
    public Employee searchById(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == id) {
                return employees[i];
            }
        }
        return null;
    }

    // Traverse all employees
    public void listEmployees() {
        System.out.println("\n-- Employee List --");
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    // Delete by employee ID
    public void deleteById(int id) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == id) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int j = index; j < size - 1; j++) {
                employees[j] = employees[j + 1]; // Shift left
            }
            employees[size - 1] = null; // Clear last element
            size--;
            System.out.println("Employee with ID " + id + " deleted.");
        } else {
            System.out.println("Employee not found.");
        }
    }
}
