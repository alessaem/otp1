import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class TemperatureConverterTest {

    TemperatureConverter tc;

    @BeforeEach
    void setUp(){
        tc = new TemperatureConverter();
    }


    @Test
    void fahrenheitToCelsius() {
        assertEquals(0,tc.fahrenheitToCelsius(32.0));
        assertEquals(90,tc.fahrenheitToCelsius(194));
        assertEquals(-40,tc.fahrenheitToCelsius(-40));
    }


    @Test
    void celsiusToFahrenheit2() {
        assertEquals(-22,tc.celsiusToFahrenheit(-30));
        assertEquals(68,tc.celsiusToFahrenheit(20));
        assertEquals(5,tc.celsiusToFahrenheit(-15));
    }

    @Test
    void isExtreme1(){
        assertTrue(tc.isExtremeTemperature(90));
    }

    @Test
    void isExtreme2(){
        assertFalse(tc.isExtremeTemperature(15));
    }

    @Test
    void isExtreme3(){
        assertTrue(tc.isExtremeTemperature(-100));
    }



}