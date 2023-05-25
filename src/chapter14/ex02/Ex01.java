package chapter14.ex02;

class A{
	
}
class B extends A{
	
}
class C extends A{
	
}

public class Ex01 {
	
	public static void main(String[] args) {
		
		//예외처리
		
		
		int [] arr = new int [] {1,2,3,4,5};
		
		
		try {System.out.println(arr[5]);		//5번방이 없음. 4번방까지 있음.
			
		
		}
		catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("예외 해결1");
		}finally {
			System.out.println("예외1의 마지막");
		}
		
		
		
		
		
		A a1 = new B();
		try {C c1 = (C)a1; 		//a1은 C타입이 없음.
		
		}catch(ClassCastException e) {
			System.out.println("예외 해결2");
		}finally {
			System.out.println("예외2의 마지막");
		}
		
		
		System.out.println("프로그램 마지막 라인");
	}

}
