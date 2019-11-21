package java0906;

public class MethodClass {
	public int temp = 20;
	
	public void thisMethod() {
		int temp = 30;
		System.out.printf("temp:%d\n", temp); //30이 출력됩니다.
		//변수는 가까이에서 만든 것을 찾아서 사용합니다.
		//메소드 안에서 찾지 말고 메소드 외부에서 찾도록 할려면 변수명 앞에 this.을 추가
		System.out.printf("this.temp:%d\n", this.temp); //30이 출력됩니다.
	}
	
	//재귀를 사용하지 않고 피보나치 수열의 값을 리턴하는 메소드
	public int fibo1(int n) {
		//두번째 이전의 항의 값을 저장할 변수
		int n1 = 1;
		//첫번째 이전의 항의 값을 저장할 변수
		int n2 = 1;
		//피보나치 수열의 값을 저장할 변수
		int result = 1;
		
		//3번째 부터 n번째까지는 n1 과 n2 값을 변경하면서 더해줍니다.
		for(int i=3; i<=n; i=i+1) {
			//이전 2개 항의 값을 더하기
			result = n1 + n2;
			//다음 데이터로 변경
			n1 = n2;
			n2 = result;
		}
		return result;
	}
	
	//재귀를 이용한 피보나치 수열 메소드
	public int fibo2(int n) {
		//첫번째 이거나 두번째이면 1
		//그 이외의 경우는 이전 2개 항의 합
		if(n==1 || n==2) {
			return 1;
		}else {
			return fibo2(n-1) + fibo2(n-2);
		}
	}
	
	//Method Overloading
	//동일한 이름의 메소드가 매개변수의 자료형과 개수를 다르게 해서 2개 이상
	//존재하는 경우
	
	public void add(int a, int b) {
		System.out.printf("a+b:%d\n", a+b);
	}
	
	public void add(double a, double b) {
		System.out.printf("a+b:%f\n", a+b);
	}
	
	//정수 매개변수를 개수에 상관없이 대입할 수 있는 함수
	public void sum(int ... ar) {
		//... 다음에 나온 변수는 배열로 간주
		//ar 배열의 데이터 합계
		int s = 0;
		for(int temp : ar) {
			s = s + temp;
		}
		System.out.printf("합계:%d\n", s);
	}
	
	//정수 2개를 더해서 결과를 리턴하는 메소드
	//return 이 있으면 메소드 수행 결과를 사용할 수 있습니다.
	public int returnadd(int n1, int n2) {
		return n1 + n2;
	}
}






