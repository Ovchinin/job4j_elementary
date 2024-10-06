package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when73to21then5Dot38() {
        double expected = 5.38;
        Point a = new Point(7, 3);
        Point b = new Point(2, 1);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus20to1Minus5then5Dot83() {
        double expected = 5.83;
        Point a = new Point(-2, 0);
        Point b = new Point(1, -5);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when0to0to0to0to0to0then0() {
        double expected = 0.0;
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 0);
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when0to0to0to1to1to1then1Dot73() {
        double expected = 1.73;
        Point a = new Point(0, 0, 0);
        Point b = new Point(1, 1, 1);
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus2to0to0to1toMinus5to0then5Dot83() {
        double expected = 5.83;
        Point a = new Point(-2, 0, 0);
        Point b = new Point(1, -5, 0);
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when3to4to5to6to7to8then5Dot20() {
        double expected = 5.20;
        Point a = new Point(3, 4, 5);
        Point b = new Point(6, 7, 8);
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}