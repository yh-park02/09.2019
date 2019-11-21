package mu;

public class Producer extends Thread {
	//Consumer와 공유할 객체
	Product product;
	
	//생성자에서 product를 대입받아서 은스턴스 변수에 대입
	public Producer(Product product) {
		//this가 붙으면 메소드 외부에서 속성이나 메소드를 찾는다.
		this.product = product;
	}
	@Override
	//자바에서는 int보다 작은 자료형을 가지고 산술 연산을 하면 int로 변환해서 처리하기 때문에 
	//산술연산에 결과는 최소가 int이다. 산술연산 결과를 int보다 작은 자료형에 저장할 때는 강제형변환을 해주어야 한다.
	public void run() {
		for(char ch = 'A'; ch<= 'z'; ch=(char)(ch+1)) {
			product.put(ch);
		}
	}
}
