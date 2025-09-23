import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final StudentManager manager = new StudentManager();

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            printMenu();
            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1":
                    addStudentCLI();
                    break;
                case "2":
                    viewAllStudentsCLI();
                    break;
                case "3":
                    findStudentCLI();
                    break;
                case "4":
                    updateStudentCLI();
                    break;
                case "5":
                    deleteStudentCLI();
                    break;
                case "6":
                    System.out.println("Exiting. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
            System.out.println(); // blank line between operations
        }
        scanner.close();
    }

    private static void printMenu() {
        System.out.println("=== Student Record Management ===");
        System.out.println("1. Add student");
        System.out.println("2. View all students");
        System.out.println("3. Find student by ID");
        System.out.println("4. Update student");
        System.out.println("5. Delete student");
        System.out.println("6. Exit");
        System.out.print("Choose an option (1-6): ");
    }

    private static void addStudentCLI() {
        try {
            System.out.print("Enter ID (integer): ");
            int id = Integer.parseInt(scanner.nextLine().trim());

            System.out.print("Enter name: ");
            String name = scanner.nextLine().trim();

            System.out.print("Enter marks (number): ");
            double marks = Double.parseDouble(scanner.nextLine().trim());

            Student s = new Student(id, name, marks);
            boolean added = manager.addStudent(s);
            if (added) System.out.println("Student added successfully.");
            else System.out.println("Student with this ID already exists. Use update if you want to change.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Operation cancelled.");
        }
    }

    private static void viewAllStudentsCLI() {
        List<Student> list = manager.getAllStudents();
        if (list.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }
        System.out.println("All students:");
        for (Student s : list) {
            System.out.println(s);
        }
    }

    private static void findStudentCLI() {
        try {
            System.out.print("Enter ID to find: ");
            int id = Integer.parseInt(scanner.nextLine().trim());
            Student s = manager.findStudentById(id);
            if (s != null) System.out.println("Found: " + s);
            else System.out.println("No student with ID " + id);
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID format.");
        }
    }

    private static void updateStudentCLI() {
        try {
            System.out.print("Enter ID to update: ");
            int id = Integer.parseInt(scanner.nextLine().trim());
            Student s = manager.findStudentById(id);
            if (s == null) {
                System.out.println("Student with ID " + id + " not found.");
                return;
            }
            System.out.println("Current record: " + s);
            System.out.print("Enter new name (leave blank to keep unchanged): ");
            String newName = scanner.nextLine();

            System.out.print("Enter new marks (leave blank to keep unchanged): ");
            String marksInput = scanner.nextLine().trim();
            Double newMarks = null;
            if (!marksInput.isEmpty()) {
                newMarks = Double.parseDouble(marksInput);
            }

            boolean updated = manager.updateStudent(id, newName, newMarks);
            if (updated) System.out.println("Student updated successfully.");
            else System.out.println("Update failed.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Operation cancelled.");
        }
    }

    private static void deleteStudentCLI() {
        try {
            System.out.print("Enter ID to delete: ");
            int id = Integer.parseInt(scanner.nextLine().trim());
            boolean deleted = manager.deleteStudent(id);
            if (deleted) System.out.println("Student deleted successfully.");
            else System.out.println("No student with ID " + id);
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID format.");
        }
    }
}