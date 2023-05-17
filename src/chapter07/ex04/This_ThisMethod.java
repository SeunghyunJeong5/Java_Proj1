package chapter07.ex04;

class A{
	
	//필드 : 힙공간에 값이 저장됨. 객체를 생성 후에 (new)===> 힙에 저장하라는 의미
	int m;
	int n;
	
	
	//메소드
	void init (int a, int b) {		//지역변수 (a,b,c) ===> 메소드 내부에서 선언된 변수 , 메소드끝나면 날아가버림
		int c;
		c =3;
		this.m = a;			//여기서 this 는 생략되었을시 컴파일할때 자동으로 등록함.
		this.n = b;
		System.out.println("필드의 값 출력 : "+this.m + ", "+this.n);  		//여기 this를 생각해도됨. 자동으로 등록됨.....
	}
	void work() {
		this.init(2,3);			//this 생략시 컴파일러가 자동으로 등록함.
	}
	
}

public class This_ThisMethod {
	
	public static void main(String[] args) {
		
		// this 키워드 : 필드이름앞에, 메소드이름앞
		//				자기자신의 객체나 메소드를 의미.
		//					기본적으로 모두 생략되어 있다.
		//					명시가 필요한 경우 : 생성자에서 인춧 이름, 받는 이름, 필드명 ...이 세가지가 동일할때, 필드명에 this 키워드를 넣어줘야함.
		
		
		
		// this() 메소드 :
		//		생성자 내부에서만 사용됨.
		//		반드시 생성자 내부에서 첫번째 라인에 와야한다.
		//		생성자 호출시 다른 생성자를 먼저 실행 하도록 한다.
		
		
		
		
		// 객체 생성
		A a = new A();
		a.work();
		
		
		
		
	}

}
