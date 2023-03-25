package Lab6.Work5;

public class MainUser {
    public String firstName;
    public String lastName;
    public Integer age;

    public Integer getAge() {
        return age;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public MainUser(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
