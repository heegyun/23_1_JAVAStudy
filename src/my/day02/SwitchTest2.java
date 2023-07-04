package my.day03;

import java.util.Scanner;

/*
 5층 건물이 있습니다. 1층 약국, 2층 정형외과, 3층 피부과,4층 치과, 5층 헬스클럽입니다.
 층을 입력 받아 해당 층이 어떤 곳인지를 알려주는 코드를 작성하세요.
 */
public class SwitchTest2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("층을 입력하세요: ");
        int num = scanner.nextInt();

        switch (num){
            case 1:
                System.out.println("약국 입니다.");
                break;
            case 2:
                System.out.println("정형외과 입니다.");
                break;
            case 3:
                System.out.println("피부과 입니다");
                break;
            case 4:
                System.out.println("치과 입니다.");
            case 5:
                System.out.println("헬습 클럽 입니다.");
                break;
        }
    }
}
