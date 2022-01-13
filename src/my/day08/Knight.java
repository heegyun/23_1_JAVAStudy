package my.day08;

public class Knight extends Novice {
    int stamina;//기력

    public void slash(){// 베기
        System.out.printf("%s(HP: %d, STAMINA: %d)의 슬래쉬!!\n",name, hp, stamina);
    }
}
