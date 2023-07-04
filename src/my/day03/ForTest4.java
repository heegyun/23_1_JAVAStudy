package day03;

public class ForTest4 {
    public static void main(String[] args) {
        // 중첩 for루프를 이용하여 아래 모양이 출력되도록 해봅시다.
        //		  *****
        //		  *****
        //		  *****

        for (int i=0;i<3 ;i++ ){
            for (int k=0;k<5 ;k++ ){
                System.out.print("*");
            }//for---
            System.out.println();//줄바꿈
        }//for-----------

    }
}


