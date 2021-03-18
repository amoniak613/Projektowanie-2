package pl.w_goroncej_wodzie.company;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String version = System.getProperty("java.version");
        System.out.println("Wersja javy: " + version);
        System.out.println("author1: "+new dev1().author);
        System.out.println("author1: "+new DEV2().author);
    }
}
