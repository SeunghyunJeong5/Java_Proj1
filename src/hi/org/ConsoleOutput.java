package hi.org;
// 패키지 : 클래스 파일이 저장될 폴더를 만들어줌

public class ConsoleOutput {
	public static void main(String[] args) {
		// main 메소드 블락에서 프로그램 작성 (main 콘 스페로 퀵하게 만듦)
		
		//1. System.out.println ();
		
		//문자열 출력 : " " 처리하면 문자열 출력임
		System.out.println("안녕하세요");
		
		System.out.println("오늘은 " + "날씨가 매우 맑습니다.");
		
		// + : 문자열 일때는 연결을 의미
		// + : 정수, 실수 일때는 더하기 연산을 의미
		System.out.println("2" + "4");
		System.out.println("2 + 4");
		
		// 정수 출력 : "" 를 처리 안함.
		System.out.println(2 + 4);
		
		// 실수 출력 : ""를 처리 하지 않는다.
		System.out.println(11.5 + 11.5);
		
		// 문자열 + 실수 ---> 실수가 문자열로 바뀜
		System.out.println("11.5" + 11.5);
		
		//================================================================
			
			System.out.println("=================================");
			// 문자열과 숫자를 +할때 : 숫자가 그냥 문자로 연결이 됨
			System.out.println("문자열" + 3 + 4 + 5);
			
			// 정수 + 정수 + 정수 + "문자열" : 앞에 숫자가 오면 계산이 되고 출력이 됨
			System.out.println(3 + 4 + 5 + " 문자열");
			
			// 변수 선언 : 문자열을 저장하는 변수 (여기서는 str에 안녕하세요를 저장하고 그 변수를 출력하는것)
		
			// 자료형(String) 변수명(str) = 초기값;
		
			String str = "안녕하세요 ";
			
			System.out.println(str);
			
			// = : 오른쪽에 있는 값을 왼쪽에 넣어라 
			// == : 같다는 의미
			// 정수를 담는 자료형 : int
			// 변수를 출력할때는 ""를 쓰지 않는다. 오로지 문자열을 출력할때 씀
			int a = 10 ;
			int b = 20 ;
			
			System.out.println(a + b);
			System.out.println(a + "b");
		
		
		
		
		
	}
}
