package chapter12.ex04;

public class Dog implements Animal {

	@Override
	public void cry() {
		System.out.println("멍멍");

	}

	@Override
	public void run() {
		System.out.println("강아지는 달립니다.");

	}

}
