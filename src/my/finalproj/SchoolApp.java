package my.finalproj;

import java.util.Scanner;

//Consol Application
public class SchoolApp {
    // 배열 사용:
    private Person[] p = new Person[30];//30명 정원
    int count; // 배열의 인덱스로 사용될 변수

    public Person[] getP() {
        return p;
    }

    /**
     * 메인 메뉴를 보여주는 메소드
     */
    public void mainMenu() {
        System.out.println("---------------Main Menu--------------");
        System.out.println("|1. 등록  2. 검색  3. 삭제  4.출력  5. 종료|");
        System.out.println("--------------------------------------");
        System.out.println("번호를 입력하세요=>");
        System.out.println("--------------------------------------");
    }//----------

    /**
     * 하위 메뉴를 보여주는 메소드
     */
    public void subMenu() {
        System.out.println("---------------Sub Menu--------------");
        System.out.println("| 1.학생  2. 강사 3. 직원  4. 상위메뉴  |");
        System.out.println("--------------------------------------");
        System.out.println("번호를 입력하세요=>");
        System.out.println("--------------------------------------");
    }

    /***/
    public void register() {
        //서브 메뉴 출력...케이스 별로 로직 수행
        Scanner sc = new Scanner(System.in);
        outer: //레이블명
        while (true) {
            subMenu();
            int no = sc.nextInt();
            switch (no) {
                case 1://학생
                    Student st = new Student();
                    st.inputInfo();//학생정보를 입력받음.
                    addPerson(st);//등록된 객체를 배열에 저장한다.
                    break;
                case 2://교사
                    Teacher tc = new Teacher();
                    tc.inputInfo();
                    addPerson(tc);
                    break;
                case 3://직원
                    Staff sf = new Staff();
                    sf.inputInfo();
                    addPerson(sf);
                    break;
                case 4://상위 메뉴
                    break outer;//레이블 지정된 반복문을 이탈
                //return;
                //register()메소드를 호출한 쪽으로 제어권을 넘김
                default:
                    System.out.println("지원되지 않는 메뉴번호입니다.");
            }
        }//while----
    }//register()------------------

    /**
     * 등록한 사람들을 배열에 저장하는 메소드
     */
    public void addPerson(Person person) {
        //
        if (count < p.length) {
            p[count++] = person;
        } else {
            System.out.println("30명 정원을 초과했습니다.");
        }

    }//addPerson()------------

    /**
     * 이름으로 등록된 사람 검색하는 메소드
     */
    public String findPerson(String name) {
        for (int i = 0; i < count; i++) {
            String pname = p[i].getName();
            //배열에 저장된 사람의 이름을 꺼내온다.
            if (name.equals(pname)) {
                //검색하는 사람의 이름과 동일하다면...
                p[i].printAll();//그 사람 정보 출력
                return p[i].getInfo();
                //awt와 연계하기 위해 문자열로 정보를 반환
            }//if--
        }//for----------
        System.out.println(name + "이란 사람 없어요!");
        return name + "이란 사람 없어요";

    }//findPerson()---------------

    /**
     * 이름으로 삭제하는 메소드
     */
    public String removePerson(String name) {
        for (int i = 0; i < count; i++) {
            String pname = p[i].getName();
            if (name.equals(pname)) {// 배열에서 꺼낸 이름이 같으면..
                //for--
                for (int j = i; j < count; j++) { // 다음 인덱스를 현재 인덱스로 땡겨서 인덱스 번호르 변경하는것이 삭제로직입니다.
                    p[j] = p[j + 1]; // 현재 인덱스를 다음 인덱스로 변경하고, count변수 감소시키기
                }
                count--;
                System.out.println(name + "님 정보가 삭제됐어요!");
                return name + "님 정보 삭제";
            }//if-------
        }//for---
        System.out.println(name + "님은 없어요!");
        return name + "님 없어요!";

    }//removePerson()-------------

    /**
     * 배열에 저장된 사람의 모든 정보 출력
     */
    public String printAll() {
        String str = "";
        for (int i = 0; i < count; i++) {
            if (p[i] instanceof Student) { // 다운 캐스팅합니다..
                str += "\n---학생정보---\n";
            } else if (p[i] instanceof Teacher) {
                str += "\n---교사정보---\n";
            } else {
                str += "\n---직원정보---\n";
            }
            str += p[i].getInfo();
        }
        System.out.println(str);
        return str;
    }//printAll()-------

    public static void main(String[] args) {
        SchoolApp sa = new SchoolApp();
        Scanner sc = new Scanner(System.in);
        while (true) {

            sa.mainMenu();
            int no = sc.nextInt();

            switch (no) {
                case 1: //등록
                    sa.register();
                    break;
                case 2: //검색
                    // 이때,, 메소드 호출하기 전에 검색하고자 하는 사람의 이름을 입력 받도록 해야합니다.
                    // 메소드 실 인수값
                    System.out.println("검색할 사람 이름=>>");
                    String name = sc.next();// 문자열만 읽어오기..
                    System.out.println("--" + name + "님을 검색합니다.--");
                    // 검색 메소드 호출
                    sa.findPerson(name);
                    break;
                case 3: // 삭제
                    System.out.println("삭제할 사람 이름=>>");
                    name = sc.next();// 문자열만 읽어오기..
                    // 삭제 메소드 호출
                    sa.removePerson(name);
                    break;
                case 4: //출력
                    sa.printAll();
                    break;
                case 5: //정상종료(System.exit(0))
                    System.out.println("Bye~~");
                    System.exit(0);
                    break;
                default:
                    System.out.println("지원하지 않는 메뉴 번호입니다.");

            }
        }// while-------------------
    }
}

