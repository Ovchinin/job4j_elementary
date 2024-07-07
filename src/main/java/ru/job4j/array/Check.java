package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 1; index < data.length; index++) {
            boolean firstItem = data[0];
            if (data[index] != firstItem) {
                result = false;
                break;
            }
        }
        return result;
    }
}