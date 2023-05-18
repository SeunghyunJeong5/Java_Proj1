package chapter08.ex02;
	
		

public class A  {
	
			//생성자
			public A(){}
			
			
			
			//필드에 부여된 접근제어자
			public int a = 1;				//같은 패키지, 다른패키지에서도 다 접근가능.
			protected int b = 2;			//같은 패키지에서 접근가능, 다른패키지에서 접근할때는 상속관계가 설정되어있어야함.
			int c = 3;						//같은 패키지에서만 접근가능, 외부 클래스에서 접근가능.
			private int d = 4;				//같은 클래스에서만 접근가능, 외부 클래스에서는 접근불가능.
			
			
			
			//메소드에 부여된 접근제어자
			public void abc () {
				System.out.println("public");
			}
			
			protected void bcd () {
				System.out.println("protected");
			}
			
			void def () {
				System.out.println("default");
			}
			
			private void efg () {
				System.out.println("private");
			}
			
			
	public static void main(String[] args) {
		
		
		
		
		
		
		
	}

}
