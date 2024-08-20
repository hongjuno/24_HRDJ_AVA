package day10;
import java.sql.*;
import java.util.*;
import java.io.*;

public class DataModel {
// 1. 데이터 베이스 연결
// 2. 데이터 입출력 담당 메소드 구현
	
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	ConnectDB cdb = null;
	Board board = null;
	Scanner scan = null;
	
	
	public DataModel() {
		cdb = new ConnectDB();
		con = cdb.getCon();
		if(con !=null) {
			System.out.println("연결 성공");
		}else {
			System.out.println("연결 실패");
		}
		scan = new Scanner(System.in);
	}//생성자 -------------------------------
	
	
	// 데이터 추가 메소드 insertData() (insert into~)
	public void insertData(Board board) throws SQLException {
		int num = 0;
		this.board = board;
		String sql = "insert into boards(btitle, bcontent, bwriter, bdate) values (?, ?, ?, now())";
		pst = con.prepareStatement(sql);
		pst.setString(1, board.getBtitle());
		pst.setString(2, board.getBcontent());
		pst.setString(3, board.getBwriter());
		
		num = pst.executeUpdate();
		if(num>0) System.out.println("저장 성공");
		else System.out.println("저장 실패");
	}
	// 게시물 데이터 입력 받기
	public void create() throws SQLException {
		board = new Board();
		System.out.println("[새 게시물 입력]");
		System.out.println("제목: ");
		board.setBtitle(scan.nextLine());
		System.out.println("내용:");
		board.setBcontent(scan.nextLine());
		System.out.println("작성자: ");
		board.setBwriter(scan.nextLine());
		///////////////////////////////////////////////
		//insertData(board);
		///////////////////////////////////////////////
		System.out.println("------------------------");
		System.out.println("버저 메뉴 : 1.Ok | 2.Cancel ");
		System.out.println("메뉴 선택: ");
		String menuNo = scan.nextLine();
		
		if(menuNo.equals("1")) {
			try {
			String sql = "insert into boards( btitle, bcontent, bwriter, bdate) "
					+ "values (?, ?, ?, now()) ";
			
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, board.getBtitle());
			pst.setString(2, board.getBcontent());
			pst.setString(3, board.getBwriter());
			pst.executeUpdate();
			pst.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			list();
		}
		
	
	}///////////////////////////////create
	
	// 데이터 전체 검색 list()
	public void list() throws SQLException{
		System.out.println("[게시물 목록]");
		System.out.println("--------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s\n","no", "writer", "date", "title");
		System.out.println("--------------------------");
		
		
		String sql = "select bno, btitle, bcontent, bwriter, bdate from boards order by bno desc";
			pst = con.prepareStatement(sql);

			rs = pst.executeQuery();
			
			while(rs.next()) {
				board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				
				System.out.println();
				System.out.println(board.getBno());
				System.out.println(board.getBwriter());
				System.out.println(board.getBdate());
				System.out.println(board.getBtitle());
				
				
			}
		
		BoardExample borad = new BoardExample();
		borad.mainMenu();
	}
	
	// 데이터 조건 검색 list()
	public void list(String name) throws SQLException{
		System.out.println("[게시물 목록]");
		System.out.println("--------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s\n","no", "writer", "date", "title");
		System.out.println("--------------------------");
		
		
		String sql = "select bno, btitle, bcontent, bwriter, bdate from boards where bwriter=?";
			pst = con.prepareStatement(sql);
			pst.setString(1, name);
			rs = pst.executeQuery();
			
			while(rs.next()) {
				board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				
				System.out.println();
				System.out.println(board.getBno());
				System.out.println(board.getBwriter());
				System.out.println(board.getBdate());
				System.out.println(board.getBtitle());
				
				
			}
		
		
	}
	
	
	// 게시물 읽기 메소드 구현하기 bno 를 입력받아서 해당 게시물을 읽어오기
	public void read() throws SQLException {
		System.out.println("[게시물 읽기]");
		System.out.println("bno: ");
		int bno = Integer.parseInt(scan.nextLine());
				
		try {
			
		String sql ="select bno, btitle, bcontent, bwriter, bdate from boards where bno = ?";
		pst = con.prepareStatement(sql);
		
		pst.setInt(1, bno);
		
		rs = pst.executeQuery();
		
		if(rs.next()) {
			board = new Board();
			board.setBno(rs.getInt("bno"));
			board.setBtitle(rs.getString("btitle"));
			board.setBcontent(rs.getString("bcontent"));
			board.setBwriter(rs.getString("bwriter"));
			board.setBdate(rs.getDate("bdate"));
			System.out.println("#######");
			System.out.println();
			System.out.println("번호: " + board.getBno());
			System.out.println("제목: " + board.getBtitle());
			System.out.println("내용: " + board.getBcontent());
			System.out.println("작성자: " + board.getBwriter());
			System.out.println("날자: " + board.getBdate());
			System.out.println("#######");
			rs.close();
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
			// 보조 메뉴 출력
			System.out.println("------------------------");
			System.out.println("버저 메뉴 : 1.Update | 2.Delete | 3.List");
			System.out.println("메뉴 선택: ");
			String menuNo = scan.nextLine();
			System.out.println();
			
			if(menuNo.equals("1")) {
				update(board);
			}else if(menuNo.equals("2")){
				delete(board);
			}else if(menuNo.equals("3")){
				list();

	}
		
	}

	
	public void read(int bno) throws SQLException {
		System.out.println("[게시물 읽기]");
		System.out.println("bno: ");
		bno = Integer.parseInt(scan.nextLine());
				
		try {
			
		String sql ="select bno, btitle, bcontent, bwriter, bdate from boards where bno = ?";
		pst = con.prepareStatement(sql);
		
		pst.setInt(1, bno);
		
		rs = pst.executeQuery();
		
		if(rs.next()) {
			board = new Board();
			board.setBno(rs.getInt("bno"));
			board.setBtitle(rs.getString("btitle"));
			board.setBcontent(rs.getString("bcontent"));
			board.setBwriter(rs.getString("bwriter"));
			board.setBdate(rs.getDate("bdate"));
			System.out.println("#######");
			System.out.println();
			System.out.println("번호: " + board.getBno());
			System.out.println("제목: " + board.getBtitle());
			System.out.println("내용: " + board.getBcontent());
			System.out.println("작성자: " + board.getBwriter());
			System.out.println("날자: " + board.getBdate());
			System.out.println("#######");
			rs.close();
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
			// 보조 메뉴 출력
			System.out.println("------------------------");
			System.out.println("버저 메뉴 : 1.Update | 2.Delete | 3.List");
			System.out.println("메뉴 선택: ");
			String menuNo = scan.nextLine();
			System.out.println();
			
			if(menuNo.equals("1")) {
				update(board);
			}else if(menuNo.equals("2")){
				delete(board);
			}else if(menuNo.equals("3")){
				list();

	}
		
	}

	
	
	
	
	
	
	public void delete(Board board) {
		
		try {
			String sql = "DELETE FROM boards where bno = ?";
			pst = con.prepareStatement(sql);
			pst.setInt(1, board.getBno());
			pst.executeUpdate();
			list();
			pst.close();
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		
}


	public void update(Board board) throws SQLException {
		// 수정 내용 입력 받기
		
		System.out.println("[수정 내용 입력]");
		System.out.print("제목: ");
		board.setBtitle(scan.next());
		System.out.println("내용: ");
		board.setBcontent(scan.next());
		System.out.println("작성자: ");
		board.setBwriter(scan.next());
		
		// 보조 메뉴 출력
		System.out.println("------------------------");
		System.out.println("버저 메뉴 : 1.Ok | 2.Cancel ");
		System.out.println("메뉴 선택: ");
		String menuNo = scan.next();
		if(menuNo.equals("1")) {
			// 게시물 정보 수정(update set ~~~)
			String sql = "UPDATE boards SET btitle = ?, bcontent = ?, bwriter = ? where bno = ?";
			pst = con.prepareStatement(sql);
			pst.setString(1, board.getBtitle());
			pst.setString(2, board.getBcontent());
			pst.setString(3, board.getBwriter());
			pst.setInt(4, board.getBno());
			
			pst.executeUpdate();
			list();
			
			pst.close();
			con.close();
			
			
		}else if(menuNo.equals("2")) {
			System.out.println("취소");
			
		}
		
		
	}/////////////////////////// update

	
	public void clear() {
		System.out.println("[게시물 전체 삭제]");
		System.out.println("---------------------------");
		System.out.println("보조 메뉴: 1.Ok | 2.Cannel");
		System.out.println("메뉴 선택: ");
		String menuNo = scan.next();
		if(menuNo.equals("1")) {
			try {
				String sql = "TRUNCATE TABLE boards";
				pst = con.prepareStatement(sql);
				pst.executeUpdate();
				list();
				pst.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void exit() {
		if(con != null) {
			try {
				con.close();
			}catch(SQLException e) {
				
			}
		}
		System.out.println("**게시판 종료**");
		System.exit(0);
	}//exit---------------------------------------------
	

	public static void main(String[] args) throws SQLException {
		DataModel dm = new DataModel();
		//dm.create();
		dm.list();
		dm.read(1);
		
	}
	
	
}
