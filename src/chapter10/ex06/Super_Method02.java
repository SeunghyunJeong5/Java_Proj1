package chapter10.ex06;

class E{
	
	E(){
		this(3);
		System.out.println("E의 생성자 - 1 ");
		
	}
	E(int a){
		System.out.println(a);
		System.out.println("E의 생성자 - 2 ");
	}
}

class F extends E{
	
	F(){
		
		this(33);						
		System.out.println("F의 생성자 - 1 ");
		
	}
	F(int a){
		//super();생략되어있음.  //자식객체에서 다른 생성자를 호출하지 않으면 부모의 생성자를 호출하는 super()가 생략되어있음.
		System.out.println(a);
		System.out.println("F의 생성자 - 2 ");
	}
	
	
}
public class Super_Method02 {
public static void main(String[] args) {
	
	F f1 = new F();
	
}
}
