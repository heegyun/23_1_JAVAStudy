package my.day03;

import java.io.IOException;

/*
    if~else if ~else문을 사용하여 "숫자", "알파벳", "기타문자"를 출력하는 코드 작성하기
 */
public class IfTest2 {
    public static void main(String[] args) {
        System.out.println("0~9 또는 알파벳, 그외 문자를 입력하세요~");
        // Scanner scanner = new Scanner(System.in);
        // String n = scanner.next();
        try {
            char n = (char) System.in.read();

            if ((n >= '0') && (n<='9')) {// 0~9사이의 문자인지 판단 하는 조건식
                System.out.println("숫자");

            } else if ((n>='A') && (n<='Z') ||(n>='a') && (n<='z') ) { // "A"~"Z" 또는 "a"~"z" 사이의 문자열인지 판단하는 조건식
                System.out.println("알파벳");

            } else {
                System.out.println("그외 문자");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}