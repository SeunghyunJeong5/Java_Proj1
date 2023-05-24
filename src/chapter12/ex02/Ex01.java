package chapter12.ex02;

abstract class Calc{
	
	abstract int add (int a, int b);		//두 정수를 인풋 받아서 더한 값을 리턴
	abstract int diff (int a, int b);		//빼기
	abstract int mul (int a, int b);		//곱하기
	abstract double div (int a, int b);		//나누기
}

class Calc1 extends Calc {

	@Override
	int add(int a, int b) {
		int p= a+b;
		return p;
	}

	@Override
	int diff(int a, int b) {
		int m = a-b;
		return m;
	}

	@Override
	int mul(int a, int b) {
		int g = a*b;
		return g;
	}

	@Override
	double div(int a, int b) {
		double n = (double)a/b;
		return n;
	}
	
}


abstract class Calc2{
	abstract int add (int a, int b);		//두 정수를 인풋 받아서 더한 값을 리턴
	abstract int diff (int a, int b);		//빼기
	abstract int mul (int a, int b);		//곱하기
	abstract double div (int a, int b);		//나누기
	
}

public class Ex01 {
	
	public static void main(String[] args) {
		//위의 추상클래스를 1. 콘크리트 클래스를 생성해서 작동
					//  2. 익명클래스를 생성해서 작동
		
		
		System.out.println("========== 1. 콘크리트 클래스를 생성해서 작동 =============");
		Calc c1 = new Calc1();
	
	
		c1.add(200, 100);
		c1.diff(200, 100);
		c1.mul(200, 100);
		c1.div(200, 100);
		
		System.out.println(c1.add(200, 100));
		System.out.println(c1.diff(200, 100));
		System.out.println(c1.mul(200, 100));
		System.out.println(c1.div(200, 100));
		
		
		
		System.out.println("========== 2. 익명 클래스를 생성해서 작동 =============");
		
		Calc2 c2 = new Calc2() {
			@Override
			int add(int a, int b) {
				int p= a+b;
				return p;
			}
			@Override
			int diff(int a, int b) {
				int m = a-b;
				return m;
			}
			@Override
			int mul(int a, int b) {
				int g = a*b;
				return g;
			}
			@Override
			double div(int a, int b) {
				double n = (double)a/b;
				return n;
			}
			
			
		};
		
		
		c2.add(300, 100);
		c2.diff(300, 100);
		c2.mul(300, 100);
		c2.div(300, 100);
		
		System.out.println(c2.add(300, 100));
		System.out.println(c2.diff(300, 100));
		System.out.println(c2.mul(300, 100));
		System.out.println(c2.div(300, 100));
		
		
	}

}
