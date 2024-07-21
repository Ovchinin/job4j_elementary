package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int result = 0;
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                if (array.length > 1 && array[row].length > 1) {
                    result += array[row][cell];
                } else {
                    result = array[row][cell];
                }
            }
        }
        return result;
    }
}