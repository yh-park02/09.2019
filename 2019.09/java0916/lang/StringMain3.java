package lang;

public class StringMain3 {

	public static void main(String[] args) {
		//String 클래스의 split 메소드 활용하기
		//구분자로 구분된 문자열을 csv라고 한다.
		String data = "87,67,64,89";
		
		//위의 문자열을 ,단위로 구분해서 출력 - String의 split 이용
		//String [] split(String regexp)
		//문자열을 regexp를 기준으로 분할해서 문자열 배열을 리턴한다.
		String [] result = data.split(",");
		for(String temp : result) {
			System.out.printf("%s\n", temp);
		}
		
		//만들어진 문자열을 정수로 변환해서 합계를 출력 
		//정수 변환은 Integer.parseInt()
		//합계를 구할 변수
		int sum = 0;
		for(String temp : result) {
			sum = sum + Integer.parseInt(temp);
		}
		System.out.printf("합계:%d\n", sum);
		
		//중간에 변환되지 않는 문자열을 삽입해서 변환되지 않는 경우에는 0으로 계산
		//예외처리는 try ~ catch 이용
		
		data = "98, 87, -, 88";
		//위의 data를 가지고 작업 - 변환이 안되는 경우 0으로 간주
		//-인 경우 NumberFormatException이 발생
		result = data.split(",");
		sum = 0;
		for(String temp : result) {
			//숫자로 변환하다가 예외가 발생하면 0을 더하도록 하고 계속 수행하도록 한다.
			//숫자 앞 뒤에 공백이 있는 경우는 공백을 제거하도록 
			//trim()을 호출해서 공백을 제거
		    try {
			    sum = sum + Integer.parseInt(temp.trim());
		    }catch(NumberFormatException e){  // ==   }catch(Exception e){
			    sum = sum + 0;
		    }
		}
		System.out.printf("합계:%d\n", sum);
		
		
		
	}
}
