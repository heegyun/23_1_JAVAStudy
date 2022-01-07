package my.day05;

public class Student {
    //멤버 변수선언
    String name;
    String hakbun;
    int haknum;
    String address;

    // 생성자메소드 : 멤버변수 초기화
    public Student(){ // 기본생성자...
        name ="홍길동";
        hakbun  = "20212222";
        haknum = 2;
        address ="대전 동구 용운동";
    }

    // 인자 생성자....(매개변수 있는 생성자...)
    public Student(String name, String address, int haknum, String hakbun){
        // 매개변수를 멤버변수값으로 초기화....
        this.name = name;
        this.address = address;
        this.haknum = haknum;
        this.hakbun = hakbun;
    }

    // 멤버 메소드
    void 수강신청하기(String className){
        System.out.println(className + "과목을 수강신청하다.");
    }
    // 학생 데이터를 모두 출력하는 메소드
    public void showStudentInfo(){
        System.out.println(name + "," + address);
    }


}
