package chapter17.ex04;

import java.util.Set;
import java.util.TreeSet;


class MyClass{		//일반 클래스 : TreeSet에 넣을 경우 정렬되어 저장되지 않음.
	int data1;
	int data2;
	
	//생성자로부터 필드의 값 할당
	MyClass ( int data1, int data2){
		this.data1 = data1;
		this.data2 = data2;
	}
	
	@Override
		public String toString() {
			
			return " " + data1+ " ";
		}
	
}


// MyClass2는 TreeSet에 저장할때 특정 필드가 정렬되서 저장되도록 함.
class MyClass2 implements Comparable<MyClass2>{		//Comparable이라는 인터페이스의 메소드를 오버라이딩해서 사용함.
	int data1;
	int data2;
	
	//생성자로부터 필드의 값 할당
	MyClass2 ( int data1, int data2){
		this.data1 = data1;
		this.data2 = data2;
	}
	
	@Override
	public int compareTo(MyClass2 o) {		//___.compareT0(__)이니까 앞에꺼가 내꺼고 뒤에꺼가 새로들어온거.
		//오름차순 정렬해서 저장
		if (this.data1<o.data1) {
			return -1;
			
		}else if (this.data1 ==0) {
			return 0;
		}else {
			return 1;
		}
		
		
		
		//내림차순 정렬해서 저장
		/*
		if (this.data1<o.data1) {
			return 1;
			
		}else if (this.data1 ==0) {
			return 0;
		}else {
			return -1;
		}
		  
		 */
	}
	
	@Override
	public String toString() {
		
		return " " + data1+ " ";
	}
	
	
	
}



class MyClass3 implements Comparable<MyClass3>{
	
	String data1;		//===> 정렬해서 TreeSet에 저장하도록 설정 
	String data2; 
	
	//생성자를 사용해서 필드의 값 입력
	MyClass3(String data1, String data2){
		this.data1 = data1;
		this.data2 = data1;
		
	}
	
	
	@Override
	public int compareTo(MyClass3 o) {
		
		//방법1
		//return (this.data1.compareTo(o.data1));		//오름차순 정렬
		
		
		//방법2 : 오름차순정렬
		if(this.data1.charAt(0)<o.data1.charAt(0)) {				//charAt(0): 맨앞글자를 의미
			return -1;
			
		}else if (this.data1.charAt(0)==o.data1.charAt(0)) {
			return 0;
			
		}else {
			return 1;
		}
		
		
		//방법2의 내림차순정렬
		/*
		  if(this.data1.charAt(0)<o.data1.charAt(0)) {				//charAt(0): 맨앞글자를 의미
		 
			return 1;
			
		}else if (this.data1.charAt(0)==o.data1.charAt(0)) {
			return 0;
			
		}else {
			return -1;
		}
		*/
		
		
		
		
		
		
		}
	
	
	
	
	
	
	
	@Override
	public String toString() {
		
		return " " + data1+ " ";
	}
	
	
	
	
}

public class Set_TreeSet_Class {
	
	public static void main(String[] args) {
		
		// TreeSet<E> : Set과 공통된 특징
		//				1. Set<E>을 인터페이스를 구현한 클래스. 
		//				2. 중복된 값을 넣을수 없다.
		//				3. 방번호가 없다.
		
		//				TreeSet만의 특징
		//				4. 값이 정렬되어서 들어간다(오름차순 정렬)
		//				5. 검색/정렬 기능의 메소드가 추가적으로 들어있다.
		
		
		//				Wrapper Class는 자동으로 정렬해서 들어가도록 설계가 되어있다. String 포함
		
		//				일반 클래스를 TreeSet에 저장할때 특정 컬럼을 정렬해서 저장되도록 하기 위해서는
		//				Comparable<E> 인터페이스를 구현해서 compareTo()메소드를 오버라이딩해서 특정컬럼이 정렬되어 들어가도록 설계해야한다.==>Wrapper클래스는 이미 이과정이 되어있는것임.
		
		
		//Wrapper 클래스를 TreeSet에 저장하면 자동으로 오름차순 정렬되어 들어감.
		Set<String> set1 = new TreeSet();
		set1.add("하");
		set1.add("카");
		set1.add("다");
		set1.add("오");
		
		System.out.println(set1);
		
		
		Set<Integer> set2 = new TreeSet();
		
		set2.add(50);
		set2.add(50);
		set2.add(30);
		set2.add(40);
		
		System.out.println(set2);
		
		//특정 객체를 TreeSet에 넣으면 정렬되어 저장되지 않는다.
		//Comparable<E> 인터페이스를 구현해서 compareTo()메소드를 오버라이딩해서 특정컬럼이 정렬되어 들어가도록 설계해야한다.
		//중복되지 않도록 하려면 Object 클래스의 equals, hashcode 를 재정의 해줘야됨.
		
		
		System.out.println("=======================================");
		//1. MyClass 객체를 TreeSet에 저장 ==> 일반 클래스 : 정렬되어 들어가지 않는다.
		Set<MyClass> mySet = new TreeSet();
		
		//mySet.add(new MyClass(1,1));
		//mySet.add(new MyClass(5,5));
		//mySet.add(new MyClass(3,3));		==> 애초에 comparable이 재정의 되어있지 않으면 TreeSet에서는 일반클래스에서는 쓸수가 없음.
		
		System.out.println(mySet);
		
		
		
		
		//2. MyClass2 객체를 TreeSet에 저장 ==> Comparable 인터페이스의 compareTo()메소드를 재정의 함 : data1 필드에 정렬되어 들어감.
		Set<MyClass2> mySet2 = new TreeSet();
	
		mySet2.add(new MyClass2(1,1));
		mySet2.add(new MyClass2(5,5));
		mySet2.add(new MyClass2(3,3));
		
		System.out.println(mySet2);
		
		
		System.out.println("========================");
		Set<MyClass3> mySet3 = new TreeSet();
		mySet3.add(new MyClass3("다","다"));
		mySet3.add(new MyClass3("가","가"));
		
		System.out.println(mySet3);
		
		
		
		
		
		
		
		
		
		
	
	}

}
