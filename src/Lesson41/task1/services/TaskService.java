package Lesson41.task1.services;

import Lesson41.task1.model.Task;

import java.util.*;

public class TaskService {
    private NavigableSet<Task> tasks;

    public TaskService() {
        tasks = new TreeSet<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
        System.out.printf("Task %s is added", task.getName());
    }

    public void finishTask() {
        Task task = tasks.pollFirst();
        if (task == null) {
            System.out.println("Задач нет!");
        } else {
            System.out.printf("Task %s finished%n", task.getName());
        }
    }
}
