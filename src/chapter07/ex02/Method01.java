package chapter07.ex02;

class A{						//패키지가 다르면 A로 다시 만들수 있음.
	
	
	//생성자
	A(){}
	
	
	//인스턴스 필드
	int m ;
	int n ;
	
	//메소드 : 함수를 객체지향언어에서는 메소드라고함, 호출해야 사용가능, 인풋 매개변수를 가짐.
			//메소드 내부에 프로그래밍 기능
	
	//리턴값이 없는 메소드, 인풋 값이 없는
	   public     void    print () {		//public 생략가능
	//접근제어자   리턴타입   메소드명() {}
		
		   
		   // 호출시 필드의 내용을 출력
		   System.out.println("m필드의 값 : "+m);
		   System.out.println("n필드의 값 : "+n);
	
	}
	   
	   //리턴 값이 있는 메소드 (int), 메소드 호출시 인풋 매개변수를 받는 메소드
	   int plus (int a, int b) {
		   //int 의 경우 반드시 정수값만 받아야함.
		   return a+b;
	   }
	
	   //실수값을 리턴
	   double minus (double a, double b) {
		   return a-b;
		   
	   }
	   
	   //문자열을 리턴
	   String fullName (String fName, String lName) {
		   return lName + " " + fName;
		   
	   }
	   
	
}


public class Method01 {

	
	public static void main(String[] args) {
		
		//객체 생성
		A a = new A ();
		
		
		//메소드호출 : 리턴이 없는 메소드
		a.m = 10;
		a.n = 10;
		
		a.print();
		
		//리턴값이 있는 메소드 호출, 매개변수 정수값 2개
	//	a.plus(10, 20);	이렇게 하고 해도되고 바로 출력해도 됨.
		System.out.println(a.plus(10, 20));
		
		//더블을 리턴 받는 메소드 호출
		System.out.println(a.minus(33.3, 22.1));
		
		//문자열을 리턴 받는 메소드 호출
		System.out.println(a.fullName("길동", "홍"));
		
		
		
	}
	
	
}
