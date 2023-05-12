package chapter05.ex07;

public class Main_Method_Argument02 {
	
	public static void main(String[] args) {
		
		//main 메소드의 input 매개변수로 실수 값을 넘겨 받아 계산
		
		
		
		// 1. 직접 넘어오는 변수를 받아서 할당
		String a = args[0];
		String b = args[1];
		String c = args[2];
		
		System.out.println(a+b+c);  				// +는 연결연산자로 사용됨
		
		double aa = Double.parseDouble(a);			//String 형에 저장된 실수를 double 형으로 바꿔줌
		double bb = Double.parseDouble(b);
		double cc = Double.parseDouble(c);
		
		System.out.println(aa+bb+cc);				// +는 덧셈을 연산
		
		
		System.out.println("==========================================");
		
		for(int i =0; i <args.length;i++) {
			System.out.println(args[i]);	     			//String 타입으로 찍힘
		}
		
		
		
		
		
		
		
		
		
	}

}
