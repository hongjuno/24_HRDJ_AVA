package day03;
import java.util.Scanner;

public class Score1 {

	public static void main(String[] args) {
		
		int [] scores = null;
		
		int studentNum=0;
		
		int maxScores = 0;
		double avgScore = 0.0;
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
		System.out.println("----------------------------");
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석| 5.종료");
		System.out.println("----------------------------");
		
		System.out.println("선택 > ");
		
		
		
		int num = Integer.parseInt(scan.nextLine());	// 한줄을 짤라 숫자를 넣어라
		
		if(num == 1) {
			System.out.println("학생수> ");
			studentNum = Integer.parseInt(scan.nextLine());
			scores = new int[studentNum];
			
		}else if(num == 2) {
			for(int i = 0 ;i< scores.length; i++) {
				System.out.println("scores[" + i + "]");
				scores[i] = Integer.parseInt(scan.nextLine());
			}
		}else if(num == 3) {
			for(int i = 0; i<scores.length;i++) {
				System.out.println("scores [" + i + "] : " + scores[i]);
			}
		}else if(num == 4) {
			maxScores = scores[0];
			for(int i = 0; i<scores.length; i++) {
				if(scores[i]>maxScores) {
					maxScores = scores[i];
			}
				sum = sum + scores[i];
				
				avgScore = sum/scores.length;
				
		}
			System.out.println("최고 점수 : " + maxScores);
			System.out.println("평균 점수 : " + avgScore);
			
		}else if(num == 5) {
			System.out.println("프로그램 종료");
		}
		
		
		
		
		}
		
	}

}
