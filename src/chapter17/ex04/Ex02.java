package chapter17.ex04;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student {
	int stuID;		//식별자 : 오버라이딩 2개 해야됨.
	String stuName;
	String stuPhone;
	
	public Student(int stuID, String stuName, String stuPhone) {
		super();
		this.stuID = stuID;
		this.stuName = stuName;
		this.stuPhone = stuPhone;
	}
	
	@Override
	public String toString() {
		
		return " "+stuID+ " "+stuName+" "+stuPhone+" ";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			if (this.stuID== ((Student)obj).stuID) {
				return true;
			
			}else {
				return false;
			}
		}
		return false;
	}
	
	
	@Override
	public int hashCode() {
		
		return Objects.hash(stuID);
	}
	
	
	
	
	
}
public class Ex02 {
public static void main(String[] args) {
	
	Set<Student> hset = new HashSet();
	
	//학생 객체를 5개 생성해서 set에 넣을 경우 stuID필드에 중복된 값을 넣지 못하도록 설정
	//stuID 필드의 equals() 재정의, hashCode() 재정의
	
	hset.add(new Student(11111, "이순신", "없음"));
	hset.add(new Student(22222, "세종대왕", "있음"));
	hset.add(new Student(33333, "홍길동", "있음"));
	hset.add(new Student(44444, "신사임당", "없음"));
	hset.add(new Student(55555, "안중근", "있음"));
	hset.add(new Student(55555, "홍길순", "없음"));		//같은값이라서 안들어감.
	
	
	System.out.println(hset);
	System.out.println(hset.size());
	
	
	
	
	
	
	
}
	
}
