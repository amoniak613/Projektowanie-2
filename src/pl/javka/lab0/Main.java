package pl.javka.lab0;import pl.javka.lab1.Category;

import java.util.Calendar;
import java.util.Date;


public class Main {
    public static void main(String[] args) {
        String version = System.getProperty("java.version");
        System.out.println("Wersja javy: " + version);
        System.out.println("author1: "+new dev1().author);
        System.out.println("author1: "+new DEV2().author);
    }
}
