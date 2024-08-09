package day04;
import java.util.Scanner;
import static java.lang.System.out;
import java.util.ArrayList;

public class JobApp {
	
	static Person p2 = new Person();

	static ArrayList<Person> arrylist = new ArrayList<Person>();
	
	// 필드, 생성자, 메소드
	public void showMenu() {
		System.out.println("******JOB v1.1*****");
		System.out.println("1. 구직 등록");
		System.out.println("2. 구인 등록");
		System.out.println("3. 구직자 정보 출력");
		System.out.println("4. 구인회사 정보 출력");
		System.out.println("5. 종료");
		System.out.println("******************");
		System.out.println("메뉴 번호를 입력하세요 =>");
		System.out.println("******************");
	}// showMenu()-----------
	
	public void inputPerson() {
		// 이름, 나이 성별, 전화번호를 입력받아
		// Person 객체에 저장
		Scanner scan = new Scanner(System.in);
		//p2 = new Person();
		System.out.println("-- 구직 등록 start --");
		System.out.println("이름 입력=>");
		String nm = scan.next();
		p2.name = nm;
		
		out.println("나이 입력=> ");
		int a= scan.nextInt();
		p2.age= a;
		
		System.out.println("-- 성별 메뉴 --");
		System.out.println("1.남자 2.여자");
		System.out.println("------------");
		System.out.println("성별 메뉴번호 입력");
		int s = scan.nextInt();
		if(s == 1)
			p2.gender = 'M';
		else if(s == 2)
			p2.gender = 'F';
		else
			System.out.println("지원되지 않는 메뉴 입니다");
		
		System.out.println("전화번호 입력=>");
		String t = scan.next();
		p2.tel = t;
		
		arrylist.add(p2);
		
		
	}
	
	// 구직자 정보 출력 메소드
	void showInfo() {
		for(Person p : arrylist) {
			p.getInfo();
		}
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		JobApp ja = new JobApp();
		
		while(true) {
			ja.showMenu();
			int no=scan.nextInt();
			if(no == 5) {
				System.exit(0);	//프로그램 종료
			}else if(no == 1) {
				ja.inputPerson();
			// 인적 정보를 입력받는 모듈
			}else if(no == 3) {
				ja.showInfo();
			}
		}

	
		
		
	}

}
