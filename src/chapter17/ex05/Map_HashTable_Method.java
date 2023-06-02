package chapter17.ex05;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Map_HashTable_Method {
	
	public static void main(String[] args) {
		
		//map <K,V>> : K : Key		: 중복되면 안됨, Set관리됨===> List의 방번호 같은거
		//			   V : Value	: 중복된 값을 넣을 수 있음.
	

		
		//		- HashMap <K,V>		: Key(HashSet) 임의로 출력됨, 싱글 쓰레드(ArrayList와 비슷)
		//		- Hashtable <K,V>	: Key(HashSet) 임의로 출력됨, 멀티 쓰레드(Vector와 비슷), 모든 메소드가 동기화 처리됨.
		//		- LinkedHashMap <K,V> : Key(LinkedHashSet) : 넣은 순서대로 출력됨.
		//		- TreeMap <K,V>		  : Key(TreeSet) : Key가 정렬되어서 들어감. <기본적으로 오름차순 정렬>
	
	
	
		//1. Map선언 
		Map<Integer, String> hmap1 = new Hashtable();		//import가 필요함
		
		//2. put(K,V) : Map에 값을 추가할때 사용
		hmap1.put(2, "나다라");		// Key : 2, Value : "나다라"
		hmap1.put(1, "가나다");
		hmap1.put(3, "다라마");
		hmap1.put(3, "가가가");
		
		System.out.println(hmap1);
		
		//3. putAll(다른 맵객체) : 주의 ==> Key, Value의 타입이 같아야한다.
		Map<Integer, String> hmap2 = new Hashtable();
		hmap2.put(10, "홍길동");
		hmap2.putAll(hmap1);
		
		System.out.println(hmap2);
	
		//4. replace (K key, V value) : key의 값을 value로 수정
		hmap2.replace(1, "가가가");
		hmap2.replace(4, "라라라");		//key 4번은 없음. 그러니 입력도 안됨.
		
		System.out.println(hmap2);
		
		
		//5. replace (k Keym, V oldValue, V newValue); oldValue 의 값을 newValue로 수정
		
		hmap2.replace(1, "가가가","나나나");
		hmap2.replace(2, "다다다","라라라");	//key 와 oldValue가 일치하지 않으면 수정되지 않음.
	
		System.out.println(hmap2);
		
		
		//6. get(Object key) : key를 넣고, key에 해당하는 값을 가져옴
		System.out.println(hmap2.get(1));
	
	
		//7. containskey (Object key) : 해당키가 존재하면 true, 없으면 false
		System.out.println(hmap2.containsKey(2));
		System.out.println(hmap2.containsKey(4));
	
	
		
		//8. containsvalue (Object value) : 해당값이 존재하면 true, 없으면 false
		System.out.println(hmap2.containsValue("나나나"));
		System.out.println(hmap2.containsValue("다라마"));
	
	
		//9. Set<K> keySet() : 키만 추출해서 set에 저장
		Set<Integer> keyset = hmap2.keySet(); 
		System.out.println(keyset);
	
	
		//10. Set<Map.Entry<K,V> entrySet() : Key와 Value ====>둘이 합쳐서 entry 라고 하는데, 이걸 추출 
		Set<Map.Entry<Integer, String>> entrySet = hmap2.entrySet();	//이것도 set에 저장해서 출력함.
		System.out.println(entrySet);
		
		
		//11. size() : 총개수
		System.out.println(hmap2.size());
		
		
		//12. remove(Object key) : 키로 값을 삭제
		hmap2.remove(1);
		hmap2.remove(4);		//방이 없어도 오류가 발생되지 않음
		System.out.println(hmap2);
	
	
		//13. remove (Object key, Object value) : key와 value가 정확히 일치해야만 삭제됨.
		hmap2.remove(2, "나다라");	//삭제완료
		hmap2.remove(3, "가가라");	//삭제불가능
		System.out.println(hmap2);
		
		
		//14. clear() : 전체 삭제
		hmap2.clear();
		System.out.println(hmap2);
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	}

}
