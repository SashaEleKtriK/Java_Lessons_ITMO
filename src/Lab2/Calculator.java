package Lab2;

public class Calculator {
    public static String sum(long a, long b) {
        long res = a + b;
        return a + " + " + b + " = " + res;
    }

    public static String sum(int a, int b) {
        int res = a + b;
        return a + " + " + b + " = " + res;
    }

    public static String sum(double a, double b) {
        double res = a + b;
        return a + " + " + b + " = " + res;
    }

    public static String division(long a, long b) {
        double res = (double) a / b;
        return a + " / " + b + " = " + res;
    }

    public static String division(int a, int b) {
        double res = (double) a / b;
        return a + " / " + b + " = " + res;
    }

    public static String division(double a, double b) {
        double res = a / b;
        return a + " / " + b + " = " + res;
    }

    public static String multiplication(long a, long b) {
        long res = a * b;
        return a + " * " + b + " = " + res;
    }

    public static String multiplication(int a, int b) {
        int res = a * b;
        return a + " * " + b + " = " + res;
    }

    public static String multiplication(double a, double b) {
        double res = a * b;
        return a + " * " + b + " = " + res;
    }

    public static String difference(long a, long b) {
        long res = a - b;
        return a + " - " + b + " = " + res;
    }

    public static String difference(int a, int b) {
        int res = a - b;
        return a + " - " + b + " = " + res;
    }

    public static String difference(double a, double b) {
        double res = a - b;
        return a + " - " + b + " = " + res;
    }

}

