package day02;

public class ConExam1 {

	public static void main(String[] args) {
		
		int i = 1;
		while(i<=10) {
			++i;
			if(i % 2 != 0) {
				continue;
			}
			System.out.println(i + " ");
		}

	}

}
