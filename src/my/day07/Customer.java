package my.day07;

public class Customer {
    // 고객 아이디.
    protected int customerID;
    // 고객 이름.
    protected String customerName;
    // 고객 등급
    protected String customerGrade;
    // 보너스 포인트
    int bonusPoint;
    // 적립 비율
    double bonusRatio;

    public void setCustomerGrade(String customerGrade){
        this.customerGrade = customerGrade;
    }

    public String getCustomerGrade(){
        return  customerGrade;
    }

    public  void setCustomerID(int id){
        customerID  = id;
    }
    public  void setCustomerName(String name){
        customerName = name;
    }


    public Customer(){

    }

    // 인자 생성자..
    public Customer(int id,String name){
        customerID = id;
        customerName = name;
        customerGrade = "SILVER";
        bonusRatio = 0.01;
        System.out.println("부모생성자 입니다.");
    }


    public int calcPrice(int price){ // 보너스 포인트 계산
        bonusPoint += price*bonusRatio;
        return bonusPoint;
    }
    public String getCustomerInfo(){
        return customerName + "님의 등급은" + customerGrade +"이며, 보너스 포인트는" + bonusPoint+"입니다.";

    }



}
