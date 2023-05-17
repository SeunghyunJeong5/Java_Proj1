package chapter07.ex04;

public class Ex01 {

	// 두배열의 각 방의 내용을 더해서 출력
	public static void arrSum(int[] a, int[] b) {
		
		
		int [] c = new int [71]; //a배열은 방수가 71임...b배열의 방수는 55임. 방수가 다르면 더할때 오류가 발생함...
		
		for(int i =0 ,j=0 ;i<a.length; i++,j++) {
			
			if(i>54) {			//55이상은 값을 그냥 a만 저장하는것....흠.....
				c[i] = a[i];
			}
			else {	c[i]= a[i]+b[i];}
				System.out.print(c[i]+ " ");
			}
			
		}
		
		
		
		
/*
		System.out.println(" ==================더해서 출력 =================== ");

		for (int i = 0; i < (int) 500 / 9; i++) {
			System.out.print(a[i] + b[i] + " ");
		}

	}
*/
	public static void main(String[] args) {

		// 0~500까지(숫자의 범위를 의미)의 7의배수를 저장
		// 0~500까지의 9의배수를 저장

		int[] a = new int[(int) 500 / 7];
		int[] b = new int[(int) 500 / 9];

		for (int i = 0, j = 1; i < (int) 500 / 7; j++) {

			if (j % 7 == 0) {
				a[i] = j;
				i++;

			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("\n\n");

		for (int i = 0, j = 1; i < (int) 500 / 9; j++) {

			if (j % 9 == 0) {
				b[i] = j;
				i++;

			}

		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.print("\n\n");

		arrSum(a, b); // 각 방의 내용을 더해서 출력

	}

}
