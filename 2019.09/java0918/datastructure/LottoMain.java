package datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {
		// 1-45까지의 숫가 6개를 중복없이 저장
		// 어떤 자료구조를 이용해서 저장하는 것이 가장 코드를 중일 수 있는지 생각해보기
		// 동일한 자료형의 데이터를 여러개 저장하는 자료구조
		// 최근에는 배열도 List로 취급
		// 배열(크기가 변경되지 않는다.), ArrayList, LinkedList, Stack, PriorityQueue, ArrayDeque
		// HashSet, LinkedHashSet, TreeSet

		// 배열을 사용하는 경우
		// 정수 6개를 저장하는 배열
		int[] lottoAr = new int[6];
		Scanner sc = new Scanner(System.in);
		// 결과가 변하지 않는 자주 접근하는 속성이나 메소드의 결과는 지역변수에 저장하고 사용
		int len = lottoAr.length;
		for (int i = 0; i < len; i = i + 1) {
			// input에 정수 입력받기
			System.out.printf("숫자 입력(1-45): ");
			int input = sc.nextInt();

			// 1부터 45사이가 아니라면 다시 입력(유효성검사)
			if (input < 1 || input > 45) {
				System.out.printf("1-45사이의 숫자만 입력하세요!!\n");
				i = i - 1;
				continue;
			}
			// 중복 검사를 해서 통과하지 못하면 다시 입력
			// 맨 처음에는 중복복사 할 필요가 없어서 i>0 보다 클때
			int j = 0;
			if (i > 0) {
				for (j = 0; j <= i; j = j + 1) {
					if (input == lottoAr[j]) {
						break;
					}
				}
				// 반복문이 끝까지 수행되지 않았다면 break를 만나서 중단
				if (j != i + 1) {
					System.out.printf("중복된 숫자입니다!!다른 숫자를 입력해주세요!!\n");
					i = i - 1;
					continue;
				}
			}
			// 유효성 검사를 통과하면 데이터를 배열에 저장
			lottoAr[i] = input;
		}
		// 데이터 정렬- 전에는 직접 정렬했는데
		// API 메소드를 정렬
		Arrays.parallelSort(lottoAr);

		// 배열의 데이터 출력
		for (int temp : lottoAr) {
			System.out.printf("%d\t", temp);
		}
		sc.close();
	}
}
