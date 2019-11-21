package java0904;

public class WhileTest {

	public static void main(String[] args) {
		//Hello Java 라는 문장을 3번 출력
		//동일한 문장을 연속해서 작성하는 경우 유지보수가 어려워집니다.
		//5번 출력하는 것으로 변경 - 2번 더 작성
		//Hello 601 으로 변경 - 3번 변경
		System.out.printf("Hello Java\n");
		System.out.printf("Hello Java\n");
		System.out.printf("Hello Java\n");
		
		System.out.printf("============\n");
		//반복문을 이용해서 3번 출력
		
		//반복문을 사용하면 수정을 할 때 이전보다 적은 수정을 하는 경우가 많습니다.
		
		//반복 횟수를 파악하기 위한 변수
		int idx = 0;
		//idx가 3보다 작으면 반복 수행
		while(idx < 3) {
			System.out.printf("Hello Java\n");
			idx = idx + 1; //idx++, idx += 1 로 작성해도 됩니다.
		}

	}

}




