package Lab2;

import Lab2.Address;
import Lab2.Calculator;

public class Main {
    public static void main(String[] args) {
        testCalc();
        testSub();

    }

    public static void testCalc() {
        System.out.println("Задание 1. Тест калькулятора.");
        System.out.println(Calculator.sum(45, 73));
        System.out.println(Calculator.sum(45L, 73L));
        System.out.println(Calculator.sum(45.0, 73.0));
        System.out.println(Calculator.division(45, 445));
        System.out.println(Calculator.division(45L, 445L));
        System.out.println(Calculator.division(45.0, 445.0));
        System.out.println(Calculator.multiplication(4, 7));
        System.out.println(Calculator.multiplication(4L, 7L));
        System.out.println(Calculator.multiplication(4.0, 7.0));
        System.out.println(Calculator.difference(51, 44));
        System.out.println(Calculator.difference(51L, 44L));
        System.out.println(Calculator.difference(51.0, 44.0));
    }

    public static void testSub() {

        System.out.println("Задание 2. Тест класса подстанции.");
        Address address1 = new Address("1-я Красноармейская", 4, "корпус 2");
        Address address2 = new Address("ул. Ломоносовская", 10, "литера А");
        Address address3 = new Address("Невский проспект", 146, " ");
        Address address4 = new Address("Банковский переулок", 2, "здание 3");
        SubStation subStation1 = new SubStation("Распределительная подстанция", 3, 6);
        SubStation subStation2 = new SubStation("Трансформаторная подстанция", 5500, 6);
        SubStation subStation3 = new SubStation();
        SubStation subStation4 = new SubStation("Распределительно-Трансформаторная подстанция", 277, 10);
        subStation1.setAddress(address1);
        subStation1.setTransformersCount(0);
        subStation2.setAddress(address2);
        subStation2.setTransformersCount(2);
        subStation3.setNumber(362);
        subStation3.setAddress(address3);
        subStation3.setTransformersCount(1);
        subStation3.setType("Трансформаторная подстанция");
        subStation3.setVoltage(10);
        subStation4.setAddress(address4);
        subStation4.setTransformersCount(4);
        System.out.println(subStation1);
        System.out.println(subStation2);
        System.out.println(subStation3);
        System.out.println(subStation4);


    }
}
