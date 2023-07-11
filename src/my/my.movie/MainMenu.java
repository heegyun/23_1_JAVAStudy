package moviereservation;

import java.io.IOException;
import java.util.ArrayList;

public class MainMenu extends AbstractMenu {
    private static final MainMenu instance = new MainMenu(null);
    private static final String MAIN_MENU_TEXT = // 기본 문구
            "1: 영화 예매하기\n" +
                    "2: 예매 확인하기\n" +
                    "3: 예매 취소하기\n" +
                    "4: 관리자 메뉴로 이동\n" +
                    "q: 종료\n\n" +
                    "메뉴를 선택하세요: ";

    private MainMenu(Menu prevMenu) {
        super(MAIN_MENU_TEXT, prevMenu);
    }

    public static MainMenu getInstance() {
        return instance; // 메뉴 객체 반환
    }


    private void checkReservation() {
        System.out.print("발급번호를 입력하세요: ");

    }

    private void cancelReservation() {
        System.out.print("발급번호를 입력하세요: ");
        try {

        } catch (Exception e) {
            System.out.println(">> 파일 입출력에 문제가 생겼습니다.");
        }
    }

    private void reserve() {
        try {

        } catch (Exception e) {
            System.out.println(">> 파일 입출력에 문제가 생겼습니다..");
        }
    }


    @Override
    public Menu next() { // 사용자 입력을  행 단위로 가져옴
        switch (scanner.nextLine()) {
            // 관리자 비밀번호 확인 코드를 추가하기
            // 만약 일치하면 메인 메뉴를 이전 메뉴로 등록 하고,
            // 관리자 메뉴 객체를 반환
            // 그렇지 않으면, >>비밀번호가 틀렸습니다. 메세지 출력 후, 메인메뉴(자기자신) 반환

            case "q":
                return prevMenu; //q입력시 메인 메뉴(this)로 돌아감
            default:
                return this; // 그 외 입력은 메인 메뉴(this)로 돌아감
        }

    }

    private boolean checkAdminPassword() {
        System.out.print("관리자 비밀번호를 입력하세요: ");
        return "admin1234".equals(scanner.nextLine());
    }
}