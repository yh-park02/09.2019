package lowlevel;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPFileClient {

	public static void main(String[] args) {
		//보내는쪽
		try {
			//데이터를 보내기 위한 UDP 소켓을 생성
			DatagramSocket socket = new DatagramSocket();
			//보낼 데이터 생성
			String msg = "9.png";
			//보내기 위한 패킷을 생성
			DatagramPacket dp = new DatagramPacket(
					msg.getBytes(), msg.getBytes().length,
					InetAddress.getByName("192.168.0.168"), 7777);
			
			System.out.printf("파일 이름 전송 성공\n");
			
			//보내기
			socket.send(dp);
			
			//보내기 위한 파일의 스트림을 생성해서 파일의 내용을 배열에 저장하기
			BufferedInputStream bis = new BufferedInputStream(
					new FileInputStream("/Users/tjoeun-304/Documents/9.png"));
			
			//한번에 읽어서 저장
			int len = bis.available();
			byte [] b = new byte[len];
			bis.read(b);
			
			//보낼 데이터 생성
			dp = new DatagramPacket(b, len, 
					InetAddress.getByName("192.168.0.168"), 7777);
			
			//데이터 보내기
			socket.send(dp);
			
			bis.close();
			System.out.printf("파일 전송 성공\n");
			
			/*
			//나눠서 읽기
			while(true) {
				byte [] b = new byte[128];
				int r = bis.read(b);
				if(r <0) {
					break;
				}
				//배열에 b의 0부터 r까지 추가 
			}
			*/
			
			
			//소켓 닫기
			socket.close();
			
		}catch(Exception e) {
		    System.out.printf("예외:%s\n", e.getMessage());
		    e.printStackTrace();
		}

		
		
	}
}
