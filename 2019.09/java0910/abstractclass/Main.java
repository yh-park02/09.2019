package abstractclass;

public class Main {

	public static void main(String[] args) {
		//Eclipse에서 수정
		
		Star s = new Protoss();
		s.attack();
		
		//Zerg 클래스의 인스턴스 생성
		s = new Zerg();
		s.attack();
		
		//Terran 클래스의 인스턴스 생성
		s = new Terran();
		s.attack();
	}
}



