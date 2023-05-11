package chapter05.ex03;

public class Ex02 {

	public static void main(String[] args) {

		/*
		 * 배열방 1000개를 생성, 정수배열, 4의 배수를 담는데 8의 배수는 담지 않도록 저장
		 * 
		 * 출력은 10개씩 끊어서 출력(for 문을 사용해서 출력)
		 */

		int[] arr1 = new int[1000];			//배열 선언 : 1000개의 방 생성, index : 0~999
		int a;
		int i = 0;
		for (a = 1; true; a++) {				//각 배열 방에 값을 insert, i : 방번호, a : 값
			if (a % 4 == 0) {
				if (a % 8 != 0) {				//if (a%4==0) && (a%8!=0) { 이렇게 해도됨
					arr1[i] = a;				
					i++;						//i는 999까지 증가함

				}
				if (i == 1000)
					break;

			}
		}

		for (i = 0; i < 1000; i++) {				//i<arr1.length 로 해도됨
			System.out.print(arr1[i] + " ");

			if (i % 10 == 9) {						//(i+1)%10==0으로 조건을 둬도 됨.
				System.out.println();
			}

		}

	}

}
