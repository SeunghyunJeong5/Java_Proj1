package chapter07.ex01;

// class A { 오류남!! 이미 필드1클래스 에서 만들었으므로
	
//}


class B {
	//public B() {}
	
	
	int m;				//인스턴스 필드 : 객체화 후에만 사용가능, 다른 객체와 별도 분리가 됨, 메모리의 힙공간에 저장됨.

	static int n;		//정적 필드(static) : 객체 없이 클래스명으로 사용가능, 객체화 해서도 사용가능, 메모리의 클래스 영역안에 스태틱영역에 저장됨. 
											//모든 객체와 공유되는 필드
	
}


public class Field02 {
	
	public static void main(String[] args) {
		
		
		// B 타입으로 b1, b2, b3 객체 생성
		B b1 = new B();            //=====> 생략된 public B() {} 호출한거임
		B b2 = new B();
		B b3 = new B();
		
		//인스턴스 필드 : m <===== 객체 내부에서 고유공간, 다른 객체와 값이 공유되지 않는 필드.
		b1.m = 1;
		b2.m = 2;
		b3.m = 3;
		
		System.out.println(b1.m);
		System.out.println(b2.m);
		System.out.println(b3.m);
		
		
		System.out.println("======================정적 필드 =========================");
		
		// 정적 (static) 필드 : 모든 객체에서 값을 공유하는 필드, 클래스 영역에 값이 저장됨.
		b1.n=10;  							//객체 생성후 호출
		
		System.out.println(b1.n);
		System.out.println(b2.n);
		System.out.println(b3.n);
		
		B.n = 30;		//객체 생성 없이 클래스 이름으로 사용가능
		
		System.out.println(b1.n);
		System.out.println(b2.n);
		System.out.println(b3.n);
		
		
	}

}
