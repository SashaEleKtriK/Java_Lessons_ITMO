package Lab6;

import Lab6.Work1and2.Client;
import Lab6.Work1and2.Employee;
import Lab6.Work1and2.Human;
import Lab6.Work3.Truck;
import Lab6.Work4.Child;
import Lab6.Work4.Parent;
import Lab6.Work5.ChildUser;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1 и 2");
        Client client1 = new Client("Игорь", "Зорькин", "СовКомБанк");
        Client client2 = new Client("Антон", "Шемякин", "СовКомБанк");
        Employee employee1 = new Employee("Вера", "Подолюк", "Сбер");
        Employee employee2 = new Employee("Игнат", "Сахипов", "СовКомБанк");
        client1.printInfo();
        client2.printInfo();
        employee1.printInfo();
        System.out.println(employee2.role() + " " + employee2.getFullName() + " " + employee2.getBankName());
        System.out.println("Задание 3");
        Truck truck1 = new Truck(2500, "МАЗ", 'r', 160.5f , 4, 1000);
        System.out.println(truck1.toString());
        System.out.println("Задание 4");
        Child child = new Child();
        child.getInteger();
        System.out.println("Задание 5");
        ChildUser user = new ChildUser("Владимир", "Викторов", 45);
        user.getFullName();
        System.out.println(user.getFullName() + ". Возраст, лет: " + user.getAge() );
    }
}
