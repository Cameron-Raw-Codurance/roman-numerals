import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsTest {
    RomanNumerals romanNumerals;
    @BeforeEach
    void Setup(){
       this.romanNumerals = new RomanNumerals();
    }
    @Test
    void Returns_I_When_Input_Is_1(){
        assertEquals("I", romanNumerals.convert(1));
    }
    @Test
    void Returns_II_When_Input_Is_2(){
        assertEquals("II", romanNumerals.convert(2));
    }
    @Test
    void Returns_III_When_Input_Is_3(){
        assertEquals("III", romanNumerals.convert(3));
    }
    @Test
    void Returns_V_When_Input_Is_5(){
        assertEquals("V", romanNumerals.convert(5));
    }
    @Test
    void Returns_VI_When_Input_Is_6(){
        assertEquals("VI", romanNumerals.convert(6));
    }
    @Test
    void Returns_VII_When_Input_Is_7(){
        assertEquals("VII", romanNumerals.convert(7));
    }
    @Test
    void Returns_VIII_When_Input_Is_8(){
        assertEquals("VIII", romanNumerals.convert(8));
    }
    @Test
    void Returns_X_When_Input_Is_10(){
        assertEquals("X", romanNumerals.convert(10));
    }
    @Test
    void Returns_XV_When_Input_Is_15(){
        assertEquals("XV", romanNumerals.convert(15));
    }
    @Test
    void Returns_XXV_When_Input_Is_25(){
        assertEquals("XXV", romanNumerals.convert(25));
    }
    @Test
    void Returns_IV_When_Input_Is_4(){
        assertEquals("IV", romanNumerals.convert(4));
    }
    @Test
    void Returns_IX_When_Input_Is_9(){
        assertEquals("IX", romanNumerals.convert(9));
    }
    @Test
    void Returns_MMCMXLVII_When_Input_Is_2947(){
        assertEquals("MMCMXLVII", romanNumerals.convert(2947));
    }

}