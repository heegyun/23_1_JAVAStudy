package day03;

public class WhileTest2 {
    public static void main(String[] args) {
       // 1부터 3까지의 정수와 "END"를 출력하는 코드

        int n = 1;
        System.out.println(n);
        n = n +1;
        System.out.println(n);
        n = n +1;
        System.out.println(n);
        n = n +1;
        System.out.println("END");

        // 이를 while문으로 개선하면?

        while(n < 4){
            System.out.println(n);
            n++;
        }
        System.out.println("END");
    }
}

