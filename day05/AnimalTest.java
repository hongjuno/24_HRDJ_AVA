package day05;

interface Soundable{
	//추상 메소드
	public String sound();
}



public class AnimalTest {
	
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	

	
	public static void main(String[] args) {
		
		printSound(new Dog());
		printSound(new Cat());
		
//		
//		Animal animal = new Dog();	 //자식클래스 타입
//		animal.sound();
	}
}

abstract class Animal{
	// 추상 클래스.. 적어도 한개 이상의 추상 메소들르 갖는 클래스
	// 추상 메소드: 바디가 없는 메소드
	
	abstract void sound();
}

class Dog implements Soundable{
	
	@Override
	public String sound() {
		return "멍멍";
		
	}
	
}
class Cat implements Soundable {
	
	@Override
	public String sound() {
		return "야용";
		
	}
	

//class Dog extends Animal{
//	
//	@Override
//	void sound() {
//		System.out.println("멍멍 소리낸다.");
//		
//	}
//	
//}
//class Cat extends Animal {
//	
//	@Override
//	void sound() {
//		System.out.println("야옹 소리낸다.");
//		
//	}
//	
}
