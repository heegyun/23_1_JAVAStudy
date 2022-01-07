package my.day04;

import java.util.Random;

public class MethodTest3 {
   // 매개변수는 없는 메소드
    // 1이상 6이하의 임의의 정수를 반환하는 메소드 정의하기
    static int rollDie(){
    //    double x = Math.random()*6; // 0.0 <=n <1.0
    //    int temp = (int)x;// 0이상 6 미만
        Random random = new Random();
        int x  = random.nextInt(6)+1;
        return x;
   }


    public static void main(String[] args) {
        int n = rollDie();// 메소드 호출부
        System.out.println("주사위의 눈: " + n);
    }


}
