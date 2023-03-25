package Lab6.Work5;

public class ChildUser extends MainUser{
    @Override
    public String getFullName() {
        return "Пользователь " + super.getFullName();
    }

    public ChildUser(String firstName, String lastName, Integer age) {
        super(firstName, lastName, age);
    }
}
