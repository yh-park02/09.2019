package lang;

public class StringMain4 {

	public static void main(String[] args) {
		// String compareTo(String other) 메소드는
		// ()안에 있는 데이터가 크면 음수(-1) 같으면 0 작으면 양수(1)를 리턴한다.

		int[] ar = { 100, 78, 89, 65, 45 };
		// 선택정렬
		// 숫자 데이터는 크기 비교를 >,<, == 등으로 한다.
		for(int i = 0; i < ar.length - 1; i = i + 1) {
			for (int j = i + 1; j < ar.length; j = j + 1) {
				if (ar[i] > ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		for(int temp : ar) {
			System.out.printf("%d\n", temp);
		}
		
		// 위의 알고리즘을 이용해서 문자열의 정렬
		String[] names = { "김좌진", "홍범도", "안중근", "유관순", "윤봉길" };
		// 위의 문자열을 정렬 : 크기 비교는 compareTo 메소드 이용
		for(int i = 0; i < names.length - 1; i = i + 1) {
			for (int j = i + 1; j < names.length; j = j + 1) {
				if (names[i].compareTo(names[j]) > 0) {
					String temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
		
		//데이터 출력 - 김좌진 안중근 유관순 윤봉길 홍범도 순으로 출력
		for(String temp : names) {
			System.out.printf("%s\n", temp);
		}
		
		if(names[0].compareTo("가")>=0 && names[0].compareTo("나") <0) {
			System.out.printf("ㄱ으로 시작\n");
		}else {
			System.out.printf("ㄱ으로 시작하지 않습니다.\n");
		}
		//한글이 어떤 자음으로 시작하는지 판단할 때는 모음의 시작은 ㅏ 이고 끝은 ㅣ 이다.
		//받침의 시작은 없는 것이고 끝은 ㅎ이다.
		//한글은 '가'에서 시작해서 '힣' 이 끝이다.
		//ㄱ으로 시작하는 경우는 가보다 크거나 같고 나보다 작은 경우이다.
		
		
	}
}
