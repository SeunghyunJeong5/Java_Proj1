package chapter14.ex05;

class Aaa{
	
	void abc() throws ClassNotFoundException {
		bcd();
	}
	void bcd() throws ClassNotFoundException {
		cde();
	}
	void cde() throws ClassNotFoundException {
		//DB 연결시 사용 : 일반예외 - 반드시 예외처리가 되어야한다.(1. 자신이 직접 처리하는 방법, 2. throws 로 미루는방법)
		Class cls = Class.forName("java.lang.Object1");		//Object1로 바꾸면 없는 클래스이므로 오류가 나옴.
		System.out.println("존재하는 클래스 입니다.");			
}
}


public class Throws_Exception03 {
	
	public static void main(String[] args)  {
		
		Aaa a1 = new Aaa();
		try {
			a1.abc();
		} catch (ClassNotFoundException e) {
			System.out.println("예외가 발생됨");
			e.printStackTrace();			//오류가 어디서 발생했는지 출력해주는것임. 디버깅 목적으로 사용하는것. 오류가 실제로 나서 프로그램이 안돌아가는것이 아님.
		}
		System.out.println("프로그램 정상 종료됨.");
	}

}
