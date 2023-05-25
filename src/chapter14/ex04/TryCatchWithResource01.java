package chapter14.ex04;

import java.io.IOException;
import java.io.InputStreamReader;

public class TryCatchWithResource01 {

	public static void main(String[] args)  {		//throws 하면 여기에 생김 (throws IOException이라고 나옴)
		
		//객체를 사용 후 RAM에서 그 객체를 제거해야한다.
		//			- finally 블락에서 사용한 객체를 close()해야함.
		
		//일반예외 : 반드시 예외처리를 해야한다.(컴파일오류)
		//		- throws : 예외를 미루는 방법
		//		- try catch : 자신이 직접 예외처리
		
		System.out.println("문자를 콘솔에서 한글자 입력하세요.");
		
		//1. 수동 리소스 해제 : finally 블락에서 해제
		InputStreamReader ir1 = null;		//콘솔에서 한글자 읽어들이는 객체
		
		ir1 = new InputStreamReader(System.in);		//ir1은 콘솔에서 읽어들일수 있는 객체를 활성화 시켜줌.
		
		try {
			char input = (char)ir1.read(); 			//byte로 읽어들여서 char 타입으로 변환해서 input 변수에 담는다.
			System.out.println("입력한 문자는 : "+input);				//try 써야한다 이건.
		} catch (IOException e) {
			System.out.println("IOException 이 발생되었습니다. 문자를 하나만 넣어주세요.");
			e.printStackTrace();		//예외에 대한 자세한 정보를 출력하도록한다.(디버깅할때)
		} 	 
		finally {		//객체를 사용 후 메모리에서 제거해야한다. ir1.close()
			
			if(ir1 != null) {			//ir1객체가 null이 아닐때 객체를 제거함.(null이면 의미없음)
			
			
			try {
				ir1.close();				//이것도 try 써야한다.
			} catch (IOException e) {
				System.out.println("객체 제거시 예외가 발생되었습니다.");
				e.printStackTrace();
			}
			
			}
			
			
		}
		
		
		
		
		
		
		
	}
}
