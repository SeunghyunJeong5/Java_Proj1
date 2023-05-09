package chapter04.ex05;

public class Do_While_Statement {
	
	public static void main(String[] args) {
		
		
		
		// do while 문 : 조건과 상관없이 첫 1회는 무조건 실행블락을 실행 시킴. 조건을 확인 후 반복
		
		// 1. while 문 : 실행블락은 조건이 true일때만 실행시킴
		
		//		초기값
		//	while (조건) {
		//		실행블락
		//	증감식;
		//	}
		
		
		// 2. do while 문
		//		초기값
		//		do {
		//		실행블락
		//		증감식 ;
		//		}while (조건) ;               ------------ 실행을 무조건 한번하고 트루이면 다시하고 아니면 안함
		
		
		
		//1. while 문
		
		System.out.println("=========while문===========");
		int a =0 ;
		while (a<0) {						//false 이므로 실행 블락이 실행되지 않는다.
			System.out.println(a + " ");
		}
			
		//2. do while 문
		
		System.out.println("=========do while문===========");
		
		do {
			System.out.print(a + " "); // 조건과 상관없이 1번은 실행블락이 작동됨.
		} while (a<0);
		
		
		
		//3. 반복횟수가 10번인 경우 : while 문과 do while 문을 비교
		
		System.out.println("=========반복횟수가 10번인 경우 : while 문과 do while 문을 비교===========");
		
		
		
		System.out.println("=========while문===========");
		a = 0; // 변수의 값을 변경
		while ( a< 10) {
			System.out.print(a +" "); //0~9 10번출력
			a++;
		}
		System.out.println();
		
		
		System.out.println("=========do while문===========");
		a = 0;
		do {
			System.out.print(a + " ");
			a++;
		}while (a < 10);
		
		
		
		
		
	}
	

}
