package interfacesample;

public class Main2 {
	//Main 클래스 안에서 String 클래스가 사용됨 - has a
	//이 경우는 인스턴스 변수로 선언되서 Main 과 수명이 같아서 composition
	String str;
	public static void main(String[] args) {
		String str; //aggregation
		
		//ServiceImpl 객체를 생성
		//ServiceImpl service = new ServiceImpl();
		
		//인터페이스를 implements 한 클래스의 객체를 만들 때는
		//변수를 만들 때 인터페이스 이름을 사용하기도 합니다.
		Service service = new ServiceImpl();
		
		service.insert();
		service.read();
		service.update();
		service.remove();

	}

}
