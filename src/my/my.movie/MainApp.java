package moviereservation;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("프로그램을 시작합니다!"); // 프로그램 실행 문구
        Menu menu = MainMenu.getInstance();
        if(menu !=null){
            menu.print();
            menu.next();
        }
        System.out.println("프로그램이 종료됩니다."); // 프로그램 종료 문구
    }
}

interface Menu{
    void print();

    Menu next();
}