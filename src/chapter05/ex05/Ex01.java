package chapter05.ex05;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {

		// 2차원 정방형 배열:
		// 4행 200열 배열 선언
		// 0행 : 5의 배수
		// 1행 : 3의 배수
		// 2행 : 7,8의 배수
		// 3행 : 4의배수 이면서 7의배수 인 값 : 28이 시작

		// 1. 배열 변수 선언
		// 2. 배열의 각 행에 값 입력
		// 3. 출력 (for, enhanced for, Arrays.toString() )

		int[][] arr1 = new int[4][200];

		for (int i = 0; i < arr1.length; i++) {

			if (i == 0) {
				for (int j = 0, a = 1; j < arr1[i].length;  a++) {

					if (a % 5 == 0) {
						arr1[i][j] = a;
						j++;
					}
				}

			}

			else if (i == 1) {
				for (int j = 0, a = 1; j < arr1[i].length; a++) {
					if (a % 3 == 0) {
						arr1[i][j] = a;
						j++;
					}

				}

			}

			else if (i == 2) {
				for (int j = 0, a = 1; j < arr1[i].length; a++) {
					if (a % 7 == 0 | a % 8 == 0) {
						arr1[i][j] = a;
						j++;
					}

				}

			}

			else if (i == 3) {
				for (int j = 0, a = 1; j < arr1[i].length;  a++) {
					if (a % 4 == 0 && a % 7 == 0) {
						arr1[i][j] = a;
						j++;
					}
				}

			}

		}
		
		
		
		System.out.println("==========1. 이중 for 사용해서 2차원 정방형 배열 출력 ==============");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}

			System.out.println();
		}

		

		
		System.out.println("==========2. 이중 Enhanced for 을 사용해서 2차원 정방형 배열 출력 ==============");
		for (int[] k : arr1) {
			for (int a : k) {
				System.out.print(a + " ");
			}
			System.out.println();
		}

		
		System.out.println("==========3. Arrays.toString 을 사용해서 2차원 정방형 배열 출력 ==============");
		
		System.out.println(Arrays.toString(arr1[0]));
		System.out.println(Arrays.toString(arr1[1]));
		System.out.println(Arrays.toString(arr1[2]));
		System.out.println(Arrays.toString(arr1[3]));

	}

}
