package Concurrency.Task4;

public class MyName extends Thread {
    private Message msg;

    @Override
    public void run() {
        while (true) {
            msg.print(this, Thread.currentThread().getName());

        }
    }

    public MyName(Message msg) {
        this.msg = msg;
    }
}
