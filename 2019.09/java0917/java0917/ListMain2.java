package java0917;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListMain2 {

	public static void main(String[] args) {
		//데이블 구조 만들기
		List<Person> list = new ArrayList<>();
		//테이블에 삽입할 데이터를 생성
		Person person = new Person();
		person.setName("박문석");
		person.setPhone("01097594562");
		person.setAddress("서울시 양천구");
		person.setAge(40);
		//테이블에 데이터를 삽입하기
		list.add(person);
		
		
		//테이블에 삽입할 데이터를 생성
		person = new Person();
		person.setName("김지영");
		person.setPhone("010585594562");
		person.setAddress("서울시 강남구");
		person.setAge(35);
		//테이블에 데이터를 삽입하기
		list.add(person);
		
		//데이터 정렬(sort)-Age로 정렬
		list.sort(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getAge() - o2.getAge();
			}
		});
		
		//타이틀을 출력
		System.out.printf(
				"%-10s%-15s%-20s%-3s\n",
				"이름", "전화번호", "주소", "나이");
		
		//Fast Enumeration을 이요한 List 접근
		for(Person p : list) {
			System.out.printf(
					"%-10s%-15s%-20s%-3d\n",
					p.getName(), p.getPhone(), 
					p.getAddress(), p.getAge());
		}
	}
}
