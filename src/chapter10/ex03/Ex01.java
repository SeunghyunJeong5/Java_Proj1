package chapter10.ex03;
//상속, 메소드 오버라이딩 (인스턴스 메소드), 업캐스팅, 다운캐스팅, 배열에 객체를 넣고 빼기.....


class Human { //부모클래스는 자식클래스에서 공통적으로 적용되는 필드, 메소드를 정의함.
	//부모클래스 --- 부모는 사람 <===> (자식)은 학생, 교수, 근로자
	
	//Human () {} 가 생략되어 있음.
	
	//필드
	String name;
	int age;
	
	
	//메소드
	void eat () {
		
		System.out.println("Human - 모든 사람은 잠을 잡니다. ");
		
		
	}
	
	
}


//자식클래스
class Student extends Human {
	//기본생성자는 생략되어있음. 상속관계에서는 기본생성자 내부에 부모 클래스의 기본생성자를 호출...
	
	//Student () { super(); } 			이런식으로 되어있음... super ();는 부모클래스의 생성자를 호출하는 것임

	int stuID ;
	
	void goToSchool () {
		System.out.println("Student - 학생은 학교에 갑니다.");
	}

	
	//메소드 오버라이딩 : 부모 클래스에서 정의한 메소드를 자식 클래스에서 재정의해서 사용
	@Override
	void eat() {
			System.out.println("Student - 학생은 식당에서 식사를 합니다.");
}


	@Override
	public String toString() {
		return "Student [stuID=" + stuID + ", name=" + name + ", age=" + age + "]";
	}

	

}


class Professor extends Human {
	//기본생성자는 생략되어있음.
	
	
	int professorID;
	
	void goToTeach () {
		System.out.println("교수는 학생을 가르치러 학교에 갑니다.");
		
	}
	
	@Override
	void eat() {
		System.out.println("Professor - 교수는 식사를 합니다. ");
	}

	@Override
	public String toString() {
		return "Professor [professorID=" + professorID + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}

class Worker extends Human {
	//기본생성자는 생략되어있음.
	
	int wokerID;
	
	void goToWork () {
		System.out.println("근로자는 일터로 일하러 출근합니다. ");
		
	}
	@Override
	void eat() {
	System.out.println("Worker - 근로자는 맛있게 식사를 합니다. ");
	}
	@Override
	public String toString() {
		return "Worker [wokerID=" + wokerID + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	}





public class Ex01 {
	
	
	public static void main(String[] args) {
		//1. 상속에서 부모 클래스의 필드와 메소드 상속 확인
		
		
		//Human 클래스의 h1 객체 생성
		Human h1 = new Human();
				// 부모 클래스의 필드와 메소드만 접근가능
				// h1은 부모객체를 객체화 했기때문에 자식클래스를 내포하고 있지 않아서 다운캐스팅을 할수 있다.
		
		//Student ss1 = (Student) h1;//다운캐스팅 오류 발생, 그리고 다운캐스팅은 명시해야한다.
									//주의!! : 런타임 오류발생 : instanceof 를 사용해서 해당 타입이 존재하는지 확인 후 캐스팅필요.

		System.out.println(h1 instanceof Human); //참
		System.out.println(h1 instanceof Student);		//밑에는 다 거짓
		System.out.println(h1 instanceof Professor);
		System.out.println(h1 instanceof Worker);
		
		//오류의 종류는 2가지인데 , 컴파일 오류와 런타임 오류이다. 컴파일오류는 이클립스에서 오류가 발생하는 것이고, 런타임오류는 실행시에 오류가발생하는 것이다.
		
		//위의 오류를 해결하기 위해
		if (h1 instanceof Student) {
			Student ss1 = (Student) h1; //h1에 Student 타입이 존재할때만 실행.
		}else {
			
		System.out.println("h1에는 Student 타입이 존재하지 않습니다.");
		}
		
		
		System.out.println("=====================================================");
		
		
		//Student 클래스 s1 객체 생성
		Student s1 = new Student(); //부모 / 자식의 타입을 둘다 내포하고 있지만, 자식의 타입으로 저장되어있음
									//부모, 자식 클래스의 필드, 메소드 접근가능
		
		s1.name = "홍길동";		
		s1.age = 20;
		
		s1.stuID = 1234;
		
		
		
		Human s2 = new Student(); //자식 클래스의 객체를 만들면 부모의 생성자 먼저 호출 자식의 생성자 나중에 호출을 한다. 
									//부모 / 자식의 타입을 둘다 내포하고 있지만, 부모의 타입으로 저장되어있음
									//부모 클래스의 필드와 메소드만 접근가능
		
		s2.name = "이순신";
		s2.age = 30;
		
		//s2는 두가지 타입을 다 갖고있기 때문에 둘다 이동이 가능하다.
		//다운캐스팅 !!!
		System.out.println(s2 instanceof Student);
		
		
		Student ss2 = null;
		if (s2 instanceof Student) {
			ss2 = (Student) s2;
			System.out.println("다운캐스팅이 잘 되었습니다.");
		}else {
			System.out.println("다운캐스팅 되지 않습니다.");
		}
		
		//ss2는 두가지 타입을 다 갖고있다. (s2를 ss2로 다운캐스팅 한것.)
		
		ss2.name = "세종대왕";
		ss2.age = 50;
		
		ss2.stuID = 2345;
		
		
		//업캐스팅 : ss2에서 부모타입으로 !! 업캐스팅은 명시하지 않아도 자동으로 업캐스팅됨.
		System.out.println(ss2 instanceof Human);
		
		Human hh1 =ss2; 	//업캐스팅은 캐스팅시 instanceof를 사용하지 않아도 됨. 컴파일단계에서 오류가 발생하므로.....
		
		
		//자식을 객체화해서 부모타입으로 지정 후 배열/컬랙션에 저장 후 에서 끄집어내서 출력함.
		
		Student s10 = new Student(); //h10에는 두가지 타입이 내포되어있음.
		Professor p10 = new Professor(); //p10에는 두가지 타입이 내포되어있음.
		Worker w10 = new Worker(); //w10에는 두가지 타입이 내포되어있음.
		
		//각 객체의 필드의 값을 입력
		s10.name = "김똘똘";
		s10.age = 10;
		s10.stuID = 1234;
		
		p10.name = "김교수";
		p10.age = 40;
		p10.professorID =2345;
		
		w10.name = "홍근로자";
		w10.age = 20;
		w10.wokerID = 3456;
		
		
		//위의 객체를 배열 /컬랙선 (ArrayList/Vector/Set/Map)에 넣어서 처리함.
		
		//배열 /컬렉션에 저장되는 것은 동일한 타입으로 지정되어야 한다.
		//s10 : Student, p10 : Professor, w10 : Worker
		
		
		Human[] arr = new Human[] { s10, p10, w10 }; //집어넣을때 바로 업캐스팅 되어서 들어감.
		
		//배열의 각 방의 값을 끄집어내서 변수에 재할당
		Human h20 = arr[0];
		Human h21 = arr[1];
		Human h22 = arr[2];
		
		
		//배열의 각 방의 내용을 끄집어 낼때 다운캐스팅을 하면서 끄집어 낸다.
		
		Student s20 = (Student) arr[0];
		Professor s21 = (Professor) arr[1];
		Worker s22 = (Worker) arr[2];
		
		
		//각 객체의 필드의 내용을 출력.
		System.out.println(s20);
		System.out.println(s21);
		System.out.println(s22);
		
		
		
		
		
		//3. 메소드 오버 라이딩 테스트
		
		//3-1. Human 객체 생성 후 eat () 메소드 호출
		Human h30 = new Human ();		//h30은 Human타입만 있음
		h30.eat();		//Human 클래스의 메소드 호출
		
		//3-2. Student 객체 생성시 Student 타입으로 지정
		Student s30 = new Student (); //s30은 두개으 타입 내포.
		s30.eat();		//Student 클래스의 eat();호출
		
		Professor p30 = new Professor();
		Worker w30 = new Worker ();
		
		p30.eat();
		w30.eat();
		
		
		//자식 클래스를 생성하면서 부모클래스를 타입으로 지정 후 오버라이딩된 메소드 호출
		System.out.println(" 오버라이딩된 메소드가 출력됨.");
		
		Human h40 = new Student();			///두가지 타입 다 갖고있음.
		Human h41 = new Professor();
		Human h42 = new Worker();
		
		//Human 클래스의 eat() 메소드 호출
		h40.eat();			//Human 클래스의 eat()호출시 , Student 클래스의 오버라이딩된 eat()이 작동됨.
		h41.eat();
		h42.eat();
		
		
		
		//객체를 만들면 이름은 stack에 다 있고, 힙영역에 값이 있는데, 메소드는 힙영역에 이름이 있고, 실행부는 클래스의 인스턴스메소드에 있다.
		//그런데 오버라이딩을 하면 자식객체를 만들어도 부모타입이 밑에 깔림. 그래서 자식것이 실행됨.
		
		
		
		
		
	}

}
