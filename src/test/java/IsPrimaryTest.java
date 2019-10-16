import org.junit.Assert;
import org.junit.Test;

public class IsPrimaryTest {

    @Test
    public void Is1PrimaryTest(){
        Assert.assertFalse(IsPrimary.isPrimary(1));
    }

    @Test
    public void Is2PrimaryTest(){
        Assert.assertTrue(IsPrimary.isPrimary(2));
    }
}
