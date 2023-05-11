package chapter05.ex04;

public class Chat {
	
	public static void main(String[] args) {
		
		
		
		int[][] arr1 = new int[4][100];

		// 첫번째 행에는 10의 배수만 저장
		for (int i = 0; i < 100; i++) {
		    arr1[0][i] = (i + 1) * 10;
		}

		// 두번째 행에는 3의 배수만 저장
		for (int i = 0; i < 100; i++) {
		    arr1[1][i] = (i + 1) * 3;
		}

		// 세번째 행에는 3의 배수이지만 6의 배수는 아닌 수 저장
		int count = 0;
		for (int i = 1; i <= 100; i++) {
		    if (i % 3 == 0 && i % 6 != 0) {
		        arr1[2][count] = i;
		        count++;
		    }
		}

		// 네번째 행에는 7의 배수이거나 8의 배수인 수 저장
		count = 0;
		for (int i = 1; i <= 1000; i++) {
		    if (i % 7 == 0 || i % 8 == 0) {
		        arr1[3][count] = i;
		        count++;
		        if (count == 100) {
		            break;
		        }
		    }
		}

		// arr1 배열 출력
		for (int i = 0; i < 4; i++) {
		    for (int j = 0; j < 100; j++) {
		        System.out.print(arr1[i][j] + " ");
		    }
		    System.out.println();
		}

	}

}
