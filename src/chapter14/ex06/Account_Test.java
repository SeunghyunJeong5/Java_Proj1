package chapter14.ex06;

public class Account_Test {

	public static void main(String[] args) {
		
		Account a1 = new Account();
		
		//현재 잔고 출력 // 필드의 접근제어자가 private 이므로 getter를 사용해서 필드 정보를 출력.
		System.out.println(a1.getBalance());
		
		
		try {
			a1.withdrow(100000);
		} catch (BalanceException e) {
			System.out.println(e.getMessage()); 
		}
		
		a1.deposit(100000);
		
		try {
			a1.withdrow(100000);
		} catch (BalanceException e) {
			System.out.println(e.getMessage()); 
		}
	}

}
