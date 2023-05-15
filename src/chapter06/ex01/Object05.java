package chapter06.ex01;

class Animal {
	
	//기본 생성자
	public Animal () {}
	
	//필드
	String animalName;
	String animalCry;
	String animalRun;
	int animalAge ;
	double animalWeight;
	
	//필드의 내용을 출력 : 메모리의 값 출력
	public void print () {
		System.out.println("동물의 이름 : "+animalName);
		System.out.println("동물의 울음소리 : "+animalCry);
		System.out.println("동물의 운동 : "+animalRun);
		System.out.println("동물의 나이 : "+animalAge);
		System.out.println("동물의 몸무게 : "+animalWeight);
		
	}
	
	
	
	
}


public class Object05 {
	
	public static void main(String[] args) {
		// Animal 클래스 ===> tiger 객체 생성 : 호랑이, 어흥, 껑충껑충, 10, 300
		// Animal 클래스 ===> eagle 객체 생성 : 독수리, 키이오, 훨훨날아감, 20, 30
		// Animal 클래스 ===> dog 객체 생성 : 개, 멍멍, 팔짝팔짝, 40, 20
			
		//arr1 배열에 객체를 저장 후 끄집어내서 출력.
		
		
		
		
		// tiger 객체 생성
		Animal tiger = new Animal();
		
		//객체를 생성하면, 객체의 필드와 메소드를 사용.			//tiger 객체는 stack에 저장되고, 값은 heap 영역에 있다
		tiger.animalName = "호랑이";
		tiger.animalCry = "어흥";
		tiger.animalRun = "껑충껑충";
		tiger.animalAge =	10 ;
		tiger.animalWeight = 300 ;
		
		tiger.print();
		
		System.out.println("======================================");
		
		Animal eagle = new Animal();
		
		eagle.animalName = "독수리";
		eagle.animalCry = "키이오";
		eagle.animalRun = "훨훨날아감";
		eagle.animalAge =	20 ;
		eagle.animalWeight = 30 ;
		
		eagle.print();
		
		System.out.println("======================================");
		
		Animal dog = new Animal();
		
		dog.animalName = "개";
		dog.animalCry = "멍멍";
		dog.animalRun = "팔짝팔짝";
		dog.animalAge =	40 ;
		dog.animalWeight = 20 ;
		
		dog.print();
		
		System.out.println("======================================");
		
		
		
		
		
							
		System.out.println(" ========= 객체를 배열에 저장 ================= ");
		
		// 1. 방의 크기를 지정 후 나중에 각 방에 값을 입력
		int [] arr11 = new int [3];			//arr11 배열은 방(index)이 3개가 생성이 되고, 정수만 입력가능.
		double [] arr12 = new double [3]; 	//arr12 배열은 방(index)이 3개가 생성이 되고, 실수만 입력가능.
		String [] arr13 = new String [3]; 	//arr13 배열은.... 문자열만 저장가능.
		
		Animal[] arr1 = new Animal[3];		//Animal 타입의 객체만 저장이 가능		//===========> 여기서 int double String Animal  이런것들은 데이터 타입임.
		
		//각 배열의 방에 Animal 타입의 객체를 저장, tiger, eagle, dog는 Animal 클래스로 생성됨, Animal 타입을 가지고 있다.
		arr1[0] = tiger;
		arr1[1] = eagle;
		arr1[2]	= dog;
		
		//각 배열의 방에는 객체의 힙영역의 주소가 들어가 잇다.
		System.out.println(tiger);
		System.out.println(eagle);
		System.out.println(dog);
		
		
		// 배열의 방의 저장된 객체를 다시 변수에 할당해서 끄집어낸다.
		// 객체 변수를 선언 후 끄집어 낸다.
		System.out.println("======================================");
		Animal a1 = null;					// 객체형 변수 : a1(객체의 자료형 : Animal)
			System.out.println(a1);
		a1 = arr1[0];						// arr1[0] 방의 값을 가지고 와서 a1변수에 할당.
			System.out.println(a1);  		//tiger의 주소값과 같은값이 들어가있다.
			
		
		Animal a2 = arr1[1];
		Animal a3 = arr1[2];
		
		System.out.println("======================================");
		a1.print();
		System.out.println("======================================");
		a2.print();
		System.out.println("======================================");
		a3.print();
		
		
		
		
		
		System.out.println("===========내가한거===========================");
		
		//내가 한거
		Animal out1 = arr1[0];
		Animal out2 = arr1[1];
		Animal out3 = arr1[2];
		
		out1.print();
		System.out.println("======================================");
		out2.print();
		System.out.println("======================================");
		out3.print();
		
	}

}
