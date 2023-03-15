package Lab4.Part1;

import java.util.Arrays;

public class ArrayChecking {
    public static void main(String[] args) {
        exercise5Test();
        exercise6Test();
    }

    public static void exercise5Test() {
        System.out.println("============");
        System.out.println("Задание 5");
        System.out.println("Появляется ли число 3 как первый или последний элемент массива целых чисел.");
        System.out.println("============");
        int[] ints1 = {1, 2, 3, 4, 88, 3, 77};
        firstArray(ints1);
        int[] ints2 = {3, 2, 2};
        firstArray(ints2);
        int[] ints3 = {3};
        firstArray(ints3);
        System.out.println("============");
        System.out.println("************");
    }

    public static void exercise6Test() {
        System.out.println("============");
        System.out.println("Задание 6");
        System.out.println("Проверить, что массив содержит число 1 или 3. ");
        System.out.println("============");
        int[] ints1 = {1, 2, 3, 4, 88, 3, 77};
        secondArray(ints1);
        int[] ints2 = {3, 2, 2};
        secondArray(ints2);
        int[] ints3 = {4, 67, 87};
        secondArray(ints3);
        System.out.println("============");
        System.out.println("************");
    }

    public static void firstArray(int[] ints) {

        System.out.println(Arrays.toString(ints));
        boolean isThree = false;
        if (ints.length >= 2) {
            if (ints[0] == 3 || ints[ints.length - 1] == 3) {
                isThree = true;
            }
            System.out.println(isThree);
        } else {
            System.out.println("Длина массива должна быть больше или равна двум.");
        }
    }

    public static void secondArray(int[] ints) {
        System.out.println(Arrays.toString(ints));
        boolean isTrue = false;
        for (int i : ints
        ) {
            if (i == 1 || i == 3) {
                isTrue = true;
                break;
            }
        }
        System.out.println(isTrue);
    }
}

