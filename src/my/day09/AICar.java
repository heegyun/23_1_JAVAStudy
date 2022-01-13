package my.day09;


public class AICar extends Car{

    @Override
    public void run() {
        System.out.println("AICar가 달립니다.");

    }

    @Override
    public void stop() {
        System.out.println("AICar가 멈춥니다.");
    }
}
