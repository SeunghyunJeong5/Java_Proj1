package chapter08.ex02;

public class A_Test01 {

	public static void main(String[] args) {
		//동일한 패키지에 존재하는 클래스
		
		//A 클래스는 동일한 패키지에 존재하는 클래스 : import없이 접근가능.
		A a1 = new A();
		
		System.out.println(a1.a);    //public
		System.out.println(a1.b);    //protected
		System.out.println(a1.c);    //default
		//System.out.println(a1.d);  //private		----> 오류가남.(접근불가)
		
		System.out.println("==========================");
		
		//메소드 호출                  
		a1.abc();		//public     
		a1.bcd();       //protected  
		a1.def();       //default    
		//a1.efg();     //private	 ---> 오류가 남.(접근불가)
		                             

	}

}
