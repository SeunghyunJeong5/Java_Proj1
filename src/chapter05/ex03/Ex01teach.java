package chapter05.ex03;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01teach {

	public static void main(String[] args) {

		// 배열에 저장후 출력

		Scanner sc = new Scanner(System.in);

		// 변수 선언
		int[] arr1; // 배열변수 : arr1 선언
		int n; // 프로그램을 선택하는 변수 (1,2,3,4)
		int idx; // 배열 방의 크기를 저장하는 변수

		do {

			System.out.println("==================================================================================");
			System.out.println("1. 인풋 값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수 저장 후 출력");// 7,8,14,16.....
			System.out.println("2. 인풋 값을 받아서 방의 크기를 지정하고 1씩 증가하도록 값을 넣는데, 4배수만 빼고 저장 후 출력");// 1,2,3,5,6,7,9.....
			System.out.println("3. 인풋 값을 받아서 방의 크기를 지정하고 3의 배수만 저장하는데 그중 6의 배수인 경우만 빼고 저장후 출력");// 3,9,15....
			System.out.println("4. 프로그램 종료");
			System.out.println("==================================================================================");

			System.out.println(" 1 ~ 4번까지 번호를 입력하세요 >>>");
			n = sc.nextInt();

			if (n == 1) {
				System.out.println("1. 인풋 값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수 저장 후 출력");
				System.out.println(" 배열의 방크기를 정수로 입력해주세요.");
				idx = sc.nextInt(); // 콘솔에서 입력 받아서 배열 방 크기를 지정

				arr1 = new int[idx]; // 배열방 생성

				// 배열방의 for문을 사용해서 7의 배수와 8의 배수를 배열방에 저장
				int a = 0; // 배열 방의 번호
				for (int i = 1;; i++) { // i = 배열의 방에 저장되는 7의 배수와 8의 배수의 값(무한루프로 값을 증가할수있게 만듦--->탈출 break를 만들어 줘야됨.)

					if (i % 7 == 0 | i % 8 == 0) { // i가 7or8의 배수일때
						arr1[a] = i;
						a++; // 배열의 방번호
					}

					if (a == idx)
						break; // 무한루프 탈출 방법

				}
				// for문을 사용해서 배열의 각방의 내용을 출력
				for (int i = 0; i < arr1.length; i++) {
					System.out.print(arr1[i] + " "); // 왜 i인거지?---이 i와 위에꺼는 다른i 입니다....
				}

				System.out.print("\n\n");

				// Enhanced For 문을 사용해서 출력
				for (int k : arr1) {
					System.out.print(k + " ");
				}
				System.out.print("\n\n");

				// Arrays.toString()으로 출력
				System.out.println(Arrays.toString(arr1));

			}

			else if (n == 2) {

				System.out.println("2. 인풋 값을 받아서 방의 크기를 지정하고 1씩 증가하도록 값을 넣는데, 4배수만 빼고 저장 후 출력");
				System.out.println(" 배열의 방크기를 정수로 입력해주세요.");
				idx = sc.nextInt();
				arr1 = new int[idx]; // 배열의 방크기 지정
				int i = 0; // 방번호를 지정하는 변수

				for (int a = 1;; a++) { // 배열의 각 방에 값을 저장하는 for문

					if (a % 4 == 0)
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

			}

			else if (n == 3) {

				System.out.println("3. 인풋 값을 받아서 방의 크기를 지정하고 3의 배수만 저장하는데 그중 6의 배수인 경우만 빼고 저장후 출력");
				System.out.println(" 배열의 방크기를 정수로 입력해주세요.");
				idx = sc.nextInt();
				arr1 = new int[idx];
				int i = 0;
				for (int a = 3;; a += 3) {
					if (a % 6 == 0)
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

			}

			else if (n == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;

			}

			else {
				System.out.println("잘못 입력 했습니다. (1 ~ 4번 까지의 번호를 입력하세요.)");

			}

		} while (true);

		sc.close();

	}

}
