package my.day02;

import java.util.Scanner;

public class ScannerTest {
    // 클래스 변수1
    static String name;
    // 클래스변수2
    static String hakbun;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력하세요>> ");
        name = scanner.next();
        System.out.println("학번을 입력하세요>> ");
        hakbun = scanner.next();
        System.out.println("이름:" + name);
        System.out.println("학번:" + hakbun);
    }
}
