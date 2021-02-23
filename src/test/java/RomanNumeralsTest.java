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
    @Test
    void ReturnsIIIWhenPassed3(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("III", romanNumerals.convert(3));
    }
    @Test
    void ReturnsIVWhenPassed4(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("IV", romanNumerals.convert(4));
    }
    @Test
    void ReturnsVWhenPassed5(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("V", romanNumerals.convert(5));
    }
    @Test
    void ReturnsVIWhenPassed6(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("VI", romanNumerals.convert(6));
    }
    @Test
    void ReturnsVIIWhenPassed7(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("VII", romanNumerals.convert(7 ));
    }
    @Test
    void ReturnsVIIIWhenPassed8(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("VIII", romanNumerals.convert(8 ));
    }
    @Test
    void ReturnsIXWhenPassed9(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("IX", romanNumerals.convert(9 ));
    }
    @Test
    void ReturnsXWhenPassed10(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("X", romanNumerals.convert(10 ));
    }
}
