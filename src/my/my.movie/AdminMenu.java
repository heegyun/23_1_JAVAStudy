public class AdminMenu extends AbstractMenu {
    private static final AdminMenu instance = new AdminMenu(null);
    private static final String ADMIN_MENU_TEXT = // 기본 문구
            "1: 영화 등록하기\n" +
                    "2: 영화 목록 보기\n" +
                    "3: 영화 삭제하기\n" +
                    "b: 메인 메뉴로 이동\n\n" +
                    "메뉴를 선택하세요: ";

    private AdminMenu(Menu prevMenu) {
        super(ADMIN_MENU_TEXT, prevMenu); // 부모 생성자 호출
    }

    public static AdminMenu getInstance() {
        return instance; // 메뉴 객체를 반환
    }

    public Menu next() {
        switch (scanner.nextLine()) {
            case "1":
                createMovie(); // 영화 등록 진행
                return this; // 관리자 메뉴 객체 반환
            case "2": // 2번 메뉴 선택 시
                printAllMovies(); // 영화 목록 출력
                return this; // 관리자 메뉴 객체 반환
            case "3":
                deleteMovie(); // 영화 삭제 진행
                return this; // 관리자 메뉴 객체 반환(다시 관리자 메뉴가 나옴
            case "b": return prevMenu;
            default: return this;
        }
    }

   
