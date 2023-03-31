package Concurrency.Task1and2;

import java.util.ArrayList;
import java.util.List;

public class MyThread extends Thread {
    public void run() {
        System.out.println(getCurrentThreadInfo(this));
        for (int i = 0; i <= 100; i++) {
            System.out.println(getCurrentThreadInfo(this) + i);
        }
    }

    public static String getCurrentThreadInfo(Thread thread) {
        String str = thread.getName() + " " + thread.getState() + " ";
        return str;
    }

    public static List<MyThread> generateThreads(int threadsCount) {
        List<MyThread> allThreads = new ArrayList<>();
        for (int i = 0; i < threadsCount; i++) {
            MyThread myThread = new MyThread();
            allThreads.add(myThread);
            myThread.start();
        }
        return allThreads;
    }

    public MyThread() {
        System.out.println(getCurrentThreadInfo(this));
    }

}
