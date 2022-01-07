package my.day05;

public class AniamlManager { // 완성 프로그램..(동물관리 프로그램)
    public static void main(String[] args) {
        // 고양이 객체 생성...
        // 참조형 변수사용
        // 클래스 명 참조변수명 = new 클래스명();//생성자...
        Cat cat = new Cat();// 객체생성
        cat.name = "야옹이";
        cat.breeds = "페르시안";
        cat.weight = 5.2;

        cat.meow();
        cat.claw();

        // 강아지 객체 생성...

    }
}
