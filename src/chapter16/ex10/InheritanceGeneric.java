package chapter16.ex10;
//부모클래스 : 제너릭 클래스
class Parent<T>{
	
	T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}
//자식클래스 : 제너릭 클래스 ==> 부모의 타입이 반드시 하나 이상 있어야함.<T, K...이런식으로>
class Child <T> extends Parent<T>{
	
	
}
class Child2 <T, V> extends Parent <T>{	//부모타입의 갯수보다 많으면 상관없다.
	V v;

	public V getV() {
		return v;
	}

	public void setV(V v) {
		this.v = v;
	}
	
}

public class InheritanceGeneric {
public static void main(String[] args) {
	
	
	//제너릭 클래스의 상속 :
	//		- 자식클래스는 부모의 클래스의 타입의 갯수와 같거나 많아야한다. 
	
	
	//1. 부모 제너릭 클래스
	Parent <String> p1 = new Parent<>();
	p1.setT("부모 제너릭 클래스");
	
	System.out.println(p1.getT());
	
	
	Parent <Double> p2 = new Parent<>();
	p2.setT(33.33);
	System.out.println(p2.getT());
	
	
	
	
	//2. 자식 클래스 1
	Child <String> c1 = new Child();
	c1.setT("자식1 - 제너릭 클래스");			//부모에서 상속받은 메소드
	System.out.println(c1.getT());			//부모에서 상속받은 메소드
	
	
	//3. 자식 클래스 2
	Child2 <String, Integer> c2 = new Child2();
	c2.setT("자식2 - 제너릭 클래스");		//부모에서 상속되어서 내려오는 메소드
	c2.setV(100); 						//자신에서 정의한 메소드
	
	
	System.out.println(c2.getT());		//부모상속
	System.out.println(c2.getV());		//자식생성
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
