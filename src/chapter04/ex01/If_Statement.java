package chapter04.ex01;

public class If_Statement {
	
	
	public static void main(String[] args) {
		
		
		// 제어문 - if (실행문 마지막에 break가 생략되어 있다.) , switch (실행문에서 빠져나오기 위해서 break 필요) 
		
		// if 문 사용하기 
		//	1. Type 1 : 조건이 1개 일때 
		//	-	if(조건) {조건이 참일때 실행 내용}
		//	-	if(조건) 조건이 참일때 실행 내용 ; -----------하나일때만 중괄호가 생략가능
		
		//	2. Type 2 : 조건이 2개 일때, 삼항 연산자로 처리 가능 : (조건) ? 참 : 거짓;
		//	-	if(조건) {조건이 참일때 실행 내용}
		//			else {조건이 거짓일때 실행 내용}
		
		//	3. Type 3 : 조건이 여러개 일때
		//	-	if(조건1) {조건1이 참일때 실행 내용}
		//			else if (조건2) {조건2가 참일때 실행 내용}		
		//			else if (조건3) {조건3가 참일때 실행 내용}		
		//			else if (조건4) {조건4가 참일때 실행 내용}		
		//			else if (조건5) {조건5가 참일때 실행 내용}		
		//			else {위의 조건이 모두 만족하지 않을때 실행 내용}
		
		
		// Type 1 예제 : 조건이 1개일때
		int val1 = 5;
		
		if (val1 > 3) {System.out.println("실행1");}   //조건이 True 이므로 "실행1" 이 출력
		
		
		System.out.println("===================================");
		
		// 조건이 1개일때 중괄호를 생략가능
		
		if (val1 > 3) System.out.println("실행2");
		
		
		System.out.println("===================================");
		
		
		// Type 2 : 조건 2개일때
		if (val1 > 3) {System.out.println("실행3");}	// 조건이 True 일때 실행
		else {System.out.println("실행4");}			// 조건이 false 일때 실행
		
		System.out.println((val1 < 3) ? "참" : "거짓");
		// if ~ else ============= 3 항 연산자로 변환 가능
		
		System.out.println("===================================");
		
		// Type 3 : 조건이 여러개 일때
		
		int val2 =95;
		
		if (val2 > 90) {System.out.println("A학점 입니다.");}
		else if (val2 > 80) {System.out.println("B학점 입니다.");}
		else if (val2 > 70) {System.out.println("C학점 입니다.");}
		else if (val2 > 60) {System.out.println("D학점 입니다.");}
		else {System.out.println("F학점 입니다.");}
		
		
		System.out.println("============조건의 순서를 바꿀경우 원치 않는 내용이 출력 될 수 있다.=======================");
		
		
		int val3 = 95 ; // 조건을 적용할때 세밀하게 적용해야 할 필요도 있다. --- 처음 만족해버리면 break로 빠져나와버려서 의미가 없다.
		
		if (val3 > 50) {System.out.println("F학점");}
		else if (val3 > 60) {System.out.println("D학점");}
		else if (val3 > 70) {System.out.println("C학점");}
		else if (val3 > 80) {System.out.println("B학점");}
		else if (val3 > 90) {System.out.println("A학점");}
		else {
			//위의 조건이 모두 만족하지 않을때, switch 문의 default
		System.out.println("F학점");}
		
		
		System.out.println("============조건을 부여할때 세밀하게 적용해야할 필요도 있다.=======================");

		int val4 = 95 ; // 조건을 적용할때 세밀하게 적용해야 할 필요도 있다.
		
		if (val4 >= 60 && val4 <70) {System.out.println("D학점");}  //True && True ===> 둘다 만족해야 트루
		else if (val4 >= 70 && val4 <80) {System.out.println("C학점");}
		else if (val3 > 70 && val4 <90) {System.out.println("B학점");}
		else if (val4 > 90 && val4 <100) {System.out.println("A학점");}
		else {
			//위의 조건이 모두 만족하지 않을때, switch 문의 default
		System.out.println("F학점");}
		
		
	}

}
