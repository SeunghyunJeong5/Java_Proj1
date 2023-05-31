package chapter17.ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class List_Vector_Method {

	public static void main(String[] args) {
		
		// List<E> : 인터페이스, 메소드만 선언되어있다. 구현되어있지 않다. 객체화 불가능
		//			: 방번호[index] 를 가지고 있다.(set map은 없음) 중복된 값을 저장할 수 있다. 
		//			: 컬렉션 값을 추가하거나, 제거나, 수정하거나, 할때 메소드를 사용함.
		
		//			- ArrayList <E> : 싱글 쓰레드
		//			- Vector <E> 	: 멀티 쓰레드 환경, 모든 메소드가 동기화 처리가 되어있기 때문에 멀티쓰레드 환경에 유리.
		//					-- 기본적으로 ArrayList와 Vector는 완벽하게 일치한다. 
		//					-- 둘다 중간에 어떤 값을 넣거나 제거할 경우 부하가 많이 발생된다.
		//					-- 둘다 빈번하게 값을 수정하는 경우 부하가 많이 발생된다.
		
		//			- LinkedList <E>:
		//					-- 중간에 어떤 값을 추가/제거해도 부하가 많이 발생되지 않는다.
		//					-- 빈번하게 값이 변경되는 경우 사용하는 자료형(값을 중간에 제거해도 방이 당겨지지 않는다.)
		
		
		
		//List 에서 사용되는 메소드
		
		//자식의 구현 클래스를 객체화해서 List 타입으로 선언 : 인터페이스의 메소드를 호출하면 오버라이딩된 메소드 호출
		List<Integer> aList = new Vector<>(); 		//import해줘야됨
		
		
		
		
		//메소드
		
		//메소드 1~4 : 리스트에 값을 추가
		//1. add (E element) : 마지막 방에 값을 추가함.	들어가는 값을 element라고함.
		System.out.println(aList);
		System.out.println(aList.size());	//List 컬렉션에 저장된 방의 개수
		
		aList.add(3);
		aList.add(4);
		aList.add(5);
		
		System.out.println(aList);
		System.out.println(aList.size());	//List 컬렉션에 저장된 방의 개수
		
		//2. add(int index, E element) : 특정 index 방번호에 값을 추가함.
		aList.add(1, 6); 		//1 : index(방번호), 6 : 방에 들어가는 값 ===> 값이 들어가면서 다른값들이 뒤로 다 밀림
		
		System.out.println(aList);
		System.out.println(aList.size());	//List 컬렉션에 저장된 방의 개수
		
		
		//3. addAll(다른 리스트 객체) : 자신의 마지막 방에서 다른 컬렉션 객체의 값을 모두 추가
		List<Integer> aList2 = new Vector();
		
		aList2.add(1);
		aList2.add(2);
		System.out.println(aList2);
		
		aList2.addAll(aList);			//자신의 방 뒤에 리스트를 통째로 추가로 넣어주는거
		System.out.println(aList2);
		
		
		//4. addAll (int index, 다른 리스트객체)
		List<Integer> aList3 = new Vector();
		
		aList3.add(1);
		aList3.add(2);
		System.out.println(aList3);
		
		aList3.addAll(1, aList3);		//자기 자신의 객체의 값을 추가할 수 있다.
		System.out.println(aList3); 	//1번방에 12가 들어가서 2가 뒤로 밀림.
		
		
		
		
		// 컬렉션 : List, Set, Map
		// List의 값을 수정 : set()
		
		//5. set(int index, E element) : index 방번호에 있는 값을 element로 들어온 인자로 수정
		
		aList3.set(1, 5);				//1:방번호, 5:변경될값
		aList3.set(3, 6);
		System.out.println(aList3);
		
		
		//삭제 
		//6. remove (int index) : index : 방번호의 값을 삭제, 삭제 후에 뒤의 값이 한칸씩 앞으로 오게 된다.
		
		aList3.remove(2);				//2번방의 값이 삭제되고 앞으로 땡김.
		System.out.println(aList3);
		
		
		//7. remove(Object o ) : 방번호로 삭제하는 것이 아니고, 리스트에 저장된 값을 식별해서 삭제. 같은 값은 한꺼번에 다 삭제됨.
		
		aList3.remove(new Integer(6));		//객체를 넣어서 하면됨.
		System.out.println(aList3);
		
		//8. clear() : 리스트의 모든 값을 삭제
		aList3.clear();
		System.out.println(aList3);
		
		
		
		//9. isEmpty() : 리스트에 값이 존재하지 않을 경우 true, 존재하는 경우 false
		System.out.println(aList3.isEmpty());
		
		
		//10. size() : 방의 개수
		System.out.println(aList3);
		System.out.println(aList3.size());
		System.out.println(aList2);
		System.out.println(aList2.size());
		
		
		//검색 : 리스트에 저장된 값을 가져오기
		//11. get(int index) : index 방 번호의 값을 가져오기.
				//aList2 : [1, 2, 3, 6, 4, 5]
		System.out.println(aList2.get(0));
		System.out.println(aList2.get(1));
		System.out.println(aList2.get(2));
		System.out.println(aList2.get(3));
		System.out.println(aList2.get(4));
		System.out.println(aList2.get(5));
		
		System.out.println("========리스트의 값을 For문을 사용해서 출력 ============");
		for (int i = 0 ; i<aList2.size();i++) {
			System.out.print(aList2.get(i)+" ");
			
		}
		System.out.println();
		
		
		System.out.println("==========리스트의 값을 향상된 For문을 사용해서 출력 ===============");
		for( int k : aList2) {
			System.out.print(k + " ");
		}
		System.out.println();
		
		
		// 리스트의 값을 배열로 변환
		//12. toArray() : 리스트에 저장된 값을 배열로 변환, 리턴 타입이 Object이기때문에 다운캐스팅 해서 처리
		Object[] obj = aList2.toArray();
		System.out.println(Arrays.toString(obj));
		
		
		
		//13. toArray(T[] t) : 리스트 ====> 배열, T[] 타입으로 바로 나옴(다운캐스팅 안함)===> 리스트를 배열로 끄집어낼때 해당타입의 배열로 바로 끄집어낸다.
		Integer[] int1 = aList2.toArray(new Integer[0]);	//int[] int1 = new int [10];  	
		// [0] : 방의 개수를 지정함. 리스트의 값이 존재할 경우 리스트의 방크기로 자동으로 지정됨
		
		System.out.println(Arrays.toString(int1));
		
		Integer[] int2 = aList2.toArray(new Integer[10]);	//int[] int2 = new int [10]; 비슷한 느낌.  	
		System.out.println(Arrays.toString(int2));
	}
}
