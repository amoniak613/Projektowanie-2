package pl.javka.lab1;

import pl.javka.lab1.Category;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Main {
    public static void getDatailInfo(Object o) {
        if (o != null && o instanceof Task) {
            Task task = (Task) o;
            System.out.println("taskName: " + task.getName());
            System.out.println("taskDescription: " + task.getDescription());
            System.out.println("taskCategory: " + task.getCategory());
            System.out.println("taskDateTimeStart: " + task.getTimeStart());
            System.out.println("taskDateTimeStop: " + task.getTimeStop());
            if (o instanceof Subtask) {
                Subtask subtask = (Subtask) o;
                System.out.println("subtaskTitle: " + subtask.getSubtaskName());
            } else {
                System.out.println("subtaskTitle: B/D");
            }
        }

    }

    public static void main(String[] args) {
        Task task1 = new Task("Nazwa 1", "Zadanie 1", Category.NEW, new Date());
        Task task2 = new Task("Nazwa 2", "Zadanie 2", Category.DONE, new Date());
        Task task3 = new Task("Nazwa 3", "Zadanie 3", Category.IN_PROGRESS, new Date());
        System.out.println(task1);
        System.out.println(task2);
        System.out.println(task3);

        //      https://stackoverflow.com/questions/1311143/java-util-date-deleting-three-months-from-a-date
        Date today = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(today);
        c.add(Calendar.MONTH, 3);
        Task task4 = new Task("Zadanie 4", "Zadanie do wykonania", Category.NEW, c.getTime());
        System.out.println(task4.toString());

        System.out.println("Wyswietlenie za pomoca petli:");
        List<Task> zadania = new ArrayList<>();
        zadania.add(task1);
        zadania.add(task2);
        zadania.add(task3);
        zadania.add(task4);

        for (Task zadanie: zadania)
        {
            System.out.println(zadanie);
        }

        // zadanie 2 lab 02
        Task subtask1 = new Subtask("Nazwa 1", "Zadanie 1", Category.NEW, new Date(), "Nazwa 1");
        Task subtask2 = new Subtask("Nazwa 2", "Zadanie 2", Category.NEW, new Date(), "Nazwa 2");
        Task subtask3 = new Subtask("Nazwa 3", "Zadanie 3", Category.NEW, new Date(), "Nazwa 3");

        // zadanie 3, lab 02
        Object otask1 = new Task("Nazwa 1", "Zadanie 1", Category.NEW, new Date());
        Object otask2 = new Task("Nazwa 2", "Zadanie 2", Category.DONE, new Date());
        Object otask3 = new Task("Nazwa 3", "Zadanie 3", Category.IN_PROGRESS, new Date());
        Object osubtask1 = new Subtask("Nazwa 1", "Zadanie 1", Category.NEW, new Date(), "Nazwa 1");
        Object osubtask2 = new Subtask("Nazwa 2", "Zadanie 2", Category.NEW, new Date(), "Nazwa 2");
        Object osubtask3 = new Subtask("Nazwa 3", "Zadanie 3", Category.NEW, new Date(), "Nazwa 3");

        getDatailInfo(osubtask1);
    }
}
