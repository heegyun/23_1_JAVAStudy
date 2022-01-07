package my.day03;

import java.util.Scanner;

public class OperatorEx01 {
    // 2개의 정수를 입력 받아서 둘 중 큰수를 판단하기.
    static int num1, num2;
    // 2개 정수 입력받아서 총점과 평균을 구해서 출력하기(산술연산자)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수1: ");
        num1 = scanner.nextInt();
        System.out.println("정수2: ");
        num2 = scanner.nextInt();
        //boolean res = ;
        //System.out.println("첫번째 정수1이 더 크다.");
        String res = (num1>num2)? "num1이 num2보다 크다" : "num1이 num2보다 작다";
        System.out.println(res);
    }

}
