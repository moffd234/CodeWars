import org.example.NumberUtils;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NumberUtilsTest {

    @Test
    public void exampleTests() {
        assertTrue(NumberUtils.isNarcissistic(153));
        assertTrue(NumberUtils.isNarcissistic(1634));
        assertFalse(NumberUtils.isNarcissistic(112));
    }

}