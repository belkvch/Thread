package ex11;

public class Deadlock implements Runnable {

    Account account = new Account();
    User user = new User();

    Deadlock() {
        Thread.currentThread().setName("MainThread");
        Thread t = new Thread(this, "RacingThread");
        t.start();
        account.getSumm(user); //получить данные о сумме на счете
        System.out.println("Назад в главный поток");
    }

    public void run() {
        user.getUserInfo(account); // получить данные о пользователе по номеру счета
        System.out.println("Назад в другой поток");
    }

    public static void main(String args[]) {
        new Deadlock();
    }
}
