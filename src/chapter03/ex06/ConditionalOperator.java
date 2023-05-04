package chapter03.ex06;

public class ConditionalOperator {
	
	public static void main(String[] args) {
		
		// 삼항 연산자 : if ~ else 를 축약해서 1라인으로 사용하는 구문.
		//			(조건) ? 참(실행구문): 거짓(실행구문) ;  --- 참일때, 거짓일때 실행되는 것이 다르다.
		
		
		int val1 = (3>5) ? 6 : 9;
		
		System.out.println(val1); //  9 (조건이 거짓 이므로)
		
		
		int val2 = (3<5) ? 6 : 9;
		
		System.out.println(val2); //  6 (조건이 참 이므로)
		
	}
	
	

}
