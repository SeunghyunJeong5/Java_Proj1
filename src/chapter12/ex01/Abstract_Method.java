package chapter12.ex01;

abstract class A{						//구현부가 없는 메소드가 있으면 클래스도 abstract가 되어야하고, 자식클래스에서 그 메소드를 반드시 오버라이딩해줘야됨.

	//인스턴스 필드 : 객체화, 힙영역에 값이 저장되어있음.
	
	int a;
	int b;
	
	
	//일반 메소드
	void print () {
		
	}
	
	//추상 메소드 : { 구현부(실행블락)  } 가 없는 메소드
	abstract void run();
	
}


class Cat extends A {			//콘크리트 클래스, 추상 클래스에서 선언해놓은 추상메소드를 구현하는 클래스
	
	@Override
	void run() {
		
		System.out.println("고양이는 달립니다. ");
		
	}
}


class Dog extends A{
	
	@Override
	void run() {
		System.out.println("강아지는 달립니다. ");
		
	}
	
}

class Eagle extends A{
	
	@Override
	void run() {
	System.out.println("독수리는 하늘을 납니다. ");
		
	}
	
	
}

public class Abstract_Method {

	public static void main(String[] args) {
		
		// 추상 메소드 (Abstract Method)
		// 	 	- 구현부가 존재하지 않는 메소드( {} - 실행블락이 없는 메소드), 선언만 되어있는 메소드
		//		-	abstract void abc ();
		// 		- 추상메소드가 클래스 블락에 1개라도 존재하면 반드시 그 클래스는 추상 클래스가 되어야한다. abstract class A {}
		//		- 자식 클래스에서 추상 클래스의 추상 메소드를 오버라이딩해서 메소드를 구현해야한다.
		//		- 추상클래스는 객체 생성이 안됨. 자식 클래스를 객체화 해서 타입으로는 적용할 수 있다.
		//		- 프로젝트를 설계시 메소드이름을 프로그래머가 함부로 바꾸지 못하도록 할 수 있다. (PM설계)
		//		- 자식클래스에서 구현하는 메소드를 오버라이딩해서 구현부를 만듦.
		//		- 메소드 이름을 함부로 변경 할 수 없다.
		//		- 유지보수를 쉽게 하는 프로그램을 만들때 사용. (강결합 ===> 약결합)
		
		
		
		
		// 1. 추상 클래스 (객체화 하지 못함) : 추상 메소드를 포함하는 클래스
		//A a = new A(); ===> 오류남
		
		// 2. 추상 클래스는 타비으로 지정이 가능 : 자식을 객체화해서 부모타입으로 지정가능
		A cat1 = new Cat();
		A dog1 = new Dog();
		A eagle1 = new Eagle();
		
		
		// 3. 부모의 추상메소드를 실행하면 오버라이딩 된 자식클래스의 메소드가 출력
		cat1.run();
		dog1.run();
		eagle1.run();
		
		
		// 4. 배열에 넣고 출력
		A[] arr = new A[] {cat1,dog1,eagle1};
		
		System.out.println("====================== 배열을 통해 출력 ============================");
		// 5. for 문을 사용해서 배열의 각방의 내용을 출력
		for (int i = 0; i<arr.length; i++) {
			arr[i].run();
		}
		
		System.out.println("====================== Enhanced for 문을 통해 출력 ============================");

		// 6. Enhanced for 문을 사용해서 출력
		for (A k: arr) {
			k.run();
		}
		
		
		
		
		
		
		
		
	}
}
