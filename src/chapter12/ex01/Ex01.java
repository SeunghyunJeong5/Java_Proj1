package chapter12.ex01;

abstract class Car {	//추상 클래스 : 트럭(경유), 자가용(휘발유), 굴삭기(경우), 봉고(LPG)....
	
	abstract void run();
	abstract void eat();
	
	
}

class Car1 extends Car{

	@Override
	void run() {
		System.out.println("트럭");
		
	}

	@Override
	void eat() {
		System.out.println("경유 사용");
		
	}
	
	
}

class Car2 extends Car{

	@Override
	void run() {
		System.out.println("자가용");
		
	}

	@Override
	void eat() {
		System.out.println("휘발유 사용");
		
	}
	
	
}

class Car3 extends Car{

	@Override
	void run() {
		System.out.println("굴삭기");
		
	}

	@Override
	void eat() {
		System.out.println("경유 사용");
		
	}
	
	
}

class Car4 extends Car{

	@Override
	void run() {
		System.out.println("봉고");
		
	}

	@Override
	void eat() {
		System.out.println("LPG 사용");
		
	}
	
	
}

public class Ex01 {
	
	public static void main(String[] args) {
		
		//구현한 클래스를 생성후, 자식 객체를 생성시 부모 타입으로 지정 후 오버라이딩된 메소드 호출
		
		Car c1 = new Car1();
		Car c2 = new Car2();
		Car c3 = new Car3();
		Car c4 = new Car4();
		
		
		c1.run();
		c1.eat();
		
		System.out.println("============================");
		
		c2.run();
		c2.eat();
		
		System.out.println("============================");
		
		c3.run();
		c3.eat();
		
		System.out.println("============================");
		
		c4.run();
		c4.eat();
		
		
	}

}
