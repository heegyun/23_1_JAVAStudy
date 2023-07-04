package day03;

public class ForTest1 {
    public static void main(String[] args) {
        System.out.printf("3 X %d = %d\n", 1, 3 * 1); // 3 x 1 = 3
        System.out.printf("3 X %d = %d\n", 2, 3 * 2); // 3 x 2 = 6
        System.out.printf("3 X %d = %d\n", 3, 3 * 3); // 3 x 3 = 9
        System.out.printf("3 X %d = %d\n", 4, 3 * 4); // 3 x 4 = 12
        System.out.printf("3 X %d = %d\n", 5, 3 * 5); // 3 x 5 = 15
        System.out.printf("3 X %d = %d\n", 6, 3 * 6); // 3 x 6 = 18
        System.out.printf("3 X %d = %d\n", 7, 3 * 7); // 3 x 7 = 21
        System.out.printf("3 X %d = %d\n", 8, 3 * 8); // 3 x 8 = 24
        System.out.printf("3 X %d = %d\n", 9, 3 * 9); // 3 x 9 = 27

        /*	for (초기화;조건식 ;증감식 ){
			반복 실행될 문장
		}*/

        for(int i=1; i<=9;i++){
            System.out.printf("3 X %d = %d\n", i, 3 * i);
        }//for----

    }
}

