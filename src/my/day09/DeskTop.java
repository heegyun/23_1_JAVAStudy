package my.day09;

public class DeskTop extends Computer{
    //오버라이딩..


    @Override
    public void display() {

        System.out.println("데스크 탑으로 디스플레이 합니다.");
    }

    @Override
    public void typing() {
        System.out.println("데스크 탑으로 타이핑 합니다.");
    }
}
