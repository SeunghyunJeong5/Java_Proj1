package chapter02.scanner;

import java.util.Scanner;

public class Ex02 {
	
	
	public static void main(String[] args) {
		//1. 스캐너 등록
		//2. 우리 가족의 이름(String) 및 몸무게 (double) 를 인풋 받고, 몸무게의 합과, 평균을 구해서 출력하는 프로그램을 작성
			// sc.nextDouble(); --- 실수값을 입력 받을때 써먹는것 
		
		Scanner sc = new Scanner(System.in);
		
		
		String grandMatherName ;
		String fatherName ;
		String matherName ;
		String sisterName ;
		String myName ;
		double grandMatherWeight ;
		double fatherWeight ;
		double matherWeight ;
		double sisterWeight ;
		double myWeight ;
		
		
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
		System.out.println("할머니 몸무게를 입력하세요 >>>");
		grandMatherWeight = sc.nextDouble();
		System.out.println("아버지 몸무게를 입력하세요 >>>");
		fatherWeight = sc.nextDouble();
		System.out.println("어머니 몸무게를 입력하세요 >>>");
		matherWeight = sc.nextDouble();
		System.out.println("누나의 몸무게를 입력하세요 >>>");
		sisterWeight = sc.nextDouble();
		System.out.println("나의 몸무게를 입력하세요 >>>");
		myWeight = sc.nextDouble();
		
		
		double sum = grandMatherWeight + fatherWeight + matherWeight + sisterWeight + myWeight ;
		double avg = sum/5.0 ;
		
		
		System.out.printf("입력한 할머니의 성함은 %s이고, 입력한 아버지의 성함은 %s이고, 어머니의 성함은 %s이고, 누나의 성함은 %s이고, 나의 이름은 %s 입니다. \n 그리고 입력한 할머니의 몸무게는 %.2fkg이고, 아버지의 몸무게는 %.2fkg이고, 어머니의 몸무게는 %.2fkg이고, 누나의 몸무게는 %.2fkg이고, 나의 몸무게는 %.2fkg 입니다.\n", grandMatherName, fatherName, matherName, sisterName, myName, grandMatherWeight, fatherWeight, matherWeight, sisterWeight, myWeight);
		
		System.out.printf("우리 가족의 몸무게의 총합은 %.2fkg 이고, 몸무게의 평균은 %.2fkg 입니다.", sum, avg);
		
		
		
		
		
	}

}
