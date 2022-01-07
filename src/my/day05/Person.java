package my.day05;
public class Person {
    // 멤버 변수....
    String name;
    int age;
    char gender;
    String tel;

    // 기본 생성자...
    public Person(){

    }

    // 인자 생성자....
    public Person(String name, int age, char gender, String tel){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.tel= tel;
    }

    // 멤버 메소드
    public String showProfile(){
        String info = "---"+ name + "프로필"+"----";
        info+="\n나이 :" + age;
        info+="\n성별 :" + gender;
        info+="\n전화 :" + tel;
        return info; //문자열 반환
    }

    public void wantJob(String job, int pay){
        System.out.println("--" + name + "님--");
        System.out.println("희망직종: " + job);
        System.out.println("희망연봉: " + pay);

    }

}
