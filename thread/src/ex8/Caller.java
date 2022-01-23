package ex8;

public class Caller implements Runnable {
    String msg;
    Callme target;
    Thread thread;
    int priority;

    public Caller(Callme target, String msg, int priority) {
        this.target = target;
        this.msg = msg;
        thread = new Thread(this);
        thread.setPriority(priority);
        thread.start();
    }

    public void run() {
        synchronized (target) {//синхронизированный блок
            target.call(msg);
        }
    }
}