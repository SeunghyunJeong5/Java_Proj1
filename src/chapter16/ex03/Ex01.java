package chapter16.ex03;

class Tiger{
	
	String name = "호랑이";
}

class Lion{
	String name = "사자";
}

class Eagle{
	String name = "독수리";
}

class Animal <T>{
	
	private T t;
	
	//getter
	public T getT () {
		return t;
	}
	
	//setter
	public void setT (T t) {
		this.t = t;
	}
}

public class Ex01 {
	
	public static void main(String[] args) {
		//Animal Generic 클래스에 Tiger, Lion, Eagle 클래스를 setter 주입하고, getter로 가져와서 필드의 내용을 출력.
		
		Animal <Tiger> a1 = new Animal<Tiger>();
		
		a1.setT(new Tiger());
		System.out.println(a1.getT().name);
		
		
		
		Animal <Lion> a2 = new Animal<>();
		
		a2.setT(new Lion());
		System.out.println(a2.getT().name);
		
		
		Animal <Eagle> a3 = new Animal<>();
		
		a3.setT(new Eagle());
		System.out.println(a3.getT().name);
		
		
		
	}

}
