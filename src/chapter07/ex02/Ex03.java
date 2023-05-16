package chapter07.ex02;

import java.util.Scanner;

class E {
	
	//a는 배열, b는 배열의 각 방의 값을 곱하는 인자
	//배열의 각방의 값을 b인자로 받은 변수로 곱해서 출력
	
	
	void print (int[] a, int b) {
		//1. 배열의 내용을 출력
		System.out.println("===========배열의 원본 출력============");
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
			
		}
		System.out.print("\n\n");
		
		System.out.println("==================1. 인풋 받은 배열의 내용을 출력 =====================");
		for (int i = 0; i<a.length; i++) {
			System.out.print(a[i]*b + " ");
			
		}
		System.out.print("\n\n");
		
		
	}
}

public class Ex03 {

	public static void main(String[] args) {
		
		
		
		
		E e1 = new E();
		
		int[] arr1 = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		int b= 3;
		
		e1.print(arr1, b);
		
		
	
		
		
	}
	
}
