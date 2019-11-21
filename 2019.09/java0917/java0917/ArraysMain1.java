package java0917;

import java.util.Arrays;

public class ArraysMain1 {

	public static void main(String[] args) {
		String [] names = {"이승엽","선동렬","이종범","최향남","조계현"};
		//배열의 데이터를 정렬해주는 메소드
		//Arrays.sort - String 클래스는 Comparable을 implements 했으므로 정렬이 가능하다.
		Arrays.sort(names);
		//정렬이 되었는지 확인
		for(String name : names) {
			System.out.printf("%s\n", name);
		}
		//정수 배열도 정렬이 가능하다.
		//정수는 int이지만 Arrays가 볼 째는 Integer 이다. 
		//정수 배열
		int [] ar = {700, 200, 500, 400, 600, 300, 100};
		//정렬하지 않은 상태에서 binary search 수행
		//binary search는 정렬이 안된 상태에서 하면 올바른 결과를 가져오지 못한다.
		int result = Arrays.binarySearch(ar, 100);
		System.out.printf("result:%d\n", result);
		//먼저 정렬을 수행
		//100, 200, 300, 400, 500, 600, 700
		Arrays.sort(ar);
		result = Arrays.binarySearch(ar, 600);
		System.out.printf("result:%d\n", result);
	}
}