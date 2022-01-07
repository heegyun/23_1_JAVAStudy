package my.day05;

import java.util.Scanner;

/*
 구직 등록 프로그램...
 */
public class JobApp {

    public void showMenu(){
        System.out.println("******JOB v1.0******");
        System.out.println("** 1. 구직등록 **");
        System.out.println("** 2. 구인등록 **");
        System.out.println("** 3. 구직자 정보 출력 **");
        System.out.println("** 4. 구인회사 정보 출력 **");
        System.out.println("** 5. 종료 **");
        System.out.println("************************");
        System.out.println("* 메뉴 번호를 입력하세요 >> ");
        System.out.println("**************************");
    }
    public static void inputPerson(){
        //이름, 나이, 성별, 전화번호를 입력받아 Person 객체에 저장....
        Scanner scanner = new Scanner(System.in);
        System.out.println("-- 구직 등록 start---");
        System.out.println("이름 입력 =>");
        String nm = scanner.next();
        System.out.println("나이 입력 =>");
        int age = scanner.nextInt();
        System.out.println("--성별 메뉴--");
        System.out.println("1.남자  2.여자");
        System.out.println("--------------");
        System.out.println("성별 메뉴번호 입력 =>");
        int s = scanner.nextInt();
        char gen = 'N' ;
        if(s == 1) {
            gen = 'M';

        }else if(s == 2){
            gen = 'F';
        }

        System.out.println("전화번호 입력=>");
        String tel = scanner.next();

        //사람 객체 생성
        Person person1 = new Person(nm,age,gen,tel);
        String info = person1.showProfile();
        System.out.println(info);

    }

    public static void main(String[] args) {
        JobApp jobApp = new JobApp();

        while(true) {
            jobApp.showMenu();
            Scanner scanner = new Scanner(System.in);
            int menuNo = scanner.nextInt();
            if (menuNo == 5) {
                System.exit(0); //프로그램 정상종료
            } else if (menuNo == 1) { // 1. 구직등록 (직장을 구하는 사람의 인적정보를 입력 받는다.)
                JobApp.inputPerson(); // 인적 정보를 입력받는 모듈
            }

        }


    }
}
