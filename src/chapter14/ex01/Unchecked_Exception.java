package chapter14.ex01;

class A{		//부모클래스
	int a;
	int b;
}
class B extends A{	//자식클래스
	int c;
	int d;
}
class C extends A{	//자식클래스
	int e;
	int f;
}

public class Unchecked_Exception {

	public static void main(String[] args) {
		
		// 실행 예외 : Unchecked Exception, Runtime Exception : 실행시 예외가 발생
		
		
		
		// 1. ArithmeticException : 정수를 0으로 나누면 발생되는 예외
		//			컴퓨터 프로그램에서는 0으로 나누면 무조건 오류가 발생
		//System.out.println(3/0);
		
		
		// 2. ClassCastException : 다운캐스팅시 객체 내부에 해당 타입이 존재하지 않을 때 발생되는 예외
		
		A a1 = new B();
		A a2 = new C();
		
		//C c1 = (C)a1;				====> a1에는 C타입이 없는데 그걸 만들라고 하니까.....
		
		
		// 3. ArrayIndexOutOfBoundException : 배열의 방번호를 넘어간 경우 발생되는 예외
		
		int [] arr = new int[] {1,2,3,4,5};
		
		//System.out.println(arr[5]);
		
		
		
		// 4. NumberFormatException : 문자타입의 정수나 실수를 정수나 실수로 바꿀때 발생되는 오류
		//String a = "10!";
		//int num = Integer.parseInt(a);		//문자 --> 정수, 실수로 바꿀때.
		
		
		
		// 5. NullPointException : 참조 주소의 값이 Null 인데, 메소드를 호출하는 경우
		String str = "안녕하세요";
		System.out.println(str.charAt(2));
		
		
		String str1 = null;
		System.out.println(str1.charAt(2));		//오류발생
	}

}
