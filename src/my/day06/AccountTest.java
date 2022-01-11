package my.day06;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        //account.number = 1233;
        account.setNumber(1233);
        //account.owner = "홍길동";
        account.setOwner("홍길동");
        //account.balance = 5000;
        account.setBalance(10000);
        System.out.println(account.getBalance());

    }
}
