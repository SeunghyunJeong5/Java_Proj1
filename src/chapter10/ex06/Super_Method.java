package chapter10.ex06;

class Aaa{
	
	//기본 생성자
	Aaa() {
		System.out.println("Aaa 생성자");
	}
}
class Bbb extends Aaa{
	Bbb() {
		//super(); 생략되어있음.
		System.out.println("Bbb 생성자");			//======> 출력이 super가 생략되어있으므로 부모의 생성자부터 나오고 자기꺼 나옴.
	}
	
}

class Ccc{
	Ccc(int a){
		System.out.println(a);
		System.out.println("C 생성자 호출");
	}
}

class Ddd extends Ccc{
	Ddd(){
		super(3);
		System.out.println("D 생성자 호출");
	}
}

public class Super_Method {

	public static void main(String[] args) {

		// super() : 생성자 내부에서 사용, 생성자 첫번째 라인에 와야함, 부모(super)클래스의 생성자 호출

		
		//자식객체 생성시 부모의 기본 생성자를 먼저 호출 후 자신의 객체가 생성됨.
		Bbb bbb1 = new Bbb();
		
		
		System.out.println("==================================");
		//자식객체 생성시 부모객체를 먼저 호출
		Ddd ddd1 = new Ddd();			// 생성자의 형태(입력값...)같은것이 맞으면 오류가 나지 않는다.
		
		
		
	}

}
