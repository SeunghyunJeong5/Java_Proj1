package chapter04.ex05;

import java.util.Scanner;

public class Do_While_Statement02 {
	
	public static void main(String[] args) {
		
		// do while 문을 사용해서 무한루프를 돌립니다.
		// do while 문 내에서 if를 사용
		// 스캐너에서 정수 값을 입력 받아서 
		// 숫자 4를 누르면 (4 : 무한 루프를 빠져나온다.)(프로그램을 빠져 나온다.)
		// 1 : "평균 출력"
		// 2 : "합계 출력"
		// 3 : "이름 출력"
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int a ;
		
		do {
			
			System.out.println("====================================================");
			System.out.println("1. 평균 출력 | 2. 합계 출력 | 3. 이름 출력 | 4. 프로그램 종료");
			System.out.println("====================================================");
			System.out.println("위의 번호를 입력하세요>>>>>");
			
			a = sc.nextInt();
			
			if(a==1) {
				System.out.println(" 평균 출력 ");
			}
			else if(a==2) {
				System.out.println(" 합계 출력 ");
			}
			else if(a==3) {
				System.out.println(" 이름 출력 ");
			}
			else if(a==4) {
				System.out.println("프로그램 종료");
					break;
				}
			else {
				System.out.println("잘못 입력 했습니다. (1 ~ 4번 까지의 정수를 입력하세요.");
			}
			
			
		}while (true); //a선언안하고 while (true)라고 해도됨

		System.out.println("While 문을 빠져나왔습니다. 프로그램이 종료 되었습니다.");
		
		sc.close();
		
		
	}

}
