package my.finalproj;

import java.util.Scanner;

public class Teacher extends  Person{

    private String id; //교번
    private String subject; //담당 과목

    //setter, getter
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    @Override
    public String getInfo() {
        String info=super.getInfo()+"\n교번: "+id
                +"\n담당과목: "+subject;
        return info;
    }
    @Override
    public void inputInfo() {
       //이름, 주소
        super.inputInfo();
        Scanner sc=new Scanner(System.in);
        System.out.println("교번을 입력하세요=>");
        String i=sc.nextLine();
        setId(i);
        System.out.println("과목을 입력하세요=>");
        String s=sc.nextLine();
        setSubject(s);
    }
    @Override
    public void printAll() {
        System.out.println(this.getInfo());
    }
}
