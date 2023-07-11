/*TCP통신 방식에서 서버단에서는 ServerSocket과 Socket이 필요*/
class  MyNetServer{
	 public static void main(String[] args) {
        try {
            ServerSocket sc = new ServerSocket(5000);
            System.out.println("## 서버 실행..");
            while(true) {
                Socket s = sc.accept();
                BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

                System.out.println("## 클라이언트 연결됨 !!");
                System.out.println("## 클라이언트 메시지: "+br.readLine());
                br.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
