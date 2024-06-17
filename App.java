public class App {
    public void showSystem() {
        // Logic to display the system
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Student student1 = new Student(1, "lan", 20, "lan@example.com");
        Student student2 = new Student(2, "nam", 22, "nam@example.com");
        manager.addStudent(student1);
        manager.addStudent(student2);
        for (Student student : manager.getAllStudents()) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName());
        }
    }
}
