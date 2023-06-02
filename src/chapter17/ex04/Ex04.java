package chapter17.ex04;

import java.util.Set;
import java.util.TreeSet;

class Aa implements Comparable<Aa>{
	
	String name;
	
	
	public Aa(String name) {
		
		this.name = name;
	}

	@Override
	public int compareTo(Aa o) {
		
		if(this.name.charAt(0)<o.name.charAt(0)) {
			return -1;
		}else if (this.name.charAt(0)==o.name.charAt(0)) {
			return 0;
		}else {
			return 1;
		}
	}
	
	@Override
	public String toString() {
		
		return " " + name + " ";
	}
	
	
}

class Bb implements Comparable<Bb>{
	int userID;

	public Bb(int userID) {
		
		this.userID = userID;
	}
	
	@Override
	public int compareTo(Bb o) {
		if(this.userID<o.userID) {
			return -1;
			
		}else if (this.userID<o.userID) {
			return 0;
		}else {
			return 1;
		}
		
	}
	
	
	
	@Override
	public String toString() {
		
		return " " + userID + " ";
	}
	
	
	
}



public class Ex04 {
	
	public static void main(String[] args) {
		//두 클래스를 TreeSet에 저장시 정렬되어 출력되도록 구현하면됨.
		
		
		Set<Aa> aaSet = new TreeSet();
		
		aaSet.add(new Aa("가"));
		aaSet.add(new Aa("나"));
		aaSet.add(new Aa("다"));
		aaSet.add(new Aa("라"));
		aaSet.add(new Aa("마"));
		
		System.out.println(aaSet);
		
		
		Set<Bb> bbSet = new TreeSet();
		
		bbSet.add(new Bb(1));
		bbSet.add(new Bb(2));
		bbSet.add(new Bb(3));
		bbSet.add(new Bb(4));
		bbSet.add(new Bb(5));
		
		System.out.println(bbSet);
		
	}

}
