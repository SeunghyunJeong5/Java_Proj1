package chapter10.ex06;

class Aa{
	
	int a = 10;
	
	void abc() {
		System.out.println("Aa 클래스의 abc메소드 ");
	}
	void ab() {
		System.out.println("Aa 클래스의 ab메소드 ");
	}
}

class Bb extends Aa{
	
	int b = 20;
	
	@Override
	void abc() {
		System.out.println("Bb 클래스의 abc메소드 ");
		
	}
	void bcd() {
		abc(); 			//this.abc() , this가 생략되어있음.					대부분의 this는 생략되어있음... 자신을 나타내니까.
	}
	void cde() {
		super.abc(); 	//부모객체의 abc() 호출
	}
	void def () {
		super.ab(); 	//부모객체의 ab() 호출
	}
	void efg() {
		System.out.println(super.a);
		System.out.println(this.b);
	}
	
}

public class Super_Keyword02 {
	
	public static void main(String[] args) {
		
		//1. 객체 생성
		Bb bb = new Bb();			//bb는 Aa와 Bb타입을 내포. Bb타입으로 지정되어있음.
		bb.bcd(); 					//자신의 abc메소드를 호출
		bb.cde(); 					//부모 클래스의 메소드 호출
		bb.def();   				//부모 클래스의 메소드 호출
		
		bb.efg();
	}

}
