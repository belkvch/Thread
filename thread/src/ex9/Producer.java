package ex9;

public class Producer implements Runnable {
    Queue queue;

    Producer(Queue queue) {
        this.queue = queue;
        new Thread(this, "Поставщк").start();
    }

    public void run() {
        int i = 0;
        while (true) {
            queue.put(i++);
        }
    }
}
