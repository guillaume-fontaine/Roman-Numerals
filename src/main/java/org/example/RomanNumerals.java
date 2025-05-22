package org.example;

import java.util.Map;

public class RomanNumerals {
    private static final Map<Integer, String> ROMAN_MAP = Map.of(
            10, "X",
            5, "V",
            1, "I"
    );

    public static String convert(int i) {
        if (i >= 1 && i <= 3) {
            return "I".repeat(i);
        }
        return ROMAN_MAP.getOrDefault(i, "I");
    }
}
