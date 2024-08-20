package day10;
import java.sql.SQLException;
import java.util.Scanner;


public class BoardExample {
	Scanner scan = new Scanner(System.in);
	DataModel dm = null;
	
	
	public BoardExample() {
		dm = new DataModel();
		
	}
	
	
	
	
	public void mainMenu() throws SQLException {
		System.out.println();
		System.out.println("---------------");
		System.out.println("메인 메뉴 : 1. Create | 2. Read | 3. Clear | 4. Exit");
		System.out.println("메뉴 선택");
		String menuNo = scan.nextLine();
		System.out.println();
		
		
		switch(menuNo) {
		case "1" :
			dm.create();
			break;
		case "2" :
			dm.read();
			break;
		case "3" :
			dm.clear();
			break;
		case "4" :
			dm.exit();
			break;
	}
}
	
	
	public static void main(String[] args) throws SQLException {
		BoardExample boardExample = new BoardExample();
		boardExample.mainMenu();
		

	}

}
