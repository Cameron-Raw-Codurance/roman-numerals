import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsTest {
    @Test
    void ReturnsIWhenPassed1(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("I", romanNumerals.convert(1));
    }
    @Test
    void ReturnsIIWhenPassed2(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("II", romanNumerals.convert(2));
    }
}
