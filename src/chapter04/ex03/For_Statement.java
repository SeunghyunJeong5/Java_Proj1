package chapter04.ex03;

public class For_Statement {
	
public static void main(String[] args) {
	
	
	
	//반복문 : for, while, do while ,  조건이 true 일때 까지 계속 반복, 조건이 false 이면 구문을 빠져나온다.
	
	// for (변수의 초기값 ; 조건 ; 증감식) {
	//	조건이 True 일동안 반복 실행 블럭	
     	
    //}
	
	//1. For 문의 기초 : i = 0값을 할당함. i변수는 for 블락에서 선언했기 때문에 for 문이 끝나면 소멸(밑에서 다시 쓸수있다는 얘기)
	// 0~9까지 1씩 증가하면서 i변수의 값을 출력
	for (int i =0 ; i < 10 ; i ++) {
		System.out.println(i);
	}
	
	
	
	// i = 100, j = 200 ----> 초기값, i<1000 ----> 조건, i++, j++ ----> 증감식, 실행구문 작통후 증감식 작동
	for (int i = 100, j=200 ; i<1000 ; i++, j ++) {
		System.out.printf("변수 i : %d, 변수 j : %d\n", i, j);
	}
	
	
	
	System.out.println("======================================================");
	
	
	// 전역 변수로 선언 b : for문 블락 밖에서 선언
	int b;
	for ( b=0 ; b <100 ; b +=2) {
		System.out.print(b + " ");
	}
	
	System.out.println("======================================================");
	
	//for 문을 사용해서 0~1000 사이 3의 배수만 출력
	
	//for (int c=3 ; c<1000 ; c +=3) {
	//	System.out.print(c + " ");
	//}
	//위에 것도 됨
	
	for (int c=0 ; c<1000 ; c +=3) {
		if (c != 0) {System.out.print(c + " ");}
	}
	
	System.out.println();
	System.out.println("=============2단을 println()으로 출력=========================================");
	
	
	//for 문을 사용해서 2단 출력
	
	for (int i = 2, j = 1; j<10 ; j++) {
		System.out.println(i + " * " + j + " = " + i*j );
	}
	
	
	System.out.println("=============2단을 printf()로 출력=========================================");

	for (int i = 2, j = 1; j<10 ; j++) {
		System.out.printf("%d * %d = %d \n", i, j, i*j);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
}


