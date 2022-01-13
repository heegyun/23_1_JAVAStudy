package my.day09;



public class Bus extends Car{
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }

    @Override
    public void stop() {
        System.out.println("버스가 정지합니다.");
    }
}
