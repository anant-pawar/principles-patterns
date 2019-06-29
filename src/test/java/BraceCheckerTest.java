import com.design.practice.BraceChecker;
import org.junit.Assert;
import org.junit.Test;

public class BraceCheckerTest {
    @Test
    public void testBraces(){
        BraceChecker braceChecker = new BraceChecker();
        Assert.assertEquals(true,  braceChecker.check("{()()}"));
    }
}
