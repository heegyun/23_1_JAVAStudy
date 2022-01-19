package my.schoolapp;

import java.util.Scanner;

import static java.lang.System.out;
//5.0버전 이상에서 사용가

public abstract class Person {


	private String name;
	private String addr;


	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}//기본생성자----

	public Person(String name, String addr) {
		super();
		this.name = name;
		this.addr = addr;
	}//인자생성자--------

	/**setter,getter-----*/
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
	/**추상메소드  */
	public abstract void setId(String id);
	public abstract String getId();

	/**사람 정보를 입력받는 모듈*/
	public void inputInfo()
			throws NotSupportedNameException{
		out.println(/**사람 정보를 입력받는 모듈*/);
		Scanner sc=new Scanner(System.in);
		String nm=sc.nextLine();
		if(nm.startsWith("콩")){
			throw new NotSupportedNameException(
					"콩씨는 절대로 등록할 수 없어요");
		}else if(nm.startsWith("퐁")){
			throw new NotSupportedNameException(
					"퐁씨는 이용할 수 없어요.");
		}

		setName(nm);//멤버 변수에 입력값을 저장

		out.println("주소를 입력하세요=>");
		String ad=sc.nextLine();
		setAddr(ad);//멤버 변수에 입력값을 저장
	}//-------------

	/**사람의 정보를 문자열로 돌려주는 메소드
	 * */
	public String getInfo(){
		String info="이름: "+name+"\n주소: "+addr;
		return info;
	}
	/**사람 정보를 콘솔에 출력해주는 메소드*/
	public void printAll(){
		out.println(this.getInfo());
	}
	public String toString(){
		return name;
	}


}/////////////////////////////////






