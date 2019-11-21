package java0904;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		//문자열을 입력받아서 식당을 출력하기 - switch 사용
		//1.중국집 2.분식집 3.한식집 나머지는 잘못된 선택
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("메뉴 선택(1.중국집 2.분식집 3.한식집):");
		String menu = sc.nextLine();

		final String 중국 = "1";
		final String 분식 = "2";
		final String 한국 = "3";
		//위의 조건 처리 - switch
		switch(menu) {
		case 중국:
			System.out.printf("중국집\n");
			break;
		case 분식:
			System.out.printf("분식집\n");
			break;
		case 한국:
			System.out.printf("한식집\n");
			break;	
		default:
			System.out.printf("잘못된 메뉴 선택\n");
			break;
			
		}
		
		
		sc.close();
	}

}



