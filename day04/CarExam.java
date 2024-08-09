package day04;

public class CarExam {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		Car myCar = new Car();
		
		myCar.tire = new Tire();
		myCar.run();
		
		myCar.tire = new HankookTire();
		myCar.run();
		
		myCar.tire = new KumhoTire();
		myCar.run();
		
		
		
		car.setSpeed(100);
		car.setStop(false);
		
		System.out.println(car.getSpeed());
		System.out.println(car.getStop());
		
		
	}

}

class Car{
	// 캡슐화(정보 은닉)
	private int speed;
	private boolean stop;
	
	Tire tire;
	
	public void run() {
		tire.roll();
	}
	
	// setter 메소드 정의(필드 값 변경하는 메소드) - 반환없다
	public void setSpeed(int speed) {
		this.speed =  speed;
	}
		
	public void setStop(boolean stop) {
		this.stop = stop;
	}
		
	// Getter 메소드 정의(필드 값 변경하는 메소드)
	public int getSpeed() {
		return speed;
	}
	
	public boolean getStop() {
		return stop;
	}
	
	
	
	
	
	
}
