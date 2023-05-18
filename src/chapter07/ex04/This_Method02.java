package chapter07.ex04;

class Book{
	
	
	//기본 생성자를 호출 시 필드의 초기값 세팅
	Book(){
		bookName = "책 이름 알 수 없음";
		bookAuthor = "작자 미상";
		bookPrice = 0;
		bookCount = 0;
	}
	
	//매개 변수가 1개 인풋 : bookName
	Book(String bookName) {
		this();						//Book()를 호출			//this()는 생성자 내부에서 다른 생성자를 호출할때 쓰임(객체를 호출하는..?)
		this.bookName = bookName;							//this.은 키워드로 필드나 메소드명 앞에 오는것이고
	}
	
	//매개 변수2개인 생성자 호출
	Book(String bookName, String bookAuthor){
		this(bookName);
		this.bookAuthor = bookAuthor;
		
	}
	
	
	//매개 변수가 3개인 생성자 호출
	 Book(String bookName, String bookAuthor, int bookPrice) {
		
		this(bookName, bookAuthor);
		this.bookPrice = bookPrice;
	}
	
	 Book(String bookName, String bookAuthor, int bookPrice, int bookCount) {
		
		this(bookName, bookAuthor,bookPrice);
		this.bookCount = bookCount;
	}



	String bookName;
	String bookAuthor;
	int bookPrice;
	int bookCount;
	
	
	//필드의 모든값을 출력
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookPrice=" + bookPrice + ", bookCount="
				+ bookCount + "]";
	}
	
}


public class This_Method02 {

	
	public static void main(String[] args) {
		
	//Book객체 생성
		Book b1 = new Book ();
		Book b2 = new Book ("홍길동전");
		Book b3 = new Book ("자바","이순신");
		Book b4 = new Book ("파이썬","김유신",30000);
		Book b5 = new Book ("html","신사임당",40000,500);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		
		
		
		
	}
}
