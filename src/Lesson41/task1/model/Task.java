package Lesson41.task1.model;

import java.time.LocalDate;

public class Task implements Comparable<Task> {
    private String name;
    private String description;
    private LocalDate deadline;

    public Task(String name, String description, int days) {
        this.name = name;
        this.description = description;
        deadline = LocalDate.now().plusDays(days);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    @Override
    public int compareTo(Task o) {
        return this.deadline.compareTo(o.getDeadline());
    }
}
