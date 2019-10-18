import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void factorial1Test(){
        Assert.assertTrue( Factorial.factorial(1)==1);
    }
    @Test
    public void factorial0Test(){
        Assert.assertTrue(Factorial.factorial(0)==1);
    }
}
