package lab01Obiektowosc;

import pl.w_goroncej_wodzie.company.Category;

import java.util.Date;

public class Task {
    public String name;
    public String description;
    public Category category;
    public Date timeStart;
    public Date timeStop;
    public Task(String name, String description, Category category, Date timeStop) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.timeStop = timeStop;
        this.timeStart = new Date();
    }
}
