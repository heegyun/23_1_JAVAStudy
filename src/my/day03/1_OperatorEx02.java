package my.day03;

import java.util.Scanner;

public class OperatorEx02 {
    // 성별(남,여)을 입력받아 저장하는 변수 선언
    static String gender;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("성별 입력: ");
        gender = scanner.next();
        String res = (gender.equals("남"))?"당신은 남자입니다.":"당신은 여자입니다.";
        System.out.println(res);
    }

}
