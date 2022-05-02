import static org.junit.Assert.*;
import org.junit.*;

public class DemoTester {
    @Test
    public void converterTest() {
        assertEquals(1, Demo.converter(6));
    }
}
