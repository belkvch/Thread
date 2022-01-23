package ex4;

class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread("First");
        new NewThread("Second");
        new NewThread("Third");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Глaвный поток прерван");
        }
        System.out.println("Глaвный поток завершен.");
    }
}
