package day04;

public class Person {
	
	// 객체 모델링 (클래스 멤버)
	
	// 속성 : has -a  (클래스(Person) has a ~ 뒤에가 어색하면 속성이 잘못된 것)
	int age;
	String name;
	char gender;
	String tel;
	
	// 기본 생성자
	public Person() {
		
	}
	
	// 메소드 getInfo()
	void getInfo() {
		System.out.println(name + "님 정보----");
		System.out.println("나이 : " + this.age);
		System.out.println("성별 : " + this.gender);
		System.out.println("전화번호 : " + this.tel);
	}
	
	
	
	
	// 메소드
	void 웃다() {
		System.out.println("웃는다.");
	}
	void 먹다() {
		System.out.println("먹는다.");
	}
	
	
	
	
}
