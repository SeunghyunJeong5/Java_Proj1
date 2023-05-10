package chapter05.ex03;

import java.util.Arrays;
import java.util.Scanner;

public class DDddd {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr1; // 배열변수 : arr1 선언
		int n; // 프로그램을 선택하는 변수 (1,2,3,4)
		int idx; // 배열 방의 크기를 저장하는 변수
	
		
		System.out.println("3. 인풋 값을 받아서 방의 크기를 지정하고 3의 배수만 저장하는데 그중 6의 배수인 경우만 빼고 저장후 출력");
		System.out.println(" 배열의 방크기를 정수로 입력해주세요.");
		idx = sc.nextInt();
		arr1 = new int[idx];
		int i = 0;
		for (int a = 3;; a+=3) {
			if (i % 6 == 0)
				continue;
			
				arr1[i] = a;
				i++;
			
			
			if (i == idx)
				break;

		}

		// 배열의 저장된 내용을 출력 : For
		for (i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.print("\n\n");
		// 배열의 저장된 내용을 출력 : Enhanced For
		for (int k : arr1) {
			System.out.print(k + " ");
		}
		System.out.print("\n\n");
		// 배열의 저장된 내용을 출력 : Arrays.toString()
		System.out.println(Arrays.toString(arr1));
		
		
		
		
		sc.close();
		
	}

}
