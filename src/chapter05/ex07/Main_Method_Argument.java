package chapter05.ex07;

public class Main_Method_Argument {
	
	
	public static void main(String[] args) {
		
		
		//Method (메소드) : C에서 함수를 객체 지향 언어(OOP)에서 메소드라 호칭
		//			- 접근지정자 반환타입 메소드명                 (인풋매개변수)               {실행블락}
		//			   public   void   main	  args 에 들어오는 값은 String 배열로 들어온다.
		
		
		
		//1. args : main 메소드로 String[] 배열을 담는 변수
		
		
		
		// main 메소드 인풋으로 값을 넘겨서 변수에 할당하고 출력
		String a= args[0];
		String b= args[1];
		String c= args[2];
		String d= args[3];
		
		System.out.println(a+b+c+d);		// +는 연결 연산자로 들어감(String 변수이므로)
		//run 에서 밑에 화살표 누르고 run configuration 으로 들어가서 내 class를 잘 선택하고, argument에 들어가서 값을 입력하면 각 args 에 값이 들어간다.
		
		System.out.println("=============================================");
		
		//String 을 정수로 변환 : Integer.ParseInt();
		
		int aa = Integer.parseInt(args[0]);
		int bb = Integer.parseInt(args[1]);
		int cc = Integer.parseInt(args[2]);
		int dd = Integer.parseInt(args[3]);
		
		System.out.println(aa+bb+cc+dd);	// 여기의 +는 더하기 연산자로 사용됨.
		
		System.out.println("=============================================");
		
		//main 메소드의 매개 변수 args로 들어오는 값을 for 문을 통해서 출력
		System.out.println(args.length); //배열에 넘어오는 개수

		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
