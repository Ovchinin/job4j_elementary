package ru.job4j.converter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert140RubleThen2Euro() {
        float input = 140;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert140RubleThen2Dollar() {
        float inputForDollar = 120;
        float expectedForDollar = 2;
        float outputForDollar = Converter.rubleToDollar(inputForDollar);
        float valueForDollar = 0.0001f;
        assertThat(outputForDollar).isEqualTo(expectedForDollar, withPrecision(valueForDollar));
    }
}