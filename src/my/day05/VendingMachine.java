package day05;

public class VendingMachine {

    int inputedMoney = 0; // 투입금액

    // 음료수 목록
    // 음료수 정보 - 0 : 콜라, 1 : 사이다, 2 : 커피
    String b0 = "콜라";
    String b1 = "사이다";
    String b2 = "커피";

    int p0 = 1000;
    int p1 = 1200;
    int p2 = 800;

    // 금액 투입 기능
    void setInputedMoney(int money) {
        inputedMoney = inputedMoney + money;
        System.out.println("현재 투입된 금액은 " + inputedMoney + "입니다.");
    }

    // 뽑기 가능한 음료 출력
    void printAllBeverages() {

        System.out.println("0. " + b0 + " : " + p0);
        System.out.println("1. " + b1 + " : " + p1);
        System.out.println("2. " + b2 + " : " + p2);
    }

    // 사용자가 선택한 음료 제공
    String getBeverage(int bno) {

        String target = null;
        int targetPrice = 0;

        if(bno == 0) {
            target = b0;
            targetPrice = p0;
        } else if(bno == 1) {
            target = b1;
            targetPrice = p1;
        } else {
            target = b2;
            targetPrice = p2;
        }

        if(inputedMoney >= targetPrice) {
            inputedMoney = inputedMoney - targetPrice;
            System.out.println(target + "을 뽑으셨습니다.");
            System.out.println("잔액은 " + inputedMoney + "입니다.");
            return target;
        } else {
            System.out.println("잔액이 부족합니다.");
            return null; // null -> 데이터 없음.
        }

    }

}
