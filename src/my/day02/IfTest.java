package my.day03;

import java.util.Scanner;

// 문제1: if~else 문을 사용하여 짝수, 홀수를 판단하는 코드 작성하기
public class IfTest {
    public static void main(String[] args) {
        int num1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 입력>>");
        num1 = scanner.nextInt();
        if((num1%2) != 0){ //참
            System.out.println(num1 + "은 홀수");
        }else{
            System.out.println(num1 + "은 짝수");
        }
    }
}
