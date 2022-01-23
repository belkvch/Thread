package ex3;

class NewТhread extends Thread {
    NewТhread() {
        super("Демонстрационный поток");
        System.out.println("Дoчepний поток:" + this);
        start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Дoчepний поток:" + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException е) {
            System.out.println("Дoчepний поток прерван.");
        }
        System.out.println("Дoчepний поток завершен.");
    }
}
