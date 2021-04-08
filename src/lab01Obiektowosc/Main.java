package lab01Obiektowosc;

import pl.w_goroncej_wodzie.company.Category;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Task task1 = new Task("Nazwa 1", "Zadanie 1", Category.NEW, new Date());
        Task task2 = new Task("Nazwa 2", "Zadanie 2", Category.DONE, new Date());
        Task task3 = new Task("Nazwa 3", "Zadanie 3", Category.IN_PROGRESS, new Date());
        System.out.println(task1);
        System.out.println(task2);
        System.out.println(task3);
    }
}
