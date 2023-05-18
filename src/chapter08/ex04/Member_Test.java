package chapter08.ex04;

public class Member_Test {
	
	public static void main(String[] args) {
		// Member 객체 생성 후 setter로 주입
		// getter로 필드의 값을 출력
		Member m1 = new Member();
		
		m1.setMemberNo(1L);
		m1.setMemberId("Himedia");
		m1.setMemberPass("1234");
		m1.setMemberEmail("aaa@aaa.com");
		m1.setMemberAge(15);
		
		System.out.println(m1.getMemberNo());
		System.out.println(m1.getMemberId());
		System.out.println(m1.getMemberPass());
		System.out.println(m1.getMemberEmail());
		System.out.println(m1.getMemberAge());
		
		System.out.println(m1);
		System.out.println(m1.toString());
		
	}

}
