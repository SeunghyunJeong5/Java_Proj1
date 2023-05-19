package chapter10.ex03;

class A{
	
	void print () {			//인스턴스 메소드
		System.out.println("A클래스의 print() ");
		
	}
}


class B extends A {		// B는 A를 상속받는다.
	@Override
	void print() {				//Override 할때는 메소드명과 리턴타입이랑 인풋개수 자료형이 다 맞아야함.
		System.out.println("B클래스의 print()");
		
	}
	
}

class C extends A{
	@Override
	void print() {
	System.out.println("C클래스의 print()");
	
	}
	
	
}

public class MethodOverriding01 {

	public static void main(String[] args) {
		
		//메소드 오버로딩(Method Overloading) - 상속과는 상관없음.
		//			- 메소드 이름은 동일하지만 시그니쳐에 따라서 다른 메소드로 식별하는것.
		//			- 시그니쳐 : 메소드를 식별하는 식별자, 리턴타입은 식별자가 아님. 아규먼트의 개수, 아규먼트의 자료형으로 식별.
		
		//메소드 오버라이딩(Method Overriding) - 반드시 상속관계에서만 적용.
		//			- 부모 메소드의 실행부를 재정의 해서 사용하는것 .
		//			- 인스턴스 메소드 일때만 오버라이딩됨.
		//			- 필드는 오버라이딩 되지 않는다.
		//			- 스태틱 메소드도 오버라이딩 되지 않는다.
		//			- @Override (@ : 어노테이션) 어노테이션 : 부모클래스의 메소드를 오버라이딩하겠다고 선언하는것.
		//			- 부모클래스와 메소드의 리턴타입, 메소드명, 시그니쳐가 정확히 일치해야한다.
		
		
		//A클래스를 객체화해서 A타입으로 지정함.
		A a = new A();		// a : A타입만 존재.
		a.print();
		System.out.println("=========================");
		
		
		
		B b = new B();		
		b.print(); 					//A클래스의 print()가 출력됨.  ====> 오버라이딩후에는 B클래스의 print()가 출력됨.
		System.out.println("=========================");

		
		C c = new C();
		c.print();
		System.out.println("=========================");

		
		System.out.println("=======자식 객체를 생성하면서 부모타입으로 지정한 경우 : 오버라이딩된 메소드가 출력 =========");
		A ab = new B();						//B를 객체화해서 A타입으로 만든것이므로 B의 오버라이딩된 메소드가 찍힘.
		ab.print();
		
		A ac = new C();						//오버라이딩을 안찍으면 A의 메소드가 출력됨.
		ac.print();
		
		
		
	}
}
