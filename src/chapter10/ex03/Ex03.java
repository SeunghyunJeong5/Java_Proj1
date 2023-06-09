package chapter10.ex03;



class Customer{
	
	void memberInfo() {
		System.out.println("회원님은 기본 회원님 입니다.");
	}
}

class Gold extends Customer{
	
	
	@Override
	void memberInfo() {
		System.out.println("회원님은 골드 회원님 입니다.");
	}
	
}
class Silver extends Customer{
	@Override
	void memberInfo() {
		System.out.println("회원님은 실버 회원님 입니다.");
	}
	
}
class Bronze extends Customer{
	@Override
	void memberInfo() {
		System.out.println("회원님은 브론즈 회원님 입니다.");
	}
	
}



public class Ex03 {
	
	public static void main(String[] args) {
		
		//자식을 객체화해서 부모 타입으로 지정
		
		//부모의 메소드 호출시 오버라이딩된 메소드 출력
		
		//for문에 넣어서 / enhanced for문에 넣어서 출력
		
		Customer c1 = new Gold ();
		Customer c2 = new Silver ();
		Customer c3 = new Bronze ();
		
		Customer[] arr = new Customer[] {c1,c2,c3};
		
		System.out.println("===============for문을 통한 출력====================");
		for (int i =0 ;i<arr.length;i++) {
			arr[i].memberInfo();
		}
		
		System.out.println("================Enhanced for문을 통한 출력======================");
		for(Customer k : arr) {
			k.memberInfo();
		}
		
		
	}

}
