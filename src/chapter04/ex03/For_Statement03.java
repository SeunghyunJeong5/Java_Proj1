package chapter04.ex03;

public class For_Statement03 {
	
	public static void main(String[] args) {
		
		
		
		/*
		  이중 for 문을 사용해서 구구단 출력
		  		--for - for
		 
		 */
		
		
		int i,j ; 	// i : 단을 출력 하는 변수 ,  // j : 1~9 번까지 출력 되는 변수
		for ( i = 1; i<10; i++) { //단을 출력하는 블락
			System.out.println(i + "단 출력");
			
			System.out.println("=================================");
			
			for (j =1 ; j < 10 ; j++) { //i =1 일때 이게 9번 돌아간다.
				System.out.println( i + " * " + j + " = " + i*j);
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
