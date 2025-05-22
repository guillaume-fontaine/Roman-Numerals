package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.example.RomanNumerals.convert;


@DisplayName("RomanNumerals should")
class RomanNumeralsTest {

    @Test
    @DisplayName("Convert 1 to 'I'")
    void convert1(){
        assertThat(convert(1)).isEqualTo("I");
    }

}