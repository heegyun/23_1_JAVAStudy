package my.day05;

public class StudentManager {
    public static void main(String[] args) {

        // 학생 객체 생성
        Student hong = new Student();
        Student lee = new Student("이길동","대전 서구 갈마동",3,"20203333");

        hong.showStudentInfo();
        lee.showStudentInfo();

        hong.address = "대전 동구 판암동";
        hong.showStudentInfo();


        /*
        student.address ="대전 동구 용운동";
        student.name = "홍길동";
        student.hakbun  = "20212222";
        student.haknum = 2;
        student.showStudentInfo();
        student.수강신청하기("자바");


        lee.address = "대전 서구 갈마동";
        lee.haknum = 3;
        lee.hakbun = "20203333";
        lee.name = "이길동";
        lee.showStudentInfo();
        lee.수강신청하기("C++");
        */



    }
}
