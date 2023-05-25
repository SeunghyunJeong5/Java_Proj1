package chapter14.ex03;

class A {
	int a;

}

class B extends A {
	int b;
}

class C extends A {
	int c;
}

public class Ex01 {

	public static void main(String[] args) {

		A a1 = new B();

		String[] arr = new String[] { "안녕", "오늘", "날씨", "맑음" };

		String str = null;

		System.out.println(" 1. 첫번째 방법으로 예외처리 (각각 처리) ====================");

		try {
			C b1 = (C) a1; // 예외발생1 ClassCastException

		} catch (ClassCastException e) {
			System.out.println("ClassCastException예외발생");
		}

		try {
			System.out.println(arr[4]); // 예외발생2 ArrayIndexOutOfBoundsException

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 예외발생");
		}

		try {
			System.out.println(str.charAt(1)); // 예외발생3 NullPointerException

		} catch (NullPointerException e) {
			System.out.println("NullPointerException 예외발생");
		}

		System.out.println(" 2. 두번째 방법으로 예외처리 (여러 catch 로 예외처리)===============================");

		try {
			C b1 = (C) a1;
			System.out.println(arr[4]);
			System.out.println(str.charAt(1));

		} catch (ClassCastException e) {
			System.out.println("ClassCastException예외발생");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 예외발생");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException 예외발생");
		}

		System.out.println(" 3. 세번째 방법으로 예외처리 (Exception으로 한꺼번에 처리)=======================================");

		try {
			C b1 = (C) a1;
			System.out.println(arr[4]);
			System.out.println(str.charAt(1));

		} catch (Exception e) {
			System.out.println("Exception으로 한꺼번에 처리");
		}

		System.out.println(" 4. 네번째 방법으로 예외처리 (catch 블락에서 세밀하게 처리하고 그외는 Exception으로 처리)==============================");

		try {
			C b1 = (C) a1;
			System.out.println(arr[4]);
			System.out.println(str.charAt(1));

		} catch (ClassCastException e) {
			System.out.println("ClassCastException예외발생");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 예외발생");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException 예외발생");
		} catch (Exception e) {
			System.out.println("나머지 Exception으로 처리");
		}

	}
}
