package chapter05.ex01;

public class Array_Definition03 {
	
	public static void main(String[] args) {
		
		
		/*
		 		1차원 배열 선언 방법 3가지
		 */
		
		System.out.println("1. 방법1");
		
		int[] arr1;				//배열 변수 선언
		arr1 = new int[3];		//배열 방을 생성
		
		
		int[] arr2 = new int [3];		//선언과 동시에 배열방 생성
		
		
		int arr3[] = new int [3];		//변수 이름뒤에 대괄호를 넣음
		
		
		int arr4[];
		arr4 = new int [3];
		
		
		arr4[0] = 10; //이런식으로 넣음.
		
		
		
		System.out.println("2. 방법2");		// 배열을 선언과 동시에 값을 할당.
											// 주의 : 방 크기를 지정하면 안됨.
		
		int[] arr5 = new int[] {10,20,30};		//선언과 동시에 방에 값을 바로 할당.
		
	
		int[] arr6; //선언 후 
		arr6 = new int [] {10, 20, 30};
		
		
		System.out.println("3. 방법3");		//선언과 동시에 값을 바로 할당
		
		int [] arr7 = {10,20,30};
		
		
		int [] arr8;
		arr8 = new int[] {10,20,30};		//arr8 = {10, 20, 30}; 은 오류발생
		
		
		
	}

}
