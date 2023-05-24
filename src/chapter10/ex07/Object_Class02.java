package chapter10.ex07;

class Aa{		//extends Object
	
	//필드
	String name;
	
	Aa (String name){
		this.name = name;
	}
	
}
class Bb{		//extends Object
	//Object 클래스의 equals를 재정의 해서 힙의 값을 비교하도록 재정의

	String name;
	
	Bb(String name){
		this.name = name;
	}
	
	//Object의 메소드를 재정의 : 힙영역의 값을 비교하도록 재정의
	@Override
		public boolean equals(Object obj) {				
		if(this.name == ((Bb)obj).name) {
			return true;
			
		}else {
			return false;
		}
			
			
		}
	
}

public class Object_Class02 {

	public static void main(String[] args) {
		 
		//Object 클래스의 equals() 메소드 : 기본적으로 Stack의 주소를 비교하도록 설정.
		//		-equals() 메소드는 힙의 값을 비교하는 것이 아니라 Stack 메모리의 참조 주소를 비교하도록 세팅되어있음
		//			그래서 equals 메소드를 힙의 값을 비교 할 수 있도록 재정의 해서 사용해야함.
		//		아주특수하게 String 클래스는 equals 메소드가 힙의 값을 비교하도로고 재정의가 되어있다.
		
		
		
		//Aa 객체 생성
		Aa a1 = new Aa("안녕");
		Aa a2 = new Aa("안녕");
		
		System.out.println("Stack의 주소 : "+a1);
		System.out.println("Stack의 주소 : "+a2);
		
		System.out.println(a1==a2);				//거짓====> stack에 저장된 힙의 주소값이 다름.
		System.out.println(a1.equals(a2));		//거짓====> stack에 저장된 힙의 주소값이 다름.
		System.out.println("====================================");
		
		String s1 = new String("안녕");
		String s2 = new String("안녕");
		
		System.out.println(s1==s2);				//거짓
		System.out.println(s1.equals(s2));		//참====>자바의 기본 String 클래스에서 Object 클래스의 equals를 재정의해서 힙의 값을 비교하도록 정의되어있음.
		
		System.out.println("=========================");
		Bb b1 = new Bb("안녕");
		Bb b2 = new Bb("안녕");
		
		System.out.println(b1==b2); 			//거짓 ===> 스택의 주소값을 비교하므로
		System.out.println(b1.equals(b2));      //참 ==> 재정의 해서 힙의 값을 비교하도록 만들어 놓음.
		
		/*@Override
		public boolean equals(Object obj) {				b2가 Object 클래스로 업캐스팅되어서 들어가고
		if(this.name == ((Bb)obj).name) {				이거를 Bb클래스로 다운캐스팅해서 name 필드를 이용.
			return true;
			
		}else {
			return false;
		}
		*/
		
		
		
		
		
	}
}
