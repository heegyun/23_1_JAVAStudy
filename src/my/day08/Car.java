package my.day08;

public class Car {
    String name;

    public Car(){}
    // 매개변수 있는 생성자..(멤버변수 초기화).
    public Car(String name){
        this.name = name;
        System.out.println("부모클래스 생성자 입니다.");
    }

    public void move(){
        System.out.println("부모의 move()메소드입니다.");
    }
}
