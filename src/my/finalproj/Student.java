package my.finalproj;

import java.util.Scanner;

public class Student extends  Person{

    private String id; // 학번
    private String className; //학급

    @Override
    void setId(String id) {
        this.id  = id;
    }

    @Override
    String getId() {
        return id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }


    @Override
    public void inputInfo() {
        //이름, 주소
        super.inputInfo();
        // 학번, 학급
        Scanner scanner = new Scanner(System.in);
        System.out.println("학번을 입력하세요: ");
        String id = scanner.nextLine();
        setId(id);
        System.out.println("학급을 입력하세요: ");
        String cn = scanner.nextLine();
        setClassName(cn);
    }

    @Override
    public String getInfo() {
        String info= super.getInfo() +"\n학번: " +id +"\n학급" + className;
        return info;
    }

    @Override
    public void printAll() {
        System.out.println(this.getInfo());
    }
}
