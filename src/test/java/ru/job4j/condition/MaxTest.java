package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    public void whenMax5To3Then5() {
        int first = 5;
        int second = 3;
        int result = Max.max(first, second);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To7Then7() {
        int first = 2;
        int second = 7;
        int result = Max.max(first, second);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5To5Then5() {
        int first = 5;
        int second = 5;
        int result = Max.max(first, second);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5To3To2Then5() {
        int first = 5;
        int second = 3;
        int third = 2;
        int result = Max.max(first, second, third);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To7To3Then7() {
        int first = 2;
        int second = 7;
        int third = 3;
        int result = Max.max(first, second, third);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To3To7Then7() {
        int first = 2;
        int second = 3;
        int third = 7;
        int result = Max.max(first, second, third);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5To3To2To1Then5() {
        int first = 5;
        int second = 3;
        int third = 2;
        int fourth = 1;
        int result = Max.max(first, second, third, fourth);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To7To3To1Then7() {
        int first = 2;
        int second = 7;
        int third = 3;
        int fourth = 1;
        int result = Max.max(first, second, third, fourth);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To3To7To1Then7() {
        int first = 2;
        int second = 3;
        int third = 7;
        int fourth = 1;
        int result = Max.max(first, second, third, fourth);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To3To1To7Then7() {
        int first = 2;
        int second = 3;
        int third = 1;
        int fourth = 7;
        int result = Max.max(first, second, third, fourth);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }
}