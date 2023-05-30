package chapter16.ex06;

class A{	//일반 클래스 : 제너릭 메소드 생성
	
	//매개변수 타입으로 들어오는 변수에서 Object 의 메소드만 사용가능하다.
	public <T> void method (T t) {
		
	//	t.length();		//length () : String 타입에 존재하는 메소드(이거는 String이 들어왔을때만 가능하다)
	
	System.out.println(t.equals("안녕"));	//Object의 메소드 이므로 모든 타입에서 사용가능.
	System.out.println(t.equals(10));
	
	
	}
	
	
	
	
	
	
	public int method2 (String s) {
		
		return  s.length();		// 글자의 개수를 나타내는 메소드
	}
	
	
}

public class AbableGenericMethod {
	
	public static void main(String[] args) {
		
		//제너릭 메소드에서 인풋 매개변수에서 사용가능한 메소드 : Object 클래스의 메소드만 사용가능하다.
		//		- 다양한 타입이 들어오므로 Object 클래스의 메소드만 사용가능함.
		
		A a = new A();
		System.out.println(a.method2("안녕하세요"));
		
		a.<String> method("안녕");		//제너릭 메소드 호출
		a.method("안녕");				//제너릭 메소드 호출
		
		System.out.println("===============================");
		a.<Integer> method(10);
		a. method(10);
		
		
		
	}

}
