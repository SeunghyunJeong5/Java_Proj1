package chapter08.ex03;

public class Ex01 {
	
	public static void main(String[] args) {
		
		int[] coinUnit = {500, 100, 50, 10} ; // 거슬러 줘야하는 돈
		
		int money = 2680; // money : 변수의 돈을 위의 거스름돈으로 나누어 주려고 함.
	
		System.out.println("money = " +money);
		
		int c = 0;
		
		for (int i = 0; i<coinUnit.length;i++) {
			
			//나누어 줄 거스름돈이 아래와 같이 출력되도록 코드 작성
				c = money/coinUnit[i] ;
				money = money%coinUnit[i];
				
				System.out.println(coinUnit[i]+"원 : "+c );
			
			
			
		}
		
	}
	

}

/*
실행 결과 창에
money = 2680
500원 : 5
100원 : 1
50원 : 1
10원 : 3
*/