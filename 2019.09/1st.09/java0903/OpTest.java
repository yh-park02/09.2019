package java0903;

public class OpTest {

	public static void main(String[] args) {
		//다음 2개의 변수 중에서 작은 값을 min에 저장하고 출력하기
		int n1 = 20;
		int n2 = 30;
		
		int min = n1 < n2 ? n1 : n2;
		System.out.printf("작은 값:%d\n", min);
		
		int time = 7700;
		//time에 전체 시간이 초단위로 저장되어 있습니다.
		//time은 몇 시간 몇 분 몇 초인지 계산
		//2시간 8분 20초 입니다.
		
		//시간 구하기
		int hour = time / 3600;
		//분 구하기 : 전체 시간에서 시간이 가져간 부분을 제외하고 60으로 나누기
		int minute = (time - hour * 3600)/60;
		//초 구하기 : 전체 시간에서 시간과 분이 가져간 부분을 제외
		int second = time % 60;
		
		System.out.printf("%d 시간 %d분 %d초\n", hour, minute, second);
		
		int money = 760000;
		//오 만원 몇 장 만원 몇 장을 주는 것이 최소로 줄 것인지 계산

	}

}






