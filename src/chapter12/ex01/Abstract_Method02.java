package chapter12.ex01;

abstract class Animal{
	
	//구현부가 없이 선언만 된 메소드 : 추상메소드 ===> 자식클래스에서 오버라이딩해서 구현부를 만들어 줘야한다.
	abstract void eat();
	abstract void run();
	abstract void cry();
	
	
}

class Tiger extends Animal{			//콘크리트 클래스 : 추상메소드를 모두 구현한 클래스. 오류난걸 클릭하면 구현이됨.

	@Override
	void eat() {
		System.out.println("호랑이는 고기를 먹습니다.");
		
	}

	@Override
	void run() {
		System.out.println("호랑이는 껑충껑출 달립니다.");
		
	}

	@Override
	void cry() {
		System.out.println("호랑이는 어흥하고 웁니다.");
		
	}  
	
	
	
}

abstract class Lion extends Animal{		//추상 클래스 : 부모의 추상메소드를 일부만 구현한 경우 abstract를 명시 해야함.(콘크리트 클래스가 아님)

	@Override
	void eat() {
		System.out.println("사자는 고기를 먹습니다. ");
		
	}

	@Override
	void run() {
		System.out.println("사자는 펄쩍펄쩍 달립니다.");
		
	}

		
	
}

class LionChild extends Lion {			//마지막으로 구현이 안된 클래스를 여기서 구현
										//부모의 추상메소드를 모두 구현한 클래스

	@Override
	void cry() {
		System.out.println("아기사자는 응애하고 웁니다.");
	}
	
	
	
	
}




public class Abstract_Method02 {
public static void main(String[] args) {
	
	
	// 1. 추상 클래스는 객체화 할 수 없다.
	// Animal a1 = new Animal();
	
	
	// 2. 자식 클래스를 객체화해서 타입으로 지정은 가능하다.
	Animal a2 = new Tiger();
	
	// Animal a3 = new Lion();			//Lion은 추상클래스이므로 객체화 할 수 없다.
	
	Animal a4 = new LionChild();
	
	//3. 오버라이딩된 메소드 호출
	a2.run();
	a2.eat();
	a2.cry();
	
	System.out.println("==================");
	
	//Animal 의 메소드 호출시 오버라이딩된 메소드 출력
	a4.run();
	a4.eat();
	a4.cry();
	
	
	
	
	
	
	
}
}
