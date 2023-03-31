package Concurrency.Task3;

import java.util.ArrayList;
import java.util.List;

public class CountThread extends Thread {
    private Counter counter;
    public Integer count = 0;


    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {
            counter.increment();
            //System.out.println(counter.getCount() + this.getName());
        }

    }


    public static List<CountThread> generateThreats(Counter counter) {
        List<CountThread> allThreads = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            CountThread ct = new CountThread(counter);
            ct.start();
            allThreads.add(ct);
        }

        return allThreads;
    }

    public CountThread(Counter counter) {
        this.counter = counter;
    }
}
