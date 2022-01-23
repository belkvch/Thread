package ex11;

class User {
    synchronized void getUserInfo(Account account) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " вошел в метод User.getUserInfo()");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("User прерван");
        }
        System.out.println(name + " пытается вызвать метод Account.getAdditionalInfo()");
        account.getAdditionalInfo();
    }

    synchronized void getAdditionalInfo() {
        System.out.println("внутри User.getAdditionalInfo");
    }
}
