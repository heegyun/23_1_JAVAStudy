package my.day04;

public class MethodTest {

    public static void main(String[] args) {
        int n=4;
        int s = square(4);// 메소드 호출부
        System.out.println("한변의 길이가 " + n +"인 정사각형의 넓이: " + s );
    }

    // 정사각형 넓이 구하는 메소드 정의하시오.
    static int square(int length){ // 메소드 정의부
        return length * length;
    }
}
