package day05;
import java.awt.*;

class Button{
	// 중첩 인터페이스 
	public static interface ClickListener{
		// 추상 메소드
		void onClick();
	}
	// 필드
	private ClickListener clickListener;
	
	// 메소드
	public void setClickListener(ClickListener clistener) {
		this.clickListener = clistener;
	}
	public void onClick() {
		this.clickListener.onClick();
	}
}




public class ButtonExample {

	public static void main(String[] args) {
		// Ok 버튼 객체 생성
		Button okBtn = new Button();
		
		// 로컬 클래스
		class OkListener implements Button.ClickListener{

			@Override
			public void onClick() {
				System.out.println("OK 버튼을 클릭했습니다");
				
			}
			
		}
	
		okBtn.setClickListener(new OkListener());
		okBtn.onClick();
		
	}
}
