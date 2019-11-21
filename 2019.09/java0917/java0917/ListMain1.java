package java0917;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMain1 {

	public static void main(String[] args) {
		// 문자열을 저장하는 ArrayList를 생성
		List<String> al = new ArrayList<>();
		// 문자열을 저장하는 LinkedList를 생성
		List<String> li = new LinkedList<>();

		al.add("강감참");
		li.add("강감참");

		al.add("조헌");
		li.add("조헌");

		// 현재 시간을 기록
		long start = System.currentTimeMillis();
		// 첫번째 자리에 100000개를 삽입
		for (int i = 0; i < 100000; i = i + 1) {
			li.add(1, "을지문덕");
		}
		// 현재 시간을 기록
		long end = System.currentTimeMillis();
		System.out.printf("LinkedList 작업시간:%d\n", (end - start));

		
		start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i = i + 1) {
			al.add(1, "을지문덕");
		}
		end = System.currentTimeMillis();
		System.out.printf("ArrayList 작업시간:%d\n", (end - start));
		
		
		
		start = System.currentTimeMillis();	
		int size = al.size();
		for(int i=0; i<size; i=i+1) {
			String data = al.get(i);
			System.out.printf("%s\n", data);
		}
		end = System.currentTimeMillis();
		System.out.printf("ArrayList 작업시간:%d\n", (end - start));
		
		System.out.printf("--------------------------------\n");
		
		start = System.currentTimeMillis();	
		int size1 = li.size();
		for(int i=0; i<size1; i=i+1) {
			String data = li.get(i);
			System.out.printf("%s\n", data);
		}
		end = System.currentTimeMillis();
		System.out.printf("LinkedList 작업시간:%d\n", (end - start));
		
		
	}
}








