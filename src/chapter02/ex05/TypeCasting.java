package chapter02.ex05;

public class TypeCasting {
	
	public static void main(String[] args) {
		
		
		/*
		 타입 캐스팅 (Type Casting) : 정수 ---> 실수 ,  실수 ---> 정수
		 
		 	-- 낮은 자료형 ==========> 높은 자료형 
		 		byte --> short --> int --> long --> float --> double
		 
		 
		 
		 	-- 업캐스팅   	: 자동으로 변환, 
		 				낮은 자료형===> 높은 자료형으로 변환
		 				
		 	-- 다운캐스팅  	: 자동으로 변환되지 않는다, 수동으로 명시가 필요함.
		 				높은 자료형===> 낮은 자료형으로 변환
		 
		 */
		
		
		// 1. 캐스팅 방법 첫번째
		
		// int val1 = 4.3;   //오류 발생-------> val1 : int 이므로 실수를 넣으면 오류발생
		int val2 = (int) 4.3;  //이건 가능 ---> 다운캐스팅이라고 함 int라고 명시를 해줬고 정수형 4로 인식을 해버림.
												// 수동으로 반드시 명시를 해야한다.
		
		System.out.println(val2); //4로 출력
		
		double val3 = 3; // 업캐스팅 : 자동으로 작동됨.
		System.out.println(val3); //3
		
		
		// 다운캐스팅이 필요함. 명시해야함.
		//int val4 = 5.8; 
		//long val5 = 10.0000344;
		
		
		int val4 = (int)5.8; 
		long val5 = (long)10.0000344;
		
		System.out.println(val4);  //5  
		System.out.println(val5); //10     (한 라인 복사 ctrl + art + 아랫쪽 화살표)
		
		
		// 업캐스팅 (자동으로 업캐스팅 됨) 명시하지 않아도 됨.
		
		float val6 = (float)5; //이렇게 굳이 안해줘도됨.
		double val7 = 6;
		
		System.out.println(val6);  //5  
		System.out.println(val7);  //5  
		
	}

}
