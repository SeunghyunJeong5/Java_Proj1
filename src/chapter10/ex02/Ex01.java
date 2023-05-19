package chapter10.ex02;
//상속, 캐스팅

class Customer { // 부모 클래스 : 고객의 정보를 담은 클래스
	String name; // 고객 이름
	long customerID; // 고객의 아이디
	int customerPoint; // 고객의 포인트

	void customerInfo() {

		System.out.println("고객이름 : " + name + ", 고객 ID : " + customerID + ", 고객 포인트 : " + customerPoint);
	}

}

class GoldMember extends Customer{
	int goldPoint ;
	void goldInfo() {
		System.out.println("고객이름 : " + name + ", 고객 ID : " + customerID + ", 고객 포인트 : " + goldPoint);
	}
}

class SilverMember extends GoldMember{
	int silverPoint ;
	void silverInfo() {
		System.out.println("고객이름 : " + name + ", 고객 ID : " + customerID + ", 고객 포인트 : " + silverPoint);
	}
}

class BronzeMember extends SilverMember{
	int bronzePoint ;
	void bronzeInfo() {
		System.out.println("고객이름 : " + name + ", 고객 ID : " + customerID + ", 고객 포인트 : " + bronzePoint);
	}
}

//자식 클래스 : GoldMember, SilverMember, BronzeMember =====> 각각 int 색깔Point
															// 필드 goldPoint : 기본값으로 10점    실버는 5 브론즈는 3
															// 메소드 goldInfo() ===> 출력 : 골드 회원입니다.....

public class Ex01 {
	public static void main(String[] args) {
//각 객체를 생성해서 부모클래스의 필드와 메소드 접근가능한지 확인 후 업캐스팅 <=====> 다운캐스팅 해서 출력...
		System.out.println("==============회원================");
		Customer c1 = new Customer ();
		
		c1.name = "홍길동";
		c1.customerID = 1111;
		c1.customerPoint = 10;
		c1.customerInfo();
		
		
		System.out.println("==============골드 회원================");
		GoldMember g1 = new GoldMember ();
		
		g1.name = "신사임당";
		g1.customerID = 5555;
		g1.customerPoint = 10;
		g1.customerInfo();
		g1.goldPoint = 10;
		g1.goldInfo();
		
		System.out.println("==============실버 회원================");
		SilverMember s1 = new SilverMember ();
		
		s1.name = "세종대왕";
		s1.customerID = 3333;
		s1.customerPoint = 5;
		s1.customerInfo();
		s1.silverPoint= 5;
		s1.silverInfo();
		
		System.out.println("==============브론즈 회원================");
		BronzeMember b1 = new BronzeMember ();
		
		b1.name = "이순신";
		b1.customerID = 2222;
		b1.customerPoint = 3;
		b1.customerInfo();
		b1.bronzePoint =3;
		b1.bronzeInfo();
		
		System.out.println("==============골드 업캐스팅 회원================");
		GoldMember g2 = s1;		//업캐스팅
		g2.name = "세종2";
		g2.customerID = 55555;
		g2.customerPoint = 10;
		g2.customerInfo();
		g2.goldPoint = 10;
		g2.goldInfo();
		
		System.out.println(g2 instanceof Customer);
		System.out.println(g2 instanceof GoldMember);
		System.out.println(g2 instanceof SilverMember);
		
		
		System.out.println("==============실버 다운캐스팅 회원================");
		
		SilverMember s2 = null;
		if (g2 instanceof SilverMember) {
			s2 = (SilverMember) g2;
			System.out.println("SilverMember 타입으로 다운캐스팅이 잘 되었습니다.");
		}else {
			System.out.println("SilverMember 타입으로 다운캐스팅이 할 수 없습니다.");
		}
		
		System.out.println(s2 instanceof SilverMember);
		s2.name = "세종3";
		s2.customerID = 555555555;
		s2.customerPoint = 5;
		s2.customerInfo();
		s2.goldPoint = 10;
		s2.goldInfo();
		s2.silverPoint = 5;
		s2.silverInfo();
		
		System.out.println("=============================================");
		//c1(Customer), g1(Customer/GoldMember), s1(Customer/GoldMember/SilverMember), 
		//b1(Customer/GoldMember/SilverMember/BronzeMember) 을 Customer 타입으로 배열에 저장
		
		//객체를 배열 arr에 넣음 : upCasting 됨
		//배열 arr에 저장된 모든 객체는 Customer 타입을 내포하고있고, Customer 타입으로 upCasting 되어 들어가있음.
		
		//배열 arr에 들어가 있는 객체는 Customer 타입으로 다 업캐스팅 되어있음.
		Customer [] arr = new Customer []{c1,g1,s1,b1}; //싹다 Customer 타입으로 업캐스팅 되어서 들어감.
		
		//배열에 저장된 객체를 가지고 온다.
		Customer cc1 = arr[0];				//Customer
		Customer cc2 = arr[1];				//Customer / GoldMember
		Customer cc3 = arr[2];				//Customer / GoldMember / SilverMember
		Customer cc4 = arr[3];				//Customer / GoldMember / SilverMember / BronzeMember
		
		
	
		cc1.customerInfo();
		
		//다운캐스팅
		GoldMember gg1 = (GoldMember) cc2;					//cc2를 gg1으로 다운캐스팅한것.
		gg1.goldInfo();
		
		SilverMember ss1 = (SilverMember) cc3;				//cc3를 ss1으로 다운캐스팅한것.
		ss1.silverInfo();
		
		BronzeMember bb1 = (BronzeMember) cc4;				//cc4를 bb1으로 다운캐스팅한것.
		bb1.bronzeInfo();
		
		
		
		System.out.println("======================================");
		
		//객체 생성시 타입을 지정;
		
		
		//1. Customer 객체 생성시 타입지정
		Customer cus1 = new Customer();
		
		
		//2. GoldMember 객체 생성시 타입지정 (2가지 지정가능)
		Customer cus2 = new GoldMember();  // 2가지다 갖고 있는데 Customer타입임.===> 다운캐스팅이 가능하다는 얘기
		
		cus2.name = "고객이름"; //Customer만 접근가능함.
		
		GoldMember gm1 = (GoldMember)cus2;
		gm1.goldPoint = 10;
		gm1.goldInfo();
		
		//2. GoldMember 객체 생성자 타입을 GoldMember 로 지정/ 2개를 갖고있음 타입(골드랑 커스텀)
		GoldMember gm2 = new GoldMember(); // 2가지다 접근가능
		
		
		//3. SilverMember 객체화 하면서 Custom 타입으로 지정
		Customer cus3 = new SilverMember();	//3가지 다 갖고있는데 Customer타입으로 지정됨.===>다운캐스팅가능!!
		
		SilverMember sil1 = (SilverMember) cus3; //=====> 다운캐스팅한거..		
		
		//4. SilverMember 객체화 하면서 SilverMember 타입으로 지정
		SilverMember sil3 = new SilverMember(); // ===>3가지다 갖고 3가지다 접근가능.
		
		
		System.out.println("=================================================");
		
		
		Customer ccc1 = new GoldMember ();	//2가지
		Customer ccc2 = new SilverMember();	//3가지
		Customer ccc3 = new BronzeMember();	//4가지
		
		//자식 클래스를 부모타입으로 객체화해서 베열에 저장
		Customer [] arr2 = new Customer [] {ccc1, ccc2, ccc3};
		
		//각 배열의 방의 값을 끄집어내면서 다운캐스팅을 바로 할수 있음.
		GoldMember gm11 = (GoldMember) arr2[0];
		SilverMember sil11 = (SilverMember) arr2[1];
		BronzeMember bro11 = (BronzeMember) arr2[2];
		
	}
}
