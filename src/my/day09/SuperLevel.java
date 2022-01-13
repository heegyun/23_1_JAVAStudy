package my.day09;

public class SuperLevel extends  PlayerLevel{
    @Override
    void run() {
        System.out.println("엄청빠르게 달립니다.");
    }

    @Override
    void jump() {
        System.out.println(" 점프합니다.");
    }

    @Override
    void turn() {
        System.out.println("턴할 수 있습니다.");
    }

    @Override
    void showLevelMessage() {
        System.out.println("고급자 레벨 입니다.");
    }
}
