package day02;
import java.util.Scanner;

public class WhileExam4 {

	public static void main(String[] args) {
		
		String i;
		
		Scanner scan = new Scanner(System.in);
		
			
		System.out.println("메시지를 입력하세요");
		
		do {
				System.out.println(">");
				i = scan.next();
				System.out.println(i);
				
			}while(! i.equals("q"));
			System.out.println("프로그램 종료");
		}
			
				
		}

	


