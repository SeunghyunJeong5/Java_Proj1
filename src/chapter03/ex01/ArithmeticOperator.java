package chapter03.ex01;

public class ArithmeticOperator {
	
	
	public static void main(String[] args) {
		
		/*
		 	산술 연산자 : +, -, *, /, %(나누고 난 나머지 값만 출력)
		 	증감 연산자 : ++ (1씩증가), --(1씩감소) ------> 변수 앞에, 변수 뒤에
		 	
		 */
		
		// 1. 산술 연산자
			int a = 5;
			int b = 10;
		
			System.out.println(2+3); // 정수 : 5
			System.out.println(a+b); // 정수 : 15
				
			System.out.println(2+(double)3);	// 실수 : 5.0 (앞에있는것 2가 자동으로 2.0(double)타입으로 업캐스팅된다.
			
			System.out.println(8%5); // 8을 5로 나누고 난 나머지 값만 출력, 3이됨     if, for 2의 배수, 3의 배수 
			System.out.println(8/5); // int : 몫만 출력
			System.out.println(8/5.0); // double : 1.6
			System.out.println((int)(8/5.0)); // int : 1 몫만 출력
			
		// 2. 증감연산자 : ++, --
			int val1 = 3;
			val1++;
			System.out.println(val1); //4
			
			val1--;
			System.out.println(val1); //3
			
			int val2 =3;
			++val2;
			System.out.println(val2); //4
			
			--val2;
			System.out.println(val2); //3
		
			
			System.out.println("====================================");
			
			
			int val3 = 3;
			int val4 = ++val3;
			System.out.println(val4);  //4  앞에들어가면 플러스해서 넣고
			
			//int val4 = val3++;
			//System.out.println(val4); 3
			
			int val5 = 3;
			int val6 = ++val5;
			System.out.println(val6); //4
			
			int val7 =3;
			int val8 =4;
			int val9 = 2 + val7-- + ++val8 ; //2 + 3 + 5 (여기는 뒤에 --가 붙으면 여기 구문에서는 계산될때는 그대로 계산됨, 그리고 나중에 1감소한 값으로 저장됨)
			
			System.out.println("val7 : " + val7); //2
			
			System.out.println(val9); // 10
			System.out.println("=================================");
			
			
			
			int val10 = 30;
			int val11 = 40;
			int val12 = 50;
			
			int val13 = 7 + --val10 + ++val11 + val12--; //7 + 29 + 41 + 50 
			
			System.out.println(val12); //49
			
			System.out.println(val13); //127
			
			
			
			
			
			
			
			
			
		
		
		
	}

}
