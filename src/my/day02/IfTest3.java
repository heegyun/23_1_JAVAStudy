package my.day03;

import java.util.Scanner;

/*
   놀이공원 입장료 계산하기.
    8살 미만은 1000원, (초등학생) 14살 미만은 2000원, (중고등학생) 20살 미만은 2500원,그 이상 3000원
   age변수, charge변수
*/
public class IfTest3 {
    public static void main(String[] args) {
        System.out.println("나이를 입력하세요 ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        int charge = 0;

        if (age < 8) {
            charge = 1000;
            System.out.println("취학전 아동입니다.");
        } else if (age < 14 ) {
            charge = 2000;
            System.out.println("초등학생입니다.");
        } else if(age < 20) {
            charge = 2500;
            System.out.println("중고등학생입니다.");
            }
        else{
            charge = 3000;
            System.out.println("일반인입니다.");
        }
        System.out.println("입장료는 " + charge +"입니다.");
    }
}