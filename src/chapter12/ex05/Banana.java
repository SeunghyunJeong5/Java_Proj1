package chapter12.ex05;

public class Banana implements Fruit {

	@Override
	public void name() {
		System.out.println("바나나");

	}

	@Override
	public void eat() {
		System.out.println("바나나는 맛있어.");

	}

	@Override
	public void color() {
		System.out.println("노란색");

	}

}
