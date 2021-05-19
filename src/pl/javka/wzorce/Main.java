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

        //    zadanie 2
        ComputerGame lowBudgetComputerGame = new ComputerGame(
                "C# 1.0, Hindi edition",
                PegiAgeRating.P16,
                4.0,
                1024,
                1,
                2,
                2,
                3.0
        );

        ComputerGame highBudgetComputerGame = new ComputerGame(
                "C# 8.0, Hindi edition",
                PegiAgeRating.P18,
                80.0,
                16384,
                150,
                32,
                16,
                5.0
        );

        PCGameAdapter lowBudgetPcGameAdapter = new PCGameAdapter(lowBudgetComputerGame);
        System.out.println(lowBudgetPcGameAdapter.isTripleAGame());
        System.out.println(lowBudgetPcGameAdapter.getPegiAllowedAge());

        PCGameAdapter highBudgetPcGameAdapter = new PCGameAdapter(highBudgetComputerGame);
        System.out.println(highBudgetPcGameAdapter.isTripleAGame());


    }
}
