package Lab6.Work1and2;

public class Employee extends Human {
    private String bankName;

    public String getBankName() {
        return bankName;
    }

    @Override
    public String getAllInfo() {
        return "Сотрудник " + this.getFirstName() + " " + this.getLastName() + ", Банк " + bankName;
    }

    public Employee(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    public void printInfo() {
        System.out.println(this.getAllInfo());
    }

    @Override
    public String getFullName() {
        return (this.getFirstName() + " " + this.getLastName());
    }

    @Override
    public String role() {
        return "Сотрудник";
    }
}
