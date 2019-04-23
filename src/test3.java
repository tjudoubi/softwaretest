

	import static org.junit.Assert.*;

	import org.junit.After;
	import org.junit.Before;
	import org.junit.Test;
	import static org.junit.Assert.assertEquals;

	import java.util.Arrays;

	public class test3 {
		
		BubbleSort temp;
		@Test
		public void testfindLast() {
			int arr[] = new int[]{10,20,15,0,6,7,2,1,-5,55};
			int[] c = new int[]{-5, 0, 1, 2, 6, 7, 10, 15, 20, 55};
			int[] temp_temp = temp.BubbleSort(arr);
			String s1 = new String();
			String s2 = new String();
			for(int i = 0;i < arr.length;i++){
				s1 += String.valueOf(temp_temp[i])+ " ";
				s2 += String.valueOf(c[i])+ " ";
			}
			System.out.println(s1+"xxx"+s2);
			assertEquals(true,s1.equals(s2));
			s1 = null;
			s2 = null;

		}
		
		@Before
		public void testfind_1() {
			BubbleSort temp = new BubbleSort();
		}
		
		@After
		public void testfind_2() {
			temp = null;
		}
		
	}


