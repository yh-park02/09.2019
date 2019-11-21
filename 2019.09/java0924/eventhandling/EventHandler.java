package eventhandling;

import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//인터페이스는 여러 개 구현이 가능하다.
public class EventHandler extends WindowAdapter implements KeyListener {
	
	//KeyFrame의 Label에 대한 참조를 저장할 변수
	Label lbl;
	
	//레이블을 주입받기 위한 생성자
	public EventHandler(Label lbl) {
		//입력하지 않아도 첫번째 줄은 super()
		//상위 클래스의 매개변수가 없는 생성자를 호출하는 구문
		super();
		this.lbl = lbl;
	}


	@Override
	public void windowOpened(WindowEvent e) {
		//윈도우가 열릴때 
	}

	@Override
	public void windowClosing(WindowEvent e) {
		//닫기 버튼을 눌렀을 때 호출되는 메소드
		//프로그램 종료
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		//종료가 될 때 
	}

	@Override
	public void windowIconified(WindowEvent e) {
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
			
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
			
	}

	@Override
	public void keyPressed(KeyEvent e) {
			//lbl의 좌표 가져오기
		int x = lbl.getX();
		int y = lbl.getY();
		//방향키를 누르면 
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			x = x - 5;
		}else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			x = x + 5;
		}else if(e.getKeyCode() == KeyEvent.VK_UP) {
			y = y - 5;
		}else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			y = y + 5;
		}
		System.out.printf("조합키:%d\n", e.getModifiers());
		System.out.printf("누른문자:%c\n", e.getKeyChar());
		System.out.printf("누른 키보드 코드:%d\n", e.getKeyCode());
		//CTRL + X를 누르면 프로그램 종료하는 단축키 생성
		if(e.getModifiers() == 2 && e.getKeyCode() == 88) {
			System.exit(0);
		}
		
		lbl.setLocation(x,y);
		}
		
	@Override
	public void keyReleased(KeyEvent e) {
		
	}

}
