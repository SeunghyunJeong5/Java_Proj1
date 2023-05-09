package chapter04.ex06;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		// 스캐너로 번호를 입력 받고 각 프로그램을 출력하는 프로그램을 작성
		// for 문 블락내에서 scanner를 인풋 받는다.

		Scanner sc = new Scanner(System.in);
		int a;
		int b;

		do {

			System.out.println("=====================================================================");
			System.out.println("1. 1 부터 20까지의 홀수를 차례대로 출력하는 프로그램");
			System.out.println("2. 10이하의 정수를 입력받아 정수만큼 \"JAVA 프로그래밍\" 이라고 출력하는 프로그램");
			System.out.println("3. 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇개인지 출력하는 프로그램");
			System.out.println("4. 입력받은 정수만큼 성적을 입력받아서 총점과 평균을 출력하는 프로그램");
			System.out.println("5. 프로그램 종료 ");
			System.out.println("=====================================================================");
			System.out.println("위의 번호를 입력하세요>>>>>");

			a = sc.nextInt();

			if (a == 1) {
				System.out.println("1. 1 부터 20까지의 홀수를 차례대로 출력하는 프로그램");
				for (int i = 0; i < 20; i++) {
					if (i % 2 != 0) {
						System.out.print(i + " ");
					}

				}
				System.out.print("\n\n");
			}

			else if (a == 2) {
				System.out.println("2. 10이하의 정수를 입력받아 정수만큼 \"JAVA 프로그래밍\" 이라고 출력하는 프로그램");

				System.out.println("10 이하의 정수를 입력하세요.");
				b = sc.nextInt();

				for (int i = 1; i <= b; i++) {

					System.out.println("JAVA프로그래밍" + i);
				}

			}

			else if (a == 3) {
				System.out.println("3. 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇개인지 출력하는 프로그램");
				System.out.println(" 정수 10개를 공백을 사용해서 입력 하세요>>>");

				int input = 0; // 스캐너로 받아서 저장하는 변수
				int even = 0; // 짝수만 카운트 하는 변수

				for (int i = 1; i <= 10; i++) {

					input = sc.nextInt();

					if (input == 0) {
						continue;
					}

					else if (input % 2 == 0) {
						even++;
					}
				}
				System.out.printf("입력받은 짝수의 개수는 %d개 입니다.\n", even);

			}

			else if (a == 4) {
				System.out.println("4. 입력받은 정수만큼 성적을 입력받아서 총점과 평균을 출력하는 프로그램");
				System.out.println(" 학생수를 입력하세요.");
				
				int p = 0;
				int score = 0;
				int sum = 0;
				int avg = 0;
				
				p = sc.nextInt();
				
				for (int i = 0; i <=p; i++) {
					
					score = sc.nextInt();
					
					sum = score + socore;
					
					
					
				}
					
				
				
				
				
				

			}

			else if (a == 5) {

				System.out.println("프로그램을 종료합니다.");
				break;

			}

			else {
				System.out.println("잘못 입력 했습니다. (1 ~ 5번 까지의 번호를 입력하세요.)");

			}

		} while (true);

		sc.close();

	}

}
