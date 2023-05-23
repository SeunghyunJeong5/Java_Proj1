package chapter10.ex06;

class A{
	
	int a;
	
	//다른 생성자가 존재하지 않을 경우 기본생성자는 생략가능. 
	//다른 생성자가 존재하면 기본생성자를 명시해줘야함.(자식클래스를 만들때)
	A(){}
	
	A(int a){
		this.a=a;
	}
	
}
class B extends A{
	//기본생성자가 생략되어 있음.
	//자식클래스는 객체화 할때 부모클래스의 생성자를 기본적으로 호출
	B(){
		super(); //이것도 생략되어있음
	}
}

public class Super_Keyword {
	
	public static void main(String[] args) {
		
		// this 키워드 :	this.		===> 필드, 메소드 이름앞에 this키를 사용해서, 자신의 객체의 필드나, 메소드 호출시 사용됨.
		// this 메소드 :	this()		===> 생성자 내부에서 사용됨, 생성자 첫 라인에 와야하고, 자신의 객체의 다른 생성자를 호출시 사용됨.
		
		
		// 상속 관계에서 부모(Super) 클래스가 있을때 사용됨.
		// super 키워드 : super. 		===> 필드나 메소드 이름앞에 super 를 사용해서 부모의 필드나 메소드를 호출.
		// super 메소드 : super()		===> 생성자 내부에서 사용됨, 생성자 첫 라인에 와야하고, 부모(super)의 생성자를 호출할때 사용됨.
		
		
	}

}
