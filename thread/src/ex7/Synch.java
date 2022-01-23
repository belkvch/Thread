package ex7;

public class Synch {
    public static void main(String args[]) {
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "Добро пожаловать", 3);
        try {
            ob1.thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Caller ob2 = new Caller(target, "в синхронизированный", 2);
        try {
            ob2.thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Caller ob3 = new Caller(target, "мир!", 1);
    }
}
