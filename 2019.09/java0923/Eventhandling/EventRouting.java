package Eventhandling;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventRouting extends Frame {
	Button blueBtn, greenBtn;
	
	public EventRouting() {
		setLayout(new FlowLayout());
		
		blueBtn = new Button("파랑색");
		greenBtn = new Button("초록색");
		
		add(blueBtn);
		add(greenBtn);
		
		//버튼 2개의 이벤트 처리를 2개의 객체를 생성해서 처리
		blueBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.BLUE);
			}
		});
		
		greenBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.green);
			}
		});
		
		
		setBounds(100,100,300,300);
		setTitle("이벤트 라우팅");
		setVisible(true);
		
	}
}
