package chapter03.ex02;

public class BitwiseOperator {
	
	
	public static void main(String[] args) {
		
		

	 	//다양한 진법 표현과 비트 연산자
	 	
		//1. 다양한 진법 표현 : 10진수, 16진수, 8진수, 2진수
		int data =13;
		
		System.out.println(Integer.toBinaryString(data));  //13을 2진수로 출력
		System.out.println(Integer.toHexString(data)); //13을 16진수로 출력
		System.out.println(Integer.toOctalString(data)); //13을 8진수로 출력
		
		
		System.out.println("=====================================");
		
		
		//2. 2진수 8진수 16진수를 10진수로 표현
		System.out.println(Integer.parseInt("1101", 2)); //13
		System.out.println(Integer.parseInt("15", 8)); //13
		System.out.println(Integer.parseInt("d", 16)); //13
		
		System.out.println("=====================================");
		
		// 문자열로 된 숫자를 정수로 변환해서 연산을 함....... client 폼에서 ====> 서버로 숫자를 전송
		System.out.println("3" + "5");  //35 문자열 연결
		System.out.println(3 + "5"); //35
		
		System.out.println(Integer.parseInt("3") + Integer.parseInt("5")); //문자열로된걸 숫자로 변환해서 계산 : 8
		
		
		//문자열로 된 실수를 실수형으로 변환
		String a = "13.3";
		String b = "13.4";
		
		System.out.println(a + b);		//둘다 문자열이기때문에 13.313.4로 출력
		
		System.out.println(Double.parseDouble(a) + Double.parseDouble(b)); //double 형으로 바꾸어서 계산하여 출력
		
		
		
		
		
		
		// 2. 비트 연산 : & (AND), | (OR), ^ (XOR), ~(NOT)
			// -- & (AND)   0 & 0 ==> 0 , 0 & 1 ==> 0, 1&0==>0, 1&1==>1   --------> 2진법으로 바꾸어서 계산됨
		
		System.out.println(3&10); // 2나옴
		
		    // -- | (OR)    0|0==>0, 0|1==>1, 1|0==>1, 1|1==>1
		
		System.out.println(3|10);  // 11나옴
		
			// -- ^ (XOR) : 두 값이 같을때는 0 다를때는 1
						//	0^0==>0, 0^1==>1, 1^0==>1, 1^1==>0
		
		System.out.println( 3^10 ); //9
		
			// -- ~(NOT) : 반대를 출력 (0은 1로, 1은 0으로)
		
		System.out.println(~3);  //-4
		System.out.println(~10); // -11
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
