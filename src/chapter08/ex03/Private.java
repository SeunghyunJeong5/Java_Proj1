package chapter08.ex03;

class Student { 				//default : 외부 패키지에서 접근불가
	
	//외부에서 접근이 불가한 필드, 외부 클래스에서 필드에 직접 값을 접근할 수 없도록 설정함.
	private String stuName;
	private String stuAddr;
	private int age;
	private double weight;
	
	//getter, setter 를 사용 : 접근 지정자를 public 을 반드시 사용.======> 외부에서 필드의 값을 가져오거나 주입할수 없으므로 이걸 사용.
			//private필드에 값을 넣을때(setter)
			//private 필드에 값을 불러올때(getter)를 사용.
	
	
	//stuName 필드에 대한 getter : 필드의 값을 리턴
	public String getStuName() {		//stuName 을 StuName 대문자로 표기해야함.
		return stuName;
		
	}
	
	//sttName 필드에 대한 setter : 필드의 값을 외부에서 주입
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	
	
	//getter
	public String getStuAddr() {
		return stuAddr;
	}
	
	
	//setter
	public void setStuAddr(String stuAddr) {
		this.stuAddr = stuAddr;
	}
	
	
	//getter : age필드에 대한 getter
	public int getAge() {
		return age;
	}
	
	//setter : age 필드에 대한
	public void setAge(int age) {
		this.age = age;
	}
	
	
	//getter : weight에 대한
	public double getWeight() {
		return weight;
	}
	
	//setter : weight에 대한
	public void setWeight(double weight) {
		this.weight= weight;
	}
	
}





public class Private {
	
	public static void main(String[] args) {
		
		Student s1 = new Student ();
		
		//private 이므로 직접 접근이 안됨. 외부클래스에서 : getter, setter 를 사용해서 값을 출력, 입력
	//	s1.stuName = "홍길동"; // ===>이렇게 요청이 안됨.
	//	System.out.println(s1.stuName);  //===> 이것도 마찬가지.
		
		//getter를 사용해서 필드의 내용을 출력
		System.out.println(s1.getStuName());
		
		//setter를 사용해서 필드에 값을 입력
		s1.setStuName("홍길동");
		System.out.println(s1.getStuName());
		System.out.println("=======================================");
		
		
		//setter를 사용해서 필드에 값을 입력
		s1.setStuAddr("서울");
		s1.setAge(25);
		s1.setWeight(75.5);
		
		
		//getter를 사용해서 필드의 값을 출력
		System.out.println(s1.getStuName());
		System.out.println(s1.getStuAddr());
		System.out.println(s1.getAge());
		System.out.println(s1.getWeight());
		
		
		
		
		
	}

}
