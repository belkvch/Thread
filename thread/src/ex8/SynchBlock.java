package ex8;

public class SynchBlock {
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "Добро пожаловать", 3);
        Caller ob2 = new Caller(target, "в синхронизированный", 2);
        Caller ob3 = new Caller(target, "мир!", 1);

        try {
            ob1.thread.join();
            ob2.thread.join();
            ob3.thread.join();
        } catch (InterruptedException е) {
            System.out.println("Пpepвaнo");
        }
    }
}
