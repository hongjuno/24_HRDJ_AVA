package day09;
/*
 * 1. JDBC 드라이버 로드
 * 2. 데이터 베이스 연결
 */

import java.io.IOException;
import java.io.FileInputStream;
import java.sql.*;
import java.util.ArrayList;

public class PersonSelect {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
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
			
				
				//String sql2 = "select name, phone from person ";
				// 이름이 홍길동과 같은 사람의 모든 열의 정보를 검색해서 출력하기
				String sql2 = " select * from person";
						
				
			
			// 4. 데이터 추가 명령 전송 하기 e
				st = con.createStatement();
				rs = st.executeQuery(sql2);
				
				String name = "";
				String phone = "";
				String email = "";
				int age = 0;
				Person person = null;
				ArrayList<Person> arlist = new ArrayList<Person>();
				while(rs.next()) {
					
					name = rs.getString("name");
					phone = rs.getString("phone");
					email = rs.getString("email");
					age = rs.getInt("age");
					person = new Person(name, phone, email, age);
					arlist.add(person);
				}
				for(Person p : arlist) {
				
				System.out.println("이름: " + p.getName());
				System.out.println("전화번호: " + p.getPhone());
				System.out.println("이메일: " + p.getEmail());
				System.out.println("나이: " + p.getAge());
				}
		}catch(Exception e) {
			System.out.println("드라이버 로딩 실패");
			
			
		}finally {
			try {
				con.close();
				st.close();
				rs.close();
				System.out.println("연결 끊기");
			}catch(SQLException es) {
				
			}
		}
		

	}

}
