package chapter14.ex03;

public class Multi_Catch02 {
	
	public static void main(String[] args) {
		
		// 여러 예외를 한꺼번에 처리함.
		//		- Exception : 모든 Exception의 부모클래스(ArithmeticException, NumberFormatException.......)

		
		
		try {
			
			System.out.println(3/0);
			int num = Integer.parseInt("10!");		
			
		} catch (Exception e) {
			//Exception : try 블락에서 발생되는 모든 Exception을 catch
		System.out.println("Exception 클래스가 모든 예외를 캡쳐했습니다.");
		}
		
		
		
	}
	
	
	
	
}
