import java.util.List;

public interface Manager {
    void addStudent(Student student);
    void removeStudent(int studentId);
    void updateStudent(int studentId, String name, int age, String email);
    List<Student> getAllStudents();
    Student findStudentById(int studentId);
    List<Student> findStudentsByName(String name);
}