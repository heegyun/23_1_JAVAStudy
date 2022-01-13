package my.day08;

public class Wizard extends Novice{  // 자식 클래스
    int mp;

    public void fireball(){
        System.out.printf("%s(HP: %d, MP: %d)의 파이버볼~~@\n",name, hp, mp);
    }
}
