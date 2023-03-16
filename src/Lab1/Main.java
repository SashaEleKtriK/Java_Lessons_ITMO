package Lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3(10500);
        task4(3.6, 4.1, 5.9);
        task5();
        task6();
    }

    private static void task1() {
        System.out.println("Задание 1");
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java");
    }

    private static void task2() {
        System.out.println("Задание 2");
        double result1 = (46 + 10) * ((double) 10 / 3);
        long result2 = (29) * (4) * (-15);
        System.out.println("(46 +10)*(10/3) = " + result1);
        System.out.println("(29)*(4)*(-15) = " + result2);
    }

    private static void task3(int number) {
        System.out.println("Задание 3");
        System.out.println("number = " + number);
        int result = (number / 10) / 10;
        System.out.println(result);
    }

    private static void task4(double i, double b, double a) {
        System.out.println("Задание 4");
        double result = i * b * a;
        System.out.println(i + " * " + b + " * " + a + " = " + result);

    }

    private static void task5() {
        System.out.println("Задание 5");
        System.out.println("Введите 3 целых числа");
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        System.out.println(first + ", " + second + " , " + third);
    }

    private static void task6() {
        System.out.println("Задание 6");
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num % 2 != 0) {
            System.out.println("Нечетное");
        }
        if (num % 2 == 0 && num <= 100) {
            System.out.println("Четное");
        }
        if (num % 2 == 0 && num > 100) {
            System.out.println("Выход за пределы диапазона");
        }
    }
}
