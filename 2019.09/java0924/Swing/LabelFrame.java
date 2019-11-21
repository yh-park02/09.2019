package Swing;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelFrame extends JFrame {
	JLabel lbl;
	ImageIcon [] images;
	public LabelFrame() {
		setLayout(new FlowLayout());
		//ImageIcon 배열 만들기 
		images = new ImageIcon[3];
		images[0] = new ImageIcon("./h1.png");
		images[1] = new ImageIcon("./h2.png");
		images[2] = new ImageIcon("./h3.png");
		
		//현재 디렉토리 경로를 확인
		String curDir = System.getProperty("user.dir");
		System.out.printf("%s\n", curDir);
		
		
		//절대 경로를 이용해서 ImageIcon을 생성
		//Windows의 절대 경로는 디렉토리 기호가 \\
		//ImageIcon icon = new ImageIcon("/Users/tjoeun-304/Desktop/3.png"); 
		
		//상대경로 
		//ImageIcon icon = new ImageIcon("./3.png");
		
		
		
		//이미지 아이콘을 이용해서 레이블을 생성 
		lbl = new JLabel(images[0]);
		add(lbl);
		Thread th = new Thread() {
			int idx =0;
			public void run() {
			while(true) {
				try {
					idx = idx +1;
					Thread.sleep(100);
					lbl.setIcon(images[idx%images.length]);
				}
				catch(Exception e) {}
			}
		}
		};
		th.start();
		
		//닫기 버튼을 누를 때 종료 기능을 수행하도록 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		this.setBounds(100, 100, 300, 300);
		this.setTitle("레이블 애니메이션");
		this.setVisible(true);
	}

}
