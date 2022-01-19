package my.finalproj;


import java.util.Scanner;

public abstract class Person {
    private String name;
    private String addr;

    public Person(){

    }

    public Person(String name, String addr){
        this.name = name;
        this.addr = addr;
    }
    // setter, getter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    // 추상메소드
    abstract void setId(String id);
    abstract String getId();

    // 사람 정보를 입력받는 메소드
    public void inputInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력하세요 >>");
        String nm = scanner.nextLine();
        setName(nm);
        System.out.println("주소를 입력하세요 >>");
        String ad = scanner.nextLine();
        setAddr(ad);
    }



    // 사람 정보를 출력하는 메소드
    public String getInfo(){
        String info = "이름: " +name + "주소: " + addr;
        return info;
    }

    //사람 정보를 콘솔에 출력하는 메소드
    public void printAll(){
        System.out.println(getInfo());
    }

    public String toString(){
        return name;
    }

}
