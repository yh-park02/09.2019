package layout;

import java.awt.Button;
import java.awt.Frame;
import java.util.Random;

public class NullLayoutFrame extends Frame {
	
	Button btn;
	int x = 20;
	int y =30;
	
	public NullLayoutFrame() {
		//레이아웃을 null로 설정 
		setLayout(null);
		
		btn = new Button("버튼");
		//Layout이 null일 때는 위치와 크기를 직접 설정
		btn.setBounds(x, y, 30, 30);
		add(btn);
		
		
		setTitle("Null 레이아웃");
		setBounds(100,100,500,500);
		setVisible(true);
		
		//스레드를 만들고 실행 
		Thread th = new Thread() {
			boolean flag = false;
			public void run() {
				while(true) {
					try {
						Thread.sleep(100);
						Random r = new Random();
						x = r.nextInt(450);
						y = r.nextInt(450);
						btn.setLocation(x, y);
						btn.setVisible(flag);
						flag = !flag;
						
					}catch(Exception e) {
		
					}
				}
			}
		};
		th.start();
		
	/*	
		Thread th = new Thread() {
			public void run() {
				while(true) {
					try {
						Thread.sleep(100);
						x = x+10;
						btn.setLocation(x, y);
						if(x == 460) {
							btn.setLabel("골인");
							break;
						}
					}catch(Exception e) {
		
					}
				}
			}
		};
		th.start();
	*/
		
		
		
		
		
	}
}
