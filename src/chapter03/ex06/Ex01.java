package chapter03.ex06;

import java.util.Scanner;

public class Ex01 {
	
	
	public static void main(String[] args) {
		
		
		// 문제1. : 삼항 연산자를 사용해서 스캐너로 정수값을 인풋받아서 인풋 받은 값이 홀수이면
		//			" 지금 넣은 값은 0 이고 [홀수 / 짝수]" 입니다." ==========2로나누었을때 값이 0이면 짝수...
		
		
		
		/*Scanner sc = new Scanner(System.in);
		
		int val1;
		
		System.out.println("값을 입력하십시오");
		val1 = sc.nextInt();
		
		String val2 = (val1%2==0) ? "짝수" : "홀수" ;
				
				//int val1 = (3>5) ? 6 : 9;
		
		System.out.println(" 지금 넣은 값은 %d 이고 %s 입니다.", val1, val2 );
		*/
		
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("정수값을 입력하십시오");
		a = sc.nextInt();
		System.out.println( (a%2==0) ? "짝수 입니다.\n" : "홀수 입니다.\n");
		
		
		// 문제2. : 스캐너로 인풋 받은 값이 3,6,9의 배수이면 (__%3 | __%6 | __%9)
		//			" 지금 넣은 값은 3, 6, 9의 배수 입니다. "
		//			" 지금 넣은 값은 3, 6, 9의 배수가 아닙니다."
		
		System.out.println("또 다른 정수값을 하나 넣어 주세요");
		a = sc.nextInt();
		System.out.println( (a%3==0 || a%6==0 || a%9==0) ? "369의 배수입니다." : "369의 배수가 아닙니다.");
		
	}
	
	

}
