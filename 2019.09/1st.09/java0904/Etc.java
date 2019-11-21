package java0904;

public class Etc {

	public static void main(String[] args) {
		//1부터 10까지 출력
		for(int idx = 1; idx <= 10; idx = idx + 1) {
			//idx가 3의 배수라면 
			if(idx % 3 == 0) {
				//break이면 반복문을 중단하므로 1, 2
				//break;
				
				//continue는 다음 반복으로 넘어갑니다.
				//1,2,4,5,7,8,10 - 3의 배수인 경우만 출력을 하지 않습니다.
				continue;
			}
			
			System.out.printf("idx:%d\n", idx);
		}

	}

}
