package lab15.sict.must.edu.mn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
void testMultiplyPositive() {
App calc = new App();
assertEquals(6.0, calc.multiply(2.0, 3.0), "2 * 3 нь 6-тай тэнцүү байх ёстой");
    }
@Test
void testMultiplyNegative() {
App calc = new App();
assertEquals(-6.0, calc.multiply(-2.0, 3.0), "-2 * 3 нь -6-тай тэнцүү байх ёстой"); 
    }
}
