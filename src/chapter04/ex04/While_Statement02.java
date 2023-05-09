package chapter04.ex04;

public class While_Statement02 {

	public static void main(String[] args) {
		
		
		
		// 반복문 : 무한 루프에 빠지지 않도록 해야한다.
		
		
		System.out.println("======무한 루프 탈출=======");
		
		boolean abc = true;
		int i = 1;
		while (abc) {				//무한 루프 : 100 번 출력
			
			System.out.println("무한 루프" + i);
			if (i == 100) {break;}
			i++;
			
		}
		
		
		
		
		
		
	}
}
