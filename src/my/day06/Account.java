package my.day06;

public class Account {//계좌
    // 멤버 변수
   private int number;
   private String owner;
   private String password;
   private int balance; //잔액

    // getter메소드, setter메소드
    public void setNumber(int number){
        this.number = number;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public  void setBalance(int balance){
        this.balance = balance;
    }

    public int getNumber(){
        return number;
    }
    public String getOwner(){
        return owner;
    }
    public String getPassword(){
        return password;

    }

   // 잔액 출력 메소드
    public int getBalance(){
        return balance;
    }


}
