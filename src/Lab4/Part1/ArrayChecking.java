package Lab4.Part1;

import java.util.Arrays;

public class ArrayChecking {
    public static void main(String[] args) {
        int[] ints1 = {1, 2, 3, 4, 88, 3, 77};
        int[] ints2 = {3, 2, 2};
        int[] ints3 = {3};
        exercise5Test(ints1, ints2, ints3);
        exercise6Test(ints1, ints2, ints3);
    }

    public static void exercise5Test(int[] ints1, int[] ints2, int[] ints3) {
        System.out.println("============");
        System.out.println("Задание 5");
        System.out.println("Появляется ли число 3 как первый или последний элемент массива целых чисел.");
        System.out.println("============");
        firstArray(ints1);
        firstArray(ints2);
        firstArray(ints3);
        System.out.println("============");
        System.out.println("************");
    }

    public static void exercise6Test(int[] ints1, int[] ints2, int[] ints3) {
        System.out.println("============");
        System.out.println("Задание 6");
        System.out.println("Проверить, что массив содержит число 1 или 3. ");
        System.out.println("============");
        secondArray(ints1);
        secondArray(ints2);
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

