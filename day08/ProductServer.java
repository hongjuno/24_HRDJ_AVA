package day08;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.json.JSONObject;
 

class Product{
	
}

public class ProductServer {

	private ServerSocket serverSocket;
	private ExecutorService threadPool;
	private List<Product> products;
	
	
	public void start() throws IOException{
		serverSocket = new ServerSocket(50001);
		threadPool = Executors.newFixedThreadPool(100);
		products = new Vector<Product>();
		System.out.println("[서버] 시작됨");
		
		while(true) {
			// 연결 수락
			Socket socket = serverSocket.accept();
			// 요청 처리용 SocketClient 생성
			SocketClient sc = new SocketClient(socket);
		}
	}// start()-------------------------
	
	
	
	
	// 메소드: 서버 종료
	public void stop() {
		try {
			serverSocket.close();
			threadPool.shutdownNow();
			System.out.println("[서버] 종료됨");
		}catch(IOException e) {
			
		}
	}// stop()------------------
	
	
	
	
	
	// 중첩 클래스로 정의하기
	class SocketClient{
		Socket socket;
		DataInputStream dis;
		DataOutputStream dos;
		
		public SocketClient(Socket socket) throws IOException{
			this.socket = socket;
			this.dis = new DataInputStream(socket.getInputStream());
			this.dos = new DataOutputStream(socket.getOutputStream());
			recevie();
			
		}//SocketClient()----------------------
		
		// 용청 받기
		private void recevie() throws IOException{
			while(true) {
				String msg= dis.readUTF();
				JSONObject request = new JSONObject();
				
				int memu = request.getInt("memu");
				
				Scanner scanner = new Scanner(System.in);
				
				String menuno = scanner.nextLine(); 
				
				switch(menuno) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				}
				
			}
			
			
			
		}// recevie()-----------------------------
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
