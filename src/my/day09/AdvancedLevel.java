package my.day09;

public class AdvancedLevel extends  PlayerLevel{
    @Override
    void run() {
        System.out.println("빠르게 달린다.");
    }

    @Override
    void jump() {
        System.out.println("점프 할수 있습니다");
    }

    @Override
    void turn() {

    }

    @Override
    void showLevelMessage() {
        System.out.println("중급자 레벨입니다.");
    }
}
