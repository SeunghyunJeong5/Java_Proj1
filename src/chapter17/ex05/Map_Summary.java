package chapter17.ex05;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_Summary {

	public static void main(String[] args) {
		
		//map <K,V>> : K : Key		: 중복되면 안됨, Set관리됨===> List의 방번호 같은거
				//			   V : Value	: 중복된 값을 넣을 수 있음.
			

				
				//		- HashMap <K,V>		: Key(HashSet) 임의로 출력됨, 싱글 쓰레드(ArrayList와 비슷)
				//		- Hashtable <K,V>	: Key(HashSet) 임의로 출력됨, 멀티 쓰레드(Vector와 비슷), 모든 메소드가 동기화 처리됨.
				//		- LinkedHashMap <K,V> : Key(LinkedHashSet) : 넣은 순서대로 출력됨.
				//		- TreeMap <K,V>		  : Key(TreeSet) : Key가 정렬되어서 들어감. <기본적으로 오름차순 정렬>
			
		//1. HashMap : 입력순서와 출력순서가 다르다. 싱글쓰레드 환경.===> ArrayList와 비슷
		Map <String, Integer> hMap = new HashMap();
		hMap.put("다", 30);
		hMap.put("마", 40);
		hMap.put("나", 50);
		hMap.put("가", 60);
		hMap.put("가", 70);		//나중에 넣은 key가 작동함.
		
		System.out.println(hMap);
		
		//2. Hashtable : 입력순서와 출력순서가 다르다. 모든 메소드가 동기화, 멀티쓰레드 환경===> Vector와 비슷
		
		
		Map <String, Integer> tMap = new Hashtable();
		tMap.put("다", 30);
		tMap.put("마", 40);
		tMap.put("나", 50);
		tMap.put("가", 60);
		tMap.put("가", 70);		//나중에 넣은 key가 작동함.
		
		System.out.println(tMap);
		
		
		//3. LinkedHashMap : 입력된 순서로 출력됨.
		
		Map <String, Integer> lMap = new LinkedHashMap();
		lMap.put("다", 30);
		lMap.put("마", 40);
		lMap.put("나", 50);
		lMap.put("가", 60);
		lMap.put("가", 70);		//나중에 넣은 key가 작동함.
		
		System.out.println(lMap);
		
		//4. TreeMap : key 값으로 정렬되어서 입력됨, 기본적으로 오름차순 정렬
		Map <String, Integer> treeMap = new TreeMap();
		treeMap.put("다", 30);
		treeMap.put("마", 40);
		treeMap.put("나", 50);
		treeMap.put("가", 60);
		treeMap.put("가", 70);		//나중에 넣은 key가 작동함.
		
		System.out.println(treeMap);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
