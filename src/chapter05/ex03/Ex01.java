package chapter05.ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		// 배열에 저장후 출력

		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		int d;

		do {

			System.out.println("==================================================================================");
			System.out.println("1. 인풋 값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수 저장 후 출력");// 7,8,14,16.....
			System.out.println("2. 인풋 값을 받아서 방의 크기를 지정하고 1씩 증가하도록 값을 넣는데, 4배수만 빼고 저장 후 출력");// 1,2,3,5,6,7,9.....
			System.out.println("3. 인풋 값을 받아서 방의 크기를 지정하고 3의 배수만 저장하는데 그중 6의 배수인 경우만 빼고 저장후 출력");// 3,9,15....
			System.out.println("4. 프로그램 종료");
			System.out.println("==================================================================================");

			System.out.println(" 1 ~ 4번까지 번호를 입력하세요 >>>");
			a = sc.nextInt();

			if (a == 1) {
				System.out.println("1. 인풋 값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수 저장 후 출력");
				System.out.println(" 배열의 방크기를 정수로 입력해주세요.");
				b = sc.nextInt();
				int[] arr1 = new int[b];
				int j = 0;

				for (int i = 0; i < arr1.length; i++) {

					if (j % 7 == 0) {
						arr1[i] = j;

					}

					else if (j % 8 == 0) {
						arr1[i] = j;

					} else {
						j += 1;

					}

					System.out.print(arr1[i] + " ");

				}

				System.out.print("\n\n");

			}

			else if (a == 2) {

				System.out.println("2. 인풋 값을 받아서 방의 크기를 지정하고 1씩 증가하도록 값을 넣는데, 4배수만 빼고 저장 후 출력");
				System.out.println(" 배열의 방크기를 정수로 입력해주세요.");
				c = sc.nextInt();
				int[] arr2 = new int[c];
				int k = 0;
				for (int i = 0; i < arr2.length; i++) {

					arr2[i] = k;
					k += 1;
				}

			}

			else if (a == 3) {

				System.out.println("3. 인풋 값을 받아서 방의 크기를 지정하고 3의 배수만 저장하는데 그중 6의 배수인 경우만 빼고 저장후 출력");
				System.out.println(" 배열의 방크기를 정수로 입력해주세요.");
				d = sc.nextInt();
				int[] arr3 = new int[d];
				int l = 0;

				for (int i = 0; i < arr3.length; i++) {

					l += 3;

					arr3[i] = l;

					if (l % 6 == 0) {
						continue;
					}
					System.out.print(arr3[i] + " ");
				}
				System.out.print("\n\n");
			}

			else if (a == 4) {
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
