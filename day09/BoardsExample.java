package day09;
/*
 * 1. JDBC 드라이버 로드
 * 2. 데이터 베이스 연결
 */

import java.io.IOException;
import java.io.FileInputStream;
import java.sql.*;

public class BoardsExample {

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
			
				
				String sql2 = "insert into boards (btitle, bcontent, bwriter, bdate, bfilename,bfiledata) "
						+ "values (?, ?, ?, now(), ?,?)";
				
				PreparedStatement st = con.prepareStatement(sql2, Statement.RETURN_GENERATED_KEYS);
			
				
				st.setString(1, "눈 오는 날");
				st.setString(2, "준오시치 내가고침 ");
				st.setString(3, "winter");
				st.setString(4, "snow.png");
				st.setBlob(5, new FileInputStream("C:\\Users\\COMPUTER\\eclipse-workspace\\javaOOP\\src\\day09\\snow.png"));
			
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
