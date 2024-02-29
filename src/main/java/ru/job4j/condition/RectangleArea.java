package ru.job4j.condition;

public class RectangleArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double s = l * h;
        return s;
    }

    public static void main(String[] args) {
        double result = RectangleArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = " + result);

        double result2 = RectangleArea.square(1, 5);
        System.out.println(" p = 6, k = 2, s = " + result2);

        double result3 = RectangleArea.square(2, 3);
        System.out.println(" p = 6, k = 2, s = " + result3);
    }
}