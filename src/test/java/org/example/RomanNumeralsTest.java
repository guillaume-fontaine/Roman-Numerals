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

    @Test
    @DisplayName("Convert 10 to 'X'")
    void convert10(){
        assertThat(convert(10)).isEqualTo("X");
    }

    @Test
    @DisplayName("Convert 5 to 'V'")
    void convert5(){
        assertThat(convert(5)).isEqualTo("V");
    }

    @Test
    @DisplayName("Convert 2 to 'II'")
    void convert2(){
        assertThat(convert(2)).isEqualTo("II");
    }

    @Test
    @DisplayName("Convert 3 to 'III'")
    void convert3(){
        assertThat(convert(3)).isEqualTo("III");
    }

}