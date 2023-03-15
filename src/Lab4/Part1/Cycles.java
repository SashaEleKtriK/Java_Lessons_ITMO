package Lab4.Part1;

public class Cycles {
    public static void main(String[] args) {

        firstCycle();
        secondCycle();
    }

    public static void firstCycle() {
        System.out.println("============");
        System.out.println("Задание 1");
        System.out.println("Нечетные числа от 1 до 99");
        System.out.println("============");
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        System.out.println("============");
        System.out.println("************");
    }

    public static void secondCycle() {
        System.out.println("============");
        System.out.println("Задание 2");
        System.out.println("Программа, которая выводит числа от 1 до 100, которые делятся на 3, 5 и на то и другое");
        System.out.println("============");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Делится на 3 и на 5: " + i);
            } else if (i % 5 == 0) {
                System.out.println("Делится на 5: " + i);
            } else if (i % 3 == 0) {
                System.out.println("Делится на 3: " + i);
            }
        }
        System.out.println("============");
        System.out.println("************");

    }


}

