package day04;
import java.util.ArrayList;

public class Main {

	// 클래스 구성 요소
	// 필드 : 객체의 데이터를 저장하는 역할을 한다.
	
	// 생성자 : 기본 생성자, 인자 생성자 
	
	//메소드 : 
	
	
	
	public static void main(String[] args) {
		House house1 = new House("홍준오", 3, "대전 동구 용운동");
		
		house1.showOwner(house1.ownerName);
		System.out.println("방의 객수: " + house1.getRoomNum());
		System.out.println("집의 정보1:" + house1.sowInfo() );
		house1.sowInfo2();
		
		ArrayList<House> arrList = new ArrayList<House>();
		arrList.add(house1);
		arrList.add(new House("강길동", 2, "대전 서구 길마동"));
		arrList.add(new House("이자바", 4, "대전 중구 대흥동"));
	
		for(House house:arrList) {
			house.sowInfo2();
		}
		
		
	}

}
	// 집클래스 모델링
	
	// 추상화
	class House{
		String ownerName;
		int roomNum;
		String address;
		
		public House() {	// 인자 생성자 만들더라도 기본 생성자는 만드는게 좋다 
			
		}
		 
		// 인자 생성자 
		public House(String ownerName, int roomNum, String address){
			this.ownerName = ownerName;
			this.roomNum = roomNum;
			this.address = address;
			
		}
		
			
		// 1. 반환없고, (주인 이름을 매개변수로 전달 받아 이름)을 같이
		// 출력하는 메소드 showOwner() 정의
		void showOwner(String Name) {
			System.out.println("현재 전달받은 주인 이름은 " + Name + "입니다");
		}
		 
		// 2. 방의 갯수를 반환하는 getRoomNum() 메소드 정의
		int getRoomNum() {
			return roomNum;
		}
		
		 
		// 3. 모든 멤버 변수의 값을 반환하는 showInfo()메소드 정의
		String sowInfo() {
			String result = "집 주인 이름 : " + ownerName + "\n방의 갯수 : "+ roomNum 			+"집 주소 : "+ address;
			return result;
		}
		
		String sowInfo2() {
			String result = "집 주인 이름 : " + ownerName + "\n방의 갯수 : "+ roomNum 			+"집 주소 : "+ address;
			return result;
		}
	}
	
	
	























