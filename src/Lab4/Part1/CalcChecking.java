package Lab4.Part1;

import java.util.Scanner;

public class CalcChecking {
    public static void main(String[] args) {
        sum();
        more();
    }

    public static boolean sum() {
        System.out.println("============");
        System.out.println("Задание 3");
        System.out.println("Вычислить сумму двух целых чисел и вернуть true, если сумма равна третьему целому числу.");
        System.out.println("============");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе число:");
        int b = scanner.nextInt();
        System.out.println("Введите третье число:");
        int c = scanner.nextInt();
        boolean isSum = false;
        if (c == a + b) {
            isSum = true;
        }
        System.out.println(isSum);
        System.out.println("============");
        System.out.println("************");
        return isSum;
    }

    public static boolean more() {
        System.out.println("============");
        System.out.println("Задание 4");
        System.out.println("Программа, которая принимает от пользователя три целых числа и возвращает true, если второе число больше первого числа, а третье число больше второго числа.");
        System.out.println("============");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе число:");
        int b = scanner.nextInt();
        System.out.println("Введите третье число:");
        int c = scanner.nextInt();
        boolean isMore = false;
        if (b > a && c > b) {
            isMore = true;
        }
        System.out.println(isMore);
        System.out.println("============");
        System.out.println("************");
        return isMore;
    }


}

