package java0909;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Student 클래스의 instance 생성
		Student student1 = 
				new Student();
		//속성에 set 메소드를 이용해서 값을 설정
		//student1.setHakbun("89101010");
		
		student1.setName("박문석");
		student1.setGender(true);
		student1.setMobile("01037901997");
		
		//get 메소드를 이용해서 값을 가져와서 출력
		System.out.printf("학번:%s\n", 
				student1.getHakbun());
		
		//student1 의 no 값 출력
		System.out.printf(
				"번호:%d\n", student1.getNo());
		
		Student student2 = new Student();
		//student2 의 no 값 출력
		System.out.printf(
			"번호:%d\n", student2.getNo());
		
		//매개변수가 있는 생성자를 호출해서 초기화
		Student student3 = 
				new Student("901010", "제시카",
						true, "01031391997");
		//set 메소드를 호출하지 않고 속성을 초기화
		System.out.printf(
			"학번:%s\n", student3.getHakbun());
		
		Scanner sc = new Scanner(System.in);

	}

}






