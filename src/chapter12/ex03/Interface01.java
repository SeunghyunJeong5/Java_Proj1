package chapter12.ex03;

// 1. 정식표현 : 코드가 길어짐...

interface A {		// 필드, 메소드만 옴.
	
	//필드
	public static final int a = 3;
	
	//메소드
	public abstract void abc();			//실행부가 없음.
	
	//구현한 메소드를 선언시 오류 발생 (default, static 은 가능함)
	default void bcd() {
		
	}
	
}

//인터페이스의 구현되지 않는 메소드를 구현하는 클래스
class Aa implements A{

	@Override
	public void abc() {
		System.out.println("A 인터페이스의 구현되지 않은 메소드를 구현한 메소드 abc()");
		
	}
	
}



// 2. 약식표현 : 많이 사용
interface B {
	int a =3;			//public static final 이 생략되어있음
	void abc();			//public abstract 가 생략됨.
}


class Bb implements B{

	@Override
	public void abc() {
		System.out.println("B 인터페이스의 구현되지 않은 메소드를 구현한 메소드 abc()");
		
	}
	
}


public class Interface01 {
	
	public static void main(String[] args) {
				
		
		// 인터페이스 (Interface) : 내부와 외부를 연결시켜주는 접점. ex) 콘센트(가전제품 <==> 전기), ex)메뉴판(손님<==>주방장)
		//				API (Application Programming Interface) : API를 통해서 백엔드의 다양한 서비스를 받게된다.				
		
		//				- 모든 필드, 메소드는 public 접근 제어가 적용된다.
		//				- 모든 필드는 public static final 이 생략되어있다. ==> 인터페이스의 필드의 값은 수정이 불가하다.
		//				- 모든 메소드는 public abstract가 생략되어있다. ===> 선언만 된 메소드가 있음.
		//						단 예외가 있다. (default, static메소드는 제외==>자바 1.8부터 적용됨.)
		//				- 인터페이스는 객체화 할 수 없다. 단 타입으로 지정은 가능하다.
		//				- 인터페이스를 구현한 클래스는 여러 인터페이스를 구현가능하다.
		//				- 클래스는 단 하나의 부모만 상속 할 수 있다. (다중 상속이 불가능) extends를 사용해서...
		//				- 클래스는 여러 인터페이스를 구현할 수 있다. (다중 상속이 가능) implements
		//				- 유지보수를 쉽게하기 위해서 Interface를 사용합. 강결합====> 약결합(유지보수 쉽게)
		//				- 인터페이스에 선언된 메소드를 오버라이딩해서 구현하도록 만듦.
		//				- 인터페이스를 구현하는 클래스는 오버라이딩된 메소드를 수정할 수 없다.
		//				- 인터페이스는 유지보수하기 좋게 프로그램을 약결합상태로 만들어준다.
		
		
		
		//1. 인터페이스는 객체화 할 수 없다.
		//A a= new A();
		
		//2. 인터페이스를 구현한 클래스를 객체화해서 타입으로 지정은 가능
		A a1 = new Aa();
		a1.abc(); 				//오버라이딩된 메소드를 출력.
		
		B b2 = new Bb();
		b2.abc();
		
		System.out.println(b2.a);
		//b2.a = 10;				필드의 값을 수정할 수 없다. public static final (상수)
		
		
		
		
		
		
	}

}
