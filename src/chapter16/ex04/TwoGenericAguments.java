package chapter16.ex04;

class KeyValue <K, V>{
	
	//A~Z 중 임의의 타입을 지정
	
	// T : Type
	// K : Key
	// V : Value
	// N : Number
	
	private K key;
	private V value;

	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
}
public class TwoGenericAguments {

	public static void main(String[] args) {
		//1. String, Integer 를 아규먼트로 하는 객체 생성
		KeyValue <String, Integer> kv1 = new KeyValue <String, Integer>();
		
		
		//setter 주입
		kv1.setKey("사과");
		kv1.setValue(1000);
		
		//getter를 사용해서 필드의 값을 출력
		System.out.println(kv1.getKey());
		System.out.println(kv1.getValue());
		
		
		KeyValue <String, Integer> kv2 = new KeyValue <String, Integer>();

		kv2.setKey("오렌지");
		kv2.setValue(2000);
		
		System.out.println(kv2.getKey());		//이런걸보면 그냥 객체를 소환하는게 아니고 그냥 필드도 소환가능한거같음.
		System.out.println(kv2.getValue());
		
		
		//2. Integer, String을 아규먼트로 객체 생성
		KeyValue <Integer, String> kv3 = new KeyValue();
		
		//setter 주입
		kv3.setKey(404);
		kv3.setValue("해당요청은 페이지를 찾을 수 없습니다. ");
		
		//getter로 필드값 출력
		System.out.println(kv3.getKey());
		System.out.println(kv3.getValue());
		
		
		//3. 야규먼트에 void를 사용하면 해당 아규먼트는 사용되지 않도록 설정됨.
		//			주의 : void라고 쓸때 Void(객체형이므로)라고 써야함
		KeyValue <String, Void> kv4 = new KeyValue<String, Void>();
		
		kv4.setKey("키값만 사용");
		System.out.println(kv4.getKey());
		System.out.println("===========================");
		
		// kv4.setValue(0); 오류남... null값만 넣을수있음.
		
		//Void로 지정된 곳에는 null값만 입력되지만 사용하지 않도록 처리할때
		kv4.setValue(null);
		System.out.println(kv4.getValue());
		
	}
}
