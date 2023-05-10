package chapter05.ex02;

import java.util.Arrays;

public class Array_Initial_Value {
	
	public static void main(String[] args) {
		
		/*
		 		배열의 초기값 지정 :
		 			참조 자료형 : boolean : false, 정수(byte, short, int, long) : 0, 실수(float, double) : 0.0
		 						문자(char) : 공백
		 						String : NULL
		 
		 */
		
		// 1. Stack 메모리값( 강제 초기화가 되지 않음) ---> 기본 자료형의 값
		int val1;
		
	//	System.out.println(val1);   		//오류발생 (변수의 기본값을 할당하지 않음, stack 의 값은 강제 초기화가 안됨 )
		

		int[] val2; 		//배열 선언, Heap 영역의 주소 값이 없는 상태
		//System.out.println(val2); 			//오류발생 (Heap 영역이 생성되지 않는 상태 , new int[3]같은게 있어야한다.)
		
		val2 = new int[3];
		
		System.out.println(val2);			//객체의 Heap영역의 주소가 출력됨 , 16진수로 출력됨
		
		//방의 값 출력
		System.out.println(val2[0]);
		System.out.println(val2[1]);
		System.out.println(val2[2]);
		
		System.out.println("==================================");
		
		int[] val3 = null; // 참조 자료형일때만 객체 주소에 null값을 할당 할수가 있다.(주소가 null값이 된것)
		System.out.println(val3);			// 객체 자체를 출력할때 Stack에 저장된 Heap 의 주소 : 16진수로 저장됨
		
		val3 = new int[4];	// 주소값을 읽어오게 만든것(방을 만들었으니까 주소가 생성된것)
		System.out.println(val3);		//Heap 영역의 주소를 출력
		
		
		
		// 2. Heap 메모리 값( 강제 초기화가 됨)  ----> 참조 자료형의 값 
		
		
		boolean[] a = new boolean[3];
		System.out.println(a[0]);		//false(초기값)
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println("==================================");
		
		
		int [] b = new int [3];				//정수 : byte, short, int, long
		System.out.println(b[0]);			//0(초기값)
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println("==================================");

		
		double[] c = new double[3];			//실수 : float, double
		System.out.println(c[0]);			//0.0(초기값)
		System.out.println(c[1]);
		System.out.println(c[2]);
		System.out.println("==================================");

		
		char[]d = new char[3];				//문자 : 공백
		System.out.println("char 기본값은 공백 : " + d[0]);
		System.out.println("char 기본값은 공백 : " + d[1]);
		System.out.println("char 기본값은 공백 : " + d[2]);
		System.out.println("==================================");

		
		String []e = new String[3];
		System.out.println(e[0]);			// null -------> 0이 아닌 비어있는 공허한 상태
		System.out.println(e[1]);
		System.out.println(e[2]);
		System.out.println("==================================");

		
		//Arrays.toString(배열변수);    		----> 배열의 모든 값을 출력함.
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));
		System.out.println(Arrays.toString(e));
		
		
		
		
		
	}

}
