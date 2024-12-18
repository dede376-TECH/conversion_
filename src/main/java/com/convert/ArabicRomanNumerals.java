package com.convert;

public class ArabicRomanNumerals {
    public static String convert(int nbr) {
        int[] values = {50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (nbr >= values[i]) {
                result.append(romans[i]);
                nbr -= values[i];
            }
        }

        return result.toString();
    }
}

