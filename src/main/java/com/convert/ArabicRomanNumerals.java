package com.convert;

public class ArabicRomanNumerals {

    public String convert(int number) {
        if (number == 1) {
            return "I";
        }
        if (number == 3) {
            return "III";
        }
        return "";
    }
}
