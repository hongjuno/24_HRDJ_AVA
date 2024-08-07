package day02;
import java.util.Random;
import java.util.Scanner;

public class RandomExam2 {

	public static void main(String[] args) {
		// 가위 바위 보 게임 만들기
		// 1~3까지의 난수를 생성하여 1:가위 2: 바위 3: 보
		// 컴퓨터와 유저간 게임을 하여 승 패를 출력하시오
		// 변수, 자료형, 조건문, 반복문, Scanner, Random 클래스 사용하기
		
		Scanner scan = new Scanner(System.in);
		
		Random random = new Random();
		while(true) {
		System.out.println("1:가위 2: 바위 3: 보 입니다");
		System.out.println("다른 숫자를 입력 시 프로그램이 종료됩니다.");
		System.out.println("입력하세요 : ");
		
		int me = scan.nextInt();		//유저
		int com = random.nextInt(3)+1;	//컴퓨터
		
		System.out.println("사용자측 : " + me);
		System.out.println("컴퓨터측 : " + com);
		
		if((me !=1)&&(me !=2)&(me !=3)) 
			break;
	
		
		if((me !=1)&&(me !=2)&(me !=3)) System.exit(0);	//프로그램 정상 종료
		
		
		if(me == com) {
			System.out.println("무승부 입니다.");
		}else if((me == 1) && (com== 3) || (me == 2) && (com == 1) || (me == 3) && (
				com == 2)){
			System.out.println("유저 승");
		} else {
			System.out.println("컴퓨터 승");
		}
		
		
		}
		System.out.println("프로그램이 종료됩니다");
	}

}
