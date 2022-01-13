package my.day08;

public class Novice { // 초심자
    String name;
    int hp;
    int speed;

    public void punch(){
        System.out.printf("%s(HP: %d)의 펀치!\n",name, hp );
    }

    public void move(){
        System.out.printf("%d 만큼 이동합니다.\n", speed);
    }
}
