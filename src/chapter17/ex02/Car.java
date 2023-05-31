package chapter17.ex02;

public class Car {

	String company;
	String carName;
	String carColor;
	int maxSpeed;
	
	//생성자를 통해서 필드의 값 입력. css(ctrl shift s)를 사용해서 만듦 constructor
	public Car(String company, String carName, String carColor, int maxSpeed) {
		super();	//Object 클래스의 기본 생성자 호출(생략가능)
		this.company = company;
		this.carName = carName;
		this.carColor = carColor;
		this.maxSpeed = maxSpeed;
	}

	//객체 자체를 출력시 객체의 필드의 값을 출력하도록 재정의
	@Override    			//css를 사용해서 만듦 tostring으로
	public String toString() {
		return "Car [company=" + company + ", carName=" + carName + ", carColor=" + carColor + ", maxSpeed=" + maxSpeed
				+ "]";
	}
	
	
	
}
