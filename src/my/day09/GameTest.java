package my.day09;

public class GameTest {
    public static void main(String[] args) {

        BegginerLevel begginerLevel = new BegginerLevel();
        AdvancedLevel advancedLevel = new AdvancedLevel();
        SuperLevel superLevel = new SuperLevel();

        begginerLevel.go(1);
        begginerLevel.showLevelMessage();

        advancedLevel.go(2);
        advancedLevel.showLevelMessage();

        superLevel.go(3);
        superLevel.showLevelMessage();

    }
}
