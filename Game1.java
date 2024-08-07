package day02;

public class Game1 {

	public static void main(String[] args) {
		// continue문 : 369 게임하기
		// 1부터 10까지의 정수 출력 중 3,6,9 일 때 박수 소리를 출력하는 프로그램 작성하기
		//----------------------------
		// 실행결과
		//-------------------------
		//1 2 짝 4 5 짝
		
		for(int i = 1; i<=10; i++) {
			if(i%3==0) {
				System.out.println("짝");
			}else {
				System.out.println();
			}
		}
		
	}

}
