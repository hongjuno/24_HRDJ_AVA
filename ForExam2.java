package day02;

public class ForExam2 {

	public static void main(String[] args) {
		// for(초기식; 조건식; 증감식){ 반복 수행문 }
		// 1에서 100까지 짝수들의 합을 총합을 계산하여 출력하시오
		int i, sum =0;
		
		for(i=0; i<=100; i++) {
			if(i % 2 == 0) {
				sum = sum+i;
			}
			
			}
		System.out.println("1에서 100까지 짝수들의 합 :" + sum);
		}

	}


