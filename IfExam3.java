package day02;
import java.util.Scanner;

public class IfExam3 {

	public static void main(String[] args) {

	
	
	Scanner scan = new Scanner(System.in);
	System.out.println("## 로그인(admin 혹은 임의 아이디) ##");
	System.out.println("# 로그인 아이디 : ");
	
	
	String user = scan.next();
	
	System.out.println(user + "로그인!!");
	System.out.println("## 메뉴를 선택 하세요(1~2)##");
	System.out.println("# 메뉴 선택 :");
	
	int memu = scan.nextInt();
	
	if(memu == 1) {
		System.out.println(user + " 1번 선택함 !!");
	}else  {
		System.out.println(user + " 2번 선택함 !!");
	}
		
		
	}

}
