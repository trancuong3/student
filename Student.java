import java.util.ArrayList;
import java.util.List;

public class Student implements Person {
    private int id;
    private String name;
    private int age;
    private String email;
    private List<Class> classes;

    public Student(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.classes = new ArrayList<>();
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public double calculateGpa() {
        // Logic to calculate GPA
        return 0.0;
    }

    public void addClass(Class newClass) {
        classes.add(newClass);
    }

    public List<Class> getClasses() {
        return classes;
    }
}
