package pl.javka.wzorce;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // zadanie 1
        Dog dog = new Dog
                .Builder()
                .age(10)
                .name("Maruś")
                .type("Programator")
                .toys(Arrays.asList("piłeczka", "C# 8.0 Podstawy po polsku"))
                .build();

        System.out.println(dog);

    }
}
