package day03;

public class CarExample {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.color = "노랑";
		myCar.company = "현대";
		myCar.model = "제니시스";
		myCar.maxSpeed = 200;
		
		// 메소드 호출
		myCar.CarInfo();
		
		Car myCar2 = new Car("기아", "k7", "검정", 200);
		
		myCar2.CarInfo();
		

	}

}
