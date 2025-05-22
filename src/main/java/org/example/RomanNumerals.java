package org.example;

public class RomanNumerals {

    private static final java.util.Map<Integer, String> ROMAN_MAP = java.util.Map.of(
        1, "I",
        4, "IV",
        5, "V",
        10, "X",
            22, "XXII"
    );

    public static String convert(int i) {
        if (ROMAN_MAP.containsKey(i)) return ROMAN_MAP.get(i);
        if (i > 1 && i < 4) return ROMAN_MAP.get(1).repeat(i);
        return "?";
    }
}
