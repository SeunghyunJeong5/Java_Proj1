package chapter17.ex04;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Set_TreeSet_Method02 {

	public static void main(String[] args) {

		// TreeSet은 Set<E>, SortedSet<E>== 정렬기능, NavigableSet<E>== 검색기능 인터페이스를 구현한 클래스
		// - TreeSet을 객체화해서 Set타입으로 지정할 경우 Set의 메소드만 사용가능
		// - TreeSet을 객체화해서 TreeSet타입으로 지정하면 정렬/검색 기능의 메소드를 사용가능하다.
		// - 값을 저장할때 오름차순 정렬되어서 값이 저장(1--->10, A-->Z, 가-->하)

		// 중요 : TreeSet을 객체화해서 TreeSet타입으로 지정해야함.
		TreeSet<Integer> treeSet = new TreeSet();

		// TreeSet에 값을 입력 : 50에서 2씩 감소하면서 저장==>정렬되어서 입력됨(오름차순)
		for (int i = 50; i > 0; i -= 2) {
			treeSet.add(i);
		}

		// 출력 : Iterator
		Iterator ir = treeSet.iterator();

		while (ir.hasNext()) {
			System.out.print(ir.next() + " ");
		}

		System.out.println(); // 오름차순으로 정렬되어서 출력됨.

		System.out.println(treeSet);

		System.out.println("====== 검색 기능 사용(가져오기) ===========");

		// 1. first() : 제일 처음값 가져오기
		System.out.println(treeSet.first());

		// 2. last() : 제일 마지막값 가져오기
		System.out.println(treeSet.last());

		// 3. lower(E element) : element보다 작은 값을 출력
		System.out.println(treeSet.lower(26));

		// 4. higher(E element) : element보다 큰 값을 출력
		System.out.println(treeSet.higher(26));

		// 5. floor(E element) : element를 포함해서 작은값 출력
		System.out.println(treeSet.floor(25));

		// 6. ceiling(E element) : element를 포함해서 큰값을 출력
		System.out.println(treeSet.ceiling(26));

		System.out.println("==========데이터 꺼내기=============");

		// 7. pollFirst() : 제일 첫번째 값 꺼내기
		int treeSetSize = treeSet.size();
		System.out.println("treeSetSize : " + treeSetSize);// 25
		for (int i = 0; i < treeSet.size(); i++) {
			System.out.print(treeSet.pollFirst() + " "); // 25번 루프돌면서 첫번째 값만 출력
		}
		System.out.println();

		System.out.println("========================================");
		// 8. pollLast() : 제일 마지막 값 꺼내오기
		for (int i = 50; i > 0; i -= 2) {
			treeSet.add(i);
		}

		for (int i = 0; i < treeSet.size(); i++) {
			System.out.print(treeSet.pollLast() + " "); // 아무리 생각해도 이거 출력이 다 안되는거 같음... 이유를 모르겠음... 잘 안쓴다고하니 그냥 넘어감...
		}

		System.out.println();

		System.out.println("====================정렬========================");

		// 9. SortedSet<E> 의 headSet(E element) : element 값의 Head쪽으로 정렬해서 값을 저장<element는
		// 미포함>(element값보다 작은 값들을 따로 SortedSet으로 저장한다는것.)
		for (int i = 50; i > 0; i -= 2) {
			treeSet.add(i);
		}
		System.out.println(treeSet);

		// SortedSet<Integer> sSet = treeSet.headSet(20);
		SortedSet<Integer> sSet = treeSet.headSet(20);
		System.out.println(sSet);

		// 10. NavigableSet<E> headSet(E element) : element를 포함해서 작은값을 저장.
		for (int i = 50; i > 0; i -= 2) {
			treeSet.add(i);
		}
		System.out.println(treeSet);

		// NavigableSet<Integer> nSet = treeSet.headSet(20,true);
		NavigableSet<Integer> nSet = treeSet.headSet(20, true); // true면 포함, false면 20 포함 안함.
		System.out.println(nSet);

		// 11. SortedSet<E> tailSet(E element) : element 보다 큰값을 저장
		for (int i = 50; i > 0; i -= 2) {
			treeSet.add(i);
		}
		System.out.println(treeSet);
		
		SortedSet<Integer> sSet2 = treeSet.tailSet(20); //20포함해서 큰값을 저장.
		System.out.println(sSet2);

		//12. NavigableSet<E> tailSet(E element) : element 보다 큰값을 저장
		for (int i = 50; i > 0; i -= 2) {
			treeSet.add(i);
		}
		System.out.println(treeSet);
		
		NavigableSet<Integer> nSet2 = treeSet.tailSet(20,true); //20포함해서 큰값을 저장.
		System.out.println(nSet2);
		
		
		System.out.println("======특정 범위의 값을 가져오기 subSet()===========");
		
		//13. SortedSet<E>
		for (int i = 50; i > 0; i -= 2) {
			treeSet.add(i);
		}
		System.out.println(treeSet);
		
		SortedSet sSet3 = treeSet.subSet(10, 20); 		//10을 포함하고 20을 미포함하고 저장하는것.
		System.out.println(sSet3);
		
		// 14. NavigableSet<E>
		
		for (int i = 50; i > 0; i -= 2) {
			treeSet.add(i);
		}
		System.out.println(treeSet);
		
		NavigableSet nSet3 = treeSet.subSet(10,false, 20,true); 		//컨트롤해서 저장.
		System.out.println(nSet3);
		
		
		
		
		
		System.out.println("==========반대로 정렬하기 (desending)============");
		for (int i = 50; i > 0; i -= 2) {
			treeSet.add(i);
		}
		System.out.println(treeSet);
		
		NavigableSet<Integer> desc = treeSet.descendingSet();
		System.out.println(desc);
		
		NavigableSet<Integer> asc = desc.descendingSet();
		System.out.println(asc);	//desending을 desending 해서 asending이된것...
	}

}
