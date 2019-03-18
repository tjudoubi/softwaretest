package softwaretest;

import org.junit.Test;

public class test1 {
	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public int findLast(int[] x, int y) {
		// Effects: If x==null throw
		// NullPointerException
		// else return the index of the last element
		// in x that equals y.
		// If no such element exists, return -1
		for (int i = x.length - 1; i > 0; i--) {
			if (x[i] == y) {
				return i;
			}
		}
		return -1;
	}
	// test: x=[2, 3, 5]; y = 2
	// Expected = 0

	public static int lastZero(int[] x) {
		// Effects: if x==null throw
		// NullPointerException
		// else return the index of the LAST 0 in x.
		// Return -1 if 0 does not occur in x
		for (int i = 0; i < x.length; i++) {
			if (x[i] == 0) {
				return i;
			}
		}
		return -1;
	}
	// test: x=[0, 1, 0]
	// Expected = 2
	
	
	
	
	public static int numZero(int[] arr) { 
		// Effects: If arr is null throw
											// NullPointerException
											// else return the number of
											// occurrences of 0 in arr
		int count = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == 0) {
				count++;
			}
		}
		return count;
	}

}
