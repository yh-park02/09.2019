package datastructure;

import java.util.Scanner;
import java.util.TreeSet;

public class SetLotto {

	public static void main(String[] args) {
		// 중복된 데이터를 저장하지 않고 데이터의 크기 순서대로 저장하는 구조 객체 만들기
		TreeSet<Integer> lotto = new TreeSet<>();

		Scanner sc = new Scanner(System.in);

		for (;lotto.size()<6;) {
			// input에 정수 입력받기
			System.out.printf("숫자 입력(1-45): ");
			int input = sc.nextInt();

			// 1부터 45사이가 아니라면 다시 입력(유효성검사)
			if (input < 1 || input > 45) {
				System.out.printf("1-45사이의 숫자만 입력하세요!!\n");
				continue;
			}
			// 데이터 삽입 여부를 r에 저장하면서 삽입
			boolean r = lotto.add(input);
			// 삽입에 실패했다면 - 데이터 중복
			if (r == false) {
				System.out.printf("중복된 데이터는 안됩니다.\n");
				//continue; => 반복문 안에서 마지막 continue는 의미가 없다. 
			}
		}
		// TreeSet은 데이터를 순서대로 접근할 수 있는 방법을 가지고 있기 때문에 정렬을 할 필요가 없다.
		for (Integer temp : lotto) {
			System.out.printf("%d\t", temp);
		}
		sc.close();
	}
}
