package chapter07.ex04;

public class Ex01_1 {
	
	
public static void main(String[] args) {
	
	
	  
	        int[] a = getMultiplesOfSeven();
	        int[] b = getMultiplesOfNine();

	        arrSum(a, b);
	    }

	    public static void arrSum(int[] a, int[] b) {
	        int minLength = Math.min(a.length, b.length);

	        for (int i = 0; i < minLength; i++) {
	            System.out.print(a[i] + b[i]+" ");
	        }
	    }

	    public static int[] getMultiplesOfSeven() {
	        int count = 0;
	        for (int i = 1; i <= 500; i++) {
	            if (i % 7 == 0) {
	                count++;
	            }
	        }

	        int[] a = new int[count];
	        int index = 0;
	        for (int i = 1; i <= 500; i++) {
	            if (i % 7 == 0) {
	                a[index] = i;
	                index++;
	            }
	        }

	        return a;
	    }

	    public static int[] getMultiplesOfNine() {
	        int count = 0;
	        for (int i = 1; i <= 500; i++) {
	            if (i % 9 == 0) {
	                count++;
	            }
	        }

	        int[] b = new int[count];
	        int index = 0;
	        for (int i = 1; i <= 500; i++) {
	            if (i % 9 == 0) {
	                b[index] = i;
	                index++;
	            }
	        }

	        return b;
	    }
	}
