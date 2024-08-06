package day01;
import java.util.Scanner;
/*
 * 	4칙연산과 나머지 연산을 하는 간단한 계산기 예제
 */

public class VarTest6 {

	public static void main(String[] args) {
		
		// 1. 4칙 연산을 입력 받아 저장하는 변수 선언
		String opp;
		// 2. 2개 정수 입력 받아 저장하는 변수 선언
		int x, y;
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 x 값을 일력해주세요 ");
		x = scan.nextInt();
		System.out.println("정수 y 값을 입력해주세요 ");
		y = scan.nextInt();
		
		// 3. "+" 덧셈, "-" 뺏셈, "*" 곱셈, "/" 나눗셈, "%"나머지 연산
		System.out.println("다음 연산자중 하나를 입력하세요(+, -, *, /, &): ");
		opp = scan.next();
		
		
		// 결과 출력하기
		int result = 0;
		
		if(opp.equals("+")) {
			result = x + y;
		}else if(opp.equals("-")) {
			result = x - y;
		}else if(opp.equals("*")) {
			result = x * y;
		}else if(opp.equals("/")) {
			result = x / y;
		}else if(opp.equals("&")) {
			result = x & y;
		}
		System.out.println(result);

	}

}
