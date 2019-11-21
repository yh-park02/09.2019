package mu;

public class Main {

	public static void main(String[] args) {
		//자기 cpu의 코어 개수 확인
		//연산 작업을 하는 스레드를 여러개 실행시키고자 하면 최적의 개수는 코어의 개수이다. 
		System.out.printf("코어개수:%d\n", Runtime.getRuntime().availableProcessors());
		
	
		//공유 데이터 
		Product product = new Product();
		
		//생성자 스레드 실행
		Producer Producer = new Producer(product);
		Producer.start();
		
		//소비자 스레드 실행
		//삭제하는 스레드는 데이터가 이미 존재할 때 만 동작해야 한다. 
		Consumer consumer = new Consumer(product);
		consumer.start();
	}

}
