package chapter17.ex03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList_VS_LinkedList {

	public static void main(String[] args) {

		// List<E>
		// - ArrayList<E>, Vector<E> : 검색시 성능이 빠르다. 추가(add)/삭제(remove)시 부하가 많이 발생한다.

		// - LinkedList<E> : 검색이 느리다. 추가/제거시 부하가 걸리지 않는다.

		// 1. 데이터를 추가할때 성능비교
		List<Integer> aList = new ArrayList(); // import해줘야함
		List<Integer> linkedList = new LinkedList();

		// 성능을 체크하는 변수 선언
		long startTime = 0, endTime = 0;

		// 1-1. ArrayList의 성능체크
		startTime = System.nanoTime(); // 현재시간을 나노로 바꿔서 정수형으로 저장.
		System.out.println(startTime);

		// ArrayList에 1부터 1씩 증가하면서 100000개의 값을 저장.
		for (int i = 0; i < 10000; i++) {
			aList.add(0, i); // 0번방에 계속 i값을 넣는거임 기존에 있던 값은 뒤로 밀리는것.
		}
		endTime = System.nanoTime();

		// 프로그램을 실행한 나노타임
		System.out.println(endTime - startTime);

		
		
		System.out.println("=====================================");

		
		
		// 1-2. LinkedList의 성능체크
		startTime = System.nanoTime(); // 현재시간을 나노로 바꿔서 정수형으로 저장.
		System.out.println(startTime);

		// LinkedList에 1부터 1씩 증가하면서 100000개의 값을 저장.
		for (int i = 0; i < 10000; i++) {
			linkedList.add(0, i); // 0번방에 계속 i값을 넣는거임 기존에 있던 값은 뒤로 밀리는것.
		}
		endTime = System.nanoTime();

		// 프로그램을 실행한 나노타임
		System.out.println(endTime - startTime);

		
		
		System.out.println("=====================================");

		
		
		//2-1. ArrayList 검색시 성능체크
		
		startTime = System.nanoTime(); // 현재시간을 나노로 바꿔서 정수형으로 저장.
		
		for(int i =0 ; i<10000; i++) {
			aList.get(i);
		}
		
		endTime = System.nanoTime();
		
		System.out.println(endTime - startTime);
		
		
		
		System.out.println("=====================================");
		
		//2-2. LinkedList 검색시 성능체크
		
		
		startTime = System.nanoTime(); // 현재시간을 나노로 바꿔서 정수형으로 저장.
		
		for(int i =0 ; i<10000; i++) {
			linkedList.get(i);
		}
		
		endTime = System.nanoTime();
		
		System.out.println(endTime - startTime);
		
	}

}
