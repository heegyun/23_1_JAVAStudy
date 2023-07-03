import java.io.IOException;
import java.util.Scanner;

//문제 1]국어, 영어 수학 점수를 받아서 테이블 형태로 콘솔에 출력하자.
		/*
			-------------------------------
			국어   영어   수학
			-----------------------------
			90	88      77
			------------------------------
			평균점수:

문제 2] 평균 점수에 따른 학점을 구해 출력해보자.
			 100 ~ 90: A
			 89 ~ 80: B
             79~  70: C
			 69~  60: D
			 59이하: F  */

public class IfTest4 {

    public static void main(String[] args)  {
        System.out.println("국어 점수를 입력하세요.=>");
        Scanner sc = new Scanner(System.in);
        int kor = sc.nextInt();
        System.out.println("영어 점수=>");
        int eng = sc.nextInt();
        System.out.println("수학 점수=>");
        int math = sc.nextInt();
        int total = kor + eng + math;
        double avg = total / 3.0;

        System.out.println("------------------------");
        System.out.println("국어\t영어\t수학");
        System.out.println("------------------------");
        System.out.println(kor + "\t" + eng + "\t" + math);
        System.out.println("------------------------");
        System.out.println("총점: " + total);
        System.out.println("평균: " + avg);
        System.out.println("------------------------");

        String hakjum="A";
        if((avg<=100)&&(avg >=90))
            hakjum="A";
        else if((avg<90)&&(avg>=80))
            hakjum="B";
        else if((avg<80)&&(avg>=70))
            hakjum="C";
        else if((avg<70)&&(avg>=60))
            hakjum="D";
        else
            hakjum="F";
        System.out.println("학점: "+hakjum);
        System.out.println("The End~");
    }


}