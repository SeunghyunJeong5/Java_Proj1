package chapter14.ex05;

//throws 는 계속 전가를 할수있다. 마지막최종적으로 main메소드까지 전가할수 있다.

class Aa{
	
	void abc() throws InterruptedException {
		bcd();
	}
	void bcd() throws InterruptedException {
		cde();
	}
	void cde() throws InterruptedException {
	Thread.sleep(1000);
	
}
}

public class Throws_Exception02 {
	
	public static void main(String[] args) {
		//Aa객체를 생성 후 메소드 호출
		Aa a1 = new Aa();
		
		//main 메소드로 가기전에 try catch로 예외처리
		try {
			a1.abc();  				//예외가 계속 전가되어서 여기까지 온것.
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}			
	}

}
