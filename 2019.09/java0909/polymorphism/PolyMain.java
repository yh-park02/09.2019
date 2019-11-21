package polymorphism;

public class PolyMain {

	public static void main(String[] args) {
		//참조형 변수의 대입
		
		//상위 클래스 타입의 변수에 
		//하위 클래스 타입의 객체 참조를 대입할 수 있다.
		Base base = new Derived();
		//상위 클래스 타입의 변수에 하위 클래스 타입의
		//객체를 대입한 경우에 
		//변수는 자신의 타입에 존재하는 것들만 호출이 가능
		
		//하위 클래스 타입의 참조형 변수에
		//상위 클래스 타입의 객체 참조는 바로 대입할 수 없다.
		//강제 형 변환을 해서 대입해야 합니다.
		//단 이 때 참조가 원래 하위 클래스 타입이어야 
		//예외가 발생하지 않습니다.
		//Derived derived = (Derived)(new Base());
		
		//이 경우에는 예외가 발생하지 않음
		//base는 원래 Derived 였기 때문입니다.
		Derived derived = (Derived)base;
		
		//오버라이딩 된 메소드는 변수를 만들 때의 자료형이 아니라
		//객체의 참조를 대입할 때 사용된 자료형을 따라 갑니다.
		Base b = new Base();
		b.display();
		//Base 객체가 대입되서 Base의 display를 호출
		b = new Derived();
		b.display();
		//Derived 객체개 대입되서 Derived 의 display를 호출
		
		//이렇게 동일한 코드가
		//대입된 객체에 따라 다른 메소드를 호출하는 것을
		//polymorphism(다형성) 이라고 합니다.
	}
}
