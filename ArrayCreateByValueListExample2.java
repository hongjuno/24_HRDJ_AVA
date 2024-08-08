package day03;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		
		// 2차원 배열
		int[][] scores = {
				{80, 90, 96}, {76,88}
		};
		
		// 배열의 길이
		System.out.println("1차원 배열 길이(반의 수):" + scores.length);
		System.out.println("2차원 배열 길이(첫 번째 반의 학생 수):" + scores[0].length);
		System.out.println("2차원 배열 길이(두 번째 반의 학생 수):" + scores[1].length);
		
		
		
		// 첫번째 반 평균 점수 구하기
		int classSum = 0;
		for(int i = 0; i<scores[0].length;i++) {
			//classSum = classSum + scores[0][i];
			classSum += scores[0][i];
		}
		double classAvg = (double) classSum/ scores[0].length;
		System.out.println("첫 번째 반의 평균 점수: " + classAvg);
		
		// 두번째 반 평균 점수 구하기
		int class2Sum = 0;
		for(int i = 0; i<scores[1].length;i++) {
			class2Sum += scores[1][i];
		}
		double class2Avg = (double) classSum/ scores[1].length;
		System.out.println("두 번째 반의 평균 점수: " + class2Avg);
		
		
		// 전체 학생의 평균 점수 구하기
		int totalstudent = 0;
		int totalsum = 0;
		for(int i = 0; i < scores.length; i++) {
			totalstudent += scores[i].length;
			for(int j = 0; j<scores[i].length; j++) {
				totalsum += scores[i][j];
			}
		}
		
		double totalAvg = (double) totalsum / totalstudent;
		System.out.println("전체 학생의 평균 점수: " + totalAvg);
	}

}
