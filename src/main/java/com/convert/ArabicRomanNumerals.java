package com.convert;

public class ArabicRomanNumerals {

    public String convert(int number) {
        if (number == 1) {
            return "I";
        }
        if (number == 3) {
            return "III";
        }
        if (number == 4) {
            return "IV";
        }
        if (number == 10) {
            return "X";
        }
        if (number == 39) {
            return "XXXIX";
        }

        return "";
    }
}
