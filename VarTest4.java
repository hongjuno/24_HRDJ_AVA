package day01;
import java.util.Scanner;
public class VarTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		// 참조형 변수
		Scanner scan = new Scanner(System.in);	
		
		
		
		int x;						
		System.out.println("첫번째 정수 입력 : ");
		x= scan.nextInt();
		
		int y;					
		System.out.println("두번째 정수 입력 : ");
		y= scan.nextInt();
		
		int result = x + y;			
		System.out.println(result); 
	
		
		
		double height ;
		System.out.println("키를 입력해주세요 : ");
		height = scan.nextDouble();
		
		float weight = 45.5f; 
		System.out.println("몸무게를 입력해주세요 : ");
		weight = scan.nextFloat();
		
		System.out.println("키 : "+height+"\n몸무게 : "+weight);//변수와 문자열 사이에는 연결이 필요 
		
		
	
		// char 
		
		char blood = 'A';	//문자는 ''
		System.out.println("혈액형 : "+blood+"형");
		
		
		
		// String
		String name ;
		System.out.println("이름을 입력해주세요 :  ");
		name = scan.next();
		

		// 5. 놀리형 변수
		// boolean형
		boolean stop = true;
		
		if (stop == true) {
			System.out.println("중지합니다.");
		}else {
			System.out.println("시작합니다.");
		}
			
		
	}

}
