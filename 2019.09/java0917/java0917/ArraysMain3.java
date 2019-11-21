package java0917;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ArraysMain3 {

	public static void main(String[] args) {
		// FileName의 배열을 생성
		FileNameDTO f1 = new FileNameDTO();
		f1.setName("자바");
		f1.setSize(80);
		f1.setType("파워포인트");

		FileNameDTO f2 = new FileNameDTO();
		f2.setName("스위프트");
		f2.setSize(170);
		f2.setType("키노트");

		FileNameDTO f3 = new FileNameDTO();
		f3.setName("코틀린");
		f3.setSize(50);
		f3.setType("파워포인트");

		// 위에 만든 FileName 객체 3개를 가지고 배열을 생성
		FileNameDTO[] ar = { f1, f2, f3 };
		
		//키보드로부터 입력받기 위한 객체를 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("정렬 기준을 선택하세요.(1.이름 2.크기)");
		int menu = sc.nextInt();
		
		//Comparator는 제너릭이 적용된 인터페이스라서 객체를 생성할 때 자료형을 결정해 주어야 한다.
		if(menu == 1) {
			Arrays.sort(ar, new Comparator<FileNameDTO>(){
				@Override
				public int compare(FileNameDTO o1, FileNameDTO o2) {
					//o1과 o2의 name을 비교
					return o1.getName().compareTo(o2.getName());
				}				
			});
		}else if(menu == 2) {
			Arrays.sort(ar, new Comparator<FileNameDTO>() {
				
				@Override
				public int compare(FileNameDTO o1, FileNameDTO o2) {
					//o1과 o2의 name을 비교
					return o1.getSize() - o2.getSize();
				}				
			});
		}else {
			System.out.printf("메뉴는 1번, 2번만 선택하세요!!\n");			
			//프로그램종료
			System.exit(0);
		}
		//ar 배열의 내용을 출력
		for(FileNameDTO temp : ar) {
			System.out.printf("%s\n", temp);
		}
		
		//입력받는 객체 닫기
		sc.close();
	}
}








