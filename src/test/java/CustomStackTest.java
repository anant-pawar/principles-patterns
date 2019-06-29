import com.design.algorithm.CustomStack;
import org.junit.Test;

public class CustomStackTest {

    @Test
    public void testCustomStack(){
        System.out.println("Testing CustomStack");

        CustomStack stack = new CustomStack(5);

        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}
