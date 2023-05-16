package chapter07.ex01;

class A{	//1. 생성자, 2. 필드, 3. 메소드, 4. 이너클래스
	
	public A () {}	//기본생성자(생략가능)
	
	//필드 : 힙(메모리)에 저장이 됨.
	
		// - 인스턴스 필드 : 필드 이름 앞에 static 키가 들어가있지 않은 필드, 힙에 저장됨, 객체화 해야 사용가능
				//다른 객체와 공유되지 않는 필드
	
		// - 정적(static) 필드 : 필드 이름 앞에 static 키가 붙어있는 필드, static 공간에 저장됨.
				//객체화 해서 사용, 객체화 하지 않고 클래스 이름으로 바로 사용가능
				//다른 객체와 공유해서 사용 가능한 필드
	
	
	int a;			//인스턴스 필드, 그 객체에서만 사용 가능, 힙메모리 공간에 저장
	static int b;	//정적 필드(static 필드), 모든 객체에서 공유되는 필드
	
	
	
	
}

public class Field01 {
	
	public static void main(String[] args) {
		
		// A클래스(타입) 으로 a 객체 생성
		
		A a = new A();	//a 객체를 생성. 기본생성자를 호출
		A aa = new A();
		A aaa = new A();
		
		//각 객체에 필드의 값 입력
		a.a = 10;
		aa.a = 20;
		aaa.a = 30;
		
		System.out.println(a.a);		//10
		System.out.println(aa.a);		//20
		System.out.println(aaa.a);		//30
		
		System.out.println("============정적 필드==========");
		
		
		// 정적(static) 필드의 값 입력 : 모든 객체가 공유되는 필드 <=== A class 로 생성된 모든 객체가 공유해서 사용하는 필드
		a.b = 10;
		aa.b = 20;
		aaa.b = 30;
		//a.b = 40 ;		===> 이러면 다 40이됨.
		
		
		System.out.println(a.b);		//30=====>>> 마지막에 aaa.b에 넣은 값인 30이 계속 나오는것임. b는 변수틀만 힙에 있고, 값은 스태틱 영역에 저장되고, 딱 한구멍만 파서 갖고있음...
		System.out.println(aa.b);		//30				a는 힙에 저장되므로 객체를 만드는 대로 구멍이 늘어남.
		System.out.println(aaa.b);		//30
		
		System.out.println("=========================");
		
		//정적(static) 필드 : 객체화 하지 않고, 클래스 이름으로 바로 사용가능
		A.b = 50; // 이러면 싹다 50이 되는거임.
		
		System.out.println(A.b);
		System.out.println(a.b);
		System.out.println(aa.b);
		System.out.println(aaa.b);
		
		
	}

}
