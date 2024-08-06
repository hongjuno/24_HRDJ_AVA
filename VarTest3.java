package day01;

public class VarTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 숫자 연산
		int result1 = 10 + 2 + 8;
		System.out.println("restult1: " + result1);//20
		
		// 결합 연산
		int result2 = 10 + 2 + Integer.parseInt("8");
		System.out.println("restult2: " + result2);//20
		
		String result3 = 10 + "2" + 8;
		System.out.println("restult3: " + result3);//1028
		
		String result4 = "10" + 2 + 8;
		System.out.println("restult4: " + result4);//1010
		
		String result5 = "10" + (2 + 8);
		System.out.println("restult5: " + result5);//1010
		
		 
	}

}
