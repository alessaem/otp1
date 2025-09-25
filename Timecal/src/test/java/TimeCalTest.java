import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TimeCalTest {
    TimeCal tc = new TimeCal();
    @Test
    public void testCalculateTime() {
        assertEquals(1.0, tc.calculateTime(100,100));
    }
}
