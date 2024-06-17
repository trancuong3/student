import java.util.ArrayList;
import java.util.List;

public class StudentManager implements Manager {
    private List<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void removeStudent(int studentId) {
        students.removeIf(student -> student.getId() == studentId);
    }

    @Override
    public void updateStudent(int studentId, String name, int age, String email) {
        for (Student student : students) {
            if (student.getId() == studentId) {
                student.setName(name);
                student.setAge(age);
                student.setEmail(email);
                break;
            }
        }
    }

    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }

    @Override
    public Student findStudentById(int studentId) {
        for (Student student : students) {
            if (student.getId() == studentId) {
                return student;
            }
        }
        return null;
    }

    @Override
    public List<Student> findStudentsByName(String name) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                result.add(student);
            }
        }
        return result;
    }
}
