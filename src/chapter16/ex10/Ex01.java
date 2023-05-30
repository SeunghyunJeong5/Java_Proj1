package chapter16.ex10;

//제너릭클래스
//	X : x 좌표의 포인트
//	Y : y 좌표의 포인트
// Point 클래스는 점의 (x, y)를 표시하는 클래스
class Point <X,Y>{									//필드의 값할당 방법 3가지......1. 객체이름.뭐뭐해서 삽입, 2.생성자로 삽입, 3.setter로 삽입 
	X x;
	Y y;
	//생성자를 사용해서 필드의 값 입력
	Point (X x, Y y){
		this.x = x;
		this.y = y;
	}
	
	//getter로 필드의 값을 출력
	public X getX() {
		return x;
	}
	public Y getY() {
		return y;
	}
	
}

//제너릭 메소드가 포함된 클래스 생성
class GenericM{		//static이니까 객체 안만들고 클래스명으로 호출해도된다.
	//두점의 좌표를 매개변수로 받아서 넓이를 구해서 리턴(더블) : p1(10.5, 13.3), p2(30.5, 27.3)
	public static <T, V> double makeRectangle (Point<T,V> p1, Point<T,V> p2) {
		//두점의 좌표값을 받아서 넓이를 구해서 더블형으로 리턴
		
		double w;
		double h;
		w = (double)p2.getX()-(double)p1.getX();
		h = (double)p2.getY()-(double)p1.getY();
	
		return w*h;
	}
}

public class Ex01 {
	
	public static void main(String[] args) {
		
		Point <Double, Double> p1 = new Point <> (10.5, 13.3);
		Point <Double, Double> p2 = new Point <> (30.5, 27.3);
		
		
		
		System.out.println("직사각형의 넓이는 : "+GenericM.makeRectangle(p1, p2)+"입니다.");
		
		//double rectangle = GenericM.<Double,Double>makeRectangle(p1, p2); //제너릭 메소드 호출===>이걸 출력해도된다.
		
	}

}
