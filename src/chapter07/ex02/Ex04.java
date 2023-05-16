package chapter07.ex02;

class F {

	// 1. 메소드 : 두 배열의 각 방의 내용을 더해서 출력 : int
	void print(int[] a, int[] b) {
		System.out.println(" ==================더해서 출력 =================== ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + b[i] + "\t");
		}
		System.out.print("\n\n");
		System.out.println(" ==================빼서 출력 =================== ");
		// 2. 메소드 : 두 배열의 각 방의 내용을 빼서 출력 : int
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] - b[i] + "\t");
		}
		System.out.print("\n\n");
		System.out.println(" ==================곱해서 출력 =================== ");
		// 3. 메소드 : 두 배열의 각 방의 내용을 곱해서 출력 : int
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] * b[i] + "\t");
		}
		System.out.print("\n\n");
		System.out.println(" ==================나눠서 출력 =================== ");
		// 4. 메소드 : 두 배열의 각 방의 내용을 나눠서 출력 : double
		for (int i = 0; i < a.length; i++) {
			System.out.print((double) a[i] / b[i] + "\t");
		}

	}

}

public class Ex04 {

	public static void main(String[] args) {

		F f1 = new F();

		// 1. 정수를 담는 배열 arr1 방 100개를 생성 ==> 7의 배수만 저장.
		// 7 14 21.....

		// 2. 정수를 담는 배열 arr2 방 100개를 생성 ==> 4의 배수만 저장하는데 8의 배수는 빼고 저장.
		// 4 12 20.....

		int[] arr1 = new int[100];
		int[] arr2 = new int[100];
		for (int i = 0, a = 1; i < arr1.length; a++) {
			if (a % 7 == 0) {
				arr1[i] = a;
				i++;

			}

		}

		System.out.println("=========== arr1 배열의 각 방의 값 =============");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

		for (int i = 0, a = 1; i < arr2.length; a++) {
			if (a % 4 == 0 && a % 8 != 0) {
				arr2[i] = a;
				i++;
			}

		}
		System.out.print("\n\n");

		System.out.println("=========== arr2 배열의 각 방의 값 =============");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.print("\n\n");

		f1.print(arr1, arr2);

	}

}
