package my.day06;
/*
 다음 클래스를 만들고 결과값을 출력해 보자
 나이가 40살, 이름이 제임스라는 남자가 있다. 이 남자는 결혼을 했고, 자식이 셋 있습니다.
 <출력결과>
 이 사람의 나이
 이 사람의 이름
 이 사람의 결혼 여부(boolean isMarried)
 이사람의 자녀수
 */
public class Man {
    // 멤버 변수
    int age ;
    String name;
    boolean isMarried;
    int childrens;

    // 인자 생성자..
    public Man(int age, String name, boolean isMarried, int childrens){
        // 멤버 변수 초기화...
        this. age  = age;
        this. name = name;
        this. isMarried = isMarried;
        this.childrens = childrens;
    }

    // 멤버 메소드
    public void showInfo(){
        System.out.println("이 사람의 나이: " + age);
        System.out.println("이 사람의 이름: " + name);
        System.out.println("이 사람의 결혼 여부: " + isMarried);
        System.out.println("이 사람의 자녀수: " + childrens);
    }


}
