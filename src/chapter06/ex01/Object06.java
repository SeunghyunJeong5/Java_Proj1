package chapter06.ex01;

class Student2{
	//기본생성자
	public Student2() {}
	
	
	//필드
	String sName;		//학생이름
	int sAge;			//학생나이
	String sAddr;		//학생주소
	String sEmail;		//학생메일주소
	
	
	//메소드
	public void print () {
		System.out.println("이름 : "+ sName);
		System.out.println("나이 : "+ sAge);
		System.out.println("주소 : "+ sAddr);
		System.out.println("메일주소 : "+ sEmail);
	}
}


public class Object06 {
	
	
	public static void main(String[] args) {
		
		
		// 			kim 객체 :   김길동/ 20 / 서울 / aaa@aaa.com
		//			lee 객체 :   이순신/ 30 / 부산 / bbb@bbb.com
		//			hong 객체 : 	홍길동/ 40 / 광주 / ccc@ccc.com
		
		//			각 객체의 필드의 값 입력 후, 배열에 넣어서 저장 후 끄집어 내서 다시 출력.
		
		
		Student2 kim = new Student2 ();
		
		kim.sName = "김길동";
		kim.sAge = 20;
		kim.sAddr = "서울";
		kim.sEmail = "aaa@aaa.com";
		
		kim.print();
		
		System.out.println("==========================");
		Student2 lee = new Student2 ();
		
		lee.sName = "이순신";
		lee.sAge = 30;
		lee.sAddr = "부산";
		lee.sEmail = "bbb@bbb.com";
		//alt shift a해서 한꺼번에 지우고 한꺼번에 입력할 수 있다.
		
		lee.print();
		
		System.out.println("==========================");
		Student2 hong = new Student2 ();
		
		hong.sName = "홍길동";
		hong.sAge = 40;
		hong.sAddr = "광주";
		hong.sEmail = "ccc@ccc.com";
		
		hong.print();
		
		System.out.println("==========================");
		
		System.out.println("===========배열에 넣어서 끄집어내서 출력============");
		
		Student2[] arr1 = new Student2 [3];
		
		//2. 배열을 선언하면서 바로 배열에 값을 할당.
		//Student2 [] arr1 = new Student2 [] {kim, lee, hong}; =======>이런방식으로 해도됨.
		
		arr1 [0] = kim;
		arr1 [1] = lee;
		arr1 [2] = hong;
		
		System.out.println(kim);
		System.out.println(lee);
		System.out.println(hong);      //=============> 이렇게하면 객체의 힙영역의 주소가 나온다.
										// 근데 이러는걸 보면 println은 스택영역의 값만 출력하는것 같음...
										// 그러니까 클래스의 print 시스템을 이용하는거지...
										// a1을 바로 출력하면 kim을 출력한 효과와 같다.
		
		
		Student2 a1 = arr1[0];
		Student2 a2 = arr1[1];
		Student2 a3 = arr1[2];
		
		a1.print();
	//	arr1[0].print(); 이거랑 바로 위에꺼랑 같은건데 다른건 그냥 a1에 넣었다 뿐임.
		System.out.println("==========================");
		
		a2.print();
		System.out.println("==========================");
		
		a3.print();
		System.out.println("==========================");
		
		
		//이해한거 ====> 원래 객체는 배열이랑 비슷한거임... 근데 객체는 어떤 객체(이름만 지으면 무한대로 만들 수 있는 것)를 이용해서 힙 영역에 값을 할당
		//				 할 수 있는 영역을 파놓고, 스택 영역에 객체만 저장되어 있는거임(이름과 힙영역을 찾아갈 수 있는 주소가 있음...값은 없다는 얘기...). 
		// 				그거를 클래스를 통해서 어떤 시스템화를 하는데, 여기서 값을 
		//				할당도 하고(보통은 빈공간만 파놓고 main메소드를 통해서 할당하는듯) 함수를 만들어서 출력도 할 수 있는 시스템을 만들어 놓은거임
		//				그러면 우리는 배열이랑 비슷하게 main메소드에서 값을 객체를 통해 할당해서 그 값들을 출력도 하고 클래스에 저장되어 있는 출력
		//				시스템을 사용해서 출력도 하고 하는거임.
		//				출력 시스템을 변수처럼 클래스 안에 만들어서 쓰는데, 아마 이거 말고 for문을 통해서 계산을 한다든지 그런것도 변수로 저장을 해서 할수 있지 않을까 싶음...
		//				
		//				여튼 예제 마지막에 배열을 이용해서 출력 하는거는 배열을 이용해서 빈 공간을 힙영역에 파놓고 값만 객체를 통해서 주입하는거임.
		//				그리고 공간에 있는값을 미리 만들어 놓은 객체 시스템을 이용해서 출력한거임.... 그러니까 클래스는 붕어빵기계(틀)이 되는거지.....
		//				그니까 원래 우리는 int나 String 같은 걸 썼는데, 객체는 그걸 대신해서 우리가만든 클래스명을 그걸로 쓴다 이거지. 근데 이게 
		//				int같은것과 다르게 복잡하게 여러 기능을 수행하는 클래스가 되어버린것. 그래서 객체로 만들수 있는건 우리가 먼저 만들어
		//				놓은 클래스를 이용해야만 만들어지는거임. int도 정수만 들어가듯이 우리가 만든 클래스(여기선 Student2)가 객체만 들어가는거지.
		//				그리고 위의 과정들에서 클래스를 객체화 해서 붕어빵(객체-- kim, lee, hong...)을 찍어내는거같음.
		
		
		
		
		
	}

}
