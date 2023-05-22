package chapter10.ex04;

class Car {
	
	String companyName	= "현대자동차";
	int carYear; 			//생산년도
	
}

class Hcar extends Car {
	
	String carName;			//자동차 모델(에쿠스, 제네시스, 아반떼, 봉고)
	int maxSpeed;			//최대 시속
	int oilLiter;			//몇리터가 연료통에 들어가는지
	
	
}
class BMW extends Car {
	
	
	String carName;			//자동차 모델
	int maxSpeed;			//최대 시속
	int oilLiter;			//몇리터가 연료통에 들어가는지
	
}




public class Ex02 {
	
	Car[] arr = null;
	void carInfo (Car c1, Car c2, Car c3, Car c4) {
		//현대자동차 객체를 인풋으로 받아서 arr배열변수에 저장
		
		arr = new Car [] {c1,c2,c3,c4}; 
		//현대자동차의 배열에 저장된 최대시속의 평균을 출력
		//현대자동차의 배열에 저장된 오일리터의 합을 출력
		avgMaxSpeed(arr);
		System.out.println("현대자동차의 배열에 저장된 오일리터의 합은 : " +sumOil(arr)+"입니다");
		
	}
	void avgMaxSpeed(Car[] arr) {
		double avg = 0;
		int s =0;
		for (int i = 0; i<arr.length; i++) {
			if (arr[i] instanceof Hcar) {
				s += ((Hcar)arr[i]).maxSpeed;
				
				
			}
			
		}
		avg = s/arr.length;
		
		System.out.println("현대자동차의 배열에 저장된 최대시속의 평균은 : "+avg+ "입니다");
	}
	int sumOil (Car[] arr) {
		int sum = 0;
		
		for(int i =0 ;i<arr.length;i++) {
			if(arr[i] instanceof Hcar ) {
				
				sum += ((Hcar)arr[i]).oilLiter;
				
			}
			
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		//현대자동차의 객체를 생성해서 필드의 값 입력
										//   연식/차종/최대시속/리터
		Hcar h1 = new Hcar ();			//	2000/에쿠스/330/60
		Hcar h2 = new Hcar ();			//	2010/제네시스/300/50
		Hcar h3 = new Hcar ();			//	2022/그랜져/250/55
		Hcar h4 = new Hcar ();			//	2023/아반떼/200/40
		
		h1.carYear = 2000;
		h1.carName = "에쿠스";
		h1.maxSpeed = 330;
		h1.oilLiter = 60;
		
		h2.carYear = 2010;
		h2.carName = "제네시스";
		h2.maxSpeed = 300;
		h2.oilLiter = 50;
		
		h3.carYear = 2022;
		h3.carName = "그랜져";
		h3.maxSpeed = 250;
		h3.oilLiter = 55;
		
		h4.carYear = 2023;
		h4.carName = "아반떼";
		h4.maxSpeed = 200;
		h4.oilLiter = 40;
		
		
		Ex02 e1 = new Ex02();
		e1.carInfo(h1, h2, h3, h4);
		
		
	}

}
