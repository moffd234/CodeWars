import org.example.BeadsCounter;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test0() {
        assertEquals(0, BeadsCounter.countRedBeads(0));
    }
    @Test
    public void test1() {
        assertEquals(0, BeadsCounter.countRedBeads(1));
    }
    @Test
    public void test3() {
        assertEquals(4, BeadsCounter.countRedBeads(3));
    }
    @Test
    public void test5() {
        assertEquals(8, BeadsCounter.countRedBeads(5));
    }

    @Test
    public void test6() {
        assertEquals(12, BeadsCounter.countRedBeads(6));
    }
    @Test
    public void test7() {
        assertEquals(100, BeadsCounter.countRedBeads(50));
    }
    @Test
    public void testIntegerOverflow() {
        Assert.assertThrows(ArithmeticException.class, () -> {
            BeadsCounter.countRedBeads(Integer.MAX_VALUE);
        });
    }

}