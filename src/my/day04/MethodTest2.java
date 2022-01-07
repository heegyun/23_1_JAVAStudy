package my.day04;

public class MethodTest2 {
    final static double PI = 3.141592; // 상수변수
    public static void main(String[] args) {
        double r=7;
        double h = 5;
        double v = volume(7,5);// 메소드 호출부
        System.out.println("반지름의 길이가 " + r + "높이가 " + h + "인 원기둥의 부피: " + v);
    }

    // 반지름의 길이가 r , 높이가 h인 원기둥의 부피를 구하는메소드 정의 하시오.
    static double volume(double r, double h){ // 메소드 정의부
        return PI * r*r*h;
    }
}
