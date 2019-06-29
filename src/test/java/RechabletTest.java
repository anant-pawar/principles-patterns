import com.design.algorithm.Reachable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RechabletTest {
    private Reachable reachable;

    @Before
    public void setup() {
        reachable = new Reachable();
    }

    @Test
    public void testReachable() {
        int[][] maze = {{0, 0, 0, 0},
                {0, -1, 0, 0},
                {-1, 0, 0, 0},
                {0, 0, 0, 0}};

        Assert.assertEquals(true, reachable.checkReachable(maze));
    }
}
