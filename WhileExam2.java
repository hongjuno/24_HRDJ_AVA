package day02;

public class WhileExam2 {

	public static void main(String[] args) {
		
		int i=20;
		
		while(i>0) {
			System.out.println(i--);
			if(i==3) {
				System.out.println("i=3 종료");
				break;
			}
		}
			
		
		}

	}


