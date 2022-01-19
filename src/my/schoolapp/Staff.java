package my.schoolapp;
import java.util.*;
import static java.lang.System.out;

public class Staff extends Person{

	private String id;//사번
	private String dept;//부서
	//setter, getter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String getInfo() {
		String info=super.getInfo()+"\n사번: "+id
				+"\n부서: "+dept;
		return info;
	}
	@Override
	public void inputInfo() {
		try {
			super.inputInfo();
		} catch (NotSupportedNameException e) {
			out.println(e.getMessage());
			return;
		}

		//이름, 주소
		Scanner sc=new Scanner(System.in);
		out.println("사번을 입력하세요=>");
		String i=sc.nextLine();
		setId(i);
		out.println("부서를 입력하세요=>");
		String d=sc.nextLine();
		setDept(d);
	}
	@Override
	public void printAll() {
		out.println(this.getInfo());
	}


}///////////////////////////////





