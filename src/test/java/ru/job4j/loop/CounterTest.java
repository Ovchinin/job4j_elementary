package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import ru.job4j.condition.Max;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CounterTest {
    @Test
    void when0To5Then15() {
        int start = 0;
        int finish = 5;
        int result = Counter.sum(start, finish);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when1To1Then1() {
        int start = 1;
        int finish = 1;
        int result = Counter.sum(start, finish);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMinus1To4Then9() {
        int start = -1;
        int finish = 4;
        int result = Counter.sum(start, finish);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when6To2Then0() {
        int start = 6;
        int finish = 2;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }
}