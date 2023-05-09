package chapter04.ex03;

public class For_Statement04 {

	public static void main(String[] args) {
		
		
		
		// for문에서 오류를 일으키기 쉬운 부분
		
		
		for (int i =0 ; i < 10 ; i++) {
			System.out.println(i);
		}
		
		System.out.println("==============================");
		
		
		for ( int i = 0 , j = 0 ; i < 10 ; j++) {
			System.out.println(i + " , " + j);
			
			if ( j == 1000 ) {break; //무한루프를 빠져나오도록 설정
			
			}
		
		
		}// 무한루프 발생됨// 블락내에서 선언된건 거기서 끝나버림
		
		System.out.println("무한루프 발생");
		
		
		for (int i = 10 ; i < 100 ; i+=10 )  // i+=10  ===== i = i + 10
		{
			System.out.println(i);
			
		}
		
		
		//전역 변수 : 우리가 원래 하던거
		//지역 변수 : for, if, switch, while, do while 문 등에서 {}에서 선언되는 변수는 지역변수
		
		
		
		// int i, j ; //여기 이렇게 전역 변수로 선언되어있는데 블락에서 다시 선언하면 안됨.....
		
		for ( int i = 0 ; i < 10 ; i++) {
			
		}
		
		
		
		
	}
}
