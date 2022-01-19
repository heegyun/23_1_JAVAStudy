package my.schoolapp;

public class NotSupportedNameException extends Exception  {
	
	public NotSupportedNameException(){
		super("지원되지 않는 이름입니다.");
		//예외 메시지를 super에 등록....
	}//----------
	public NotSupportedNameException(String msg){
		super(msg);
	}//-----------

}///////////////////////////////////////////////////
