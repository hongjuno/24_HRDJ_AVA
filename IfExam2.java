package day02;
import java.util.Scanner;

public class IfExam2 {

	public static void main(String[] args) {

	int memu;
	
	Scanner scan = new Scanner(System.in);
	System.out.println("## 메뉴 선택 ##");
	System.out.println(" [1] 구매자  [2] 판매자 ");
	System.out.println("## 메뉴를 선택 하세요 ->");
	
	
	memu = scan.nextInt();
	
	
	
	if(memu == 1) {
		System.out.println("구매자로 로그인하셨습니다."); 
	}else {
		System.out.println("판매자로 로그인하셨습니다.");
	}
		
		
		
		
		
	}

}
