package thread;

//Thread 클래스를 상속받은 클래스
public class ThreadEx extends Thread {
		//1초씩 쉬면서 0-9까지를 출력하는 메소드
		public void run() {
			for(int i=0; i<10; i=i+1) {
				try {
				Thread.sleep(1000);
				}catch(Exception e){
					System.out.printf("%s\n", e.getMessage());
				}
				System.out.printf("%d\n", i);
			}
		}

}
