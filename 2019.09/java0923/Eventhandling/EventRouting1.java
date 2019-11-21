package Eventhandling;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventRouting1 extends Frame {
	Button blueBtn, greenBtn;
	
	public EventRouting1() {
		setLayout(new FlowLayout());
		
		blueBtn = new Button("파랑색");
		greenBtn = new Button("초록색");
		
		add(blueBtn);
		add(greenBtn);
		
		//이벤트 처리 객체를 생성
		ActionListener listener = new ActionListener() {

			@Override
			//이벤트가 발생한 객체 - e.getSource()
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()== blueBtn) {
					setBackground(Color.BLUE);
				}else if(e.getSource() == greenBtn) {
					setBackground(Color.GREEN);
				}
			}	
		};
		//2개 버튼의 액션이벤트 처리를 동일한 객체에게 위임 - 이벤트 라우팅(Event Routing) 
		blueBtn.addActionListener(listener);
		greenBtn.addActionListener(listener);
		
		setBounds(100,100,300,300);
		setTitle("이벤트 라우팅");
		setVisible(true);
	}
}