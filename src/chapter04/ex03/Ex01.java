package chapter04.ex03;

import java.util.Iterator;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		/*
		 스캐너로 1~9 까지의 정수를 인풋 받아서 for문을 사용해서 인풋받은 단수를 출력
		 1. println()으로 출력
		 2. printf() 로 출력
		 */
		
		
		Scanner sc = new Scanner(System.in);
		/*
		 int i, j ;
		 System.out.println("출력할 단수 (1단~9단) 정수를 입력하세요 >>>");
		 
		 위에꺼는
		 	
		for (j=1; j<10; j++) {
			System.out.println(i + " * " + j + " = " + i*j );
		 
		 밑에꺼는
		 
		 for (j=1; j<10; j++) {
			System.out.printf("%d * %d = %d \n", i, j, i*j);
		 
		 */
		int a;
		
		System.out.println("정수를 입력해주세요.");
		
		a = sc.nextInt();
		
		System.out.println("=============println()으로 출력=========================================");
		
		for (int b=1; b<10; b++) {
			System.out.println(a + " * " + b + " = " + a*b );
			
		}
		
		System.out.printf("=============printf()로 출력=========================================");
		
		for (int b=1; b<10 ; b++) {
			System.out.printf("%d * %d = %d \n", a, b, a*b);
		}
		
		
		sc.close(); //------------이거 해줘야됨???
		
	}
	
}
