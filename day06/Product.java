package day06;

public abstract class Product {
		public String pname;
		int price;
		
		public void printDetall() {	// 템플릿 메소드 패턴
			System.out.println("상품명: " + pname + ",");
			System.out.println("가격: " + price + ",");
			printExtra();
		}
		// 추상 메소드
		public abstract void printExtra();
		
}
