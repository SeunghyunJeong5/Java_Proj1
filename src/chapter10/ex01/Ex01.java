package chapter10.ex01;



//부모클래스 (Animal) : 동물 클래스
class Animal {
	String name ;
	int age ;
	String color;
	
	void eat() {
		
		System.out.println("Animal - 모든 동물은 먹습니다.");
	}
	
	void sleep() {
		System.out.println("Animal - 모든 동물은 잠을 잡니다.");
	}
	
}


class Tiger extends Animal{
	String TigerSound;
	void TigerRun () {
		System.out.println("호랑이는 뜁니다.");
	}
}

class Eagle extends Animal{
	String EagleSound;
	void EagleRun () {
		System.out.println("독수리는 날아갑니다.");
	}
}

class Lion extends Animal{
	String LionSound;
	void LionRun () {
		System.out.println("사자는 걷습니다.");
	}
}


class LionChild extends Lion {
	String LionChildSound;
	void LionChildRun () {
		System.out.println("새끼 사자는 아직 걷지 못합니다.");
	}
	
}



//자식클래스 (Tiger, Eagle, Lion ===> Animal)		//추가적으로 필드1(__ Sound), 메소드1개씩 정의.(__Run)

//자식의 자식클래스 (LionChild===>Lion) ====> 자식은 여러명의 부모를 가질수는 없다.

public class Ex01 {
	
	public static void main(String[] args) {
		
		System.out.println("============동물===============");
		Animal a1 = new Animal();
		
		a1.name = "동물";
		a1.age = 10;
		a1.color = "무지개색";
		a1.eat();
		a1.sleep();
		
		System.out.println("============호랑이===============");
		Tiger t1 = new Tiger();
		
		t1.name = "호랑이";
		t1.age = 10;
		t1.color = "검은색";
		t1.eat();
		t1.sleep();
		
		t1.TigerSound = "어흥";
		t1.TigerRun();
		
		
		System.out.println("============독수리===============");
		Eagle e1 = new Eagle ();
		
		e1.name = "독수리";
		e1.age = 9;
		e1.color = "흰색";
		e1.eat();
		e1.sleep();
		
		e1.EagleSound = "끼이오";
		e1.EagleRun();
		
		System.out.println("============사자===============");
		Lion l1 = new Lion ();
		
		l1.name = "사자";
		l1.age = 5;
		l1.color = "노란색";
		l1.eat();
		l1.sleep();
		
		l1.LionSound = "캬아오";
		l1.LionRun();
		
		System.out.println("============새끼사자===============");
		LionChild l2 = new LionChild ();
		
		l2.name = "새끼사자";
		l2.age = 1;
		l2.color = "연노란색";
		l2.eat();
		l2.sleep();
		
		l2.LionSound = "카아오";
		l2.LionRun();
		l2.LionChildSound = "냥";
		l2.LionChildRun();
		
	}

}
