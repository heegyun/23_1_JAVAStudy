package my.day06;
public class Hero {
    // 멤버 변수(인스턴스 변수)
    String name; // 이름
    int power; // 힘
    int speed; // 속도
    // 클래스 변수(static 변수)
    static int count = 0;
    // 기본 생성자..(메소드 오버로딩(중복정의)
    //  단, 이름만 같고, 매개변수의 갯수 , 타입은 달라야 한다.)
    public  Hero(){
    }
    // 인자 생성자 정의(멤버 변수 초기화)
    public Hero(String n, int p, int s) {
        count++;
        name = n;
        power = p;
        speed = s;
    }
    //  생성자 오버로딩
    public Hero(String n){
        name  = n;
    }
    public Hero(int p, int s){
        power = p;
        speed = s;
    }
    // 객체 정보를 문자열로 반환
    String toStr() {
        return String.format("Hero{name: %s, power: %d, speed: %d}", name,
                power, speed);
    }
    // 클래스 메소드
    static int GetCount(){
        return count;
    }

}
