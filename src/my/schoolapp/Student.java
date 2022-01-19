package my.schoolapp;
import java.util.*;
import static java.lang.System.out;

public class Student extends Person{
	private String id;//학번
	private String className;//학급

	//setter, getter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	//overriding
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		String info=super.getInfo()+"\n학번: "
				+id+"\n학급: "+className;
		return info;
	}
	/**학생 정보를 입력받음*/
	@Override
	public void inputInfo() {
		// TODO Auto-generated method stub
		try {
			super.inputInfo();
		} catch (NotSupportedNameException e) {
			out.println(e.getMessage());
			return;
		}
		//이름, 주소,
		//학번, 학급
		Scanner sc=new Scanner(System.in);
		out.println("학번을 입력하세요=>");
		String i=sc.nextLine();
		setId(i);
		out.println("학급을 입력하세요=>");
		String c=sc.nextLine();
		setClassName(c);
	}
	@Override
	public void printAll() {
		// TODO Auto-generated method stub
		out.println(this.getInfo());
	}



}/////////////////////////////////////




