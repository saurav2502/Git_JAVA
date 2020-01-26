package program;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void findFibonacci() {
        Fibonacci fibonacci = new Fibonacci();
        int sum = fibonacci.findFibonacci(3);
        Assert.assertEquals(5,sum);
    }

    @Test
    public void findAnagram() {
        Fibonacci fibonacci = new Fibonacci();
        boolean bool = fibonacci.findAnagram("str","rst");
        Assert.assertTrue(bool);
    }
}