package my.day06;

public class HeroTest {
    public static void main(String[] args) {
        // 생성자 호출, 두 Hero 객체 생성
        Hero ironMan = new Hero("아이언맨",100, 200 );
        Hero hulk = new Hero("헐크",200,80);
        Hero batman = new Hero("배트맨");
        Hero superman = new Hero(200,250);

        System.out.println(ironMan.toStr());
        System.out.println(hulk.toStr());

        System.out.println(batman.toStr());
        System.out.println(superman.toStr());

        // 클래스 변수 사용: 클래스이름.클래스변수명
        System.out.println(Hero.count);
        // 클래스 메소드 사용: 클래스이름. 메소드명.
        System.out.println(Hero.GetCount());
    }
}
