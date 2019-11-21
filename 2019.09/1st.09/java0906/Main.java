package java0906;

public class Main {

	public static void main(String[] args) {
		//MethodClass의 인스턴스 생성
		MethodClass instance = new MethodClass();
		//동일한 이름이지만 매개변수의 모양이 다른 메소드 호출
		instance.add(10, 20);
		instance.add(20.8, 29.1);
		
		instance.sum(100, 300);
		instance.sum(100, 500, 300);
		instance.sum(100, 500, 300, 700);
		
		int result = instance.returnadd(300, 500);
		result = instance.returnadd(result, 800);
		System.out.printf("결과:%d\n", result);
		
		//결과를 리턴하는 메소드는 다른 메소드의 매개변수가 될 수 있습니다.
		System.out.printf("결과:%d\n", 
				instance.returnadd(
						instance.returnadd(300, 200), 400));
		
		MethodClass obj = new MethodClass();
		System.out.printf("%d\n",obj.fibo1(10));
		System.out.printf("%d\n",obj.fibo1(15));
		System.out.printf("%d\n",obj.fibo2(10));
		System.out.printf("%d\n",obj.fibo2(15));
		System.out.printf("%d\n",obj.fibo1(100));
		//System.out.printf("%d\n",obj.fibo2(100));
		obj.thisMethod();
		
		/*
	//Student 클래스의 객체 만들기
		Student student = new Student();
		//메소드 호출
		student.func();
		
		//매개변수가 없는 메소드 호출
		student.noArg();
		//매개변수가 있는 메소드 호출
		student.oneArg(10);
		
		int k = 0;
		//메소드의 매개변수로 기본형 데이터를 넘겨주는 경우
		//메소드를 호출해도 데이터는 변경되지 않습니다.
		student.value(k);
		System.out.printf("k:%d\n", k);
		
		int [] br = {30, 40};
		//메소드의 매개변수로 기본형이 아닌 데이터를 넘겨주면 
		//메소드를 호출하고 난 후 데이터가 변경될 수 있습니다.
		student.reference(br);
		System.out.printf("br[0]:%d\n", br[0]);
		*/
		
		/*
		//Student 클래스의 객체 만들기
		//Student 클래스의 객체를 생성하고 그 주소를 student1 이라는 변수에 대입
		Student student1 = new Student();
		Student student2 = new Student();
		
		//studentName이라는 인스턴스 변수에 값을 대입
		student1.studentName = "강감찬";
		student2.studentName = "조헌";
		
		//student1.num = "10";
		//student1.phone = "010";
		
		
		
		student1.schoolName = "두봉초등학교";
		student2.schoolName = "삼학초등학교";
		
		System.out.printf("%s\n", student1.studentName);
		System.out.printf("%s\n", student2.studentName);
		System.out.printf("%s\n", student1.schoolName);
		System.out.printf("%s\n", student2.schoolName);
		*/

	}

}
