package chapter17.ex04;

import java.util.HashSet;
import java.util.Iterator;
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
	
	
	System.out.println("set에 저장된 값을 출력 : Iterator 사용");
	
	Iterator<Student> ir = hset.iterator();
	while(ir.hasNext()) {
		Student student = ir.next();		//set안에 들어있는 객체를 읽어옴.
		System.out.println(ir.next());  //안에 student를 넣는것과같음(이거는 객체를 출력하는건데, toString을 오버라이딩한것을 저위에 해놔서 객체만 읽어와도 나중에것을 전부다 읽어옴.
		//System.out.println((ir.next()).stuID); // 이거는 객체 안에있는것을 따로 읽어오는 것임.(대신에 ir.next();는 하나만 사용해야됨. 두개 사용하면 오류남)
	}
	
	System.out.println("set에 저장된 앖을 출력 : enhanced for문을 사용");
	for( Student k : hset) {
		System.out.println(k.stuID);  //안에 k놓으면 내용 다 읽어옴.
	}
	
	
}
	
}
