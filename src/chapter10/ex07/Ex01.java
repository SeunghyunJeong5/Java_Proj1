package chapter10.ex07;

class Apple{
	
	String name;		//이름
	int price;			//가격
	int count;			//개수
	
	Apple (String name, int price, int count){
		this.name = name;
		this.price = price;
		this.count = count;
		
	}
	
	
}

class Banana {
	
	String name;		//이름
	int price;			//가격
	int count;			//개수
	
	Banana (String name, int price, int count){
		this.name = name;
		this.price = price;
		this.count = count;
		
	}
	
	
	
}

class Strawberry {
	
	String name;		//이름
	int price;			//가격
	int count;			//개수
	
	Strawberry (String name, int price, int count){
		this.name = name;
		this.price = price;
		this.count = count;
		
	}
	
	
}

public class Ex01 {
	
	//배열의 객체를 매개변수로 받아서 총 가격을 출력
	void totalPrice (Object [] obj) {
		int as;
		int bs;
		int ss;
		
		Apple aa1 = (Apple) obj[0]; 
		Banana bb1 = (Banana) obj[1]; 
		Strawberry ss1 = (Strawberry) obj[2]; 
		
		as = aa1.price * aa1.count;
		bs = bb1.price * bb1.count;
		ss = ss1.price * ss1.count;
		
	
		
		System.out.println("사과의 총 가격은 "+as+"원 입니다.");
		System.out.println("바나나의 총 가격은 "+bs+"원 입니다.");
		System.out.println("딸기의 총 가격은 "+ss+"원 입니다.");
		
		
		System.out.println("=================sum 하는 것을 배열변수로 선언하는 방법=======================");
		
		//배열변수로 선언하는 방법도 있음
		int [] sum = new int[3];		//sum[0] : 사과에 대한 합계, sum[1] : 바나나에 대한 합계, sum[2] : 딸기에 대한 합계
			
		if(obj[0] instanceof Apple) {
		sum[0] = ((Apple) obj[0]).price * ((Apple) obj[0]).count ;
		}
		if(obj[1] instanceof Banana) {
		sum[1] = ((Banana) obj[1]).price * ((Banana) obj[1]).count ;
		}
		if(obj[2] instanceof Strawberry) {
		sum[2] = ((Strawberry) obj[2]).price * ((Strawberry) obj[2]).count ;
		}
		
		System.out.println("사과의 총 가격은 "+sum[0]+"원 입니다.");
		System.out.println("바나나의 총 가격은 "+sum[1]+"원 입니다.");
		System.out.println("딸기의 총 가격은 "+sum[2]+"원 입니다.");
		System.out.println("모든 과일의 총 가격은 "+(sum[0]+sum[1]+sum[2])+"원 입니다.");
		
		//for(int i =0; i<obj.length;i++) {
		//	if(obj[i] instanceof )
			
		//}
		
	}
	
	public static void main(String[] args) {
		
		//모든 클래스는 Object 클래스의 자식 클래스 이다.
		//모든 클래스는 Object의 타입으로 업캐스팅이 가능하다.
		
		
		//"사과", 2000, 5
		//"바나나", 4000, 10
		//"딸기", 5000, 30			===> 생성자를 사용해서 각 객체의 값을 할당.
		
		Apple a1 = new Apple ("사과", 2000, 5);
		Banana b1 = new Banana ("바나나", 4000, 10);
		Strawberry s1 = new Strawberry ("딸기", 5000, 30);
		
		//모든 객체를 Object 배열에 넣는다.
		Object[] obj = new Object[] {a1,b1,s1};				//Object로 업캐스팅이 되어서 들어감.
		
		Ex01 e1 = new Ex01();
		e1.totalPrice(obj);
		
	}

}
