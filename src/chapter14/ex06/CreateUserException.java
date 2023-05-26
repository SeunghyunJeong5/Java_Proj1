package chapter14.ex06;



//1. 일반예외 (사용자정의 예외)
class MyException extends Exception{
	//1. 기본생성자
	MyException () {
		//super();
	}
	//2. 오류메세지를 인풋받아서 처리해주는 생성자.
	MyException(String message){
		super(message);			//Exception 부모의 생성자에 넣어줌.
	}
	
}

//2. 실행예외 (사용자정의 예외)
class MyRTException extends RuntimeException{
	//기본생성자
	MyRTException () {
		//super();
	}
	//2. 오류메세지를 인풋받아서 처리해주는 생성자.
		MyRTException(String message){
			super(message);			//RuntimeException 부모의 생성자에 넣어줌.
		}
}

//3. 사용자 정의 예외를 사용하는 클래스
class A{
	//1. 사용자 정의 예외의 객체 생성 (필드) 			
	MyException me1 = new MyException();			//일반예외를 처리 (기본생성자) 
	MyRTException me2 = new MyRTException();		//실행예외를 처리 (기본생성자)

	MyException mre1 = new MyException("예외 메세지 : MyException");		//오류메세지를 생성자에게 넣어서 처리하는 객체생성. MyException이 메시지로 들어가는 필드라고 생각하면됨.
	MyRTException mre2 =new MyRTException("예외 메세지 : MyRTException");
	
	//2. 예외던지기 (throw : 예외를 강제로 발생시킴) (throws가 아님)
	
	//정수를 인풋받아서 70이하이면 예외를 강제로 발생시킴 (예외를 직접)
	void abc_1(int num) {
		try {
		
		if(num>70) {
			
			//정상처리
			System.out.println("당신이 넣은 값은 : "+num +" 이고, 정상작동됨.");
		}else {
			//예외를 강제로 발생시킴
			throw mre2;			//RuntimeException 
								//(여기서 강제로 실행예외가 발생된것이니까 
								//<try 예외 catch> 구문에서 catch로 넘어감... 그럼 catch에서 MyRTException(내가만든예외)로 가는데, 
								//여기서 이걸 e로 지정하고 e에서 만들어놓은 메세지를 읽어옴) 
			
		}
		}catch(MyRTException e) {
			System.out.println(e.getMessage());  //실행예외가 발생되었을때 예외메세지를 출력해라.
		}
	}
	
	//abc_1() 메소드를 호출하는 메소드
	void bcd_1() {
		abc_1(60);
	}
	
	
	
	
	
	
	
	//정수를 인풋받아서 70이하이면 예외를 강제로 발생시킴 (예외를 미루기)
	void abc_2(int num) throws MyException {		//abc_2()메소드를 호출하는 곳에서 예외를 처리해야함.
		
		if (num > 70) {
			//정상처리
			System.out.println("당신이 넣은 값은 : "+num+", 이고 정상 값입니다.");
		}else {
			//예외를 강제발생시킴 (throws로 예외를 미루기, throw로 예외를 강제로 발생시키기)
			throw mre1;				//throw mre1은 일반예외이므로 바로 여기서 예외가 발생하고 이걸 throws로 미룬거임.
		}
		
	}
	
	void bcd_2() {
		try {
		abc_2(70);			//던져서 얘가 받은 예외를 여기서 처리함.
		}catch (MyException e) {
			System.out.println(e.getMessage());  //MyException의 생성자에 넣는 오류 메세지를 출력해라.
			
		}
	}
	
}

public class CreateUserException {

	public static void main(String[] args) {
		
		//사용자 정의 예외 : Java에서 제공되지 않는 예외를 자신이 직접 만들어서 사용하는 예외
		//		- 일반예외 (checked Exception) : 컴파일 단계에서 오류가 발생, 예외처리가 반드시 필요
		//				- Exception 클래스를 상속해서 사용자정의 예외(1. 기본생성자, 2. 오류메세지를 처리할 생성자)                           
		
		//		- 실행예외 (unchecked Exception, Runtime Exception) : 실행시 예외 발생.
		//				- RuntimeException 클래스를 상속해서 사용자 정의 예외를 생성(1. 기본생성자, 2. 오류메세지를 처리할 생성자)
		
		
		A a1 = new A();
		a1.bcd_1();
		
		
		a1.bcd_2();
		
		
		
	}
}
