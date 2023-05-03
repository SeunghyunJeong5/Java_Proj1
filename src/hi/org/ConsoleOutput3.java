package hi.org;
	
public class ConsoleOutput3 {

	public static void main(String[] args) {
		// 코드는 main 메소드 내에서 작성
		
		// 변수 선언 : Java 와 JavaScript는 완전히 별개의 언어
			// <자료형> <변수명> = <변수에 들어갈 초기값>;
		
		//문자열 자료형 : String
		String fatherName = "홍길동";
		String matherName = "홍길순";
		String myName = "홍당무";
		
		//정수형 자료형 : int
		int age = 30;
		
		//int age2 = 77.7; //오류발생 --- 정수변수에 실수를 넣었으니 오류남
		
		//실수형 자료형 : double
		double weith = 70.5 ;
		double weith2 = 50; //이거는 오류발생하지 않음 -----> 정수가 실수자료형으로 자동 변환이 된다.
		
		
		//int age = 50;    //오류 발생 --- age 변수를 새롭게 선언하는데 위에 이미 선언되어 있기 때문에 오류남
		System.out.println(age);
		age = 60; 		   //여기 시점으로 age 변수의 값은 30에서 60으로 바뀜
		System.out.println(age);
		
		
		
		System.out.println("========================================");
		
		age = 25;
		
		//1. println(); 으로 출력 ---- 문자열과 변수를 +로 연결해서 출력
		// 우리 아버지 성함은 홍길동(변수로) 이고, 우리 어머니 성함은 홍길순(변수로) 입니다.
		// 나의 이름은 홍당무(변수로) 이고, 나이는 25(변수로) 살이고, 몸무게는 70.5(변수로) 입니다.
		
		System.out.println("우리 아버지 성함은 " + fatherName + "이고, 우리 어머니 성함은 " + matherName +" 입니다.");
		System.out.println("나의 이름은 " + myName + "이고, 나이는 " + age + "살이고, 몸무게는 " + weith + "입니다.");
	
		
		System.out.println("================println() 으로 출력==========================");
		
		
		//2. print(); ------ 문자열과 변수를 +로 연결해서 출력
		// 우리 아버지 성함은 홍길동(변수로) 이고, 우리 어머니 성함은 홍길순(변수로) 입니다.
		// 나의 이름은 홍당무(변수로) 이고, 나이는 25(변수로) 살이고, 몸무게는 70.5(변수로) 입니다.
		
		
		System.out.print("우리 아버지 성함은 " + fatherName + "이고, 우리 어머니 성함은 " + matherName +" 입니다.\n" + "나의 이름은 " + myName + "이고, 나이는 " + age + "살이고, 몸무게는 " + weith + "입니다.\n");
	
		
	
		System.out.println("====================print() 으로 출력======================");

		
		
		//3. printf(); ------- 문자열내에서 콤마뒤의 값을 불러들여서 출력----이거 더 편한듯하다
		// 우리 아버지 성함은 홍길동(변수로) 이고, 우리 어머니 성함은 홍길순(변수로) 입니다.
		// 나의 이름은 홍당무(변수로) 이고, 나이는 25(변수로) 살이고, 몸무게는 70.5(변수로) 입니다.
		
		System.out.printf("우리 아버지 성함은 %s이고, 우리 어머니 성함은 %s입니다.\n", fatherName, matherName);
		System.out.printf("나의 이름은 %s이고, 나이는 %d살이고, 몸무게는 %.1f입니다.\n", myName, age, weith);
		
		
		
		System.out.println("====================printf() 으로 출력======================");

		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
