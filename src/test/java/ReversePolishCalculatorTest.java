import com.design.algorithm.ReversePolishCalculator;
import org.junit.Assert;
import org.junit.Test;

public class ReversePolishCalculatorTest {
    ReversePolishCalculator reversePolishCalculator = new ReversePolishCalculator();

    @Test
    public void testRPC(){
        Assert.assertEquals(5, reversePolishCalculator.calculateM1("23+"));
        Assert.assertEquals(10, reversePolishCalculator.calculateM1("23+5+"));
        Assert.assertEquals(-2, reversePolishCalculator.calculateM1("13-"));
        Assert.assertEquals(2, reversePolishCalculator.calculateM1("42/"));
        Assert.assertEquals(3, reversePolishCalculator.calculateM1("13*"));

        Assert.assertEquals(5, reversePolishCalculator.calculateM2("23+"));
        Assert.assertEquals(10, reversePolishCalculator.calculateM2("23+5+"));
        Assert.assertEquals(-2, reversePolishCalculator.calculateM2("13-"));
        Assert.assertEquals(2, reversePolishCalculator.calculateM2("42/"));
        Assert.assertEquals(3, reversePolishCalculator.calculateM2("13*"));
    }
}
