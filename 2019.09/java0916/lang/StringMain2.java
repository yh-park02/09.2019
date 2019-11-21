package lang;

public class StringMain2 {

	public static void main(String[] args) {
		String str = "Hello World!!123";
		//위의 문자열에서 소문자를 전부 대문자로 변환해서 출력하기 : HELLO WORLD!!
		String result = "";
		//각 문자를 순회
		int len = str.length();
		for(int i=0; i<len; i=i+1) {
			char ch = str.charAt(i);
			//문자가 소문자인지 확인
			if(ch >= 'a' && ch <='z') {
				//소문자인 경우는 32를 빼서 대문자로 변환
				ch = (char)(ch - 32);
			}
			result = result + ch;
		}
		System.out.printf("result: %s\n", result);
		
		//위의 코드를 수정해서 대문자를 소문자로 변경
		
		//비밀번호는 영문 대문자1개, 소문자1개, 숫자1개 그 이외의 문자 1개 이상으로 구성되어야 한다.
		//각각의 문자가 몇개 인지 셀 수 있어야 한다.
		//str에 저장된 문자열의 대문자개수, 소문자개수, 숫자개수, 그 이외의 문자 개수 세기
		int dae = 0;
		int so = 0;
		int su = 0;
		int etc = 0;
		//str의 대문자,숫자, 그 이외문자의 개수를 세서 저장하기
		//dae=2, so=8, su=3, etc=3로 나오도록 작성
		
		for(int i=0; i<len; i=i+1) {
			char ch = str.charAt(i);
			//숫자 0부터 9사이라면 su의 값을 1증가
			if(ch >= '0' && ch <= '9') {
				su = su+1;		
				
		}else if(ch >= 'A' && ch <='Z') {
			dae = dae +1;
			
		}else if(ch >= 'a' && ch <= 'z') {
			so = so+1;
		}else {
			etc = etc+1;
		}	
	}
		//출력
		System.out.printf("대문자:%d개\n", dae);
		System.out.printf("소문자:%d개\n", so);
		System.out.printf("숫자:%d개\n", su);
		System.out.printf("특수문자:%d개\n", etc);
		
		//dae, so, su, etc가 모두 1보다 크거나 같다면 적합한 비밀번호
		//그렇지 않다면(4개중에 하나라도 0이 있으면) 적합하지 않은 비밀번호라고 출력
		//if(dae>=1 && so>=1 && su>=1 && etc>=1){
		if(dae * so * su * etc != 0){
			System.out.printf("적합한 비밀번호\n");
		}else {
			System.out.printf("적합하지 않은 비밀번호\n");
		}
		
	}
}
