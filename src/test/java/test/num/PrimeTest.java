package test.num;


import org.testng.Assert;
import org.testng.annotations.Test;

import num.Prime;

public class PrimeTest {
	static Prime p=new Prime();

    @Test
    public void testCsesfalse() {
    	
       Assert.assertEquals(p.isPrime(2), true);
       Assert.assertEquals(p.isPrime(3), true);
       Assert.assertEquals(p.isPrime(5), true);
       Assert.assertEquals(p.isPrime(7), true);
       Assert.assertEquals(p.isPrime(11), true);
       Assert.assertEquals(p.isPrime(13), true);
       Assert.assertEquals(p.isPrime(17), true);
    }

    @Test
    public void testCases2() {
    	
       Assert.assertEquals(p.isPrime(4), false);
       Assert.assertEquals(p.isPrime(8), false);
       Assert.assertEquals(p.isPrime(21), false);
       Assert.assertEquals(p.isPrime(12), false);
       Assert.assertEquals(p.isPrime(18), false);
       Assert.assertEquals(p.isPrime(35), false);
       Assert.assertEquals(p.isPrime(15), false);
    }
    @Test
    public void testCases3() {
    	Assert.assertEquals(p.isPrime(-45), false);
    	Assert.assertEquals(p.isPrime(-0), false);
    	Assert.assertEquals(p.isPrime(-3), false);
    	Assert.assertEquals(p.isPrime(-67), false);
    	Assert.assertEquals(p.isPrime(-5), false);
    }
}

