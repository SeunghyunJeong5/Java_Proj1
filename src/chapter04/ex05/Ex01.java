package chapter04.ex05;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		// 단축키 : ctrl + shift + f ----->코드를 자동정렬 해준다.
		// 단축키 : ctrl + alt + 방향키 : 선택된 라인을 복사
		// 단축키 : alt + 방향키 : 선택된 라인이동
		
		
		// 스캐너로 번호를 인풋 받아서
		// 4번을 누를때까지 계속 무한루프
		// do while, if, for-for문 다 사용

		Scanner sc = new Scanner(System.in);
		int a;

		do {

			System.out.println("===============================================================");
			System.out.println("1. 구구단 출력 | 2. 19단 출력 | 3. 19단 중 7배수단 출력 | 4. 프로그램 종료");
			System.out.println("===============================================================");
			System.out.println("위의 번호를 입력하세요>>>>>");

			a = sc.nextInt();

			if (a == 1) {
				System.out.println(" 1. 구구단 출력 ");
				for (int b = 1; b < 10; b++) {
					System.out.print("\n\n");

					System.out.println(b + "단");
					for (int c = 1; c < 10; c++) {
						System.out.print(b + " * " + c + " = " + b * c + "\t");

					}
				}
				System.out.print("\n\n");
			}

			else if (a == 2) {
				System.out.println(" 2. 19단 출력 ");
				for (int b = 1; b < 20; b++) {
					System.out.print("\n\n");
					System.out.println(b + "단");
					for (int c = 1; c < 20; c++) {
						System.out.print(b + " * " + c + " = " + b * c + "\t");

					}
				}
				System.out.print("\n\n");
			}

			else if (a == 3) {
				System.out.println(" 3. 19단 중 7의 배수단 출력 ");
				for (int b = 1; b < 20; b++) {

					if (b % 7 == 0) {
						System.out.print("\n\n");
						System.out.println(b + "단");
						for (int c = 1; c < 20; c++) {
							System.out.print(b + " * " + c + " = " + b * c + "\t");

						}
					}
				}
				System.out.print("\n\n");
			}

			else if (a == 4) {

				break;
			}

			else {
				System.out.println("잘못 입력 했습니다. (1 ~ 4번 까지의 정수를 입력하세요.)");
			}

		} while (true);

		System.out.println("프로그램이 종료 되었습니다.");

		sc.close();

	}

}
