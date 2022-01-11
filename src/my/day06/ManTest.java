package my.day06;

public class ManTest {

    public static void main(String[] args) {

        Man james1 = new Man(40,"제임스", true, 3);

        // 객체(Man) 배열
        Man [] mans = new Man[2];
        mans[0] = james1;
        mans[1] = new Man(30,"홍길동", false, 0);
        for(int i =0 ; i <mans.length;i++){
            mans[i].showInfo();
        }

    }
}
