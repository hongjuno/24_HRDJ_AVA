package day02;

public class RefType {

	public static void main(String[] args) {	//여기부터 스택에 쌓인다
		
		
		RefType ref = new RefType();		//ref는 스택에 쌓이며
											//RefType는 힙의주소에있다
		
		RefType ref2 = new RefType();		//ref와 ref2의 참조형 변수는 다르다 주소가 다르기 때문
											//ref와 ref2는 다른영역에 
											//새롭게 할당된 오브젝트라고 부른다
		
		if(ref == ref2) {
			System.out.println("동일한 주소를 갖는 객체이다");
		}else {
			System.out.println("서로 다른 주소를 갖는 객체이다.");
		}

		String name = new String("홍준오");
		System.out.println(name);
		
		String name2 = "오늘도 수고했어요";
		System.out.println(name2.length());	//문자의 개수 공백포함
		
		
		int[] score = new int [5];
		score[0] = 10;
		score[1] = 20;
		score[2] = 30;
		score[3] = 40;
		score[4] = 50;
		
		int sum = 0;
		for(int i=0; i<score.length; i++) {
			sum = sum + score[i];
		}
		System.out.println("총합 :" + sum);
		
		
		
	}

}
