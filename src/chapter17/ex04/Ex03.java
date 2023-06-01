package chapter17.ex04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Member{
	
	int memberID;		//식별자로 사용... 오버라이딩2개..
	String memberName;
	
	
	
	//생성자를 통해서 필드의 값을 입력
	public Member(int memberID, String memberName) {
		
		this.memberID = memberID;
		this.memberName = memberName;
	}

	
	//ctrl shift s 눌러서 생성해도 된다.
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			if (this.memberID== ((Member)obj).memberID) {
				return true;
			
			}else {
				return false;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		
		return Objects.hash(memberID);
	}
	
	//객체를 출력시 필드의 내용을 출력
	@Override
	public String toString() {
		
		return memberName+"회원님의 아이디는"+memberID+"입니다.";
	}
	
	
}

class MemberMethod{
	//Set을 정의
	Set<Member> memSet;
	//MemberMethod 객체를 생성시 Set을 활성화 시킴.
	MemberMethod(){
		this.memSet = new HashSet();
	}

	//메소드를 정의
	public void addMember(Member member) {	//Member객체를 인풋으로 던지면 memSet에 저장
		
		//코드 뭐뭐.add뭐 하면되지 않을까..
		
		memSet.add(member);
		
	
			
	}
	
	//정수를 인풋받아서 : memberID ===> set에 저장되어있는 Member 에서 iterator를 통해서 끄집어내서 memberID와 같을경우 인풋받은 맴버아이디를 set에서 삭제.
	//잘 삭제가 완료된 경우, 해당아이디를 찾을수 없는경우 return false	
	public boolean removeMember(int memberID) {
		
		//코딩
		Iterator<Member> iterator = memSet.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();
            if (member.memberID == memberID) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
		//Iterator ir = memSet.iterator();
		//while (ir.hasNext()){
		// Member member =  ir.next();		맴버객체임
		//if(memberID==member.memberID){
		//memSet.remove(member);
		//return true;
	
		//}
	
	
	
	
		//}
		
		//return false
	
		//}
	
	
	
	public void showMember() {		//메소드 호출시 Set에 저장된 Member객체의 필드의 값을 출력
	
		//코딩
		for (Member k : memSet) {
            System.out.println("Member ID: " + k.memberID + ", Member Name: " + k.memberName);
        }
		
		//Iterator ir = memSet.iterator();
		//while(ir.hasNext()){
		//System.out.println(ir.next());		ir.next() ==> Member객체가 나오는데 toString 오버라이딩한거때문에 객체를 찍어도 내용이 다 나옴.
		//}
		
	}
	
	public void showSize() {		//Set에 저장된 총 개수를 출력
		//코딩
		System.out.println("Total members: " + memSet.size());
	}
	
	
	
	
}

public class Ex03 {
	
	public static void main(String[] args) {
		
		//member 객체를 5개 만들고 메소드를 통해서 set에 넣기 ...
		MemberMethod m1 = new MemberMethod();
		
		m1.addMember(new Member(11111, "이순신"));
		m1.addMember(new Member(22222, "세종대왕"));
		m1.addMember(new Member(33333, "홍길동"));
		m1.addMember(new Member(44444, "신사임당"));
		m1.addMember(new Member(55555, "안중근"));
		
		m1.showMember();
		
		m1.removeMember(33333);
		
		m1.showSize();
		
		/*강사님이 한거
		 * 
		 * 
		 * 맴버객체 생성
		 * Member m1 = new Member("1111", "홍길동")
		 * Member m2 = new Member("2222", "홍길순")
		 * Member m3 = new Member("3333", "홍길동")
		 * Member m4 = new Member("4444", "김길동")
		 * Member m5 = new Member("1111", "이길동")
		 * Member m6 = new Member("1111", "박길동")
		 * 
		 * 
		 * MemberMethod 객체화 
		 * MemberMethod mm = new MemberMethod();
		 * 
		 * mm.addMember(m1);
		 * mm.addMember(m2);
		 * mm.addMember(m3);
		 * mm.addMember(m4);
		 * mm.addMember(m5);
		 * mm.addMember(m6);
		 * 
		 * 
		 *set에 저장된 총개수
		 *mm.showSize();
		 *
		 * 
		 *set에 저장된 Member객체를 출력
		 *mm.showMember();
		 * 
		 * 
		 * 제거
		 * mm.removeMember("2222");
		 * 
		 * 
		 */
		
		
	}

}
