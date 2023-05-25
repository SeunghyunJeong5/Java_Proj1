package chapter14.ex03;

public class Multi_Catch03 {
	
	public static void main(String[] args) {
		//여러 예외를 세부적으로 처리하고 나머지 예외는 Exception에서 처리함.
		try {
			
			System.out.println(3/0);
			int num = Integer.parseInt("10!");		
			
		} catch (NumberFormatException e) {
			System.out.println("정수로 변환 할 수 없습니다.");
		
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		catch(Exception e) {
			System.out.println("모든 Exception을 한꺼번에 처리");
		}
		
		
	}

}
