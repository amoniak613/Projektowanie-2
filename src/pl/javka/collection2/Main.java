package pl.javka.collection2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new Random().ints(100, 0, 50).boxed().collect(Collectors.toList());

        System.out.println("Wygenerowana lista:");
        System.out.println(list);

        System.out.println("Unikalne wartosci:");
        Set<Integer> unikalne = new HashSet<Integer>(list);
        System.out.println(unikalne);

        System.out.println("Wartosci ktore wystepuja tylko raz:");
        Set<Integer> pojedyncze = list.stream().filter(i -> Collections.frequency(list, i) == 1).collect(Collectors.toSet());
        System.out.println(pojedyncze);

        System.out.println("Wartosci ktory powtorzyly sie conajmniej raz");
        Set<Integer> duplikaty = list.stream().filter(i -> Collections.frequency(list, i) > 1).collect(Collectors.toSet());
        System.out.println(duplikaty);
    }
}
