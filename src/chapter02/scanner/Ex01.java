package chapter02.scanner;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		// 1. scanner 등록
		// 2. 아버지 성함, 어머니 성함, 형제 이름, 자신이름 : sc.next();
				// 아버지 연세, 어머니 연세, 형제 나이, 자신의 나이 : sc.nextInt();
		// 3. 스캐너로 받은 변수의 값을 출력
		// 4. 전체 나이의 합계, 평균을 구해서 소숫점이하 2자리 까지만 출력
		
		Scanner sc = new Scanner(System.in);
		
		String grandMatherName ;
		String fatherName ;
		String matherName ;
		String sisterName ;
		String myName ;
		int grandMatherAge ;
		int fatherAge ;
		int matherAge ;
		int sisterAge ;
		int myAge ;
		
		// System.out.println(" 아버님이름 어머님이름 형제이름 나의이름을 공백을 구분해서 입력하세요 >>>> ");----------이것처럼 해도됨.(이러면 입력을 하나 입력하고 엔터 안치고 하나 스페이스바 하나 이런식으로 다 입력해도됨)
		System.out.println("할머니 성함을 입력하세요 >>>");
		grandMatherName = sc.next();
		System.out.println("아버지 성함을 입력하세요 >>>");
		fatherName = sc.next();
		System.out.println("어머니 성함을 입력하세요 >>>");
		matherName = sc.next();
		System.out.println("누나의 성함을 입력하세요 >>>");
		sisterName = sc.next();
		System.out.println("나의 이름을 입력하세요 >>>");
		myName = sc.next();
		System.out.println("할머니 연세를 입력하세요 >>>");
		grandMatherAge = sc.nextInt();
		System.out.println("아버지 연세를 입력하세요 >>>");
		fatherAge = sc.nextInt();
		System.out.println("어머니 연세를 입력하세요 >>>");
		matherAge = sc.nextInt();
		System.out.println("누나의 연세를 입력하세요 >>>");
		sisterAge = sc.nextInt();
		System.out.println("나의 나이를 입력하세요 >>>");
		myAge = sc.nextInt();
		
		
		int sum = grandMatherAge + fatherAge + matherAge + sisterAge + myAge ;
		double avg = sum/5.0 ;
		
		
		System.out.printf("입력한 할머니의 성함은 %s이고, 입력한 아버지의 성함은 %s이고, 어머니의 성함은 %s이고, 누나의 성함은 %s이고, 나의 이름은 %s 입니다. \n 그리고 입력한 할머니의 연세는 %d이고, 아버지의 연세는 %d이고, 어머니의 연세는 %d이고, 누나의 연세는 %d이고, 나의 나이는 %d 입니다.\n", grandMatherName, fatherName, matherName, sisterName, myName, grandMatherAge, fatherAge, matherAge, sisterAge, myAge);
		
		System.out.printf("우리 가족의 나이의 총합은 %d세 이고, 나이의 평균은 %.2f세 입니다.", sum, avg);
		
		
		
	}
	
	
	

}
