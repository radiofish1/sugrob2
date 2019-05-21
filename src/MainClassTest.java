import org.junit.Assert;
import org.junit.Test;

public class MainClassTest
{
    @Test
    public void testGetClassNumber()
    {
        MainClass a = new MainClass();
        Assert.assertTrue("getClassNumber less or equal 45", a.getClassNumber() > 45);
    }
}
