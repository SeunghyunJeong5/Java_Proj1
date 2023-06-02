package chapter17.ex05;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

class Student{ 		//Map에서 Key로 사용됨. 중복되면 안되니까 equals랑 hashcode를 오버라이딩해줘야됨.
	
	int stuID;		//이게 중복되면안됨.
	
	String stuName;

	public Student(int stuID, String stuName) {
		super();
		this.stuID = stuID;
		this.stuName = stuName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(stuID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return stuID == other.stuID;
	}
	
	
	@Override
		public String toString() {
			
			return "학생 ID : "+ stuID +" 학생 이름 : "+stuName;
		}
	
}

public class Ex01 {
	
	public static void main(String[] args) {
		
		
		Map <Student, String> linkMap = new LinkedHashMap();
		Student s1 = new Student(11111, "신사임당");
		Student s2 = new Student(22222, "세종대왕");
		Student s3 = new Student(33333, "안중근");
		Student s4 = new Student(44444, "홍길동");
		Student s5 = new Student(55555, "이순신");
		Student s6 = new Student(55555, "야오밍");
		
		linkMap.put(s1, "신사임당");
		linkMap.put(s2, "세종대왕");
		linkMap.put(s3, "안중근");
		linkMap.put(s4, "홍길동");
		linkMap.put(s5, "이순신");
		linkMap.put(s6, "야오밍");		//객체에서 저장할때는 55555식별자에서 이순신이 저장한 상태로 있는데 야오밍을 저장할수 없으므로 그냥 이순신까지는 출력되는데, 
		
		System.out.println(linkMap);
		System.out.println(s5);
		System.out.println(s6);
	}

}
