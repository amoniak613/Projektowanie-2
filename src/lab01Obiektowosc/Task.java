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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Date getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Date timeStart) {
        this.timeStart = timeStart;
    }

    public Date getTimeStop() {
        return timeStop;
    }

    public void setTimeStop(Date timeStop) {
        this.timeStop = timeStop;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category=" + category +
                ", timeStart=" + timeStart +
                ", timeStop=" + timeStop +
                '}';
    }
}
