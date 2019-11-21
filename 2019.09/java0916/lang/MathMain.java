package lang;

public class MathMain {

	public static void main(String[] args) {
		//1부터 6까지 랜덤하게 숫자 선택하기
		int [] ar = {1,2,3,4,5,6,2,3,4,5,6}; 		
		//0.0-1.0 사이의 랜덤한 실수를 만들어서 저장
		double r = Math.random();
		//ar 배열의 인덱스 범위 내의 숫자로 변경하기
		int idx =(int)(r * 100) % ar.length;
		System.out.printf("%d\n", ar[idx]);
	}
}
