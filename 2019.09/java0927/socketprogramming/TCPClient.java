import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {

	public static void main(String[] args) {
		try {
			//클라이언트 소켓 생성
			//192.168.0.151 의 9000 번 포트에 연결하는 소켓 생성
			InetAddress serverIp = 
				InetAddress.getByName("192.168.0.151");
			Socket socket = new Socket(serverIp, 9000);
			//기록을 해주는 스트림을 생성
			PrintWriter pw = 
				new PrintWriter(socket.getOutputStream());
			
			//메시지 입력받기
			Scanner sc = new Scanner(System.in);
			System.out.printf("전송할 메시지:");
			String msg = sc.nextLine();
			
			//메시지 전송
			pw.println(msg);
			pw.flush();
			
			//사용이 끝나서 종료
			sc.close();
			pw.close();
			socket.close();
			
		}catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.printStackTrace();
		}

	}

}
