package chapter02.ex03;

public class RangeOfVariable {

	
	public static void main(String[] args) {
		
		
		//변수의 사용 범위 : 블락에서 선언되면 그 블락까지가 사용범위 {}단위를 한블락이라고 함.
		
		int val1 = 3; // 전역변수 : 이건 블락 밖에서 선언된거니까 전체에서 사용가능
		
		{ //if, for, while, do while  ====> 블락 내부에서 선언된 변수는 지역 변수 : 블락내에서만 사용가능
			
			
			int val2 = 5; //지역 변수
			
			System.out.println(val1);
			System.out.println(val2);
		
		
		}
		
		
		System.out.println(val1);
		// System.out.println(val2); // 오류 발생 : 블락밖에서는 오류가나는것임
		
		
		
		
		
	}
	
	
	
	
	
}
