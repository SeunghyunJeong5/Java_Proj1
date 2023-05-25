package chapter14.ex05;

//예외처리
// 1. try ~ catch : 내가 직접 예외처리
// 2. throws : 메소드블락에 메소드를 호출하는 쪽에서 처리하도록 미루는 것.
// 		 일반예외는 반드시 처리해야되는 예외, 실행예외는 처리해도 되고 안해도 된다.


//1. 내가 직접 예외를 처리함.
class A{
	void abc () {
		bcd(); 			//bcd 메소드 호출
	}
	void bcd() {
		try {
			Thread.sleep(1000);				  //1초동안 대기해라. (일반예외)
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}	
	}
}


//2. 예외전가 (throws): 내가 예외를 처리하지 않고, 메소드를 호출하는 곳에서 예외를 처리하도록 미루는것.

class B{
	
	void abc() {
		try {
			bcd();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	void bcd() throws InterruptedException {
		Thread.sleep(1000);				//여기서 발생한 예외를 호출하는 놈이 해결을 한다는 컨셉임.
	}
	
}


class C {
	void abc() {
		try {
			bcd();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	void bcd() throws Exception {			//여기서 발생한 모든 예외를 넘겨버리겠다는 뜻임.
		Thread.sleep(1000);
	}
}







public class Throws_Exception01 {

	public static void main(String[] args) {
		
	}
	
}
