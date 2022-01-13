package my.day08;

public class OverridingTest {
    public static void main(String[] args) {
        Archer a = new Archer();
        Archer ma = new MasterArcher();//업 캐스팅
        a.shoot();// 부모 shoot
        ma.shoot(); // 자식 shoot
    }
}
