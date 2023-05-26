package chapter14.ex06;

public class Account {
	
	
	private long balance = 10000;		//은행에 예금된 잔고 : 10000원이 입금되어있음.

	
	//기본생성자
	Account (){}
	
	//getter : 메소드를 호출시 필드의 정보를 출력해줌. private 필드의 정보를 출력할때사용.
	public long getBalance () {
		return balance;
	}
	
	//예금을 입금/출금하는 메소드 ===> money에 인풋되면 예금을 추가하는것(입금), 인풋값을 받아서 balance에 저장하는것(잔고에 적용)
	public void deposit (int money) {
		//코드
		
			balance +=money;
			System.out.println("정상적으로 "+money+"원 입금되었습니다. 잔액 : "+balance);
		
	}
	
	
	//인풋되면 예금을 빼는것(출금) : money를 인풋받아서 예금 잔고보다 작으면 BalanceException발생 ("예금잔고가 부족합니다."출력)
	public void withdrow (int money) throws BalanceException {
		//코드
		if((balance-money)>0) {
			balance -=money;
			System.out.println("정상적으로 "+money+"원 출금되었습니다. 잔액 : " +balance);
		}
		else if ((balance-money)<0) {
			throw new BalanceException("잔고가 부족합니다. 잔액 : "+ balance);
			
		}
	}
	
	
}
