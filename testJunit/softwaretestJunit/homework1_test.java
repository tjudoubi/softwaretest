package softwaretestJunit;

import static org.junit.Assert.*;


import org.junit.Test;

import softwaretest.homework1;

public class homework1_test {
	@Test
	public void testAdd(){
		assertEquals(true,new homework1().triangle(1));
		assertEquals(true,new homework1().triangle(5));
		assertEquals(false,new homework1().triangle(100));
		assertEquals(false,new homework1().triangle(120));
		assertEquals(false,new homework1().triangle(124));
		assertEquals(true,new homework1().triangle(75));
		assertEquals(false,new homework1().triangle(79));
		assertEquals(false,new homework1().triangle(98));
	}
	
	@Test
	public void testAdd_2(){
		assertEquals(true,new homework1().ss(1));
		assertEquals(true,new homework1().ss(5));
		assertEquals(false,new homework1().ss(100));
		assertEquals(false,new homework1().ss(120));
		assertEquals(false,new homework1().ss(124));
		assertEquals(true,new homework1().ss(75));
		assertEquals(false,new homework1().ss(79));
		assertEquals(false,new homework1().ss(98));
	}

}
