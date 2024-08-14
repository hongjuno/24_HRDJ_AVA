package day07;
import java.io.IOException;
import java.net.InetAddress;




public class InetAddressExample {

	public static void main(String[] args) {

		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 ip주소: " + local);
			
			InetAddress[] locals = InetAddress.getAllByName("www.naver.com");
			for(InetAddress in: locals) {
				System.out.println("www.naver.com IP 주소 :" + in.getHostAddress());
			}
			
		}catch(IOException e) {
			
		}
		
		

	}

}
