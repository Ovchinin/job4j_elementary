package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left >= right ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int result = Max.max(2, 1);
        System.out.println(result);

        int result2 = Max.max(1, 7);
        System.out.println(result2);

        int result3 = Max.max(3, 3);
        System.out.println(result3);
    }
}