package lang;

import java.util.GregorianCalendar;

public class SystemMain {

	public static void main(String[] args) {
		//System 클래스의 static String	setProperty(String key)
		//위의 메소드는 프로퍼티를 가져오는 메소드입니다.
		//os.name, java.version
		String osname = System.getProperty("os.name");
		String javaversion = System.getProperty("java.version");
		
		System.out.printf("운영체제:%s\n", osname);
		System.out.printf("자바버전:%s\n", javaversion);
		
		
		//Hello World를 10만번 출력하는데 걸리는 시간 측정		
		long start = System.currentTimeMillis();
		for(int i=0; i<100000; i=i+1) {
			System.out.printf("Hello World\n");
		}
		long end = System.currentTimeMillis();
		//소수 까지구해서 초단위로 출력 
		//정수끼리 연산하면 결과는 정수
		//데이터 중 하나를 실수로 변경해서 연산
		//실수를 출력할 때는 %f 
		System.out.printf("걸린 시간:%f초\n", ((double)end-start)/1000);   
		
		
		//1990년 8월 21에서 지나온 날짜 계산하기 
		//년월일을 가지고 날짜 객체를 생성
		//이 객체가 getTimeMillis()를 호출하면 1970년 1월 1일 자정부터 지나온 시간을
		//1/100초 단위로 리턴한다.
		//1990년 8월 21일을 날짜 객체로 변환
		//월은 -1을 해서 대입해야 한다.
		//자바에서 월은 0부터 시작한다.
		GregorianCalendar meetday = new GregorianCalendar(1990, 7, 21);
		//현재 시간을 1/1000초 단위로 만들기
		long time = System.currentTimeMillis();
		//time은 밀리초 단위로 되어 있는데 일 단위로 변경 - 소수점 절삭
		//현재 시간에서 앞에서 만든 날짜를 빼고 하루로 나누어서 계
		long day =(time-meetday.getTimeInMillis())/ 86400 / 1000; //하루는 86400
		System.out.printf("지나온 날 수:%d\n", day);

		
		
		
		
		
		
	}
}
