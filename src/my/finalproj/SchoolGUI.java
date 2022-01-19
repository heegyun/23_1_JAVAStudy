package my.finalproj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class SchoolGUI extends JFrame  {
    //JFrame f;
    JPanel jPanel;
    // 등록,삭제, 검색, 출력, 저장 참조변수
    JButton reg, find, del, print, save;
    JTextArea jTextArea;
    // 대화상자 3개 참조변수
    JDialog dial1, dial2, dial3;
    //학생,교사,직원,닫기, 검색,검색종료 참조변수
    JButton btnStudent, btnTeacher, btnStaff, btnClose,btnFindOk, btnFindClose;
    // 확인, 취소 참조변수
    JButton btnOk, btnCancel;

    JLabel lbName, lbAddr, lbId, lbPub;
    JTextField tfName, tfAddr, tfId, tfPub, tfFindName;

    // 멤버 변수에 Person, SchoolApp 참조 변수 선언하기--------------------------
    Person p;
    SchoolApp schoolApp= new SchoolApp(); // schoolApp 생성 하기
    ////////////////////////////////////////////////

    public SchoolGUI(){
        super("학사관리 프로그램 v1.0");

        //setTitle("학사관리 프로그램 v1.0");
        setSize(500,500);
        setVisible(true);

    }// 기본생성자

    //GUI 구성하는 메소드
    public void makeGui(){
        jPanel= new JPanel();
        jPanel.setBackground(Color.YELLOW);
        jPanel.setLayout(new GridLayout(0,1,10,10));// 열은 1열로 고정, 행은 유동적

        jTextArea = new JTextArea();

        reg= new JButton("등 록");
        find = new JButton("검 색");
        del = new JButton("삭 제");
        print = new JButton("출 력");
        save = new JButton("저 장");

        // 판넬에 버튼을 부착 (add())
        jPanel.add(reg);
        jPanel.add(find);
        jPanel.add(del);
        jPanel.add(print);
        jPanel.add(save);

        add(jTextArea, BorderLayout.CENTER);
        add(jPanel, BorderLayout.EAST);

        // 다이얼로그 생성
        dial1=new JDialog(this,true);
        dial2=new JDialog(this, true);
        dial3=new JDialog(this, "**검색**", true);

        // 학생,교사,직원,검색,검색종료버튼 생성
        btnStudent = new JButton("학생");
        btnTeacher = new JButton("교사");
        btnStaff = new JButton("직원");
        btnClose = new JButton("닫기");

        // dialog1에 버튼 부착
        dial1.setTitle("**등록**");
        dial1.setLayout(new GridLayout(1,0));
        dial1.add(btnStudent);
        dial1.add(btnTeacher);
        dial1.add(btnStaff);
        dial1.add(btnClose);

        // 판넬 4개 생성 후 배치관리자 설정
        JPanel dp1=new JPanel();
        JPanel dp2=new JPanel();
        JPanel dp3=new JPanel();
        JPanel dp4=new JPanel();

        dp1.setLayout(new GridLayout(4,1));
        dp2.setLayout(new GridLayout(4,1));

        dial2.add(dp1,"West");//라벨을 붙일 패널
        dial2.add(dp2,"Center");//텍스트필드 붙일 패널
        dial2.add(dp3,"South");//버튼 붙일 패널

        dp1.add(lbName=new JLabel("이름"));
        dp1.add(lbAddr=new JLabel("주소"));
        dp1.add(lbId=new JLabel("ID"));
        dp1.add(lbPub=new JLabel("기타"));

        dp2.add(tfName=new JTextField());
        dp2.add(tfAddr=new JTextField());
        dp2.add(tfId=new JTextField());
        dp2.add(tfPub=new JTextField());

        dp3.add(btnOk=new JButton("처리"));
        dp3.add(btnCancel=new JButton("취소"));

        //dial3에 검색 또는 삭제 관련 컴포넌트 부착
        JLabel lb=new JLabel("이름을 입력하세요");
        dial3.add(lb,"North");
        dial3.add(dp4,"Center");

        tfFindName=new JTextField(20);
        dp4.add(tfFindName);

        btnFindOk=new JButton("확인");
        btnFindClose=new JButton("닫기");

        dp4.add(btnFindOk);
        dp4.add(btnFindClose);

        //ta를 편집 불가능하게끔...
        jTextArea.setEditable(false);

        // 이벤트 처리 리스너 부착------
        MyHandler handler = new MyHandler();
        reg.addActionListener(handler);
        find.addActionListener(handler);
        del.addActionListener(handler);
        print.addActionListener(handler);
        save.addActionListener(handler);

        btnStudent.addActionListener(handler);
        btnTeacher.addActionListener(handler);
        btnStaff.addActionListener(handler);

        btnClose.addActionListener(handler);
        btnOk.addActionListener(handler);
        btnCancel.addActionListener(handler);
        btnFindClose.addActionListener(handler);
        btnFindOk.addActionListener(handler);




    } //makeGui()------------------------

    // 이벤트 처리 인터페이스를 구현하는 구현 클래스 (내부 클래스(Inner Class))
    // ActionListener 인터페이스 : 모든 UI 컴포넌트에 발생하는 이벤트를 처리하는 인터페이스로 actionPerformed() 추상메소드 갖는다.
    class MyHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            // 이벤트 발생 객체(인스턴스) 확인
            Object obj = e.getSource();

            // 이벤트 발생한 객체의 문자열 값 얻어오기기
            // String btnString  = e.getActionCommand()

            if(obj == reg){ //등록
                dial1.pack();
                dial1.setLocation(500,0);
                dial1.setVisible(true);


            }else if(obj == find){ //검색
                dial3.setTitle("**검색**");
                dial3.pack();
                dial3.setVisible(true);

            }else if(obj==del){ //삭제
                dial3.setTitle("**삭제**");
                dial3.pack();
                dial3.setVisible(true);

            }else if(obj==print){ //출력
                String result = schoolApp.printAll();
                jTextArea.append(result+"\n");

            }else if(obj==save) { //저장

                /*텍스트에리어에 출력된 내용을 파일로 저장하자.
                 * 1> FileDialog를 저장 모드로 띄운다.
                 * 2> 파일명과 디렉토리명을 얻어와서
                 * 3> java.io.FileWriter클래스 생성자에
                 *    파일 절대경로를 넣어주고
                 * 4> ta의 내용을 FileWriter의  write()메소드
                 *    를 이용해서 쓰기 작업을 한다.
                 *    ...이때 주의...FileWriter의 write()
                 *       메소드 호출 후 반드시 flush()메소드를
                 *       호출해주자.
                 * */

                //1>, 2>
                FileDialog fd
                        = new FileDialog(SchoolGUI.this,
                        "파일저장", FileDialog.SAVE);
                fd.setVisible(true);
                //파일 절대경로 얻기
                String dir = fd.getDirectory();
                String file = fd.getFile();
                String filename = dir + file;
                setTitle(filename);

                try {
                    FileWriter fw = new FileWriter(filename);
                    String content = jTextArea.getText();
                    //ta로부터 가져온 내용을 fw를 통해 쓴다.
                    fw.write(content);
                    fw.flush();
                    fw.close();
                    setTitle("저장 완료");
                    jTextArea.append("저장 완료!!!->" + filename + "\n");
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }else if(obj == btnStudent){ //학생
                dial2.setTitle("**학생 등록**");
                lbId.setText("학번");
                lbPub.setText("학급");
                dial2.pack();
                dial2.setLocation(500,30);
                dial2.setVisible(true);

            }else if(obj == btnTeacher){ //교사
                dial2.setTitle("**교사 등록**");
                lbId.setText("교번");
                lbPub.setText("과목");
                dial2.pack();
                dial2.setLocation(500,30);
                dial2.setVisible(true);
            }else if(obj == btnStaff){ //직원
                dial2.setTitle("**직원 등록**");
                lbId.setText("사번");
                lbPub.setText("부서");
                dial2.pack();
                dial2.setLocation(500,30);
                dial2.setVisible(true);
            }else if(obj == btnOk){ // 등록 버튼
                String name = tfName.getText(); // 각 입력 상자에 입력한 내용을 읽어오기
                String addr = tfAddr.getText(); // 입력 내용 확인할떄는 getter메소드 사용,
                String id = tfId.getText();
                String pub = tfPub.getText();
                // 그다음 어떤 객체이냐에 따라 호출 메소드 다르게 하여 등록 하기
                // 이때, 어떤 객체이냐를 판단하기 위한 기준은 타이틀에 있는 문자열 중 교사, 학생, 직원 이 문자열로 객체확인 한다.
                // 일단 먼저 타이틀 내용 가져오기
                String title = dial2.getTitle();
                //그다음에 이 문자열인덱스로 원하는 문자열만 뽑아오기
                System.out.println(title);
                // 문자열 인덱스 2부터 4 직전까지 잘라내어 반환하는 메소드 사용하기
                String word = title.substring(2,4);
                System.out.println(word);

                if(word.equals("학생")){ // 문자열 비교할때 사용하는 메소드 equals())
                    // 학생 객체 생성
                    // 업캐스팅..하기
                    p = new Student();
                    // 추가적오르 학생 객체만이 갖는 멤버 변수 초기화 하는 메소드 호출
                    ((Student)p).setClassName(pub);

                }else if(word.equals("교사")){
                    // 교사 객체 생성
                    p = new Teacher();
                    ((Teacher)p).setSubject(pub);
                }else if(word.equals("직원")){
                    // 직원객체 생성
                    p = new Staff();
                    ((Staff)p).setDept(pub);
                }
                p.setName(name);
                p.setAddr(addr);
                p.setId(id);
                // 비즈니스 로직 수행하는 메소드 호출하기----------------------
                schoolApp.addPerson(p); // 공통타입 으로 묶어서.......배열에 저장하기...
                //////////////////////////////////////////////////////////////////
                // 다시 입력받을 수 있도록 입력 상자는 빈 문자열로 초기화하기
                tfName.setText("");
                tfId.setText("");
                tfAddr.setText("");
                tfPub.setText("");

                // 이름 입력상자에 마우스 포커스 가게 설정하기
                tfName.requestFocus();


            }else  if(obj==btnCancel){  // 취소...
                // 다이얼로그 닫기 메소드 호출
                dial2.dispose();
                tfName.setText("");
                tfId.setText("");
                tfAddr.setText("");
                tfPub.setText("");

            }else if(obj == btnClose){ //닫기
                //dial1 닫기
                dial1.dispose();
            }else if(obj == btnFindOk){ //검색(삭제) 확인 버튼
                //제목으로 검색 대화창인지 삭제 대화창인지
                String title = dial3.getTitle();
                String word = title.substring(2,4);

                //구별하기 위해 if문 작성
                if (word.equals("검색")){
                    //만약 "검색"문자열과 같으면 이름문자열을 읽어온 후, 그 이름과 같은 정보 찾는 메소드 호출
                    String name = tfFindName.getText();
                    ////////////////////////////////////
                    String msg = schoolApp.findPerson(name);
                    //////////////////////////////////
                   //그 결과값은 텍스트에어리어에 추가하기
                    jTextArea.append(msg+"\n");

                }else{
                    //삭제다이얼로그 창...
                    String name = tfFindName.getText();
                    String msg = schoolApp.removePerson(name);
                    jTextArea.append(msg+"\n");
                }
                // 이름 입력텍스트 필드 초기화
                tfName.setText("");


            }else if(obj == btnFindClose) { // 검색(삭제) 창 닫기
                // dial3다이얼로그 닫기 메소드 호출
                dial3.dispose();

            }


        }
    }// MyHandler-------------


    public static void main(String[] args) {

           SchoolGUI myFrame=  new SchoolGUI();
           myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           myFrame.makeGui();

    }



}
