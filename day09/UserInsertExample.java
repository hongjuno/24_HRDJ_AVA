package day09;
/*
 * 1. JDBC 드라이버 로드
 * 2. 데이터 베이스 연결
 */

import java.io.IOException;
import java.sql.*;

public class UserInsertExample {

	public static void main(String[] args) {
		
		Connection con = null;
		
		try {
			// 1. JDBC 드라이버 로딩..
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			// 2. 데이터 베이스 연결...
			String url = "jdbc:mysql://localhost:3306/contacts";
			String id = "root";
			String pwd = "1234";
			con = DriverManager.getConnection(url,id,pwd);
			System.out.println("DB 연결 성공");
			
			
			// 3. sql문 실행하기 위한 Statement, PreparedStatement 객체 생성
			
				
				String sql2 = "insert into users (userid, username, userpassword, userage, usermail) "
						+ "values (?, ?, ?, ?, ?)";
				PreparedStatement st = con.prepareStatement(sql2);
			
				st.setString(1, "winter");
				st.setString(2, "한겨울");
				st.setString(3, "1234");
				st.setInt(4, 50);
				st.setString(5, "wniter@naver.com");
			
			// 4. 데이터 추가 명령 전송 하기 e
				int result = st.executeUpdate();
				
				if(result > 0) {
					System.out.println("데이터 저장 성공");
				}else {
					System.out.println("데이터 저장 실패");
				}
			
			
		}catch(Exception e) {
			System.out.println("드라이버 로딩 실패");
			
			
		}finally {
			try {
				con.close();
			}catch(SQLException es) {
				
			}
		}
		

	}

}
