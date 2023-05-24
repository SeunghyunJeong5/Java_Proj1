package chapter12.ex04;

public class Cat implements Animal {				//만들때 interface add를 하면 더 빨리됨.

	@Override
	public void cry() {
		System.out.println("야옹");

	}

	@Override
	public void run() {
	System.out.println("고양이가 달린다.");
	}

}
