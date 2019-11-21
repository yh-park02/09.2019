package java0917;

import java.util.Arrays;

public class ArraysMain2 {

	public static void main(String[] args) {
		//FileName의 배열을 생성
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
		
		//위에 만든 FileName 객체 3개를 가지고 배열을 생성
		FileNameDTO [] ar = {f1, f2, f3};
		
		//배열의 데이터를 확인
		for(FileNameDTO temp : ar) {
			//객체 이름을 %s에 매핑 시켜서 출력하면 toString()의 결과가 출력된다.
			System.out.printf("%s\n", temp);
		}
		//배열의 데이터 정렬
		//데이터를 정렬하려면 크기 비교하는 메소드가 구현되어 있어야 한다.
		//Comparable 인터페이스의 compareTo 메소드이다.
		//아니면 Comparator 인터페이스를 구현한 객체를 대입해 주어야 한다.
		Arrays.sort(ar);
		System.out.printf("--------------------------------------------\n");
		
		//배열의 데이터를 확인
			for(FileNameDTO temp : ar) {
				System.out.printf("%s\n", temp);
				
		}
	}
}
