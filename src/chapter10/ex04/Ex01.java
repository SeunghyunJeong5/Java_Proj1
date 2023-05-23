package chapter10.ex04;
//상속, 업캐스팅, 다운캐스팅
class Human {		//부모 클래스
	
	String name;
	int age;
	
}

class Student extends Human {
	
	int kor; 		//국어점수
	int Eng; 		//영어점수
	int math; 		//수학점수
	
}

public class Ex01 {
	
	//메소드:객체를 인풋받는 메소드 : 여기서 학생개체를 만들어서 넣으면 자동으로 업캐스팅이됨.
		// Student 객체를 매개변수로 받아서 배열에 저장하는 객체이고, 인풋으로 Student 객체를 받아서 
		// 배열에 저장하는 메소드
		Human [] arr = null;
		
		void arrMethod (Human h1, Human h2, Human h3) {
			//1. h1, h2, h3 객체를 arr배열 변수에 집어 넣음.
			
			arr = new Human [] {h1,h2,h3}; 
			
			//sumKor(arr);	==> 이 메소드를 호출해서...	"배열에 저장된 객체의 모든 국어 점수는 ___ 점 입니다. " 이렇게 출력되도록
			sumKor(arr);
			//sumEng(arr);		"배열에 저장된 객체의 모든 영어 점수는 ___ 점 입니다. " 이렇게 출력되도록
			sumEng(arr);
			//sumMath(arr);		"배열에 저장된 객체의 모든 수학 점수는 ___ 점 입니다. " 이렇게 출력되도록
			
			System.out.println("배열에 저장된 객체의 모든 수학 점수는 "+sumMath(arr)+"점 입니다. ");
			
		}
		
		void sumKor (Human [] h1) {		//각 객체의 국어점수를 더해서 결과를 출력하는 메소드
										//Student로 다운캐스팅한 후 국어점수를 모두 더해서 출력.
			
			//for 문을 사용해서 각방의 객체를 Human 타입의 객체를 Student 타입으로 다운캐스팅 한뒤 kor점수만 뽑아온다.
			//int sum = 0;
			//for (int i = 0; i <h1.length; i++){
			//if ( h1[i] instanceof Student){ 
			//Student s = (Student) h1[i];				Human (arr[i])타입을 Student 타입으로 다운캐스팅
			// sum +=s.kor;
			//위에 두개를 줄여서 sum +=((Student)h1[i]).kor; 이라고 해도됨.
			//}
			//}
			
			Student ss1 = (Student) h1[0];
			Student ss2 = (Student) h1[1];
			Student ss3 = (Student) h1[2];
			
			int sumkor;
			sumkor = ss1.kor + ss2.kor + ss3.kor ;
			
			
			
			System.out.printf("배열에 저장된 객체의 모든 국어 점수는 %d점 입니다. \n", sumkor);
			
		}
		void sumEng (Human [] h1) {		//각 객체의 영어점수를 더해서 결과를 출력하는 메소드
										//Student로 다운캐스팅한 후 영어점수를 모두 더해서 출력.
			
			Student ss1 = (Student) h1[0];
			Student ss2 = (Student) h1[1];
			Student ss3 = (Student) h1[2];
			
			int sumEng;
			sumEng = ss1.Eng + ss2.Eng + ss3.Eng ;
			
			
			
			System.out.printf("배열에 저장된 객체의 모든 영어 점수는 %d점 입니다. \n", sumEng);
			
			
			
			
		}
		int sumMath (Human [] h1) {
			
			
			Student ss1 = (Student) h1[0];
			Student ss2 = (Student) h1[1];
			Student ss3 = (Student) h1[2];
			
			int sumMath;
			sumMath = ss1.math + ss2.math + ss3.math ;
			
			
			return sumMath;		//배열의 들어온 수학점수를 모두 더해서 리턴으로 돌려줌.
		}
	
	
	
	
	public static void main(String[] args) {
		
		//객체 생성
		Student s1 = new Student();			//홍길동 / 30 / 60 / 70 / 80
		Student s2 = new Student();			//이순신 / 40 / 66 / 77 / 88
		Student s3 = new Student();			//강감찬 / 50 / 77 / 88 / 99
		
		s1.name = "홍길동" ;
		s1.age = 30;
		s1.kor = 60;
		s1.Eng = 70;
		s1.math = 80;
		
		s2.name = "이순신" ;
		s2.age = 40;
		s2.kor = 66;
		s2.Eng = 77;
		s2.math = 88;
		
		s3.name = "강감찬" ;
		s3.age = 50;
		s3.kor = 77;
		s3.Eng = 88;
		s3.math = 99;
		
		
		//메소드 호출
		Ex01 e1 = new Ex01();
		e1.arrMethod(s1, s2, s3);
		// 이거를 했을때 배열에 저장된 ... 이 멘트가 3줄로 각각 출력되게.....
	}

}
