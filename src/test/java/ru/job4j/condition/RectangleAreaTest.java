package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class RectangleAreaTest {

    @Test
    void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP1K5Square0Dot03() {
        double expected = 0.03;
        int p = 1;
        int k = 5;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP2K3Square0Dot18() {
        double expected = 0.18;
        int p = 2;
        int k = 3;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}