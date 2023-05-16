package chapter07.ex02;

class D {
	
	//메소드 : 정수 2개를 받아서 사칙연산해서 연산한 값을 돌려주는 메소드
	
	int plus (int a, int b) {
		return a+b;
	}
	int minus (int a, int b) {
		return a-b;
	}
	int mul (int a, int b) {
		return a*b;
	}
	double div (int a, int b) {
		return (double)a/b;	//결과값이 실수값으로 나올수도 있으므로 더블로 써줘야함
	}
}

public class Ex02 {
	
	public static void main(String[] args) {
		
		//1. 객체생성
		D d1 = new D ();
		
		//2. 메소드 호출
		int c;
		
		c = d1.plus(10, 50);
		
		System.out.println(c);
		
		System.out.println(d1.minus(70, 40)); //이렇게 해도됨.
		System.out.println(d1.mul(3, 4));
		System.out.println(d1.div(50, 3));		//더블형으로 리턴
		
		
		
		
		
		
		
		
		
		
	}

}
