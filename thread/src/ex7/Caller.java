package ex7;

public class Caller implements Runnable {
    String msg;
    Callme target;
    Thread thread;
    int priority;

    public Caller(Callme target, String msg, int priority) {
        this.target = target;
        this.msg = msg;
        thread = new Thread(this);
        this.priority = priority;
        thread.start();
    }

    public void run() {
        thread.setPriority(priority);
        target.call(msg);
    }
}
