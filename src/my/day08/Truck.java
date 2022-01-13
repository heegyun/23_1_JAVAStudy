package my.day08;

public class Truck extends Car {

    int payload; // 최대 적재량

    public Truck(String n, int payload){
        super(n); // 부모의 클래스의 생성자 호출
        this.payload = payload;
    }

    @Override
    public void move() {
        System.out.println("자식 클래스의 move()메소드입니다.");
    }

    public void load(){
        System.out.println(payload + "운반하다.");
    }
}
