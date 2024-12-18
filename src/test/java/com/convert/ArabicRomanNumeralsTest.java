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
    @Test
    public void convertir_3(){
        // given
        ArabicRomanNumerals cn = new ArabicRomanNumerals();
        int number = 3;
        // when
        String res = cn.convert(number);
        //then
        assertEquals("III", res);


    }
    @Test
    public void convertir_4(){
        // given
        ArabicRomanNumerals cn = new ArabicRomanNumerals();
        int number = 4;
        // when
        String res = cn.convert(number);
        //then
        assertEquals("IV", res);


    }
    @Test
    public void convertir_10(){
        // given
        ArabicRomanNumerals cn = new ArabicRomanNumerals();
        int number = 10;
        // when
        String res = cn.convert(number);
        //then
        assertEquals("X", res);


    }
    @Test
    public void convertir_39(){
        // given
        ArabicRomanNumerals cn = new ArabicRomanNumerals();
        int number = 39;
        // when
        String res = cn.convert(number);
        //then
        assertEquals("XXXIX", res);


    }

}
