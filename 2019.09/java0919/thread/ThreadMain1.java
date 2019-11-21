package thread;

public class ThreadMain1 {

	public static void main(String[] args) {
		//Thread 클래스로부터 상속받은 클래스의 객체를 생성
		ThreadEx1 th1 = new ThreadEx1();
		//스레드 시작
		th1.start();
		
		//anonymous class를 이용하는 방법
		Thread th2 = new Thread() {
			public void run() {
				for(int i=0; i<5; i=i+1) {
					try {
						Thread.sleep(1000);
						System.out.printf("스레드\n");
					}catch(Exception e) {}
				}
			}
		};
		th2.start();
		
		//Runnable 인터페이스를 이용한 방법
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<5; i=i+1) {
					try {
						Thread.sleep(1000);
						System.out.printf("Runnable\n");
					}catch(Exception e) {}
				}
			}
			
		};
		//Runnable 인터페이스를 이용하는 경우에는 Thread 클래스의 객체를 만들고 그 객체를 가지고 start
		Thread th3 = new Thread(r);
		th3.start();
		
	
		Thread th4 = new Thread() {			
			//10초 동안 1초씩 쉬면서 Daemon이라는 문자열을 출력 
			@Override
			public void run() {
				for(int i=0; i<10; i=i+1) {
					try {
						Thread.sleep(1000);
						System.out.printf("Daemon\n");
					//}catch(Exception e) {
						
					//스레드를 강제로 종료할 수 있도록 만들고자 할 때 
					//InterruptedException이 발생하면 return 하도록 코드를 작성
					}catch(InterruptedException e) {
						return;
					}
				}
			}
		};
		//데몬 스레드로 설정 - 다른 스레드들이 작업을 하는 동안만 이 스레드는 동작한다. 
		//데몬 설정이 시작하는 것보다 항상 먼저 나와야 한다. 
		th4.setDaemon(true);
		th4.start();	
		
		//스레드의 우선 순위 설정- 먼저 되거나 자주 수행될 가능성이 높아지는 것이지 절대적인 개념은 아니다.  
		//아주 긴 시간동안 동작하는 스레드일 때 우선순위의 영향을 받는다. 
		th1.setPriority(Thread.MIN_PRIORITY);
		th2.setPriority(Thread.MAX_PRIORITY);
		th3.setPriority(Thread.MAX_PRIORITY);
	}
}
 