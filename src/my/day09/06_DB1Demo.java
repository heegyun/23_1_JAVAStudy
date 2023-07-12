import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB1Demo {
  
	public static Connection makeConnection() {
		String url = "jdbc:mysql://localhost/contacts?serverTimezone=Asia/Seoul";

		Connection con = null;
		try {
      // 1. 드라이버 로딩 코드
			

			System.out.println("데이터베이스 연결중 ...");

      // 2. DriverManager객체를 통해 데이터베이스 url정보 전달하여 연결 하여 con객체 얻어오기
			
			System.out.println("데이터베이스 연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버를 찾지 못했습니다...");
		} catch (SQLException e) {
			System.out.println("데이터베이스 연결 실패");
            System.out.println(e.getMessage());
		}
		return con;
	}

	public static void main(String[] args) {
		makeConnection();
	}
}
