package java0904;

import java.util.Scanner;

public class Toggle {

	public static void main(String[] args) {
		//ON 과 OFF를 교대로 10번 출력하기
		int i = 0;
		//int sign = 1;
		boolean flag = true;
		while(i < 10) {
			if(flag) {
				System.out.printf("ON\n");
			}else {
				System.out.printf("OFF\n");
			}
			flag = !flag;
			
			//sign = -sign;
			i = i + 1;
		}
		
		//정수를 입력받아서 소수인지 판별
		//소수는 2부터 자신의 절반까지 나누어서 한번도 나누어 떨어지지 않으면 소수
		Scanner sc = new Scanner(System.in);
		System.out.printf("소수인지 판별할 숫자 입력(1보다 큰 숫자):");
		int su = sc.nextInt();
		//중간에 나누어 떨어졌는지 확인할 변수
		int f = 0;
		
		//idx를 2부터 자신의 절반까지 하나씩 증가시키면서
		for(int idx=2; idx <= su/2; idx=idx+1) {
			//나누어 떨어지면 반복문을 종료
			if(su % idx == 0) {
				//나누어 떨어졌다는 것을 표시하기 위해서 변수의 값을 변경
				f = 1;
				break;
			}
		}
		
		//break를 만나서 종료된 것인지 아니면 반복문을 끝까지 수행한 것인지 판별
		if(f == 0) {
			System.out.printf("%d는 소수\n", su);
		}else {
			System.out.printf("%d는 소수 아님\n", su);
		}
		sc.close();
		

	}

}



