package datastructure;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapMain2 {

	public static void main(String[] args) {
		//person 클래스의 객체를 만들어서 데이터를 저장 
		PersonDTO person = new PersonDTO();
		person.setName("한예슬");
		person.setAge(30);
		person.setJab("직장인");
		
		//Person 객체의 내용을 하나씩 출력 - 구조를 바꾸면 출력부분도 바꿔줘야함.
		System.out.printf("이름:%s\n", person.getName());
		System.out.printf("나이:%s\n", person.getAge());
		System.out.printf("직업:%s\n", person.getJab());
		
		
		//Map에 데이터를 저장 
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("이름", "리처드");
		map.put("나이", 50);
		map.put("직업", "화가");
		map.put("취미", "독서");
		
		//모든 key를 전부 가져오기
		Set<String> keyset = map.keySet();
		//데이터 출력 - map에 변화가 생겨도 이 부분(출력)은 수정할 필요가 없다.
		//Apple은 데이터를 Map 구조로 넘기는 것을 많이 한다.
		for(String key : keyset) {
			System.out.printf("%s:%s\n", key, map.get(key));
		}		
	}
}
