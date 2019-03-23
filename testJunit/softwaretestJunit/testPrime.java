package softwaretestJunit;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import softwaretest.prime;

public class testPrime {
	
	ByteArrayOutputStream out;
	PrintStream ps;
	
	@Before
    public void setUp(){

        out = new ByteArrayOutputStream();

        ps = new PrintStream(out);

        System.setOut(ps);

    }
	
	@Test
	public void Prime1() throws IOException{
		out.flush();
        prime.printPrimes(3);
		assertEquals("Prime: 2\r\nPrime: 3\r\nPrime: 5\r\n", out.toString());
		
	}
	@Test
	public void Prime2() throws IOException{
		out.flush();
        prime.printPrimes(5);
		assertEquals("Prime: 2\r\nPrime: 3\r\nPrime: 5\r\nPrime: 7\r\nPrime: 11\r\n", out.toString());
		
	}

}
