package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int bound) {
        int result = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == bound) {
                result = index;
                break;
            }
        }
        return result;
    }

    public static int indexInRange(int[] data, int element, int start, int finish) {
        int result = -1;
        for (int index = start; index <= finish; index++) {
            if (data[index] == element) {
                result = index;
                break;
            }
        }
        return result;
    }
}