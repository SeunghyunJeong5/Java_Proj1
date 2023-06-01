package chapter17.ex04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		Set<Integer> hSet = new HashSet();
		HashSet<Integer> hSet2 = new HashSet();//이렇게 해도됨..?
		
		//1. for문을 사용해서 1~100 까지 HashSet에 값을 저장
		
		for (int i = 1 ; i<101; i++) {
			hSet.add(i);
		}
		
		System.out.println("Iterator를 사용해서 HashSet에 저장된 값을 출력");
		//2. Iterator를 사용해서 HashSet에 저장된 값을 출력
		
		Iterator<Integer> it = hSet.iterator();
		
	     while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	System.out.println();
		
	    System.out.println("Enhanced for 문을 사용해서 출력");
		//3. Enhanced for 문을 사용해서 출력
	    
	    for(int k : hSet) {				//Integer로 안해도됨.
	    	System.out.print(k+" ");
	    }
	    
	    System.out.println();
	    
	    
	    
	    
	    System.out.println("HashSet에 저장된 값을 배열로 변환, 일반 for문을 사용해서 출력");
		//4. HashSet에 저장된 값을 배열로 변환, 일반 for문을 사용해서 출력
	    
	    
	    Object[] obj = hSet.toArray();
	    
	    for (int i = 0 ; i<obj.length;i++) {
	    	
	    	System.out.print(obj[i]+" ");
	    }
	    System.out.println();
	    
	    
	    System.out.println("toArray(T[] t)를 사용한 방법");
	    
	    Integer[] int1 = hSet.toArray(new Integer [100]);
		
	    for (int i = 0 ; i<int1.length;i++) {
	    	
	    	System.out.print(int1[i]+" ");
	    }
	    System.out.println();
		
		
	}
	
}
