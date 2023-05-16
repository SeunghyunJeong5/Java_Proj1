package chapter07.ex02;

class Z {
	void arrSum(int[] a, int[] b) {
		for (int i = 0; i<a.length; i++) {
			System.out.print(a[i]+b[i]+" "); //" "+a[i]+b[i]+" " 이렇게 하면 a[i]+b[i]에서 +가 연산이 아니고 그냥 연결만 된다.
																					//주의!!!
		}
	}

	void arrDiff(int[] a, int[] b) {
		for (int i = 0; i<a.length; i++) {
			System.out.print(a[i]-b[i]+" ");
		}
	}

	void arrMul(int[] a, int[] b) {
		for (int i = 0; i<a.length; i++) {
			System.out.print(a[i]*b[i]+" ");
		}
	}

	void arrDiv(int[] a, int[] b) {
		for (int i = 0; i<a.length; i++) {
			System.out.print((double)a[i]/b[i]+" ");
		}
	}

}

public class Ex04teach {

	public static void main(String[] args) {

		int[] arr1 = new int[100];
		// 7의 배수 저장 , j : 7의 배수를 저장하는 변수
		for (int i = 0, j = 7; i < arr1.length; i++) {
			arr1[i] = j;
			j += 7;
			System.out.print(arr1[i] + " ");

		}
		System.out.print("\n\n");

		// 4의배수저장, 8의배수 빼고//j: 저장하는 값

		int [] arr2 = new int [100];
		for (int i =0, j=1;true; j++) {
			if (j%4==0 && j%8!=0) {
				arr2[i]=j;
				System.out.print(arr2[i]+" ");
				i++;
			}
			if (i==100) break;
			
		}
		
		System.out.print("\n\n");
		
		
		
		
		// 각 메소드 호출 후 출력
		Z f1 = new Z();
		
		f1.arrSum(arr1, arr2);
		System.out.println();
		f1.arrDiff(arr1, arr2);
		System.out.println();
		f1.arrMul(arr1, arr2);
		System.out.println();
		f1.arrDiv(arr1, arr2);
		
	}

}
