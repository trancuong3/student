public interface Person {
    int getId();
    String getName();
    int getAge();
    String getEmail();
    void setName(String name);
    void setAge(int age);
    void setEmail(String email);
    double calculateGpa();
}