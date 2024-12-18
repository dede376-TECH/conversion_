package com.convert;
import org.junit.jupiter.api.Test;  // Pour JUnit 5
import static org.junit.jupiter.api.Assertions.*;  // Pour les assertions de JUnit 5


public class ArabicRomanNumeralsTest {
    @Test
    public void convertir_1(){
        // given
        ArabicRomanNumerals cn = new ArabicRomanNumerals();
          int number = 1;
          // when
        String res = cn.convert(number);
        //then
        assertEquals("I", res);


    }
}