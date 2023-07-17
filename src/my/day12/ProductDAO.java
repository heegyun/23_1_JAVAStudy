package day12;

import java.sql.*;
import java.util.*;

public class ProductDAO {
	//String jdbcDriver = "com.mysql.jdbc.Driver";
	//String jdbcUrl = "jdbc:mysql://localhost/javadb";
	//Connection conn;
	
	//PreparedStatement pstmt;
	//ResultSet rs;

	//Vector<String> items = null;
	String sql;
	
	// 콤보박스의 상품관리 번호 목록을 위한 벡터 리턴
	public Vector<String> getItems() {
		return items;
	}
	
	// 전체 상품 목록을 가지고 오는 메서드
	public ArrayList<ProductDTO> getAll() {
		connectDB();
		sql = "";
		
		//전체 검색 데이터를 전달하기 위한 ArrayList
		
		
		// 관리코드 콤보박스 데이터를 위한 벡터 초기화
		
		try {
			
		
			// 검색된 데이터수 만큼 루프를 돌며 Product 객체를 만들고 이를 다시 ArrayList 에 추가함.
			while(rs.next()) {
				
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		finally {
			closeDB();
		}
		return datas;
	}
	
	// 선택한 상품 코드에 해당하는 상품 정보를 가지고 오는 메서드
	public ProductDTO getProduct(int prcode) {
		
		try {
			
		}
		catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		finally {
			closeDB();
		}
		return p;
	}
	
	// 새로운 상품을 등록하는 메서드
	public boolean newProduct(ProductDTO product) {
		
		
		// prcode 는 자동증가 컬럼이므로 직접 입력하지 않는다.
	
		try {
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		finally {
			closeDB();
		}
		return true;
	}
	
	// 선택한 상품을 삭제하는 메서드
	public boolean delProduct(int prcode) {
		
		try {
			
		}
		catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		finally {
			closeDB();
		}
		return true;
	}
	
	// 수정한 정보로 상품정보를 업데이트 하는 메서드
	public boolean updateProduct(ProductDTO product) {
		
		try {
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		finally {
			closeDB();
		}
		return true;
	}
	
	// DB연결 메서드
	public void connectDB() {
		try {
			Class.forName(jdbcDriver);
			conn = DriverManager.getConnection(jdbcUrl,"javabook","1234");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// DB 연결 종료 메서드
	public void closeDB() {
		try {
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	
}
