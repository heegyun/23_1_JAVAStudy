package my.day09;

public class CarTest {
    public static void main(String[] args) {

        Bus bus = new Bus();
        AICar aiCar = new AICar();

        bus.run();
        bus.stop();
        aiCar.run();
        aiCar.stop();

    }
}
