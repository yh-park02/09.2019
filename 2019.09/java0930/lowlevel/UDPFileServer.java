package lowlevel;


import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPFileServer {

	public static void main(String[] args) {
		//받는쪽
		try { 
			//받기 위한 데이터 그램 소켓 생성
			DatagramSocket socket = new DatagramSocket(7777);
			while(true) { //무한반복
			//데이터를 받기 위한 바이트 배열을 생성
			byte [] b = new byte[65536]; //64k - 한글로는 20000글자
			//데이터를 받아오기 위한 패킷을 생성
			DatagramPacket dp = new DatagramPacket(b, 65536);
			
			System.out.printf("서버 대기 중...\n");
			
			//데이터 받아오기
			socket.receive(dp);
			System.out.printf("보낸 곳:%s\n",dp.getAddress().getHostAddress());
			//받아 온 데이터가 문자열이라면 
			String msg = new String(b);
			//전송한 데이터가 65536이 안되면 뒤에 공백이 있을 수 있다. 
			System.out.printf("파일이름:%s\n", msg.trim());
			
			//파일의 내용 받기 
			//파일의 내용을 저장하기 위한 배열 생성
			//크기를 모르므로 크게 생성
			byte [] fb = new byte[1024*1021*5]; //5MB 배열 생성
			//데이터 받기
			dp = new DatagramPacket(fb, fb.length);
			socket.receive(dp);
			//받은 내용을 파일에 기록
			PrintStream ps = new PrintStream("./"+msg.trim());
			//받아온 데이터를 ps에 기록
			ps.write(fb, 0, dp.getLength());
			ps.flush();
			//ps닫기
			ps.close();
			}
			
		}catch(Exception e) {
		    System.out.printf("예외:%s\n", e.getMessage());
		    e.printStackTrace();
		
		}
	}
}
