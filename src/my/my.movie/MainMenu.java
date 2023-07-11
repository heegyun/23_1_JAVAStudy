package moviereservation;

import java.io.IOException;
import java.util.ArrayList;

class MainMenu extends AbstractMenu {
    private static final MainMenu instance = new MainMenu(null);
    private static final String MAIN_MENU_TEXT = // 기본 문구
            "1: 영화 예매하기\n" +
                    "2: 예매 확인하기\n" +
                    "3: 예매 취소하기\n" +
                    "4: 관리자 메뉴로 이동\n" +
                    "q: 종료\n\n" +
                    "메뉴를 선택하세요: ";

    private MainMenu(Menu prevMenu) {
        super(MAIN_MENU_TEXT, prevMenu); // 부모 생성자 호출
    }

    public static MainMenu getInstance() {
        return instance; // 메뉴 객체 반환
    }

    public Menu next() {
        switch (scanner.nextLine()) {
            case "1":
                reserve(); // 영화 예매를 진행
                return this; // 메인 메뉴 객체 반환(다시 메인 메뉴가 나옴)
            case "2":
                checkReservation(); // 예매 확인
                return this; // 메인 메뉴 객체 반환(다시 메인 메뉴가 나옴)
            case "3":
                cancelReservation(); // 예매 취소
                return this; // 메인 메뉴 객체 반환(다시 메인 메뉴가 나옴)
            case "4":
                if (!checkAdminPassword()) { // 관리자 비밀번호 확인
                    System.out.println(">> 비밀번호가 틀렸습니다.");
                    return this; // 실패한 경우 메인 메뉴 객체 반환
                }
                AdminMenu adminMenu = AdminMenu.getInstance();
                adminMenu.setPrevMenu(this); // 메인 메뉴를 이전 메뉴로 등록
                return adminMenu;
            case "q": return prevMenu; // q 입력 시, prevMenu를 반환
            default: return this; // 그 외 입력은 메인 메뉴(this)로 돌아감
        }
    }
