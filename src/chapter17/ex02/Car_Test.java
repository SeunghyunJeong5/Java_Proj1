package chapter17.ex02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Car_Test {

	public static void main(String[] args) {
		//1. Car 타입의 객체 5개 생성후
		//car12345
		
		Car car1 = new Car("현대", "투싼", "은색", 300);
		Car car2 = new Car("기아", "K5", "검은색", 200);
		Car car3 = new Car("벤츠", "S클래스", "검은색", 350);
		Car car4 = new Car("BMW", "8시리즈", "흰색", 350);
		Car car5 = new Car("페라리", "라페라리", "빨간색", 500);
		
		//2. ArrayList에 저장 (add로)
		List<Car> List1 = new ArrayList<>(); 
		
		List1.add(car1);
		List1.add(car2);
		List1.add(car3);
		List1.add(car4);
		List1.add(car5);
		
		
		//3. Vector에 저장
		List<Car> List2 = new Vector<>(); 
		
		List2.add(car1);
		List2.add(car2);
		List2.add(car3);
		List2.add(car4);
		List2.add(car5);
		
		
		//4. LinkedList에 저장
		List<Car> List3 = new LinkedList<>(); 
		
		List3.add(car1);
		List3.add(car2);
		List3.add(car3);
		List3.add(car4);
		List3.add(car5);
		
		
		//5. 리스트에 저장된 Car 객체를 가지고와서 출력 for문으로 출력(객체를 그냥 찍으면됨. tostring때문에)
			
		System.out.println("============for 문으로 출력 ================");
		for (int i = 0; i<List1.size();i++) {
				System.out.print(List1.get(i)+" ");
			}
			System.out.println();
		
			
			
			for (int i = 0; i<List2.size();i++) {
				System.out.print(List2.get(i)+" ");
			}
			System.out.println();
			
			
			
			for (int i = 0; i<List3.size();i++) {
				System.out.print(List3.get(i)+" ");
			}
			System.out.println();
			
		
						
		//6. 향상된 for문으로 출력
			System.out.println("============향상된 for 문으로 출력 ================");
	
			for( Car k : List1) {
				System.out.print(k + " ");
			}
			System.out.println();
			
			
			for( Car k : List2) {
				System.out.print(k + " ");
			}
			System.out.println();
			
			
			for( Car k : List3) {
				System.out.print(k + " ");
			}
			System.out.println();
		
		
		
		//7. 객체를 그냥 출력
			System.out.println("============객체로 직접 출력 ================");

			System.out.println(List1);
			System.out.println(List2);
			System.out.println(List3);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
