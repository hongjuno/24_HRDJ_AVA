package day02;

public class WhileExam1 {

	public static void main(String[] args) {
		// for(초기식; 조건식; 증감식){ 반복 수행문 }
		// 1에서 100까지 짝수들의 합을 총합을 계산하여 출력하시오
		int i=0 , sum =0;
		
		while(i<=100) {	//조건식
			if(i % 2 == 0) {	//실행문 
				sum = sum + i;
			}
			i++;	//증감식
		}
		System.out.println("1에서 100까지 짝수들의 합 : " + sum);
		}

	}


