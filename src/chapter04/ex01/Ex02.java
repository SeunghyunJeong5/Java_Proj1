package chapter04.ex01;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
		
		//1. Scanner 등록 (컨트롤 쉬프트 o)
		Scanner sc = new Scanner(System.in);
		
		
		// 프로그램 선택 변수
		int select ; 		//1. 학점의 합계/평균, 2. 홀수/짝수인지 확인하는 프로그램, 같은 이름을 식별
		
		
		// 국어 / 영어 / 수학 점수를 인풋 받는 변수 선언
		int kor;
		int eng;
		int math;
		
		
		
		// 정수 값을 인풋 받아서 홀수/짝수 인지 확인 하는 프로그램에 사용하는 변수
		int a ;
		
		
		
		// 두 변수의 값을 받아서 같은 이름인지 확인하는 프로그램
		String aName ;
		String bName ;
		
		System.out.println("==========================================");
		System.out.println("1. 학점의 합계/평균 | 2. 홀수/짝수 | 같은이름 식별");		
		System.out.println("==========================================");
		
		System.out.println("위 프로그램 번호를 입력하세요 >>>");
		
		//사용자로부터 프로그램 선택
		select = sc.nextInt();
		
		//if 조건으로 프로그램 실행
		if (1==select) {
			//스캐너로 부터 국어/영어/수학 인풋 받아서 합계와 평균을 출력
			
			System.out.println("1번 항목을 출력 했습니다.");
			
			System.out.println("국어 점수를 입력하세요.");
			kor = sc.nextInt();
			System.out.println("영어 점수를 입력하세요.");
			eng = sc.nextInt();
			System.out.println("수학 점수를 입력하세요.");
			math = sc.nextInt();
			
			int sum = kor + eng + math ;
			double avg = sum / 3.0 ;
			
			System.out.printf(" 과목의 총점은 %d이고, 평균은 %.2f 입니다.", sum, avg );
			
			}
		
		
		else if (2==select) {
			// a변수에 정수 값을 인풋 받아서 홀수인지 짝수인지 출력
			System.out.println("2번 항목을 출력 했습니다.");
			System.out.println("정수를 입력하세요.");
			
			a = sc.nextInt();
			if (a%2 == 0) {System.out.println("짝수 입니다.");}
			else {System.out.println("홀수 입니다.");}
			
		//	System.out.println( (a % 2 == 0) ? "짝수입니다." : "홀수 입니다.");
			
		}
		
		
		
		else if (3==select) {
			//aName, bName 두 변수의 문자열을 인풋 받아서 두 문자열이 같은 이름인지 식별
			System.out.println("3번 항목을 출력 했습니다.");
			System.out.println(" 첫번째 이름을 입력하세요.");
			aName = sc.next();
			System.out.println(" 두번째 이름을 입력하세요.");
			bName = sc.next();
			
			if (aName.equals(bName)) {System.out.println("같은 이름입니다.");} //검색해서 equals 알아냄... == 연산자로는 string 이라 안됨.....
			else {System.out.println("다른 이름입니다.");}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		// 스캐너 종료 : 사용 후 메모리에서 제거
		sc.close();
		
	}

}
