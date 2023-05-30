package chapter16.ex07;

class Apple{
	
	String name = "사과";
}

class Banana{
	
	String name = "바나나";
	
}
class Orange{
	String name = "오렌지";
}

class Aa <T> { 		//모든타입을 받는 클래스
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

class Bb <T extends Apple>{		// T타입으로 적용가능한 것은 Apple, Banana
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}



public class Ex01 {
public static void main(String[] args) {
		//Aa : 제너릭 타입에 모든 타입을 다 적용할 수 있다.
	Aa <String> a1 = new Aa<>();
	Aa <Integer> a2 = new Aa<>();
	Aa <Double> a3 = new Aa<>();
	Aa <Apple> a4 = new Aa<>();
	Aa <Banana> a5 = new Aa<>();
	Aa <Orange> a6 = new Aa<>();
	
	//Bb : 제너릭 타입에 올 수 있는 내용을 제한을 둠 : Apple
	//Bb<Doulbe> b1 = new Bb<>();
	//Bb<Integer> b2 = new Bb<>();		다 오류남
	//Bb<Orange> b3 = new Bb<>();
	
	Bb<Apple> b4 = new Bb<>();
//	Bb<Banana> b5 = new Bb<>();
//	Bb<String> b6 = new Bb<>();
	
	
	
	
	
	
	
}
}
