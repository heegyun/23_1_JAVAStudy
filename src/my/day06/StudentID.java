package my.day06;

public class StudentID {

    public static void main(String[] args) {
        // 10명 학생의 학번(정수)을 관리하는 배열 선언
        //int[] studentIds  = new int[]{1,2,3,4,5,6,7,8,9,10};
        String[] strNames = new String[3];
        strNames[0] = "홍길동";
        strNames[1] = "강길동";
        strNames[2] = "이길동";


        /*studentIds[0] = 0001;
        studentIds[1] = 0002;
        studentIds[2] = 0003;
        studentIds[3] = 0004;
        studentIds[4] = 0005;*/

        // 배열명.length => 배열의 전체 길이값
        for(int i=0; i<strNames.length;i++){
            System.out.println(strNames[i]);
        }
    }



}
