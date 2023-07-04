package my.day04;

import java.util.Random;
import java.util.Scanner;

/*
    1. 가위 2. 바위 3. 보  0. 종료
 */
public class Game {

    // 클래스 메소드 정의
    static void showMenu(){
        System.out.println("-----Game Menu------");
        System.out.println("1. 가위 2. 바위 3. 보  0. 종료");
        System.out.println("=============================");
        System.out.println("입력하세요>>>");
    }

    public static void main(String[] args) {

        while (true) {
            // 클래스 메소드 호출
            showMenu();
            ///////////////////
            Scanner scanner = new Scanner(System.in);
            int no = scanner.nextInt(); // user
            Random random = new Random();// 난수 생성 클래스 (0.0<= m <1.0)
            int com = random.nextInt(3) + 1;//  123
            if(no == 0) break;
            System.out.println("유저측: " + no);
            System.out.println("컴퓨터측: " + com);
            //1. 비길 경우 : no == com
            //2. 유저가 이길 경우
            //3. 이외는 유저가 패

            if (no == 0) System.exit(0); // 프로그램 정상 종료
            if (no == com) {
                System.out.println("비겼군요~~~");
            } else if ((no == 1) && (com == 3) ||
                    (no == 2) && (com == 1) ||
                    (no == 3) && (com == 2)) { // 유저가 이길경우...
                System.out.println("유저 승!!!");
            } else {
                System.out.println("유저 패!!!");
            }
        }

    }

}
