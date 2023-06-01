package chapter17.ex04;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Summary {

	public static void main(String[] args) {
		
		// Set<E> : 인터페이스, 객체화 할 수 없다, 자식을 객체화해서 타입으로는 지정가능하다.
				//		- 선언만 된 메소드 ======> 자식클래스 (오버라이딩해서 구현)
				//		- 인터페이스의 메소드 호출시 자식클래스의 오버라이딩된 메소드가 작동
				//		- 방번호가 없다. 중복된 값을 넣을수 없다. ===> ID
				//		- set에 값을 저장하면 중복 제거되어서 저장이됨.***
				
				
				
				//  	- HashSet<E>		: 입력 순서대로 출력되지 않고 랜덤하게 값이 출력
				//		- LinkedHashSet<E>	: 입력 순서대로 값이 출력
				
				//		- TreeSet<E>		: 검색을 빠르게 하기 위해서
				//				값을 저장할때 정렬해서 저장이됨 : 오름차순 정렬(ASC-어쎈딩? 이라고함)  a와c가 있는데 b를 넣으면 그 사이에 저장이 된다는 것.
				//											(1,2,3,4,5...)(A,B,C,D,E...)(가,나,다...) 
				//										   내림차순 정렬(DESC-디쎈딩?)
				//											(10,9,8,7,6....)
		
		
		
		//1. 객체생성
		Set<String> hset = new HashSet();
		Set<String> lset = new LinkedHashSet();
		Set<String> tset = new TreeSet();
		
		
		//2. 값입력 후 출력
		
		//HashSet
		hset.add("다");
		hset.add("마");
		hset.add("나");
		hset.add("가");
		
		System.out.println(hset); 		//HashSet : 입력한 순서대로 출력되지 않음.
		
		
		//LinkedHashSet : 입력한 순서대로 출력
		
		lset.add("다");
		lset.add("마");
		lset.add("나");
		lset.add("가");
		
		System.out.println(lset);
		
		
		//TreeSet : 오름차순 정렬되어서 저장이 되어있음. 오름차순 정렬되어서 출력.
		
		
		tset.add("다");
		tset.add("마");
		tset.add("나");
		tset.add("가");
		
		
		System.out.println(tset);
		
		
		
		
		
		
		
		
		
		
	}
}
