package chapter05.ex01;

public class Ex01 {

	public static void main(String[] args) {

		// 배열 방 100개를 생성 후 3의 배수만 저장 후 출력
		// 힌트 : i는 방번호, j는 3의 배수를 저장하는 변수

		int[] arr1 = new int[100];

		System.out.println(arr1.length); // 보통 이렇게 씀(방의 개수를 출력)(index : 0~99)

		int j = 0; // 3의 배수를 저장하는 변수

		// arr1 배열의 각 방에 값을 저장하는 for
		for (int i = 0; i < arr1.length; i++) {

			j += 3; // j=j+3

			arr1[i] = j;

		}

		System.out.println("==========for 문을 사용해서 출력 ==============");

		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1 변수의 [" + i + "] 번째 방의 값을 출력 : " + arr1[i]);

		}

		
		
		System.out.println("=========Enhanced For : 향상된 For 문을 사용 =============");
		//배열의 첫 번째 방부터 마지막 방까지 자동으로 그 값을 출력할때 사용
		for (int k : arr1) {
			System.out.print(k+ " ");
			
		}
		System.out.print("\n\n");
	
	
	
	
	
	
	
	}
	
	

}
