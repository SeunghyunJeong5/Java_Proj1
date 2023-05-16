package chapter07.ex02;



public class Method04 {
	
	//인스턴스 메소드 : 객체화 해야 호출이 됨.
	
	String sum (int a , int b) {
		int c = a+b;						
		String d = String.valueOf(c); //정수타입c를 String타입으로 변환해서 d변수에 할당.
		return d ;
	}
	
	
	
	//정적(static) 메소드 : 객체 생성 없이 호출 가능.
	
	static int sum2(int a, int b) {
		
		return a+b;
	}
	
	
	
	
	public static void main(String[] args) {
		
		//메인 메소드는 static 키워드가 들어가 있다.
		//같은 클래스안의 main 메소드에서는 static 키워드가 없어도 메소드 명으로 바로 호출이 가능하다는것.
		
		int a;
		
		a = sum2 (10,20);
		
		System.out.println(a);
		
		
		
		
		
		//sum : 인스턴스 메소드, 객체화 해야 호출이 가능.
		Method04 m1 = new Method04();
		
		String s1 = m1.sum(10, 30); //40 return이 String 타입이므로 스트링으로 저장
		
		String s2 = m1.sum(70, 70);	//140 스트링 타입.
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1+s2); //+가 연결연산자로 취급해서 연결해서 출력이됨.
		
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));	//180이 됨.(정수로 변환하고 한것)
		
		
		
		
		
		
		//같은 클래스 내부에서 메소드 호출 (static 메소드는 static 메소드를 호출가능)
		//sum2 : static(정적 메소드)
		
		//1. 클래스명으로 호출(정적메소드니까 객체생성 없이 호출가능)
		int m = Method04.sum2(10,20);
			System.out.println(m);
			
			
		//2. 객체 생성 후 호출해서 출력	
		Method04 m3 = new Method04();	
		int n = m3.sum2(10,20);
			System.out.println(n);
			
			
		//3. 같은 클래스안에 둘다 static 이므로 이런 방식으로 호출이 가능.(메인메소드에서 메소드명으로 바로 호출)
		int k = sum2(10,20);
			System.out.println(k);
			
			
		// sum (10,10);   ====> 이렇게하면 static 메소드가 아니므로 오류가남... 객체를 만들어야함!!!.
									//인스턴스 메소드 : 객체 생성 후 호출해야됨.
			
			sum2(10,10);  //=====> 이건 가능
									//정적(static) 메소드 : 객체 생성 후 호출, 클래스명으로 호출, 메인메소드에서 메소드명으로 호출 가능(같은 클래스 안에 있어야함.)
																												//메인과 static메소드가 같은 클래스 안에 있어야 한다는 얘기.
		
		
		
		
		
		
	}

}
