package day01;

public class VarTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 실행문은 변수 선언, 변수값 저장, 메소드 호출에 해당하는 코드
		
		// 1. 정수 변수
		// 정수 int 4byte
		int x;						// 변수 x 선언
		// 변수 초기화
		x = 1;						// 변수 x에 1 값을 저장
		int y = 2;					// 변수 y를 선언하고 2 값을 저장
		int result = x + y;			// 변수 result를 선언하고 변수 x와 y를 더한 값을 저장
		System.out.println(result); // 콘솔에 변수의 값을 출력하는 println() 메소드 호출
		// 변수는 문자만 가능, _만 가능
		// sysout ctrl + space + enter  = System.out.println()
		
		
		// 2. 실수 변수
		// 실수 float 4byte, double 8byte
		double height = 155.7;
		float weight = 45.5f; 
		
		System.out.println("키 : "+height+"\n몸무게 : "+weight);//변수와 문자열 사이에는 연결이 필요 
		
		
		// 3. 문자형 변수
		// char 
		
		char blood = 'A';	//문자는 ''
		System.out.println("혈액형 : "+blood+"형");
		
		
		// 4. 문자열 변수
		// String
		
		String name = "홍준오";
		System.out.println("이름 : "+name);
		

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
