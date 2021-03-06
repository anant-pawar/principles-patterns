import com.design.algorithm.BubbleSort;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BubbleSortTest {
    private BubbleSort bubbleSort;

    @Before
    public void setup() {
        bubbleSort = new BubbleSort();
    }

    @Test
    public void testSort() {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        int[] expectedArray = {-22, -15, 1, 7, 20, 35, 55};

        bubbleSort.sort(array);

        for (int i = 0; i < array.length; i++)
            Assert.assertEquals(expectedArray[i], array[i]);
    }
}
