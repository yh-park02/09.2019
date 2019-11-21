package java0903;

public class VariableDefine {

	public static void main(String[] args) {
		//이름, 주소, 전화번호, 나이를 저장해서 출력하기
		String name = "박문석";
		String address = "서울시 양천구 목동";
		String phone = "01037901997";
		int age = 49;
		System.out.println("이름:" + name);
		System.out.println("주소:" + address);
		System.out.println("전화번호:" + phone);
		System.out.println("나이:" + age);
		
		System.out.printf("이름:%10s 주소:%s 전화번호:%s 나이:%d\n",
			name, address, phone, age);
		//소수를 6째 자리까지 출력
		System.out.printf("%f\n", 8.9876542132);
		//소수 2째 자리까지 출력 - 3째 자리에서 반올림
		System.out.printf("%.2f\n", 8.9876542132);
		

	}

}
