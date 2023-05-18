package chapter08.ex03;

class Car1 {

	private String company;
	private String carName;
	private int carMaxSpeed;
	private double carWeight;

	// getter, setter 를 생성해서 각 필드의 값을 넣고 (setter) 출력 (getter)

	public String getCompany() {
		return company;
	}

	public String getCarName() {
		return carName;
	}

	public int getCarMaxSpeed() {
		return carMaxSpeed;
	}

	public double getCarWeight() {
		return carWeight;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public void setCarMaxSpeed(int carMaxSpeed) {
		this.carMaxSpeed = carMaxSpeed;
	}

	public void setCarWeight(double carWeight) {
		this.carWeight = carWeight;
	}

}

public class Car { // 외부패키지에서 접근가능

	public static void main(String[] args) {
		// Car객체를 생성 후 각 메소드에 setter를 호출해서 값을 넣고, getter를 사용해서 출력.

		Car1 c1 = new Car1();

		c1.setCompany("현대");
		c1.setCarName("투싼");
		c1.setCarMaxSpeed(300);
		c1.setCarWeight(1.5);

		System.out.println(c1.getCompany());
		System.out.println(c1.getCarName());
		System.out.println(c1.getCarMaxSpeed());
		System.out.println(c1.getCarWeight());

	}

}
