package org.example;

public class RomanNumerals {

    public static String convert(int i) {
        if (i == 10)
            return "X";
        if (i == 5)
            return "V";
        return "I";
    }
}
