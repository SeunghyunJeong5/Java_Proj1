package chapter10.ex06;

class Student {
	
	String name;
	Student(String name){
	this.name= name;	}	
	
	
	
	//합계와 평균을 출력하는 메소드 : 부모 클래스의 메소드 : 실행코드가 없음, 자식클래스에서 오버라이딩해서 구현코드를 생성함.
	void sum_avg() {
		
	}
}

class Student_Sub extends Student{
	int kor;
	int eng;
	int math;
	
	//1. 생성자로 매개변수 값을 받아서 각 필드의 값을 할당. name, kor, eng, math,
	Student_Sub(String name, int kor, int eng, int math){
		
		//super();
		super (name);
		//super.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	
	//2. 필드의 값을 모두 합하고, 평균을 출력, 각 객체의 점수의 합계와 평균을 구하는 메소드
	@Override
	void sum_avg() {
		int sum;
		double avg;
		
		sum= kor+eng+math;
		avg= (double)sum/3;
		System.out.printf("%s의 점수의 합계는 %d 점이고, 평균 점수는 %.2f점 입니다.\n",name,sum,avg);
	
		
		
		
	}
	
}
public class Ex01 {
	
	public static void main(String[] args) {
		
	//각 객체의 필드의 값 할당은 생성자 호출시 매개변수로 값을 넣도록 하세요.
		// 홍길동/70/88/97
		// 이순신/80/68/87
		// 김똘똘/60/86/87
		// 홍길순/77/56/80
		// 강감찬/55/66/77
		
		
		// Student 타입의 sum_avg() 호출시 오버라이딩된 메소드 호출
		
		Student s1 = new Student_Sub("홍길동",70,88,97);
		Student s2 = new Student_Sub("이순신",80,68,87);
		Student s3 = new Student_Sub("김똘똘",60,86,87);
		Student s4 = new Student_Sub("홍길순",77,56,80);
		Student s5 = new Student_Sub("강감찬",55,66,77);
		
		
		s1.sum_avg();
		s2.sum_avg();
		s3.sum_avg();
		s4.sum_avg();
		s5.sum_avg();
		
		System.out.println("=============================================");
		//배열에 넣으면
		Student[] arr = new Student [] {s1,s2,s3,s4,s5};
		
		for(int i =0 ; i<arr.length; i++) {
			arr[i].sum_avg();
		}
		
		System.out.println("=============================================");
		//for문을 사용해서 아래와 같이 출력되도록 구문 작성.
		
		//모든 사용자의 국어점수의 총합 : ___점
		//모든 사용자의 영어점수의 총합 : ___점
		//모든 사용자의 수학점수의 총합 : ___점
		int k=0;
		int e=0;
		int m=0;
		
		// 배열로 변수 선언:
		// int [] sum = new int[3]; sum[0] : 국어점수의 합, sum[1] : 영어점수의 합....=====> int k...이런식으로 안하고 변수선언을 한꺼번에 할때 사용할수도 있다.
		// Student[] arr = new Student [] {s1,s2,s3,s4,s5}; 
		// for(int i = 0; i<arr.length;i++) {
		// sum[0] +=((Student_Sub)arr[i]).kor;
		// sum[1] +=((Student_Sub)arr[i]).eng;
		// sum[2] +=((Student_Sub)arr[i]).math;
		//}
		
		for(int i = 0; i<arr.length;i++) {
			if(arr[i] instanceof Student_Sub) {
				k +=((Student_Sub)arr[i]).kor;
				e +=((Student_Sub)arr[i]).eng;
				m +=((Student_Sub)arr[i]).math;
			
						
			}
			
			
		}
		System.out.println("모든 사용자의 국어 점수의 총합 : "+k+"점");
		System.out.println("모든 사용자의 영어 점수의 총합 : "+e+"점");
		System.out.println("모든 사용자의 수학 점수의 총합 : "+m+"점");
		System.out.println("===========================================");
		System.out.println("모든 사용자의 국어 점수의 평균 : "+(double)k/5+"점");
		System.out.println("모든 사용자의 영어 점수의 평균 : "+(double)e/5+"점");
		System.out.println("모든 사용자의 수학 점수의 평균 : "+(double)m/5+"점");
		
	}

}
