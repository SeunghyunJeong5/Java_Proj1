package chapter07.ex02;

class C{
	void print (int [] a, double [] b) {
		//a배열을 값을 for문으로 출력
		System.out.println("====== 정수 배열 출력 =========");
		
		
		for (int i = 0 ; i< a.length;i++) {
			System.out.print(a[i]+ " ");
			
		}
		System.out.print("\n\n");
		
		System.out.println("====== 더블 배열 출력 =========");
		//b배열의 값을 for문으로 출력
		
		for (int i = 0 ; i< b.length;i++) {
			System.out.print(b[i]+ " ");
			
		}
		System.out.print("\n\n");
		
		
	}
	
}

public class Ex01 {
	
	public static void main(String[] args) {
		//1. 객체 생성
		C c1 = new C();
	
		
		//2. 배열 생성
		int [] arr1 = new int [] {1,2,3,4,5,6,7,8,9,10};
		double [] arr2 = new double [] {1.1, 2.2, 3.3, 4.4, 5.5};
		
		//3. 메소드 호출
		c1.print(arr1, arr2);
		c1.print(arr1, new double [] {1.1, 2.2, 3.3, 4.4, 5.5}); //같은거임.
		
		
		
	}

}
