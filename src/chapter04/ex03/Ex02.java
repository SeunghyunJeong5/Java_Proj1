package chapter04.ex03;

public class Ex02 {
	
	public static void main(String[] args) {
		
		
		
		/*
		 2중 for 문을 사용해서 구구단 출력 (print ("\t") 참고사용), println()
		 
		 1단 
		 1 * 1 = 1 \t 1 * 2 = 2		1 * 3 = 3	...... 1*9=9
		 2단
		 2 * 1 = 2		2*2=4	.....
		 
		 ...
		 
		 9단
		 9*1=9..........................................9*9=81
		  
		 이렇게 출력이 되도록 작성.
		 */
		System.out.println("==============println()로 출력 ===============");
		int i,j ;
		
		for (i=1; i<10; i++) {
			System.out.println(i+"단");
			System.out.println();
			for (j=1; j<10; j++) {
				System.out.print(i + " * " + j + " = " + i*j + "\t");
			}
			System.out.println(); System.out.println();
				
		}
		 
		System.out.println("==============printf()로 출력 ===============");
		
		for (i=1; i<10; i++) {
			System.out.println(i+"단");
			System.out.println();
			for (j=1; j<10; j++) {
				System.out.printf("%d * %d = %d \t", i,j,i*j);
			}
			System.out.println(); System.out.println();
				
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
