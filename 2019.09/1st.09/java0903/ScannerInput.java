package java0903;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		//키보드로부터 입력받을 수 있는 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("점수를 입력하세요:");
		//정수를 입력받아서 score에 저장
		int score = sc.nextInt();
		
		//score가 60이상이면 합격이라고 출력 그렇지 않으면 불합격이라고 출력
		if(score >= 60) {
			System.out.printf("합격\n");
		}else {
			System.out.printf("불합격\n");
		}
		
		sc.close();
	}

}
