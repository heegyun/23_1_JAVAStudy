/*TCP통신 방식에서 서버단에서는 ServerSocket과 Socket이 필요*/
class  MyNetServer{
	public static void main(String[] args) throws IOException{
		//서버소켓: 포트 번호 필요...
		int port=5000;
		int myNum=Integer.parseInt(args[0]);
		//1. 서버 소켓 생성-----
		ServerSocket ser=new ServerSocket(port);
		out.println("클라이언트 연결을 기다림...");
		while(true){
			Socket sock=ser.accept();
			//클이 접속해서 들어오면 서버 소켓은 클과
			//연결된 소켓객체를 반환해준다.
		out.println("클이 접속해옴...");
		out.println("클의 IP: "+sock.getInetAddress().getHostAddress());
			//클과 통신하기 위해 스트림 연결
			OutputStream os=sock.getOutputStream();
			DataOutputStream dos=new DataOutputStream(os);
			dos.writeUTF(args[1]);
			dos.writeInt(myNum);
			dos.flush();
			dos.close();
			sock.close();
		}//while--------
		//ser.close();

	}
}
class  MyNetClient{
	public static void main(String[] args)
		throws Exception{
		//클라이언트에서는 Socket만 필요...
		//서버의 IP주소와 port번호가 필요
		Socket sock=new Socket("172.16.10.207",5000);		
		//연결되면 Socket객체가 생성되고...연결 안되면 예외 발생
		System.out.println("서버와 연결됨...");	
		InputStream is=sock.getInputStream();
		DataInputStream dis=new DataInputStream(is);
		String data=dis.readUTF();
		System.out.println("서버로부터>>"+data);
		int num=dis.readInt();
		System.out.println("서버로부터>>"+num);
		dis.close();
		is.close();
		sock.close();
	}//main()-----------------
}////////////////////////////////////////////////////
