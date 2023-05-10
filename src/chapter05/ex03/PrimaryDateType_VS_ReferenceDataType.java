package chapter05.ex03;

import java.util.Arrays;

public class PrimaryDateType_VS_ReferenceDataType {
	
	public static void main(String[] args) {
		
		/*
		 	기본 데이터 타입 VS 참조 데이터 타입
		 
		 */
		
		System.out.println("=======1. 기본 데이터 타입에서 대입 연산(Stack의 값을 복사)");
		int val1 =3;
		int val2 = val1; 			// val2 =3
		val2 = 7;
		
		System.out.println(val1);		//3
		System.out.println(val2);		//7
		
		System.out.println("========2. 참조 데이터 타입에서 대입 연산 (Stack의 Heap의 주소를 복사)");
		int[] arr1 = new int[] {3,4,5};
		int[] arr2 = arr1;						// 주소를 복사한것.
		
		arr2[0] =7;
		
		System.out.println(arr1[0]);		//7------------> arr2의 0번방에 저장되어있는 값을 읽어온것(arr1의 주소와 2의 주소가 같아졌으므로)
		System.out.println(arr2[0]);		//7 ------------> arr2의 1번 2번방에는 4,5가 각각있다.
		
		System.out.println(arr1);
		System.out.println(arr2);
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		
		
		
		
		
	}
	

}
