package Concurrency.Task4;

public class Message {
    private String msg;
    private MyName currentName;

    public Message() {
    }

    public synchronized void print(MyName name, String msg) {

        this.msg = msg;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        while (name.equals(currentName)) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        notify();
        currentName = name;
        System.out.println(msg);


    }
}
