package java0920.awt;

import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.TextArea;
import java.awt.TextField;
import java.util.ArrayList;

public class ListFrame extends Frame {
	//레이블 1개와 List 1개를 배치
	Label lbl;
	List list;
	
	//List에 출력할 데이터
	ArrayList<String> data;
	
	//한 줄의 문자열과 여러 줄의 문자열을 입력받는 컴포넌트
	TextField tf;
	TextArea ta;
	
	public ListFrame() {
		lbl = new Label("프로그래밍 언어");
		//list에 출력할 데이터 생성
		data = new ArrayList<>();
		data.add("C&C++");
		data.add("Python");
		data.add("Java");
		data.add("C#");
		data.add("Kotlin");
		data.add("Swift");
		data.add("JavaScript");
		data.add("Go");
		data.add("R");
		data.add("Scala");
		data.add("Haskel");
		
		//화면에 4개의 항목을 출력하고 여러 개 선택이 가능하도록 생성
		list = new List(4, true);
		
		for(String lang : data) {
			list.add(lang);
		}
		
		tf = new TextField(30);
		//입력할 때 *로 출력
		tf.setEchoChar('*');
		
		ta = new TextArea(10, 50);
		
		//스크롤 바를 만들어서 자신 큰 영역을 스크롤을 이용해서
		//출력할 수 있도록 해주는 컴포넌트
		ScrollPane sp = new ScrollPane();
		sp.add(ta);
		
		//컴포넌트들을 모아서 출력할 Panel 생성
		Panel p = new Panel();
		p.add(lbl);
		p.add(list);
		p.add(tf);
		p.add(sp);
		
		//프레임에 패널을 배치
		add(p);
		
		//옵션을 설정
		this.setBounds(300, 300, 200, 200);
		this.setResizable(false);
		setVisible(true);
		
	}
}









