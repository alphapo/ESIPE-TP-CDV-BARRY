import com.esipe.barry.Fibonacci;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestFibonacci {

    final static Logger logger = Logger.getLogger(TestFibonacci.class);

    Fibonacci fibonacci=new Fibonacci();
    @Test
    public void testBeforeFibonacci(){
        int i =fibonacci.fibonacci(-3);
        Assert.assertEquals(-3, i);
    }
    @Test
    public void testFibonacci(){
        int i =fibonacci.fibonacci(5);
        Assert.assertEquals(5, i);
    }
}
