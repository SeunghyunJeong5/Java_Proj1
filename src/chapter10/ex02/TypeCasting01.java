package chapter10.ex02;

class Animal {			//부모클래스
	
	String name;
	int age;
	
	void eat () {
		System.out.println("모든 동물은 먹습니다.");
		
	}
	
}

//자식클래스 (Tiger, Lion)

class Tiger extends Animal{
	
	String tigerCry ;
	void tigerRun () {
		System.out.println("호랑이는 달립니다.");
		
	}
	
	
}

class Lion extends Animal{
	
	String lionCry;
	void lionRun () {
		System.out.println("사자는 달립니다.");
	}
	
}

//자식의 자식클래스 (LionChild)

class LionChild extends Lion{
	String lionChildCry ;
	void lionChildRun () {
		System.out.println("새끼사자는 엉금엉금 기어갑니다.");
	}
	
}



public class TypeCasting01 {
	
	public static void main(String[] args) {
		
		//객체의 타입 변환 (Object Type Casting)
		
		//		- 업캐스팅(upcasting) : 자식타입 ==> 부모타입으로 변환, 명시하지 않아도 자동변환됨.
		//				-- 객체를 배열/컬랙션 에 저장하기 위해서 동일한 타입으로 배열이나 컬랙션에 저장. 
		
		//		- 다운캐스팅 (downcasting) : 부모타입 ==> 자식타입으로 변환, 명시해서 변환.
		//				-- instanceof 를 사용해서 자식타입이 존재하는지 살펴보고 다운캐스팅을 해야됨.
		//				-- 만약에 자식타입이 존재하지 않을경우 실행시 오류가 발생
		
		
		// 1. Animal
		Animal a1 = new Animal ();		//a1는 Animal 타입만 존재함.
		
		//a1는 Animal 타입만 존재 : Animal 클래스의 필드와 메소드만 접근가능.
				// a1 객체 : Tiger, Lion, LionChild의 타입을 가지고 있지 않음.(접근불가능)
		a1.age = 10;
		a1.name = "동물";
		a1.eat();
		
		
		// 2. Tiger
		Tiger t1 = new Tiger ();
		
		// t1은 Tiger, Animal 타입을 가진다.
		t1.tigerCry = "어흥";	//Tiger 필드
		t1.tigerRun(); 			//Tiger 메소드
		
		t1.name = "호랑이";		//Animal 필드
		t1.age = 20;			//Animal 필드
		t1.eat();				//Animal 메소드
		
		//업캐스팅 (upcasting) : 자식타입을 부모타입으로 변환하는 것 : t1 (Animla(부모), Tiger(자식))
		Animal a2 = (Animal) t1;		//(Animal)==> 생략가능........... Tiger ===> Animal 타입으로 업캐스팅 (Animal타입의 필드나 메소드만 접근이 가능)
		
		
		//a2는 Animal 타입으로 업캐스팅 : Animal 필드/메소드만 접근
		
		System.out.println(a2.name);
		System.out.println(a2.age);
		//System.out.println(a2.tigerCry); ====> Tiger 의 필드/메소드는 접근이 불가능
		
		//a2는 Animal 타입으로 정의가 되어있음 : Tiger / Animal 둘다 갖고있음. 상태는 현재 Animal 일뿐
		
		
		System.out.println("==================================================");
		//다운캐스팅 (downcasting) : 부모 =====> 자식 변환, 명시해서 변환, 반드시 instanceof를 사용해서 실행시 오류나지 않도록 처리를 해야됨.
		Tiger tt1 = (Tiger) a2;
		
		//tt1 은 Tiger 타입으로 다운캐스팅 : Tiger / Animal 둘다 갖고있음. ===> 자신 / 부모 의 필드/메소드를 사용가능.
		System.out.println(tt1.name);			//Animal
		System.out.println(tt1.age);			//Animal
		System.out.println(tt1.tigerCry);		//Tiger
		
		System.out.println("======================================================");
		
		//3. Lion 객체를 생성 : l1 : Lion / Animal
				//자식 클래스를 객체화 시키면 부모 클래스의 필드/메소드 사용가능.
		
		Lion l1 = new Lion();
		
		//업캐스팅 : Lion (l1) ===> Animal (aa2)
		
		Animal aa2 = l1;
		//aa2 는 Animal의 필드/메소드만 접근가능, Animal / Lion 타입을 둘다 갖고는 있음.
		
		//다운캐스팅 : Animal ===> Lion
		//부모 자식의 필드 메소드 전부 사용가능
		Lion ll2 = (Lion) aa2;
		
		System.out.println(" =============== instnaceof =================");
		
		//객체 내부에 해당 타입이 존재하면 true, 존재하지 않으면 false
		System.out.println(ll2 instanceof Animal);  //====> ll2에 부모클래스가 존재하느냐 하고 물어본것.
		System.out.println(ll2 instanceof Lion);  //====> ll2에 자식(Lion)클래스가 존재하느냐 하고 물어본것.
		//System.out.println(ll2 instanceof Tiger);  //====> ll2에 자식(Tiger)클래스가 존재하느냐 하고 물어본것.===>아예없으면 오류
		
		System.out.println(a1 instanceof Animal);
		System.out.println(a1 instanceof Tiger);
		
		
		//a1 : Animal 타입을 갖고있음.
		//객체 내부에 해당 타입이 존재하지 않는 경우 : 실행시 오류가 발생 / 컴파일단계의 오류가 아님.
		
		if (a1 instanceof Tiger) {		//false : a1객체는 Tiger타입이 존재하지 않음.
		Tiger ttt1 = (Tiger) a1;			
		}
		else {
			System.out.println("해당객체에는 Tiger타입이 존재하지 않습니다.");
		}
		
		//Tiger tt22 = (Tiger) a1; 실행시 오류 발생
		
		
		//4. LionChild : LionChild / Lion / Animal 세가지를 다 갖고있음.
		LionChild lc1 = new LionChild();
		
		lc1.age = 30;				//Animal
		lc1.lionCry = "어흥";		//Lion
		lc1.lionChildCry = "응애";	//LionChild
		
		
		System.out.println("================================================");
		//LionChild =====> Animal 업캐스팅
		Animal a5 = lc1; 		//3가지 다 갖고있는 lc1 이기때문에 원하는걸로 선택해서 쓰면 된다.
								//이렇게 하면 a5도 3개다 갖게됨.
		
		System.out.println(a5 instanceof Animal);
		System.out.println(a5 instanceof Lion);
		System.out.println(a5 instanceof LionChild);
		
		//다운캐스팅 : Animal ===> Lion
		Lion ll7= null;		//초기화부터 하고	//ll7은 a5로부터 온것이기때문에 3개다 내포는 하고 있지만, Animal과 Lion만 접근가능.
		if (a5 instanceof Lion) {
			ll7 = (Lion)a5;
			System.out.println("a5는 Lion 타입으로 다운캐스팅이 잘 되었습니다."); //a5가 ll7으로 가면서 다운캐스팅이 되었다는 얘기.
		} else {
			System.out.println("a5는 Lion 타입으로 다운캐스팅 할 수 없습니다.");
		}
		
		
		ll7.lionCry = "어흥 어흥 어흥"; //Lion
		ll7.age = 30;
		
		
		//LionChild 로 다운캐스팅
		
		LionChild lc9 = (LionChild)ll7;
		

		
		
		
	}

}
