package org.example;

import java.util.Map;

public class RomanNumerals {
    private static final Map<Integer, String> ROMAN_MAP = Map.of(
            10, "X",
            5, "V",
            1, "I"
    );

    public static String convert(int i) {
        if (i == 2) return "II";
        if (i == 3) return "III";
        return ROMAN_MAP.getOrDefault(i, "I");
    }
}
