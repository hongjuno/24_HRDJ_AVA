package day02;
import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {

	int jumsu;
	
	Scanner scan = new Scanner(System.in);
	System.out.println("점수를 입력하세요 : ");
	
	jumsu = scan.nextInt();
	
	
	
	if(jumsu >=90) {
		System.out.println("A학점입니다"); 
	}else if(jumsu >= 80){
		System.out.println("B학점입니다");
	}else if(jumsu >= 70){
		System.out.println("C학점입니다");
	}else if(jumsu >= 60){
		System.out.println("D학점입니다");
	}else {
		System.out.println("F학점입니다");
	}
		
		
		
		
		
	}

}
