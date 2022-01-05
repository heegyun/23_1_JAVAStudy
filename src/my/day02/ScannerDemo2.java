package my.day02;

import java.util.Scanner;

public class ScannerDemo2 {
    // 1. 클레스 변수 선언
    // 2개의 정수를 입력 받아서 저장할 정수타입의 변수  num1, num2 선언
    // 2개의 정수의 합을 저장할 클래스 변수 sum 선언
    static int num1;
    static int num2;
    static int sum;
    static String name;

    // 2. 기본 생성자
    public ScannerDemo2(){}

    // 3. 멤버 메소드(매개변수는 2개 있고, 반환타입은 있는 메소드 add() 정의
    static int add(int num1, int num2){
        return sum = num1 + num2;
    }
    // 4. 멤버 메소드(2개의 실수를 전달 받고, 반환타입은 없는 메소드 mul() 정의


    public static void main(String[] args) {
        // 입력 받아오는 클래스 생성
            Scanner scanner = new Scanner(System.in);
            System.out.println("첫번째 정수입력: ");
            num1 = scanner.nextInt();
            System.out.println("두번째 정수입력: ");
            num2 = scanner.nextInt();

            System.out.println("두 정수의 합: "+ScannerDemo2.add(num1, num2));
        System.out.println("이름을 입력하세요>>>");
        name = scanner.next();
        System.out.println("당신의 이름은>> " + name);
    }
}
