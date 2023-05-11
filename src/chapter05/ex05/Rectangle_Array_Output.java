package chapter05.ex05;

import java.util.Arrays;

public class Rectangle_Array_Output {

	public static void main(String[] args) {

		/*
		 * 2차원 - 정방형 배열 출력 방법 
		 * - for - for
		 * - Enhanced for - Enhanced for -
		 * - Arrays.toString (배열변수)
		 * 
		 */

		// 배열 ==> 행:3, 열:100( index : 0~99번까지 존재) : 이중 for문을 통해 만들기
		// 0행 - 1~100 까지 정수
		// 1행 - 2의 배수
		// 2행 - 3의 배수

		int[][] arr1 = new int[3][100];

		for (int i = 0; i < arr1.length; i++) { // 행을 Loop :0,1,2

			if (i == 0) {

				for (int j = 0, a = 1; j < arr1[i].length; j++, a++) { // 열을 Loop :0,1,2,3,4,5.....99
					arr1[i][j] = a; // j+1; 해도된다.
				}
			}

			else if (i == 1) {
				for (int j = 0, a = 2; j < arr1[i].length; j++, a += 2) {

					arr1[i][j] = a;

				}

			} else if (i == 2) {
				for (int j = 0, a = 3; j < arr1[i].length; j++, a += 3) {
					arr1[i][j] = a;

				}

			}

		}

		/*
		 * if(i==0) { for (int j =0, a=1; j< arr1[i].length; j++) {
		 * 
		 * arr1[i][j]=a; a++; }
		 * 
		 * 
		 * }
		 * 
		 * else if (i ==1) { for (int j=0,a=1; j<arr1[i].length;a++) {
		 * 
		 * if (a%2==0) { arr1[i][j]=a; j++; } }
		 * 
		 * }
		 * 
		 * else if (i ==2) { for (int j=0,a=1; j<arr1[i].length;a++) {
		 * 
		 * if( a%3==0) { arr1[i][j]=a; j++; } }
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 * }
		 */

		System.out.println("==========1. 이중 for 사용해서 2차원 정방형 배열 출력 ==============");

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				if (j<arr1[i].length-1) {			// 0 번방부터 98번방까지 출력
				System.out.print(arr1[i][j] + " , ");
				}
				else {
					System.out.print(arr1[i][j]);
				}
			}
			System.out.println();

		}
		
		
		
		System.out.println("==========2. 이중 Enhanced for 을 사용해서 2차원 정방형 배열 출력 ==============");
		
		for (int [] k: arr1) {						//arr1이 첫번째k에 저장되고, 두번째k에 저장되고, 세번째k에 저장된걸 a에 저장해서 읽어온다.
			for (int a : k) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		

		System.out.println("==========3. Arrays.toString 을 사용해서 2차원 정방형 배열 출력 ==============");
		// Arrays.toString()

		System.out.println(Arrays.toString(arr1[0])); // 0행의 값
		System.out.println(Arrays.toString(arr1[1])); // 1행의 값
		System.out.println(Arrays.toString(arr1[2])); // 2행의 값

	}

}
