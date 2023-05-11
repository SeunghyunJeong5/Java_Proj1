package chapter05.ex04;

public class Ex01 {

	public static void main(String[] args) {

		/*
		 * arr1 = 4행 100열의 2차원 배열 방을 생성하세요.
		 * 
		 * 0: 10의 배수만 저장 
		 * 1: 3의 배수만 저장 
		 * 2: 3의 배수지만 6의 배수를 저장하지 말고 저장 
		 * 3: 7의 배수, 8의 배수 저장
		 * 
		 * for 문을 사용해서 출력.
		 * 
		 */
		
		
		//1. 배열 선언
		int[][] arr1 = new int[4][100];
		
		System.out.println("행의 개수 : "+arr1.length);
		System.out.println("0행의 열의 개수 : "+arr1[0].length);
		System.out.println("1행의 열의 개수 : "+arr1[1].length);
		System.out.println("2행의 열의 개수 : "+arr1[2].length);
		System.out.println("3행의 열의 개수 : "+arr1[3].length);
		
		//2. 배열의 각 행에 값을 저장
		
		
		for (int i =0 ; i< arr1.length; i++) {				//i : 행을 Loop : 0, 1, 2, 3
				
					if(i==0) {					//10의 배수를 저장함.
						for( int j =0, a=10 ; j< arr1[i].length; j++) {		//j : 열을 Loop : 0,1,2,3,4,5.....99
									//10의 배수를 저장하는 변수 선언
							
							arr1[i][j] = a;
							a+=10;
						
						}
						
					}
					
					else if(i==1) {				//3의 배수를 저장함.
						for( int j =0,a=3 ; j< arr1[i].length; j++) {
							arr1[i][j] =a;
							a+=3;
							
						}
							
					}

					else if(i==2) {				//3의 배수이지만 6의 배수 빼고 저장함.
						for( int j =0,a=3 ; j< arr1[i].length; a+=3) {
							if (a%6==0) continue;
							 arr1[i][j] =a;
							 j++;			// 값을 넣었을때만 j값이 증가해야한다.
							
							
						}
					}

					else if(i==3) {				//7과 8의 배수를 저장함.
						for( int j =0, a=1; j< arr1[i].length;  a++) {
							
							if (a % 7 == 0 || a%8==0) {
								arr1[i][j] = a;
								
								j++;
							}
							
							
						}
					}
					
					
					
				}
		
		
		/*for (int a = 1;; a++) {
			i = 0;

			if (a % 10 == 0) {
				arr1[i][j] = a;
				j++;
			}
			if (j == 100)
				break;
		}

		for (int a = 1;; a++) {
			i = 1;

			if (a % 3 == 0) {
				arr1[i][j] = a;
				j++;
			}
			if (j == 100)
				break;
		}
		for (int a = 1;; a++) {
			i = 2;

			if (a % 3 == 0 && a % 6 != 0) {
				arr1[i][j] = a;
				j++;
			}
			if (j == 100)
				break;
		}

		for (int a = 1;; a++) {
			i = 3;

			if (a % 7 == 0 | a % 8 == 0) {
				arr1[i][j] = a;
				j++;

			}
			if (j == 100)
				break;
		}
		
		*/

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}

	}

}
