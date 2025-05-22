package org.example;

import java.util.Map;

public class RomanNumerals {
    private static final Map<Integer, String> ROMAN_MAP = Map.of(
            10, "X",
            5, "V"
    );

    public static String convert(int i) {
        return ROMAN_MAP.getOrDefault(i, "I");
    }
}
