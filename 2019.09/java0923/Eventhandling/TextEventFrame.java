package Eventhandling;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class TextEventFrame extends Frame {
	
	//윈도우에 놓일 컴포넌트 변수
	TextField tf;
	Button btn;
	
	public TextEventFrame() {
		//배치방법선택
		setLayout(new FlowLayout());
		
		//컴포넌트들을 만들어서 배치
		tf = new TextField(20);
		add(tf);
		
		//텍스트 필드의 입력이 변경될 때 이벤트를 처리하는 리스너 생성
		tf.addTextListener(new TextListener() {
			@Override
			public void textValueChanged(TextEvent e) {
				
				//글자 뒤에 공백을 입력하지 못함
				String k = tf.getText();
				if(k.charAt(k.length()-1) == ' ') {
					String x = "";
					for(int i=0; i<k.length()-1; i=i+1) {
						x = x+k.charAt(i);
					}
					tf.setText(x);
				}
				//System.out.printf("%s\n", tf.getText());
				//영문 대소문자, 숫자, 기카문자의 개수를 저장할 변수
				int dae = 0;
				int so = 0;
				int su = 0;
				int etc = 0;
				
				//입력된 문자열과 글자 수 가져오기
				String input = tf.getText();
				int len = input.length();
				//문자열의 첫글자부터 마지막 글자까지를 ch에 저장
				for(int i=0; i<len; i=i+1) {
					char ch = input.charAt(i);
					if(ch >='A' && ch <='Z') {
						dae = dae + 1;
					}else if(ch >= 'a' &&ch<='z') {
						so = so + 1;
					}else if(ch >= '0' && ch<='9') {
						su = su + 1;
					}else {
						etc = etc + 1;
					}
				}
				//dea, so, su, etc가 모두 0보다 크다면 녹색
				if(dae>0 && so>0 && su>0 & etc>0) {
					setBackground(Color.GREEN);
				}else {  //아니면 빨간색
					setBackground(Color.red);
				}
			}
		});
		
		btn = new Button("확인");
		add(btn);
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String input = tf.getText();
				//좌우 공백을 제거하고 모두 대문자로 변경
				String result = input.trim().toUpperCase();
				System.out.printf("%s\n", result);
			}
		});
		
		
		setBounds(100,100, 300,300);
		setTitle("텍스트 이벤트 처리");
		setVisible(true);
		
	}
}
