package InputOutput;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Date;
import java.util.GregorianCalendar;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class FileInfomationFrame extends JFrame {
	
	JButton btnInfo;
	JButton btnCreateFile;
	JTextArea display;
	
	public FileInfomationFrame() {
		JPanel panel = new JPanel();
		btnInfo = new JButton("파일 정보 확인");
		btnInfo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//파일 대화상자 만들고 출력하기
				JFileChooser fc = new JFileChooser();
				fc.setMultiSelectionEnabled(false);
				int r = fc.showOpenDialog(null);
				//확인을 선택했다면
				StringBuilder sb = new StringBuilder();
				if(r == JFileChooser.APPROVE_OPTION) {
					//선택한 파일 가져오기
					File f = fc.getSelectedFile();
					sb.append("마지막 수정날짜:"+f.lastModified()+"\n");
					//에폭시 타임을 Date로 변경
					Date d = new Date(f.lastModified());
					sb.append("마지막 수정날짜:"+d.toString()+"\n");
					
					//파일 크기 출력
					sb.append("파일 크기:" + f.length()+"\n");
					long size = f.length() /1024;
					sb.append("파일크기:" + size + "K\n");
					
					//오늘 날짜를 이용해서 파일 이름 만들기
					//오늘날짜.log로 만들기
					//현재 시간을 만들기
					GregorianCalendar cal = new GregorianCalendar();
					//Date로 변환 
					Date today = new Date(cal.getTimeInMillis());
					sb.append("오늘날짜이름:" + today.toString() + ".log");
					//파일 이름 바꾸기
					//변경할 파일 경로를 생성
					//File updateFile = new File("./update.dat");
					//f.renameTo(updateFile);
					//원본 파일에서 이름3글자를 제외하고 파일이름 만들기 
					String name = f.getName();
					String modName = name.substring(3);
					File fff = new File("./"+modName);
					f.renameTo(fff);
					
					
					//파일의 존재 여부 확인 
					File ff = new File("./dfjlkasdfljk.kdjs");
					if(ff.exists() == false) {
						sb.append("파일이 존재하지 않습니다.\n");
					}else {
						sb.append("파일이 존재합니다.\n");
					}
					
					
					
					display.setText(sb.toString());
				}else {
					display.setText("선택한 파일이 없습니다.\n");
				}
			}
		});
		
		//File.createFile() : 파일을 생성
		btnCreateFile = new JButton("파일 생성");	
		btnCreateFile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 파일 경로를 만들기 - 현재 디렉토리의 오늘날짜.log
				GregorianCalendar cal = new GregorianCalendar();
				Date today = new Date(cal.getTimeInMillis());
				
				Path path = Paths.get("./" + today.toString() + ".log");
				//파일을 생성
				try {  
					//Files.createFile(path, null); //예외처리해주기 
					//예외가 발생하지 않아야 하고 현재 작업 디렉토리에 파일이 생성되어야함
					Files.createFile(path);
				} catch (Exception e1) {
					//예외메시지가 null이라고 나오면 NullPointerException 발생 
					System.out.printf("예외:%s\n", e1.getMessage());
				}
			}
		});
		
		
		panel.add(btnCreateFile);
		panel.add(btnInfo);
		add("North", panel);
		
		display = new JTextArea(30, 40);
		add(display);
		
		
		setBounds(100,100,300,300);
		pack();//크기맞추기
		setTitle("파일 정보 출력하기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
  }
}
