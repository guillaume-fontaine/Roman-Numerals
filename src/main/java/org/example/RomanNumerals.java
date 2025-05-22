package org.example;

import java.util.LinkedHashMap;

public class RomanNumerals {

   private static final LinkedHashMap<Integer, String> ROMAN_MAP = new LinkedHashMap<>() {{
        put(10, "X");
        put(5, "V");
        put(4, "IV");
        put(1, "I");
    }};


    public static String convert(int number) {
        if (number <= 0) return "?";
        StringBuilder result = new StringBuilder();
        for (var entry : ROMAN_MAP.entrySet()) {
            while (number >= entry.getKey()) {
                result.append(entry.getValue());
                number -= entry.getKey();
            }
        }
        return result.toString();
    }
}
