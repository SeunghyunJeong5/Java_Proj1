package chapter06.ex01;

class Student{		//외부의 클래스, 같은 클래스에서는 public 하나만 올 수 있다.
	
	
	// 기본 생성자 : 생략가능  -----> 실행하면 {}여기가 원래 실행됨.
	public Student () {}
	
	// 필드 선언 
	String name;		//기본값 : null
	int kor;			//기본값 : 0
	int eng;
	int math;
	
	
	//메소드 선언 : print 메소드 호출 시 메모리의 내용을 출력
	public void print() {
		System.out.println("이름 : " + name);
		System.out.println("국어 점수 : " + kor);
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + math);
		
		
	}
	
}


public class Object03 {
	
	
	
	public static void main(String[] args) {
		
					// s1 객체 생성 : 홍길동, 80, 90, 100
		            // s2 객체 생성 : 이순신, 60, 88, 70
					// s3 객체 생성 : 세종대왕, 90, 90, 88
					// s4 객체 생성 : 신사임당, 77, 88, 99
		
					// 각 객체의 print() 메소드로 호출.
		
		
		//s1 객체 생성 : 클래스를 객체화(인스턴스) 해서 메모리에 로드
		
		
		Student s1 = new Student();
		
		s1.print(); 		//s1필드의 초기값 출력	
		
		s1.name = "홍길동";
		s1.kor = 80;
		s1.eng = 90;
		s1.math = 100;
		
		System.out.println(s1.name);
		System.out.println(s1.kor);
		System.out.println(s1.eng);
		System.out.println(s1.math);
		
		System.out.println("=================================================");
		
		s1.print();
		System.out.println("=================================================");
		
		
		Student s2 = new Student();
		
		s2.name = "이순신";
		s2.kor = 60;
		s2.eng = 88;
		s2.math = 70;
		
		System.out.println(s2.name);
		System.out.println(s2.kor);
		System.out.println(s2.eng);
		System.out.println(s2.math);
		
		System.out.println("=================================================");
		
		s2.print();
		System.out.println("=================================================");
		
		
		Student s3 = new Student();
		
		s3.name = "세종대왕";
		s3.kor = 90;
		s3.eng = 99;
		s3.math = 88;
		
		System.out.println(s3.name);
		System.out.println(s3.kor);
		System.out.println(s3.eng);
		System.out.println(s3.math);
		
		System.out.println("=================================================");
		
		s3.print();
		System.out.println("=================================================");
		
		
		Student s4 = new Student();
		
		s4.name = "신사임당";
		s4.kor = 77;
		s4.eng = 88;
		s4.math = 99;
		
		System.out.println(s4.name);
		System.out.println(s4.kor);
		System.out.println(s4.eng);
		System.out.println(s4.math);
		
		System.out.println("=================================================");
		
		s4.print();
		System.out.println("=================================================");
		
		
		
		
		
		
		
		
		
	}

}
