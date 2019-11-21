package java0904;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		//점수를 입력받아서
		//90-100 사이이면 A
		//80-89 이면 B
		//70-79 이면 C
		//60-69 이면 D
		//0-59 이면 F
		//0-100 사이가 아니면 잘못된 점수 입력
		
		//1.점수 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.printf("점수를 입력하세요:");
		int score = sc.nextInt();
		
		//2.조건 처리
		if(score >= 90 && score <= 100) {
			System.out.printf("A\n");
		}else if(score >= 80 && score <= 89) {
			System.out.printf("B\n");
		}else if(score >= 70 && score <= 79) {
			System.out.printf("C\n");
		}else if(score >= 60 && score <= 69) {
			System.out.printf("D\n");
		}else if(score >= 0 && score <= 59) {
			System.out.printf("F\n");
		}else {
			System.out.printf("잘못된 점수를 입력하셨습니다!!!\n");
		}
		
		//1.아이디와 비밀번호를 입력받기
		System.out.printf("아이디를 입력해주세요:");
		String id = sc.nextLine();
		System.out.printf("비밀번호를 입력하세요:");
		String pw = sc.nextLine();
		
		//2.조건 처리
		if(id.equals("root") && pw.equals("1234")) {
			System.out.printf("로그인 성공\n");
		}else if(id.equals("root")) {
			System.out.printf("비밀번호가 틀렸습니다.\n");
		}else {
			System.out.printf("없는 아이디 입니다..\n");
		}
		
		
		sc.close();

	}

}




