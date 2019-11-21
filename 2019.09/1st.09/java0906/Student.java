package java0906;

public class Student {
	/*
	//이 코드 블록은 클래스를 처음 사용하기 위해서 메모리에 로드될 때 바로 실행됩니다.
	static{
		System.out.printf("클래스가 생성되어 메모리에 로드됩니다.\n");
	}
	
	
	//학교이름, 학생이름, 전화번호, 학번을 저장할 수 있는 변수
	
	//모든 학생의 학교 이름은 동일합니다.
	//이런 경우에는 static으로 선언해서 1개만 생성해서 공유하는 것이 좋습니다.
	static String schoolName;
	String studentName;
	//접근 지정자를 private 으로 설정하면 클래스 외부에서 사용이 불가능합니다.
	private String phone;
	//접근 지정자를 public 으로 설정하면 클래스 외부에서 객체가 사용 가능합니다.
	public String num;
	*/
	
	public void func() {
		System.out.println("처음 만들어 본 메소드");
		//클래스 안에 만들어진 다른 메소드 호출
		method();
	}
	
	public void method() {
		System.out.println("내부에서 호출할 메소드");
	}
	
	public void noArg() {
		//Hello Java를 3번 출력
		for(int i=0; i<3; i=i+1) {
			System.out.printf("Hello Java\n");
		}
	}
	
	public void oneArg(int n) {
		for(int i=0; i<n; i=i+1) {
			System.out.printf("Hello Java\n");
		}
	}
	
	//매개변수의 자료형이 기본형인 경우
	public void value(int n) {
		n = n + 1; //n의 값을 1증가
		System.out.printf("n:%d\n", n);
	}
	
	//매개변수의 자료형이 기본형이 아닌 경우
	public void reference(int [] ar) {
		ar[0] = ar[0] + 1;
		System.out.printf("ar[0]:%d\n", ar[0]);
	}
}






