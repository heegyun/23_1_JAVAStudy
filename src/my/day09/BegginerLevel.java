package my.day09;

public class BegginerLevel extends  PlayerLevel {

    @Override
    void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    void jump() {
        System.out.println("초급자 레벨 점프");
    }

    @Override
    void turn() {
        System.out.println("초급자 레벨 턴");
    }

    @Override
    void showLevelMessage() {
        System.out.println("초급자 레벨 입니다.");
    }
}
