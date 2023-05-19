package chapter08.ex01;

import chapter08.ex02.Student;

class A{				// class A는 접근제어자가 default 이므로 외부 패키지에서는 접근이 되지 않음.
	
	// 필드에 선언된 접근 제어자
	public int a;
	protected int b;
	int c;			//default : 명시해서 쓰지 않고, 생략시 default 가 생략되어 있음.
	int d;
	
	
	
	//메소드에 선언된 접근 제어자
	public void a () {								//public : 외부 패키지에서 접근 가능
		System.out.println(" a 메소드 출력");
		
	}
	
	protected void b () {							//protected : 상속 관계가 있을때만 외부 패키지에서 접근 가능
		System.out.println(" b 메소드 출력");
		
	}
	
	void c () {										//default : 같은 패키지 내에서만 접근 가능
		System.out.println(" c 메소드 출력");
		
	}
	
	private void d () {								//private : 같은 패키지가 아닌, 같은 클래스에서만 접근가능
		System.out.println(" d 메소드 출력");
		
	}
	
}

public class Package {
	//클래스 내부 구성요소 블락
	
	
	
	
	public static void main(String[] args) {
		
		//클래스 내부 구성요소 : 1. 생성자, 2.필드, 3. 메소드, 4.이너클래스(클래스 내부에 클래스)
		
		
		//클래스 외부 구성요소 : 1. 패키지(package), 2. 임포트(import), 3. 외부클래스
		
		//		- 1. 패키지 : 클래스(파일)를 조직화 할때 사용, 폴더의 개념.
		//				- 같은 패키지에 동일한 이름의 클래스는 올 수 없다.
		//		- 2. 임포트 (import) 
		//				- 동일한 패키지에 존재하지 않는 클래스는 import를 사용해서 불러들어야한다.
		//				- 외부의 클래스는 반드시 public class 이여야 불러들일 수 있다.
		//		- 3. 외부 클래스 : 클래스 외부에 생성된 클래스, public class는 반드시 하나만 와야 한다.
		//				- public class 가 아니면 외부에서 접근이 불가.
		
		
		
		// 접근제어자 : 정보를 보호하기 위해서 클래스 이름 앞, 필드 이름 앞, 메소드 이름 앞에 붙는 제어자. (변수이름 앞에는 붙지않음.)
		//					변수 이름 앞에는 붙지 않는다. =====> 메소드 내부에서 선언된, 제어문내부에서 선언된...
		//						정보의 은닉, 캡슐화 ====> 보안.....
		
		//		클래스 이름앞 (public, default) 만 사용가능
		//		필드/메소드 이름앞 (public, protected, default, private) 다 사용가능.
		
		// 접근제어자의 종류
		//			- public		: 외부 패키지에서 접근이 가능하도록 허용, 같은 패키지에는 하나의 public만 존재할 수 있다.(클래스의 필드도 그렇지 않을까...?)
		//			- protected		: 상속관계에 있을때만 외부패키지에서 접근 가능하도록 허용.
		//			- default		: 같은 패키지 내에서만 접근 가능함. 생략되어있고 명시해서 쓰지 않음.
		//			- private		: 같은 클래스에서만 접근 가능
		
		
		
		
		
		
		Car c1 = new Car();					//같은 패키지에 존재하는 클래스 : import없이 바로 사용가능
		
		
		//외부의 클래스를 import 할때는 해당 클래스의 접근 지정자가 public, 생성자도 public 으로 되어있어야함.
		
		//import 후 외부 패키지를 불러들일 수 있음.
		Student s1 = new Student();			//다른 패키지에 존재하는 클래스 : import를 사용해서 사용가능
		
		
		//import 없이 바로 접근 : 클래스의 전체 이름으로 접근 : 패키지명, 클래스명====> 이렇게 하면 임포트를 안해도됨.
		chapter08.ex02.Student s2 = new chapter08.ex02.Student();
		
		s1.stuName= "홍길동";
		
		
	}

}
