package ru.job4j.condition;

import static java.lang.Math.*;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result = distance(0, 0, 2, 0);
        double result2 = distance(7, 3, 2, 1);
        System.out.println("Distance between A and B is " + result);
        System.out.println("Distance between A and B is " + result2);
    }
}