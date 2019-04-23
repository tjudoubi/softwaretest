import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;


public class test1 {
	@Test
	public void testfindLast() {
		BackPack temp = new BackPack();
		//最大容量为10
        int m = 10;
        int n = 3;
        /*
        	放入的三个物体重量分别为3， 4， 5；价值分别为4， 5， 6
         */
        int w[] = {3, 4, 5};
        int p[] = {4, 5, 6};
        
        int[][] solution = {{0,0,0,0,0,0,0,0,0,0,0},
        					{0,0,0,4,4,4,4,4,4,4,4},
        					{0,0,0,4,5,5,5,9,9,9,9},
        					{0,0,0,4,5,6,6,9,10,11,11}};	
        int c[][] = temp.BackPack_Solution(m, n, w, p);
        boolean flag = true;
        for (int i = 0; i <= n; i++) {
            if(!Arrays.equals(solution[i], c[i])){
            	flag = false;
            }
        }
        System.out.println( Arrays.equals(solution[3], c[3]));
		assertEquals(true, flag);

	}
}
