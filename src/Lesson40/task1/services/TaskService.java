package Lesson40.task1.services;

import Lesson40.task1.model.Task;

import java.util.PriorityQueue;
import java.util.Queue;

public class TaskService {
    private Queue<Task> tasks;

    public TaskService() {
        tasks = new PriorityQueue<>();
    }

    public void addTask(Task task) {
        tasks.offer(task);
        System.out.printf("Task %s is added", task.getName());
    }

    public void finishTask() {
        Task task = tasks.poll();
        if (task == null) {
            System.out.println("Задач нет!");
        } else {
            System.out.printf("Task %s finished%n", task.getName());
        }
    }
}
