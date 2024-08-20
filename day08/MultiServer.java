package day08;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MultiServer {
		
	ServerSocket ser;
	// 전체 크라이언트 즈 소켓객체를 담을 자료 구조 ArrayList 선언
	public ArrayList<MultiServerRunnable> arrlist;
	MultiServerRunnable mr;
	Socket socket;
	
	
	// 생성자
	public MultiServer() {
		try {
			ser = new ServerSocket(9999);
			arrlist = new ArrayList<MultiServerRunnable> ();
			System.out.println("서버 대기중");
			
			while(true) {
				socket = ser.accept();
				System.out.println("연결 성공");
				mr= new MultiServerRunnable(socket);
				arrlist.add(mr);
				Thread thread = new Thread(mr);
				thread.start();
			}
			
			
		}catch(Exception e) {
			
		}
	}
	
	
	public static void main(String[] args) {

		new MultiServer();

	}
	class MultiServerRunnable implements Runnable{
		Socket sock;
		DataInputStream dis;
		DataOutputStream dos;
		
		
		// 인자 생성자(매개변수로 메세지 처리를 위한 소켓 객체를 전달받는다.)
		public MultiServerRunnable(Socket sock) {
			this.sock = sock;
		}
		
		// arrlist에 있는 객체들에게 동시에 메세지 출력하는 메소드
		public void broadCasting(String msg) throws IOException{
			for(MultiServerRunnable mr: arrlist) {
				if(mr!=this) {
					
					System.out.println("Message:" + msg.toString());
					mr.send(msg);
				}
			}
		}
		
		public void send(String msg) throws IOException{
			System.out.println("send[Message]:" + msg);
			dos.writeUTF(msg);
			dos.flush();
		}

		@Override
		public synchronized void run() {
			boolean flag = false;
			// 서버소켓을 연결하고, 상대방 메세지 읽어와서 출력하기
			try {
				dis = new DataInputStream(sock.getInputStream());
				dos = new DataOutputStream(sock.getOutputStream());
				while(!flag) {
					String msg = dis.readUTF().toString();
					System.out.println("Message: " + msg);
					
					this.broadCasting(msg);
					
						
							
				}
				
			}catch(Exception e){
				
			}
			
			
		}
		
		
	}
}

// 클라이언트의 메세지 처리를 담당하는 스레드 구현 객체










