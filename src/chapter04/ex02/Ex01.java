package chapter04.ex02;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		
		// switch 문으로 작성
		
		// 1. Scanner 로 정수 1,2,3  을 인풋 받아서
		// 1 : "금메달 입니다."
		// 2 : "은메달 입니다."
		// 3 : "동메달 입니다."
		// 그외 정수를 인풋 받으면 : "메달이 없습니다."
		
		Scanner sc = new Scanner(System.in);
		
		int number ;
		
		System.out.println("등수를 입력하세요.");
		number = sc.nextInt();
		
		switch (number) {
		case 1:
			System.out.println("금메달 입니다.");
			break;
		case 2:
			System.out.println("은메달 입니다.");
			break;
		case 3:
			System.out.println("동메달 입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
			break;
		}
		
		
		System.out.println("============================================");
		
		
		
		
		//============================================================
		// 2. Scanner 로 문자열 "gold", "silver", "bronze"
		//	 "gold" : "금메달 입니다."
		//	 "silver" : "은메달 입니다."
		//	 "bronze" : "동메달 입니다."
		// 그외 정수를 인풋 받으면 : "메달이 없습니다."
		
		
		String color ;
		
		System.out.println("메달 색깔을 입력하세요.(gold, silver, bronze, 나머지)");
		color = sc.next();

		switch (color) {
		case "gold": case "Gold": case "GOLD": //이렇게 해도 된다.
			System.out.println("금메달 입니다.");
			break;
		case "silver":
			System.out.println("은메달 입니다.");
			break;
		case "bronze":
			System.out.println("동메달 입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
			break;
		}
		
		
		
	}

}
