package pl.javka.lab1;

import java.util.Date;

public class Subtask extends Task {
    public String subtaskName;

    public Subtask(String name, String description, Category category, Date timeStop) {
        super(name, description, category, timeStop);
    }

    public Subtask(String name, String description, Category category, Date timeStop, String subtaskName) {
        super(name, description, category, timeStop);
        this.subtaskName = subtaskName;
    }

    public String getSubtaskName() {
        return subtaskName;
    }

    public void setSubtaskName(String subtaskName) {
        this.subtaskName = subtaskName;
    }

    @Override
    public String toString() {
        return "Subtask{" +
                "subtaskName='" + subtaskName + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category=" + category +
                ", timeStart=" + timeStart +
                ", timeStop=" + timeStop +
                '}';
    }
}
