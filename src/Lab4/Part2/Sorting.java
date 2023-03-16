package Lab4.Part2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        System.out.println("============");
        System.out.println("Задание 1");
        System.out.println("Напишите программу, которая проверяет отсортирован ли массив по возрастанию.");
        int[] ints1 = {1, 2, 3, 4, 88, 3, 77};
        ascChecking(ints1);
        int[] ints2 = {3, 2, 2};
        ascChecking(ints2);
        int[] ints3 = {3, 4, 5, 6, 88, 99, 100};
        ascChecking(ints3);
        int[] ints4 = {3};
        ascChecking(ints4);
        System.out.println("============");
        System.out.println("************");
        System.out.println("============");
        System.out.println("Задание 2");
        System.out.println("Напишите программу, которая считывает с клавиатуры длину массива, затем пользователь вводит числа и на новой строке выводится массив. ");
        arrayInsert();
        System.out.println("============");
        System.out.println("************");
        System.out.println("============");
        System.out.println("Задание 3");
        System.out.println("Напишите метод, который меняет местами первый и последний элемент массива.");
        swap(ints1);
        swap(ints2);
        swap(ints3);
        swap(ints4);
        System.out.println("============");
        System.out.println("************");
        System.out.println("============");
        System.out.println("Задание 4");
        System.out.println("Дан массив чисел. Найдите первое уникальное в этом массиве число.");
        firstUnique(ints1);
        firstUnique(ints2);
        firstUnique(ints3);
        int[] ints5 = {1, 2, 1, 3, 2, 3, 5, 6, 5, 7};
        firstUnique(ints5);
        int[] ints6 = {1, 1, 1, 2, 3, 2, 3};
        firstUnique(ints6);
        System.out.println("============");
        System.out.println("************");
        System.out.println("============");
        System.out.println("Задание 5");
        System.out.println("Заполните массив случайным числами и отсортируйте его. Используйте сортировку слиянием.");
        System.out.println(Arrays.toString(mergeSort(randomArray())));


    }

    public static void ascChecking(int[] ints) {
        System.out.println("============");
        System.out.println(Arrays.toString(ints));
        System.out.println("------------");
        for (int i = 0; i < ints.length; i++) {
            if ((i + 1) < (ints.length)) {
                if (ints[i] < ints[i + 1]) {
                    continue;
                } else {
                    System.out.println("Please, try again");
                    break;
                }

            } else {
                System.out.println("Ok");

            }

        }
    }

    public static void arrayInsert() {
        System.out.println("============");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array length:");
        int arrLength = scanner.nextInt();
        int[] ints = new int[arrLength];
        System.out.println("Numbers of array:");
        for (int i = 0; i < arrLength; i++) {
            ints[i] = scanner.nextInt();
        }
        System.out.println("Result: " + Arrays.toString(ints));
    }

    public static int[] swap(int[] ints) {
        System.out.println("============");
        System.out.println(Arrays.toString(ints));
        System.out.println("------------");
        int a = ints[0];
        int b = ints[ints.length - 1];
        ints[0] = b;
        ints[ints.length - 1] = a;
        System.out.println(Arrays.toString(ints));
        return ints;
    }

    public static String firstUnique(int[] ints) {
        System.out.println("============");
        System.out.println(Arrays.toString(ints));
        System.out.println("------------");
        String result = "None Unique";
        for (int i = 0; i < ints.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < ints.length; j++) {
                if (ints[i] == ints[j] && i != j) {
                    isUnique = false;
                    break;
                }

            }
            if (isUnique) {
                result = Integer.toString(ints[i]);
                break;
            }

        }
        System.out.println(result);
        return result;
    }

    public static int[] randomArray() {
        Random random = new Random();
        int[] ints = new int[10];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(222);
        }
        System.out.println(Arrays.toString(ints));
        return ints;
    }

    public static int[] mergeSort(int[] ints) {
        if (ints.length < 2) {
            return ints;
        }
        int mid = ints.length / 2;
        int[] left = new int[mid];
        int[] right;
        if (ints.length % 2 == 0) {
            right = new int[mid];
        } else {
            right = new int[mid + 1];
        }
        for (int i = 0; i < left.length; i++) {
            left[i] = ints[i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = ints[mid + i];
        }
        left = mergeSort(left);
        right = mergeSort(right);
        return mergeParts(left, right);
    }

    private static int[] mergeParts(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int leftPointer = 0;
        int rightPointer = 0;
        int resultPointer = 0;

        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer < left.length && rightPointer < right.length) {
                if (left[leftPointer] < right[rightPointer]) {
                    result[resultPointer++] = left[leftPointer++];
                } else {
                    result[resultPointer++] = right[rightPointer++];
                }

            } else if (leftPointer < left.length) {
                result[resultPointer++] = left[leftPointer++];

            } else if (rightPointer < right.length) {
                result[resultPointer++] = right[rightPointer++];

            }
        }
        return result;
    }

}
