package softwaretest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCaculate {
	// @Test
	// public void testAdd(){
	// test1 cal = new test1();
	// assertEquals(7,cal.add(2,3));
	// }
	//
	// @Test
	// public void testDivide(){
	// test1 cal = new test1();
	// assertEquals(7,cal.divide(2,0));
	// }

	@Test
	public void testfindLast() {
		test1 cal = new test1();
		// int[] array = {2,3,5};
		// assertEquals(0,cal.findLast(array, 2));

		int[] array2 = { 1 };

		assertEquals(0, cal.findLast(array2, 2));

	}

	@Test
	public void testlastZero() {
		test1 cal = new test1();
		// int[] array = {0,1,0};
		// assertEquals(2,cal.lastZero(array));

		int[] array = { 1, 0, 1 };
		assertEquals(2, cal.lastZero(array));

	}

	@Test
	public void testnumZero() {
		test1 cal = new test1();
		// int[] array = {0,1,0};
		// assertEquals(2,cal.lastZero(array));

		int[] array = { 2,7,0 };
		assertEquals(1, cal.numZero(array));

	}

}
