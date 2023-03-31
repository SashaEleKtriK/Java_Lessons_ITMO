package Concurrency;

import Concurrency.Task1and2.MyThread;
import Concurrency.Task3.CountThread;
import Concurrency.Task3.Counter;
import Concurrency.Task4.Message;
import Concurrency.Task4.MyName;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void previousTaskThreadsIsDead(List<Thread> task) throws InterruptedException {
        for (Thread t : task) {
            t.join();
        }
    }

    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Задание 1 и 2");
        List<Thread> task1 = new ArrayList<>(MyThread.generateThreads(10));
        try {
            previousTaskThreadsIsDead(task1);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(" ");
        System.out.println("Задание 3");
        Counter counter = new Counter();
        List<Thread> task2 = new ArrayList<>(CountThread.generateThreats(counter));
        try {
            previousTaskThreadsIsDead(task2);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(counter.getCount());
        System.out.println(" ");
        System.out.println("Задание 4");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите что угодно, чтобы начать");
        scanner.nextByte();
        Message msg = new Message();
        MyName myName = new MyName(msg);
        myName.start();
        MyName myName1 = new MyName(msg);
        myName1.start();
    }

}
