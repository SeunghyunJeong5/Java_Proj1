package chapter07.ex02;

class B{
	//매개 변수로 배열을 받아서 처리하는 메소드
	// void : 리턴이 없을때
	void print (int [] a) {		//배열의 정보를 출력하는 메소드
		
		//for 문으로 출력
		for (int i =0; i <a.length; i++) {
		
			System.out.print(a[i] + " ");
			
		}
		System.out.print("\n\n");
		
	}
	
}



public class Method02 {
	
	public static void main(String[] args) {
		
		
		//1. 객체 생성 후 메소드 호출
		B b1 = new B();
		
		//2. 배열을 선언과 동시에 값을 넣음
		int [] aar1 = new int [] {1,2,3,4,5,6,7,8,9,10};
		
		//3. 메소드 호출시 배열을 매개변수로 넣어줌
		b1.print(aar1); //arr1안의 값이 정수값이 들어가있으니 위의 메소드의 매개변수에 해당하는 int [] a가 성립됨. a = arr1
		
		System.out.println("========================================================");
		
		B b2 = new B();
		
		b2.print(new int [] {10,20,30,40,50,60}); //이렇게도 입력가능
		
		
		
		
		
		
	}

}
