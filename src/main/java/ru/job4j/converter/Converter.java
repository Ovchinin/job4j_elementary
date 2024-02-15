package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float inputForEuro = 140;
        float expectedForEuro = 2;
        float outputForEuro = Converter.rubleToEuro(inputForEuro);
        boolean passedForEuro = expectedForEuro == outputForEuro;
        System.out.println("140 rubles are 2. Test result : " + passedForEuro);

        float inputForDollar = 120;
        float expectedForDollar = 2;
        float outputForDollar = Converter.rubleToDollar(inputForDollar);
        boolean passedForDollar = expectedForDollar == outputForDollar;
        System.out.println("120 rubles are 2. Test result : " + passedForDollar);

        float euro = rubleToEuro(140);
        float dollar = rubleToDollar(120);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("120 rubles are " + dollar + " dollar.");
    }
}