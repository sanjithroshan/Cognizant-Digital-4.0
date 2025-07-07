// Main.java
public class Main {
    public static void main(String[] args) {
        // Create model
        Student student = new Student("Sanjeev", "C101", "A");

        // Create view
        StudentView view = new StudentView();

        // Create controller
        StudentController controller = new StudentController(student, view);

        // Display initial details
        controller.updateView();

        System.out.println("\nUpdating student name and grade...\n");

        // Update model data via controller
        controller.setStudentName("Sanjeev Veerapandian");
        controller.setStudentGrade("A+");

        // Display updated details
        controller.updateView();
    }
}
