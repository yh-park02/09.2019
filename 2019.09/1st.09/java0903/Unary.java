package java0903;

public class Unary {

	public static void main(String[] args) {
		//정수 변수를 생성해서 초기값을 부여
		int i = 10;
		
		i++; //i값을 1증가
		System.out.printf("i:%d\n", i); //11이 출력
		System.out.printf("i:%d\n", ++i); 
		//앞에 붙으면 변수의 값을 증감시키고 명령문에 사용
		//12가 되고 출력
		System.out.printf("i:%d\n", i++);  
		//뒤에 붙이면 명령문에 값을 먼저 사용하고 나중에 증감
		//12를 출력하고 i는 13이 됩니다.
		
		i = 0;
		int result = i++ + i++;
		System.out.printf("\nresult:%d\n", result);
	
		
	}

}
