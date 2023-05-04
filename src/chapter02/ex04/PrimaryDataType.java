package chapter02.ex04;

public class PrimaryDataType {
	
	
	public static void main(String[] args) {
		
		/*
			자료형 : 
				- 기본 자료형 : RAM에 STACK(스텍) 공간에 변수명, 변수의 값이 저장된다.
					- 8가지 기본 자료형 : boolean --- true,false만 담을수 있음, 정수형(byte, short, int, long), 실수형(float, double), 문자형(char)
					- 정수형 자료형의 기본은 : int 임 -----------> long으로 선언 후 변수의 값(리터럴)을 담을때, l or L의 값을 정해줘야됨 안그러면 int로 저장됨. 
					- 실수형 자료형의 기본은 : double 임 --------> float 선연된 변수에 값을 넣을때, f or F의 값을 정해줘야됨.
					
				- 참조 자료형 : RAB에 STACK(스텍) 공간에 Heap의 주소를 가지고 있다. Heap(힙) 공간에 실제 값(변수명, 변수의 값)이 저장됨.
					- 무한대 (객체 (String) / 배열 / ...)
					
			리터럴 : 변수에 할당된 값을 통칭해서 리터럴이라고 함.
		
		*/
		
		
		//1. boolean : true, false 값만 저장 할 수 있는 자료형
		
		boolean bool1 = true;
		
		boolean bool2;
		bool2 = false;
		
		// boolean bool3 = 123; // 참거짓값이 아니니 오류발생
		
		System.out.println(bool2); //false
		
		// 변수의 값 수정
		bool2 = true;
		
		System.out.println(bool1);   //true
		System.out.println(bool2);	 //true
		
		
		final boolean BOOL4 = false; // 변수 이름 앞에 final 키가 붙은것 --> 상수라고 함 ======> 상수명은 변수명과 구분하기 위해서 대문자를 사용
		
		System.out.println(BOOL4); // false
		
		// 상수의 값은 수정할 수 없다.
		
		// BOOL4 = true; // 오류발생 : 상수의 값은 수정 할 수 없다.
		
		
		
		
		// 2. 정수형 자료형 ( byte(1byte), short(2byte), int(4byte), long(8byte) )
		
		// byte : 1byte (-2^7 ~ + 2^7 -1까지 의 값을 저장할 수 있다.), 1byte = 8bit
				     // (-128 ~ + 127)
		// 8bit 의 첫번째 비트는 부호비트 0---플러스값 or 1---마이너스값 이 들어감. 나머지 7bit가 값의 크기를 다르게함.
		
		byte val1 = -128;
		byte val2 = 127;
		// byte val3 = -129; // 오류발생
		
		
		// short : 2byte (16bit, -2^15 ~ +2^15-1) 범위의 값을 할당 할 수 있다.
							 //-32,768 ~ +32,767
		
		short val3 = -32768;
		short val4 = 32767;
		// short val5 = -32769; // 오류발생
		
		
		// int : 4byte (32bit, -2^31 ~ +2^31-1) 범위의 값을 할당 할 수 있다.
					//-2,147,483,648 ~ +2,147,483,647
		
		int val5 = -2147483648;
		int val6 = 2147483647;
		// int val7 = 2147483648; // 오류발생
		
		
		// long : 8byte (64bit, -2^63 ~ +2^63)
	  	       //-9223372036854775808 ~ +9223372036854775807
			   // long 형으로 선언된 변수에 값을 할당 할 때 주의, 리터럴에 값을 넣을때 : L or l을 붙여줘야된다. 안그러면 오류남 int형으로 인식해서
		
		long val7 = -9223372036854775808L;
		long val8 = 9223372036854775807L;
		
		long val9 = 123456 ;   //int 자료형 보다 큰 값을 넣을때 L을 넣어주는 것이다. (작으면 안넣어도 됨)
		
		
		
		// 3. 실수형(소숫점) 자료형 : double 이 기본이어서, float 자료형에 값을 할당 할때, F or f를 써줘야함.
		// 			- float : 4byte, 소숫점 7자리까지 정밀도를 유지
		//			- double : 8byte, 소숫점 15자리까지 정밀도가 유지
		
		
		float val10 = 1.123456789F ; //소숫점 이하 9자리까지 넣었지만 F(7자리까지만 유지)
		double val11 = 1.123456789; //float은 오류남, F안쓰면
		
		System.out.println(val10); //1.1234568 출력됨(소숫점이하 7자리까지 정밀하고 그 뒤는 모른다는 얘기)
		
		double val12 = 1.12345678910111213; 
		
		System.out.println(val12);
		
		
		// 4. 문자 (char) : 1글자, 문자열 : 1글자 이상-----> String (참조 자료형, 객체), 리터럴에 값을 넣을때 "" 사용
			// 리터럴에 값을 넣을때 char는 ''을 씀
			// 리터럴에 문자 A, B, C, a, b, c
			// 리터럴에 특수 문자 #, !, %
			// 아스키 코드 값으로 넣을 수 있다. : 숫자, 문자, 영문자, 특수문자-----> 7bit의 값을 갖고있다.
			// 유니코드 값으로 넣을 수 있다. : '\u0041',  2byte, 3byte-----> 한글, 중국어, 일본어, .... 영어가 아닌문자는 유니코드 값을 갖고있다.
			// 한글 1자, 중국어 1자, 일본어 1자
		
		// 직접 문자를 대입 : 영어(대문자, 소문자), 숫자, 특수문자 -----> 7bit로 된 코드값을 갖고있는데 : 아스키코드라고 한다.
		// 유니코드 : 2byte ~ 3byte, 한국어, 일본어, 중국어,.....
		char val13 = 'A';  // A의 아스키 코드값 : 65
		//char val14 = 'AB'; //오류남
		char val14 = 'B';
		char val15 = 'a';
		char val16 = '가';
		char val17 = '#';
		char val18 = '1';
		
		System.out.println(val13); // A라고 출력됨
		System.out.println((int)val13); // A의 아스키코드 값이 출력된다. ---> 65
		
		System.out.println(val14); // B라고 출력됨
		System.out.println((int)val14); // B의 아스키코드 값이 출력된다. ---> 66
		
		System.out.println(val15); // a라고 출력됨
		System.out.println((int)val15); // B의 아스키코드 값이 출력된다. ---> 97
		
		System.out.println(val16); // 가 라고 출력됨
		System.out.println((int)val16); // 가 의 유니코드값이 출력된다. ---> 44032
		
		
		// 숫자(아스키 코드값으로) char 변수에 값 할당. 
		char val19 = 65; //A
		
		System.out.println(val19);
		
		//유니 코드 값으로 char 변수에 값을 저장
		char val20 = '\u0041'; //A
		char val21 = '\uac00'; //가
		char val22 = '\u0033'; //3
		char val23 = '\uc815'; //정
		
		System.out.println(val20);
		System.out.println(val21);
		System.out.println(val22);
		System.out.println(val23);
		
		// 자신의 이름을 유니코드로 char 변수에 할당해서 
		// 나의 이름은 정승현 입니다. --- 출력
		
		char first = '\uc815';
		char second = '\uc2b9';
		char third = '\ud604';
		
		//1. println() : 문자열과 변수를 출력시 + 
		
		System.out.println("나의 이름은 " + first + second + third + " 입니다.");
		
		//2. print() : 문자열과 변수를 출력시 +, \n으로 행변경
		
		System.out.print("나의 이름은 " + first + second + third + " 입니다.\n");
		
		//3. printf() : 문자열 내에서, 뒤의 변수 값을 불러들임 "%s": 문자열, "%d" : 정수, "%f" : 실수, "%c" : 문자열의 변수값을 불러들임
		
		System.out.printf("나의 이름은 %s%s%s 입니다.", first, second, third);
		System.out.printf("\n나의 이름은 %c%c%c 입니다.", first, second, third);
		
		
		
		// 참조 자료형 : String (객체) : 문자열을 저장하는 자료형 : ""
			String val25 = "\n오늘의 날씨는 흐립니다.";
			
			System.out.println(val25);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
