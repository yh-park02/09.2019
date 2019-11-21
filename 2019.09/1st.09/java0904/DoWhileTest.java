package java0904;

public class DoWhileTest {

	public static void main(String[] args) {
		//601 을 3번 출력 - do~while 이용
		int idx = 0;
		do {
			System.out.printf("601\n");
			idx = idx + 1;
		}while(idx < 3);
		
		//1 - 10 까지의 합계
		//1 + 2 + 3 + 4 + ... +10
		
		int i = 1;
		//합계를 저장할 변수
		int sum = 0;
		do {
			//합을 구할 내용을 기존의 합계에 추가
			sum = sum + i;
			
			i = i + 1;
		}while(i <= 10);
		System.out.printf("합계:%d\n", sum);
		
		//image1.png, image2.png, image3.png를 반복문을 이용해서 출력
		
		//1,2,3 을 반복문을 이용해서 출력 -> image를 추가하고 .png을 뒤에 추가
		idx = 1;
		
		while(idx < 4) {
			System.out.printf("image%d.png\n", idx);
			idx = idx + 1;
		}

	}
}
