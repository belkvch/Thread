package ex11;

public class Account {
    synchronized void getSumm(User user) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " вошел в метод Account.getSumm()");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Account прерван");
        }
        System.out.println(name + " пытается вызвать метод User.getAdditionalInfo()");
        user.getAdditionalInfo();
    }

    synchronized void getAdditionalInfo() {
        System.out.println("внутри Account.getAdditionalInfo()");
    }
}
