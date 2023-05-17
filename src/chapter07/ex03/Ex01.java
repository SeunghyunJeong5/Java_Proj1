package chapter07.ex03;

class Product {
	
	// 생성자 오버로딩 필드의 개수에 따라서 생성자 생성 : 총5개만들어야됨 기본생성자부터
	// 객체 자체를 출력시 그 객체의 필드의 내용을 출력 : toString 으로...
	
	public Product() {}
	
	
	
	public Product(String proName) {
		
		this.proName = proName;
	}

	


	public Product(String proName, int proNo) {
		
		this.proName = proName;
		this.proNo = proNo;
	}




	public Product(String proName, int proNo, int proPrice) {
		
		this.proName = proName;
		this.proNo = proNo;
		this.proPrice = proPrice;
	}




	public Product(String proName, int proNo, int proPrice, int proCount) {
		
		this.proName = proName;
		this.proNo = proNo;
		this.proPrice = proPrice;
		this.proCount = proCount;
	}




	String proName ;			//제품이름
	int proNo;					//제품번호
	int proPrice;				//제품가격
	int proCount;				//제품수량
	
	//객체를 출력시 객체의 필드의 값을 출력
	@Override
	public String toString() {
		return "Product [proName=" + proName + ", proNo=" + proNo + ", proPrice=" + proPrice + ", proCount=" + proCount
				+ "]";
	}
	
	
	
	
}
public class Ex01 {
	
	public static void main(String[] args) {
		
		Product p1 = new Product ();
		Product p2 = new Product ("애플");
		Product p3 = new Product ("애플",100);
		Product p4 = new Product ("애플",100,100000);
		Product p5 = new Product ("애플",100,100000,10);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		
		
	}
	
	
	

}
