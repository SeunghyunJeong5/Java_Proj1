package chapter07.ex02;

class MethodOverloading {
	
	
	//메소드 오버로딩=============================================================
	void print() {	//인풋매개변수가 없는 메소드
		System.out.println("데이터가 존재하지 않습니다. ");
	}
		
	void print (int a) {  //인풋매개변수에 정수 1개를 인풋받는 메소드
		System.out.println("int : " +a);
	}
	
	void print (double a) {	 //인풋 매개변수에 실수 1개를 인풋받는 메소드
		System.out.println("double : "+a);
	}
	void print (int a, int b) {  //인풋 매개변수가 2개 : 정수
		System.out.println("int a : "+ a + " int b : "+b);
	}
	void print (double a, double b) {  //인풋 매개변수가 2개 : 실수
		System.out.println("double a : " + a+ " double b : "+b);
	}
	
	
	
	//오류발생하는 경우!!!!!!!!!!!!!!!!!!!!(인풋 매개변수의 개수, 자료형이 동일한 메소드는 오류가 발생됨.
	//void print (int k, int g) {
		
	//}
	
	
	void print (int i, double j) {		//이건 오류 안남!!!
		
	}
	
	
	
	
	//메소드 오버라이딩=======================================================================
	//			: 부모 클래스의 메소드를 재정의(override)해서 사용함.(부모클래스의 것을 지우고 내가 만든것으로 사용한다는것)
					// 상속에서 적용.
	@Override
	public String toString() {
		
		
		return "객체 자체를 출력시 Object 클래스의 toString()를 출력";
	}
	
	
}

public class Method05 {
	
	public static void main(String[] args) {
		
		
	
		// 메소드 오버로딩 : 동일한 이름의 메소드이지만 시그니쳐에 따라서 다른 메소드를 식별
		//				- 시그니쳐 : 메소드를 식별하는 식별자 [인풋아규먼트(매개변수)의 개수, 인풋아큐먼트(매개변수)의 자료형(타입)에 따라서 다른 메소드인것을 식별]
		
		
		// 메소드 오버라이딩 : 상속에서 작동됨, 부모 클래스의 메소드를 자식 클래스에서 다시 정의해서 쓰는 것  
		//				- 자바의 모든 클래스는 Object 클래스를 상속 받는다.
		//					Object 클래스의 필드나, 메소드를 사용할 수 있다.(다른클래스에서도 오브젝트클래스의 것들을 이용가능하다는것.)
		//						모든 클래스의 부모클래스는 Object 클래스임.
		
		MethodOverloading m1 = new MethodOverloading ();
		
		//매개변수가 없는 print () 메소드 호출
		m1.print();
		
		//매개변수 1개 : int
		m1.print(10);
		
		//매개변수 1개 : double
		m1.print(50.55);
		
		//매개변수 2개 : int
		m1.print(10, 20);
		
		//매개변수 2개 : double
		m1.print(77.7, 88.8);
		
		
		
		
		//Object 클래스의 메소드 출력
		System.out.println(m1);					//객체를 출력하면
		System.out.println(m1.toString());		//Object 클래스의 메소드(원래는 주소값이 나오는데 내가 오버라이딩해서 출력이 바뀜)
				
		
		
	}
	

}
