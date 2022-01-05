package my.day02;

public class DataTypeEx02 {// 클래스 정의부...
    // 클래스 변수 선언
    static int a;
    // 멤버변수 선언
    double j;

    public static void main(String[] args) {
        /*  참조형: 반드시 new 연산자로 객체를 생성해 사용해야 한다.
            그러나 예외는 있다.. String의 경우. 자주 사용하기 때문에 문자열값을 직접 마치 기본형처럼
            할당해서 사용하게 된다.
        */
        System.out.println("----참조형-----");
        // 참조 변수선언
        String str1 ;
        // 변수 사용
        str1 = new String("홍길동");// 생성자..
        String str2;
        str2 = "강길동";
        int i = 10;
        System.out.println("str1:" + str1);
        System.out.println("str2: " + str2);

        // 클래스 변수 초기화1
        a=20;
        System.out.println(a);
        // 클래스변수사용. 클래스이름.클래스변수
        System.out.println(DataTypeEx02.a);

        //참조형
        DataTypeEx02 dataTypeEx02 = new DataTypeEx02();
        dataTypeEx02.j=35.0;
        System.out.println(dataTypeEx02.j);

    }
}// 클래스의 끝
