package java0904;

public class Star {

	public static void main(String[] args) {
		/*
		 	0***** 0-4
		 	1***** 0-4
		 	2***** 0-4
		 	3***** 0-4
		 	4***** 0-4
		 */
		/*
		for(int i=0; i<5; i=i+1) {
			for(int j=0; j<5; j=j+1) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		*/
		
		/*
	 	0*		0-0  끝나는 숫자가 변화(1씩 증가) : 1 * i
	 	1**		0-1
	 	2***	0-2
	 	3****	0-3
	 	4***** 	0-4
	 */
		
		/*
		for(int i=0; i<5; i=i+1) {
			for(int j=0; j<i+1; j=j+1) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		*/
		
		/*
	 	0***** 0 - 4  -1 * i + 4 : 4 - i		
	 	1****  0 - 3		
	 	2***   0 - 2	 
	 	3**	   0 - 1
	 	4*     0 - 0
	 */
		/*
		for(int i=0; i<5; i=i+1) {
			for(int j=0; j< 5-i; j=j+1) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		*/
		
		/*
	 	0* 	
	 	1**  		
	 	2***   	 
	 	3**	   
	 	4* 
	 	//일정한 패턴이 나오다가 다른 패턴으로 변경되는 경우에는 변경되는 시점에서 
	 	//코드를 분할하면 됩니다.    
	 */
		/*
		for(int i=0; i<5; i=i+1) {
			//3번째 줄 까지의 규칙
			if(i<=2) {
				for(int j=0; j<i+1; j=j+1) {
					System.out.printf("*");
				}
			}
			//4번째 줄 부터의 규칙
			else {
				for(int j=0; j<5-i; j=j+1) {
					System.out.printf("*");
				}
			}
			System.out.printf("\n");
		}
		*/
		
		/*
		     * 공백 4개 *
		    *  공백 3개 *
		   *   공백 2개 *
		  *    공백 1개 *
		 *     공백 없음 *
		 */
		
		for(int i=0; i<5; i=i+1) {
			//공백 출력
			for(int j=0; j<4-i; j=j+1) {
				System.out.printf(" ");
			}
			System.out.printf("*");
			System.out.printf("\n");
		}
		

	}

}



