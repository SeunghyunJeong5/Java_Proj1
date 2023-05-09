package chapter04.ex03;

public class Ex03 {
	
	public static void main(String[] args) {
		
		
		
		// 1. 이중 for 문을 사용해서 1단에서 19단까지 출력
		// 2. 이중 for 문을 사용해서 1단에서 19단까지 출력 중 3의 배수단만 출력 (if 조건문을 사용하면 됨)
		
		
		System.out.println(" ========== 1. 1단 ~ 19단까지 출력 ============= ");
		
		
		
		
		for (int i = 1; i<20; i++) {
			System.out.println(i+"단");
			System.out.println();
			for (int j = 1; j<10; j++) {
				System.out.print(i + " * " + j + " = " + i*j + "\t");
			}
			System.out.println(); System.out.println();
				
		}
		
		

		System.out.println(" ========== 2. 1단 ~ 19단까지 출력 내용중 3의 배수단만 출력 ============= ");
		
		for (int i = 1 ; i < 20 ; i++) {
			if ( i%3==0 ) {
			System.out.println(i + "단");
			System.out.println();
			
			for (int j = 1 ; j < 10 ; j++ ) {
				System.out.print(i + " * " + j + " = " + i*j + "\t");
				
				}
			
			System.out.println();System.out.println();
			}
		}
		
		
		System.out.println(" ========== if 문을 사용 ============= ");
		

		for (int i = 1 ; i < 20 ; i++) {
			if ( i%3==0 ) {
			System.out.println(i + "단");
			System.out.println();
			
			for (int j = 1 ; j < 10 ; j++ ) {
				System.out.print(i + " * " + j + " = " + i*j + "\t");
				
				}
			
			System.out.println();System.out.println();
			}
		}
		
		
		System.out.println(" ========== i 의 증감자를 사용 ============= ");
		

		for (int i = 3 ; i < 20 ; i+=3) {
			
			System.out.println(i + "단");
			System.out.println();
			
			for (int j = 1 ; j < 10 ; j++ ) {
				System.out.print(i + " * " + j + " = " + i*j + "\t");
				
				}
			
			System.out.println();System.out.println();
			
		}
		
		
		
		
		
		System.out.println(" ========== continue 문을 사용 ============= ");
		
		// 제어 키워드 : break; continue;
			// 제어 키워드는 일반적으로 if 문과 같이 사용됨.
			// break ; ----> {} 실행블락을 탈출
			// continue ; ----> continue를 만나면 continue 아래의 내용을 실행하지 않고, 증감식을 작동시킴
		
		

		for (int i = 1 ; i < 20 ; i++) {
			
			if ( i % 3!=0) {continue;} //3의 배수가 아닐때는 continue 가 작동
			System.out.println(i + "단");
			System.out.println();
			
			for (int j = 1 ; j < 10 ; j++ ) {
				System.out.print(i + " * " + j + " = " + i*j + "\t");
				
				}
			
			System.out.println();System.out.println();
			
		}
		
		
		
		
		
		
		
	}

}
