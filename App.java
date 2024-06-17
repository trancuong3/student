import java.util.List;
import java.util.Scanner;
public class App {
    private static StudentManager manager = new StudentManager();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    removeStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    showAllStudents();
                    break;
                case 5:
                    findStudentById();
                    break;
                case 6:
                    findStudentsByName();
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    private static void showMenu() {
        System.out.println("Student Management System");
        System.out.println("1. Add Student");
        System.out.println("2. Remove Student");
        System.out.println("3. Update Student");
        System.out.println("4. Show All Students");
        System.out.println("5. Find Student by ID");
        System.out.println("6. Find Students by Name");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");
    }
    private static void addStudent() {
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter student email: ");
        String email = scanner.nextLine();
        Student student = new Student(id, name, age, email);
        manager.addStudent(student);
        System.out.println("Student added successfully.");
    }
    private static void removeStudent() {
        System.out.print("Enter student ID to remove: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        manager.removeStudent(id);
        System.out.println("Student removed successfully.");
    }
    private static void updateStudent() {
        System.out.print("Enter student ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter new student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new student age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter new student email: ");
        String email = scanner.nextLine();
        manager.updateStudent(id, name, age, email);
        System.out.println("Student updated successfully.");
    }
    private static void showAllStudents() {
        List<Student> students = manager.getAllStudents();
        for (Student student : students) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName() +
                    ", Age: " + student.getAge() + ", Email: " + student.getEmail());
        }
    }
    private static void findStudentById() {
        System.out.print("Enter student ID to find: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Student student = manager.findStudentById(id);
        if (student != null) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName() +
                    ", Age: " + student.getAge() + ", Email: " + student.getEmail());
        } else {
            System.out.println("Student not found.");
        }
    }
    private static void findStudentsByName() {
        System.out.print("Enter student name to find: ");
        String name = scanner.nextLine();
        List<Student> students = manager.findStudentsByName(name);
        for (Student student : students) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName() +
                    ", Age: " + student.getAge() + ", Email: " + student.getEmail());
        }
    }
}
